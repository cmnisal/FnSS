
package emp;

import fnss.functions.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

public class AddEmp extends javax.swing.JFrame {
   
   String Gender;
   
    public AddEmp() {
        initComponents();
        groupButton();
      
       
    }
      private void groupButton()
        {
            ButtonGroup bg1 = new ButtonGroup();
            
            bg1.add(fRButton);
            bg1.add(mRButton);
            
        }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        basic = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        fRButton = new javax.swing.JRadioButton();
        mRButton = new javax.swing.JRadioButton();
        mmCombo = new javax.swing.JComboBox<>();
        yyCombo = new javax.swing.JComboBox<>();
        ddCombo = new javax.swing.JComboBox<>();
        face = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        power = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 650));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel3.setText("Category");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel5.setText("Phone");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel7.setText("Basic Salary");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel8.setText("DOB");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });
        jPanel2.add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 168, -1));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 168, -1));
        jPanel2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 168, -1));
        jPanel2.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 168, -1));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 168, -1));
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 168, -1));

        jLabel9.setFont(new java.awt.Font("Lato Heavy", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(44, 62, 80));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add New Employee");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 240, 40));

        jLabel10.setBackground(new java.awt.Color(231, 76, 60));
        jLabel10.setFont(new java.awt.Font("Lato Medium", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ADD");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 93, 29));

        jLabel11.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel11.setText("NIC");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel2.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 168, -1));

        fRButton.setFont(new java.awt.Font("Lato Thin", 0, 12)); // NOI18N
        fRButton.setText("Female");
        fRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRButtonActionPerformed(evt);
            }
        });
        jPanel2.add(fRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        mRButton.setFont(new java.awt.Font("Lato Thin", 0, 12)); // NOI18N
        mRButton.setText("Male");
        jPanel2.add(mRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        mmCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel2.add(mmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        yyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1978", "1979", "1980", "1981", "1982", "1983", "1984", "2985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998" }));
        jPanel2.add(yyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        ddCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(ddCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/face.png"))); // NOI18N
        jPanel2.add(face, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 560, 420));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back_1.png"))); // NOI18N
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        jPanel1.add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel14.setBackground(new java.awt.Color(39, 174, 96));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 829, 132));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1131, 11, 36, 32));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

    private void fRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fRButtonActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        String EID = eid.getText();
        String Name = name.getText();
        String  Address= address.getText();
        String  Phone= phone.getText();
        String Category = category.getText();
        String  NIC= nic.getText();
        String  Basic= basic.getText();
        String YY = yyCombo.getSelectedItem().toString();
        String DD = ddCombo.getSelectedItem().toString();
        String MM =  mmCombo.getSelectedItem().toString();
        if(mRButton.isSelected())
        {this.Gender="male" ;}
        if(fRButton.isSelected())
        {this.Gender="female" ;}
        String q ="INSERT INTO employee (EID,Category,Name,Address,DOB,NIC,Gender,Phone,BasicSalary)  "
                + "VALUES('"+EID+"','"+Category+"','"+Name+"','"+Address+"','"+YY+"-"+MM+"-"+DD+"','"+NIC+"','"+Gender+"','"+Phone+"','"+Basic+"')";
        int dOption = JOptionPane.showConfirmDialog(null, "Confirm insert?");
        if (dOption == JOptionPane.YES_OPTION) {
            
            try {
                DB.getDbCon().insert(q);
                JOptionPane.showMessageDialog(null, "Insertion Successful");
                
            } catch (SQLException ex) {
                Logger.getLogger(AddEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             
      
        
    }//GEN-LAST:event_jLabel10MouseClicked
    public class Function{   
        String mon;
    public String month(String m) throws SQLException{
           
        switch(m)
            {
                case "JAN":                  mon="01";    
                case "FEB":                  mon="02";    
                case "MAR":                  mon="03";    
                case "APR":                  mon="04";    
                case "MAY":                  mon="05";    
                case "JUN":                  mon="06";    
                case "JUL":                  mon="07";    
                case "AUG":                  mon="08";    
                case "SEP":                  mon="09";    
                case "OCT":                  mon="10";    
                case "NOV":                  mon="11";    
                case "DEC":                  mon="12";                                
            }
        
        
        return mon;
    }
}
    
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
      
        close();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JTextField basic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField category;
    private javax.swing.JComboBox<String> ddCombo;
    private javax.swing.JTextField eid;
    private javax.swing.JRadioButton fRButton;
    private javax.swing.JLabel face;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mRButton;
    private javax.swing.JComboBox<String> mmCombo;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel power;
    private javax.swing.JComboBox<String> yyCombo;
    // End of variables declaration//GEN-END:variables
}
