package fileoperations;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read_Saved_Files {

	public static void main(String[] args) {
		String filePath = "D:\\testdata.xlsx";
		 try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	            Sheet sheet = workbook.getSheetAt(0); 
	            System.out.println("Reading Excel file: " + filePath);
	            System.out.println("------------------------------------");
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;
	                        case NUMERIC:
	                            if (DateUtil.isCellDateFormatted(cell)) {
	                                System.out.print(cell.getDateCellValue() + "\t");
	                            } else {
	                                System.out.print((int) cell.getNumericCellValue() + "\t");
	                            }
	                            break;
	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "\t");
	                            break;
	                        case FORMULA:
	                            System.out.print(cell.getCellFormula() + "\t");
	                            break;
	                        case BLANK:
	                            System.out.print("[BLANK]\t");
	                            break;
	                        default:
	                            System.out.print("[UNKNOWN]\t");
	                    }
	                }
	                System.out.println(); 
	            }

	        } catch (IOException e) {
	            System.out.println("❌ Error reading Excel file:");
	            e.printStackTrace();
	        }

	}

}
