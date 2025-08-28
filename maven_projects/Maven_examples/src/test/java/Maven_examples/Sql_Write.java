package Maven_examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Apputils.DBConnection;

public class Sql_Write {

    public static void main(String[] args) {
        String[][] userData = {
            {"usersree", "User@12345"},
            {"john_doe123", "Test@12345"},
            {"alice_w", "Alice@2025"},
            {"mike89", "Mike@Pass99"},
            {"emma_k", "Emma@#2024"},
            {"rohit_22", "Rohit@123"},
            {"linda_m", "Linda@5678"},
            {"paul_dev", "Dev@2025pass"},
            {"charan_s", "Charan@09"},
            {"nina_t", "Nina@Secure"}
        };
 try (Connection conn = DBConnection.getConnection()) {
            System.out.println("Database connected");

            String sql = "INSERT INTO UserLoginDetails (userid, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            for (String[] user : userData) {
                stmt.setString(1, user[0]);
                stmt.setString(2, user[1]);
                stmt.addBatch();
            }

            int[] rowsInserted = stmt.executeBatch();
            System.out.println(rowsInserted.length + " records inserted successfully.");
             stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
