package fnss.functions;

import com.mysql.jdbc.Connection;
import fnss.config.ReadConfig;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/*
 * DB Class
 *
 */

public final class DB {

    public Connection conn;
    private Statement statement;
    public static DB db;

    private DB() throws SQLException {
        String url = ReadConfig.db_url;
        String dbName = ReadConfig.db_name;
        String driver = ReadConfig.db_driver;
        String userName = ReadConfig.db_username;
        String password = ReadConfig.db_password;
        try {
            Class.forName(driver).newInstance();
            //System.out.println("Connecting to DB");
            this.conn = (Connection) DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException sqle) {
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Exception. Please Contact Support!\n" + sqle.getMessage());
            System.exit(0);
            getDbCon();
        }
    }

    /**
     *
     * @return MysqlConnect Database connection object
     * @throws java.sql.SQLException
     */
    public static synchronized DB getDbCon() throws SQLException {
        if (db == null) {
            db = new DB();
        }
        return db;

    }

    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not
     * available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }

}
