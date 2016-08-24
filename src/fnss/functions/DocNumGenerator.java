/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fnss.functions;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thushara
 */
public class DocNumGenerator {

    private int DocNumber;
    private String DocChr;

    public void methodNumGen(String docType) throws SQLException {

        String query1 = "SELECT * FROM DocNumGenerator WHERE DocType='" + docType + "'";
        try (ResultSet rset = DB.getDbCon().query(query1)) {
            if (!rset.next()) {
                String query = "INSERT INTO DocNumGenerator (AutoCode,DocType) Values ('1001','" + docType + "')";
                DB.getDbCon().insert(query);
                DocNumber = 1000;
                DocChr = docType;
            } else {
                DocNumber = rset.getInt("AutoCode");
                DocChr = rset.getString("DocType");
                rset.updateInt("AutoCode", (DocNumber + 1));
                rset.updateRow();
            }
        }
    }

    public String getDocChar() {
        return DocChr;
    }

    public int getDocNumber() {
        return DocNumber;
    }
}
