package fileoperations;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class File_write {

	public static void main(String[] args) {
		Workbook w = new SXSSFWorkbook();
		Sheet sheet = w.createSheet("newsheet");
		Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
		cell.setCellValue("used_id");
		 
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("name");
		
		try (FileOutputStream fos = new FileOutputStream("D:/sample_output.xlsx")) {
            w.write(fos);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
		
	}


