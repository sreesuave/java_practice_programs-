package apputils;

import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    Properties props = new Properties();

    public ReadProperties() {
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("dbconfig.properties");
            if (is == null) {
                throw new RuntimeException("⚠️ dbconfig.properties not found in classpath.");
            }
            props.load(is);
        } catch (Exception e) {
            System.out.println("❌ Failed to load properties.");
            e.printStackTrace();
        }
    }

    public String getSqlDriver() {
        return props.getProperty("sql.driver");
    }

    public String getSqlPath() {
        return props.getProperty("sql.url");
    }

    public String getSqlUserName() {
        return props.getProperty("sql.username");
    }

    public String getSqlPassowrd() {
        return props.getProperty("sql.password");
    }

    public String getSqlReadQuery() {
        return props.getProperty("sql.readquery");
    }
}
