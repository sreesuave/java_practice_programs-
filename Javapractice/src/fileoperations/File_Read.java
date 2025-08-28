package fileoperations;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class File_Read {

	public static void main(String[] args) {
		Workbook w = new SXSSFWorkbook();
		Sheet sheet = w.createSheet("newsheet");
		System.out.println("enter no of rows");
		Scanner sc = new Scanner(System.in);
		int no_of_rows = sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i<no_of_rows;i++)
		{
			System.out.print("Enter user_id: ");
            String userId = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            Row row = sheet.createRow(i);
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(userId);

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(name);
		}
		
		try (FileOutputStream fos = new FileOutputStream("D:/sample_output_multiple.xlsx")) {
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


