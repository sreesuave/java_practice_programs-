package jdbcsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;

import apputils.DBConnectionUtil;

public class InserUpdateDeleteEX {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DBConnectionUtil.getConnection();
            if (conn == null) {
                System.out.println("❌ Could not establish connection.");
                return;
            }

            System.out.println("✅ Connected to the database");

            // 1️⃣ INSERT
            String insertQuery = "INSERT INTO employee (id, firstname, lastname, department, salary, date_of_joining) " +
                                 "VALUES (101, 'Test', 'User', 'QA', 60000.00, '2025-08-05')";
            int inserted = conn.createStatement().executeUpdate(insertQuery);
            if (inserted > 0) {
                System.out.println("✅ Row inserted.");
            }

            System.out.println("\n📄 Employee Table After INSERT:");
            printEmployeeTable(conn);

            // 2️⃣ UPDATE
            String updateQuery = "UPDATE employee SET department = 'Testing', salary = 62000.00 WHERE id = 101";
            int updated = conn.createStatement().executeUpdate(updateQuery);
            if (updated > 0) {
                System.out.println("✅ Row updated.");
            }

            System.out.println("\n📄 Employee Table After UPDATE:");
            printEmployeeTable(conn);

            // 3️⃣ DELETE
            String deleteQuery = "DELETE FROM employee WHERE id = 101";
            int deleted = conn.createStatement().executeUpdate(deleteQuery);
            if (deleted > 0) {
                System.out.println("✅ Row deleted.");
            }

            System.out.println("\n📄 Employee Table After DELETE:");
            printEmployeeTable(conn);

        } catch (Exception e) {
            System.out.println("❌ Error occurred.");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
                System.out.println("\n✅ Disconnected from the database.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 🔁 Utility method to display all rows
    private static void printEmployeeTable(Connection conn) {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT id, firstname, lastname, department, salary, date_of_joining FROM employee");

            System.out.printf("%-5s %-12s %-12s %-15s %-10s %-15s%n", "ID", "First", "Last", "Department", "Salary", "DateJoined");
            System.out.println("----------------------------------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String fname = rs.getString("firstname");
                String lname = rs.getString("lastname");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");
                Date doj = rs.getDate("date_of_joining");

                System.out.printf("%-5d %-12s %-12s %-15s %-10.2f %-15s%n",
                        id, fname, lname, dept, salary, doj.toString());
            }
        } catch (Exception e) {
            System.out.println("❌ Failed to print employee table.");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
