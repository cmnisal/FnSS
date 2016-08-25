package fnss.test;

import fnss.functions.DB;
import fnss.functions.DocNumGenerator;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nisal
 */
public class TestDB {

    public static void main(String[] args) {
        try {
            System.out.println(new DocNumGenerator().generateID("HIRE"));
        } catch (SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }
}
