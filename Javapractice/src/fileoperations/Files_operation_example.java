package fileoperations;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Files_operation_example {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();  
        Sheet sheet = workbook.createSheet("Test Sheet");

        Row row = sheet.createRow(0);           // First row
        Cell cell = row.createCell(0);          // First column
        cell.setCellValue("Hello, Apache POI!");

        try (FileOutputStream fos = new FileOutputStream("D:/test_excel_output.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
