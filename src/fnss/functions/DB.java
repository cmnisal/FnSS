package fnss.functions;

import com.mysql.jdbc.Connection;
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
    private DB() {
        String url= "jdbc:mysql://localhost:3306/";
        String dbName = "fnss";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = null;
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException sqle) {
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(null,"SQL Exception. Please Contact Support!\n"+sqle.getMessage());
        }
    }
    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized DB getDbCon() {
        if ( db == null ) {
            db = new DB();
        }
        return db;
 
    }
    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException{
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