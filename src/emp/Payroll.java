/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import fnss.functions.DB;
import fnss.functions.DocNumGenerator;
import fnss.test.TestDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Payroll extends javax.swing.JFrame {

    ResultSet rset, rset2;

    Double tot = 0.0; //gross salary
    Double Basic = 0.0; //basic salary
    String EID;
    String Description;
    String Accountant;  //accountant ID of the accoountant who genarated the bill 
    Double TotAllowance = 0.0;
    Double EPF = 0.0; //epf deduction
    Double totalSal = 0.0;    //netSalary
    String q1, q2, q3;
    String MM, YY;
    String PID; //payroll ID

    public Payroll() {
        initComponents();
        this.setLocationRelativeTo(null);
        accountant.setText("Enter Accountant ID..");
        eid.setText("Enter Employee ID..");

        try {
            pid.setText(new DocNumGenerator().nextVal("PAY"));
        } catch (SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
                },
                new String[]{
                    "Allowance", "Description"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        accountant = new javax.swing.JTextField();
        yyCombo = new javax.swing.JComboBox<>();
        mmCombo = new javax.swing.JComboBox<>();
        eid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        epf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        power = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel7.setText("jLabel7");

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountant.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        accountant.setForeground(new java.awt.Color(102, 102, 102));
        accountant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountantMouseClicked(evt);
            }
        });
        jPanel2.add(accountant, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 190, 25));

        yyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036" }));
        jPanel2.add(yyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        mmCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        jPanel2.add(mmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        eid.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        eid.setForeground(new java.awt.Color(102, 102, 102));
        eid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eidMouseClicked(evt);
            }
        });
        jPanel2.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 270, 25));

        jLabel2.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel2.setText("Payroll ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel3.setText("Payment Unit ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel8.setText("Accountant");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));
        jPanel2.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 270, -1));

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 270, -1));

        jLabel10.setBackground(new java.awt.Color(102, 153, 255));
        jLabel10.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Payroll Details");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 109, 20));

        jLabel9.setBackground(new java.awt.Color(102, 153, 255));
        jLabel9.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Calculate Salary");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 110, 30));

        jLabel11.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel11.setText("Basic Salary");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel12.setText("Total Salary");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel15.setText("EPF");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 41, -1));
        jPanel2.add(epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 270, -1));

        jLabel1.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 62, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payroll Generation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 280, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Allowance", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 330, 110));

        jLabel5.setBackground(new java.awt.Color(102, 153, 255));
        jLabel5.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Submit");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 110, 30));

        jLabel14.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel14.setText("Extra Allowances");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel17.setText("Employee ID");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 270, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 780, 580));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back_1.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerMouseClicked(evt);
            }
        });
        jPanel1.add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jLabel16.setBackground(new java.awt.Color(52, 73, 94));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 230));

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        //retrieving entered values from the table
        Double totalall = 0.00;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) != null && jTable1.getValueAt(i, 1) != null) {

                totalall += Double.parseDouble(jTable1.getValueAt(i, 0).toString());

                try {
                    String q3 = "INSERT INTO allowances (PID,Amount,Description) VALUES ('"
                            + pid.getText() + "'," + Double.parseDouble(jTable1.getValueAt(i, 0).toString())
                            + ",'" + jTable1.getValueAt(i, 1).toString() + "')";
                    DB.getDbCon().insert(q3);
                } catch (SQLException ex) {
                    Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
       // totAllowance.setText("" + totalall);
         TotAllowance = totalall;

        try {
            Function f = new Function();

            EID = eid.getText();
            YY = yyCombo.getSelectedItem().toString();
            MM = f.month(mmCombo.getSelectedItem().toString());
            Accountant = accountant.getText();

            //field validation
            if (EID.length() == 0) {
                JOptionPane.showMessageDialog(null, "Employee ID can't be empty!");
            }

            try {
                q1 = "SELECT BasicSalary FROM employee WHERE EID='" + EID + "'";
                rset = DB.getDbCon().query(q1);

                if (rset.next()) {
                    Basic = Double.parseDouble(rset.getString("BasicSalary"));
                    basic.setText(rset.getString("BasicSalary"));
                }

                tot = Basic + TotAllowance;
                EPF = Basic * 0.08;
                epf.setText(EPF.toString());

                totalSal = tot - EPF;
                total.setText(totalSal.toString());

                Accountant = accountant.getText();

            } catch (SQLException ex) {
                Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                q3 = "SELECT PID FROM payroll WHERE EID='" + EID + "',BasicSalary=" + Basic + ",EPF=" + EPF + ",TotalAllowance=" + TotAllowance + ",TotalSalary=" + totalSal + ",AccountantID='" + Accountant + "',Month='" + MM + "',Year='" + YY + "')";
                rset2 = DB.getDbCon().query(q1);

                if (rset2.next()) {
                    PID = rset2.getString("BasicSalary");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Payroll.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jLabel9MouseClicked
    public static double sum(Double[] values) {
        double result = 0;
        for (double value : values) {
            result += value;
        }
        return result;
    }


    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    public class Function {

        String mon;

        public String month(String m) throws SQLException {

            if (null != m) {
                switch (m) {
                    case "JAN":
                        mon = "01";
                        break;
                    case "FEB":
                        mon = "02";
                        break;
                    case "MAR":
                        mon = "03";
                        break;
                    case "APR":
                        mon = "04";
                        break;

                    case "MAY":
                        mon = "05";
                        break;
                    case "JUN":
                        mon = "06";
                        break;
                    case "JUL":
                        mon = "07";
                        break;
                    case "AUG":
                        mon = "08";
                        break;
                    case "SEP":
                        mon = "09";
                        break;
                    case "OCT":
                        mon = "10";
                        break;
                    case "NOV":
                        mon = "11";
                        break;
                    case "DEC":
                        mon = "12";
                        break;

                    default:
                        break;
                }
            }

            return mon;
        }
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new PayrollDetails().setVisible(true);


    }//GEN-LAST:event_jLabel10MouseClicked

    private void powerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseClicked
        close();
    }//GEN-LAST:event_powerMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Emp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            q2 = "INSERT INTO payroll (PID,EID,Basic,EPF,TotAllowance,TotalSalary,AccountantID,Month,Year) VALUES ('" + pid.getText() + "','" + EID + "'," + Basic + "," + EPF + "," + TotAllowance + "," + totalSal + ",'" + Accountant + "','" + MM + "','" + YY + "')";
            DB.getDbCon().insert(q2);

            JOptionPane.showMessageDialog(null, "Successfully Submitted");

        } catch (Exception ex) {

            Logger.getLogger(SearchUpdate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to Submit!!");
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void eidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eidMouseClicked
      eid.setText("");
    }//GEN-LAST:event_eidMouseClicked

    private void accountantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountantMouseClicked
       accountant.setText("");
    }//GEN-LAST:event_accountantMouseClicked

    private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountant;
    private javax.swing.JLabel back;
    private javax.swing.JTextField basic;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField epf;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mmCombo;
    private javax.swing.JTextField pid;
    private javax.swing.JLabel power;
    private javax.swing.JTextField total;
    private javax.swing.JComboBox<String> yyCombo;
    // End of variables declaration//GEN-END:variables
}
