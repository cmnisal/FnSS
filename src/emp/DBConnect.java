/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnect {
      
    static java.sql.Connection connect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
        private Connection conn;
        private String url;
        private String uname;
        private String pwd;


        public DBConnect(){
            this.url = "jdbc:mysql://localhost/fnss";
            this.uname = "root";
            this.pwd = null;
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                this.conn = (Connection) DriverManager.getConnection(url,uname,pwd);
        //        JOptionPane.showMessageDialog(null, "Connection established");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
        public void close(){
            try{
                this.conn.close();
            }catch(Exception e){
                
            }
        }
        
        public Connection getConnection(){
            return this.conn;
        }
    
}
