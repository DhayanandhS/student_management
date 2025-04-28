package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import utils.PropertyUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Properties getConnectionProperties(String filePath) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\dhaya\\eclipse-workspace\\student_management\\src\\resources\\db.properties");
        props.load(fis);
        fis.close();
        return props;
    }
    
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        Properties props = DBConnection.getConnectionProperties("src/database.properties");

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.username");
        String pass = props.getProperty("db.password");
        String driver = props.getProperty("db.driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, pass);
        // System.out.println("Connected to DB!");
    
    return connection;
}
    
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Database Connected Successfully!");
            } else {
                System.out.println("❌ Failed to connect to the Database.");
            }
        } catch (Exception e) {
            System.out.println("❌ Error occurred while connecting to DB: " + e.getMessage());
            e.printStackTrace();
        }
    }

	
}

