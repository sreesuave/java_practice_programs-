package fileoperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToMapUtil {

    public static Map<String, String> readExcelToMap(String filePath) {
        Map<String, String> map = new HashMap<>();

        try (FileInputStream fis = new FileInputStream("D:\\testdata.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); 

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { 
                Row row = sheet.getRow(i);
                if (row == null) continue;

                Cell keyCell = row.getCell(0); 
                Cell valueCell = row.getCell(1); 

                String key = getCellValueAsString(keyCell);
                String value = getCellValueAsString(valueCell);

                if (!key.isEmpty()) {
                    map.put(key, value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    // Helper method to convert any cell to string
    private static String getCellValueAsString(Cell cell) {
        if (cell == null) return "";
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue().trim();
            case NUMERIC -> String.valueOf((int) cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            case FORMULA -> cell.getCellFormula();
            default -> "";
        };
    }

    // Example usage
    public static void main(String[] args) {
        String path = "D:/data.xlsx";
        Map<String, String> result = readExcelToMap(path);

        System.out.println("Excel to HashMap:");
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
