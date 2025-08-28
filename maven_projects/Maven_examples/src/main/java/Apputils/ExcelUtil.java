package Apputils;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil {
private Workbook workbook;
    private Sheet sheet;
    private int rowNum;
public ExcelUtil(String sheetName) {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(sheetName);
        rowNum = 0;
// Create header row
        Row header = sheet.createRow(rowNum++);
        header.createCell(0).setCellValue("User ID");
        header.createCell(1).setCellValue("Password");
        header.createCell(2).setCellValue("Login Message");
    }// Add a row with user data
    public void addRow(String userId, String password, String loginMessage) {
        Row row = sheet.createRow(rowNum++);
        row.createCell(0).setCellValue(userId);
        row.createCell(1).setCellValue(password);
        row.createCell(2).setCellValue(loginMessage);
    }
// Save Excel file
    public void save(String fileName) throws IOException {
        // Auto-size columns for better readability
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }
 FileOutputStream fileOut = new FileOutputStream(fileName);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
        System.out.println("Excel file saved: " + fileName);
    }
}
