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

    public String nextVal(String docType) throws SQLException {

        String mainQuery = "SELECT * FROM docNum WHERE docType='" + docType + "'";
        try (ResultSet rset = DB.getDbCon().query(mainQuery)) {
            if (!rset.next()) {
                String query = "INSERT INTO docNum (AutoCode,DocType) Values ('1001','" + docType + "')";
                DB.getDbCon().insert(query);
                DocNumber = 1000;
                DocChr = docType;
            } else {
                DocNumber = rset.getInt("AutoCode");
                DocChr = rset.getString("DocType");
                String query = "UPDATE docNum SET AutoCode = "+(DocNumber+1)+" WHERE DocType = '"+DocChr+"'";
                DB.getDbCon().insert(query);
            }
        }
        return DocChr+DocNumber;
    }
      public String curVal(String docType) throws SQLException {

        String mainQuery = "SELECT * FROM docNum WHERE DocType='" + docType + "'";
        try (ResultSet rset = DB.getDbCon().query(mainQuery)) {
            if (!rset.next()) {
                nextVal(docType);
            } else {
                DocNumber = rset.getInt("AutoCode")-1;
                DocChr = rset.getString("DocType");
            }
        }
        return DocChr+DocNumber;
    }
}
