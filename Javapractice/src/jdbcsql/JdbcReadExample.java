package jdbcsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import apputils.DBConnectionUtil;

public class JdbcReadExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Get connection using utility class
            conn = DBConnectionUtil.getConnection();
            if (conn == null) {
                System.out.println("❌ Could not establish connection.");
                return;
            }

            System.out.println("✅ Connected to the database");

            // SQL SELECT query
            String sql = "SELECT id, firstname, department FROM employee";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            // Display results
            System.out.println("---------------------------------------------");
            System.out.printf("%-5s %-20s %-20s%n", "ID", "Name", "Department");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("firstname");
                String department = rs.getString("department");

                System.out.printf("%-5d %-20s %-20s%n", id, name, department);
            }

        } catch (Exception e) {
            System.out.println("❌ Error occurred.");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("\n✅ Disconnected from the database.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
