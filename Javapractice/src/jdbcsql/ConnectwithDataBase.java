package jdbcsql;

import java.sql.Connection;
import apputils.DBConnectionUtil;

public class ConnectwithDataBase {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DBConnectionUtil.getConnection();

            if (conn != null) {
                System.out.println("✅ Successfully connected to the database using utility class.");
            } else {
                System.out.println("❌ Failed to connect to the database.");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception occurred during DB connection.");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("✅ Connection closed.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
