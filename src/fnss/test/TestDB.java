package fnss.test;

import fnss.functions.DB;
import fnss.functions.DocNumGenerator;
import fnss.functions.ReportGenerator;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nisal
 */
public class TestDB {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("pos_id","POS1002");
        new ReportGenerator().printReport("MainBill",map);

       
    }
}
