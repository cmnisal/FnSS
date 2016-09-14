package fnss.functions;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Nisal
 */
public class ReportGenerator {

    JasperDesign jasperdesign;
    JasperReport jasperreport;
    JasperPrint jasperprint;
    Map map;
    String projectPath;

    public void printReport(String report, Map map) {
        try {
            projectPath = System.getProperty("user.dir") + "\\Reports\\";
            jasperdesign = JRXmlLoader.load(projectPath + report + ".jrxml");
            jasperreport = JasperCompileManager.compileReport(jasperdesign);
            try {
                jasperprint = JasperFillManager.fillReport(jasperreport, map, DB.getDbCon().conn);
            } catch (SQLException ex) {
                Logger.getLogger(ReportGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }

            List pages = jasperprint.getPages();
            if (!pages.isEmpty()) {
                JasperViewer.viewReport(jasperprint, false); //new JasperViewer(jasperprint).setVisible(true);
            } else {
                System.out.println(Arrays.toString(map.keySet().toArray()));
                JOptionPane.showMessageDialog(null, "Document has no pages", "No Pages", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (JRException ex) {
            Logger.getLogger(ReportGenerator.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
}
