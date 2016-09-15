/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import fnss.functions.DB;
import javax.swing.ButtonGroup;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEN
 */
public class Allocation extends javax.swing.JFrame {
String loc = null;
String slot = null;
    
    public Allocation() {
        initComponents();
        groupButton();
        this.setLocationRelativeTo(null);
        eid.setText("Enter the Employee ID..");
    }
    
        private void groupButton()
        {
            ButtonGroup bg2 = new ButtonGroup();
            
            bg2.add(r1);
            bg2.add(r2);
            bg2.add(r3);
            bg2.add(r4);
            bg2.add(r5);
            bg2.add(r6);
            bg2.add(s1);
            bg2.add(s2);
            
        }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ddCombo = new javax.swing.JComboBox<>();
        mmCombo = new javax.swing.JComboBox<>();
        yyCombo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 40, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back_1.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jDesktopPane1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2.setMaximumSize(new java.awt.Dimension(130, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lato Heavy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("Attendants Allocation");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        eid.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        eid.setForeground(new java.awt.Color(102, 102, 102));
        eid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eidMouseClicked(evt);
            }
        });
        eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eidKeyPressed(evt);
            }
        });
        jPanel2.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 90, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 77));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        r1.setActionCommand("P-A-01");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel2.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel2.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));
        jPanel2.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        jPanel2.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/stock-illustration-37848698-car-flat-icon_1.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 90, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/stock-illustration-37848698-car-flat-icon_1.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 80, 74));

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel2.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));
        jPanel2.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel10.setText("P-A-01");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel11.setText("D-Sup-01");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel12.setText("D-A-01");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel13.setText("D-Xt-01");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel14.setText("Ser-01");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel15.setText("Ser-02");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jLabel17.setBackground(new java.awt.Color(102, 153, 255));
        jLabel17.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Allocate");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 90, 30));

        ddCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(ddCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 50, -1));

        mmCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        jPanel2.add(mmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        yyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018", "2019", "2020" }));
        jPanel2.add(yyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, -1));

        jLabel18.setBackground(new java.awt.Color(102, 153, 255));
        jLabel18.setFont(new java.awt.Font("Lato Medium", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Allocations History");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 120, 30));

        jLabel19.setFont(new java.awt.Font("Lato Medium", 0, 12)); // NOI18N
        jLabel19.setText("Pick the date");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));
        jPanel2.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        jPanel2.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 90, 80));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/pipe-p.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 90, 80));

        jLabel23.setText("P-Xt-01");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel24.setText("P-Sup-01");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 770, 470));

        jLabel1.setBackground(new java.awt.Color(52, 73, 94));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 160));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 950, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       close();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       new Emp().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked
    
    
    
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
    int status=0;
        try {
             //assigned location(pump)
           
            Function f = new Function();
            
            String EID = eid.getText();
            String YY = yyCombo.getSelectedItem().toString();
            String DD = ddCombo.getSelectedItem().toString();
            String MM = f.month(mmCombo.getSelectedItem().toString());            
                        
            if(r1.isSelected())
            { this.slot="P-A-01" ; this.loc="Fuel Station";}
            if(r2.isSelected())
            { this.slot="P-Xt-01" ; this.loc="Fuel Station";}
            else if(r3.isSelected())
            { this.slot="D-A-01" ; this.loc="Fuel Station";}
            else if(r4.isSelected())
            { this.slot="D-Xt-01" ;  this.loc="Fuel Station";}
            else if(r5.isSelected())
            { this.slot="P-Sup-01" ; this.loc="Fuel Station";}
            else if(r6.isSelected())
            { this.slot="D-Sup-01" ;  this.loc="Fuel Station";}
            else if(s1.isSelected())
            { this.slot="Ser-01" ; this.loc="Service Station";}
            else if(s2.isSelected())
            { this.slot="Ser-02" ;  this.loc="Service Station";}
            else
            {JOptionPane.showMessageDialog(null, "Please pick a slot!"); status=2;}
            
             if(EID.length()==0)
           {JOptionPane.showMessageDialog(null, "Please Enter the Employee ID!"); status=2;}
           
             if(status !=2){
        
            
            String q="INSERT INTO allocation (EID,Date,Location,Slot) VALUES('"+EID+"','"+YY+"-"+MM+"-"+DD+"','"+this.loc+"','"+this.slot+"')";
            
            int dOption = JOptionPane.showConfirmDialog(null, "Confirm Allocation?");
           if (dOption == JOptionPane.YES_OPTION) {
               
               try {
                   DB.getDbCon().insert(q);
                   JOptionPane.showMessageDialog(null, "Allocation Successful");
                   
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Please Enter a Valid Employee ID!");
                   Logger.getLogger(Allocation.class.getName()).log(Level.SEVERE, null, ex);
               }
           }}
            
        } catch (SQLException ex) {
            Logger.getLogger(Allocation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       new CheckAllocation().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void eidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidKeyPressed

    private void eidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eidMouseClicked
       eid.setText("");
    }//GEN-LAST:event_eidMouseClicked

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
            java.util.logging.Logger.getLogger(Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> ddCombo;
    private javax.swing.JTextField eid;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mmCombo;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JComboBox<String> yyCombo;
    // End of variables declaration//GEN-END:variables
}
