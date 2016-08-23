/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fnss.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan
 */
public class ReadConfig {

    public static String db_driver;
    public static String db_url;
    public static String db_username;
    public static String db_password;
    public static String db_name;

    static {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("src\\fnss\\config\\config.properties"));
            String ip = prop.getProperty("db_ip");
            db_name = prop.getProperty("db_name");
            db_username = prop.getProperty("db_username");
            db_password = prop.getProperty("db_password");
            db_driver = prop.getProperty("db_driver");
            if (db_driver.equals("SQL2000")) {
                db_driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
                db_url = "jdbc:microsoft:sqlserver://" + ip + ":1433;DatabaseName=" + db_name;
            } else if (db_driver.equals("SQL2005")) {
                db_driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                db_url = "jdbc:sqlserver://" + ip + ":1433;databaseName=" + db_name;
            } else if (db_driver.equals("MySQL")) {
                db_driver = "com.mysql.jdbc.Driver";
                db_url = "jdbc:mysql://" + ip + ":3306/" + db_name;
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Can't read Config file");
            ex.printStackTrace();
            System.exit(0);
        }
    }
}
