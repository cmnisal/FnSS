/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import fnss.functions.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DEN
 */
public class PayrollDetails extends javax.swing.JFrame {

    private ResultSet rset1;
    private ResultSet rset2;
    
    public PayrollDetails() {
        initComponents();
        this.setLocationRelativeTo(null);
        
            search.setText("Enter the EID..");
        
        String q1="SELECT EID,Basic,EPF,TotAllowance,TotalSalary,Month,Year,AccountantID FROM payroll";
            
     try {
         rset1 = DB.getDbCon().query(q1);
         jTable1.setModel(DbUtils.resultSetToTableModel(rset1));
     } catch (SQLException ex) {
         Logger.getLogger(CheckAllocation.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
       private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
      }

    public class Function{   
            String mon;
        public String month(String m) throws SQLException{

            if (null != m)
                switch (m) {
                    case "JAN":
                        mon="01";
                        break;
                    case "FEB":
                        mon="02";
                        break;
                    case "MAR":
                        mon="03";
                        break;
                    case "APR":
                        mon="04";
                        break;
                    case "MAY":
                        mon="05";
                        break;
                    case "JUN":                  
                        mon="06"; 
                          break;
                    case "JUL": 
                        mon="07";    
                          break;
                    case "AUG": 
                        mon="08";    
                          break;
                    case "SEP": 
                        mon="09";    
                          break;
                    case "OCT": 
                        mon="10";    
                          break;
                    case "NOV": 
                        mon="11";
                          break;
                    case "DEC": 
                        mon="12"; 
                          break;

                    default:
                        break;
                }

            return mon;
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        mmCombo = new javax.swing.JComboBox<>();
        search = new javax.swing.JLabel();
        yyCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EID", "Basic", "EPF", "Extra Allowance", "Net salary", "Month", "Year", "Accountant ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 600, 250));

        jLabel4.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payroll Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 130, 30));

        mmCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        jPanel1.add(mmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        search.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 102));
        search.setOpaque(true);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, 20));

        yyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2014", "2015", "2016" }));
        jPanel1.add(yyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Pick Pay Unit");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/search icon - Copy.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, 20));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back_1.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(52, 73, 94));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 197));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         int status=0;
        try {
            Function f = new Function();
            
            String Search = search.getText();
            String YY = yyCombo.getSelectedItem().toString();
            String MM = f.month(mmCombo.getSelectedItem().toString());
            
            if (Search.length() ==0)
            { JOptionPane.showMessageDialog(null, "Enter the EID");  status=-1;}
            
            if(status!=-1)
            {
                String q2="SELECT  EID,Basic,EPF,TotAllowance,TotalSalary,Month,Year,AccountantID FROM payroll WHERE EID='"+Search+"'";
               rset2 = DB.getDbCon().query(q2);
                 jTable1.setModel(DbUtils.resultSetToTableModel(rset2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CheckAllocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
      new Payroll().setVisible(true);
      this.dispose();
        
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayrollDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mmCombo;
    private javax.swing.JLabel search;
    private javax.swing.JComboBox<String> yyCombo;
    // End of variables declaration//GEN-END:variables
}
