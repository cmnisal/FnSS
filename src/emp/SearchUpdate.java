/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import fnss.functions.DB;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SearchUpdate extends javax.swing.JFrame {
  
    private ResultSet rset;
    private PreparedStatement pst;
    
    public SearchUpdate() {
        initComponents();
         search.setText("Enter Employee ID..");
            try {
            String q1="SELECT *  FROM employee  ";
            
            rset = DB.getDbCon().query(q1);
            jTable1.setModel(DbUtils.resultSetToTableModel(rset));
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back_1.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 19, -1, -1));

        jPanel3.setBackground(new java.awt.Color(236, 240, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 73, 94));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update Employee ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 220, 41));

        search.setBackground(new java.awt.Color(204, 218, 220));
        search.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 102));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/search icon - Copy.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 40, 40));

        jLabel2.setBackground(new java.awt.Color(231, 76, 60));
        jLabel2.setFont(new java.awt.Font("Lato Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Employee");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 110, 28));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EID", "Category", "Name", "Address", "DOB", "NIC", "Gender", "Phone", "Basic Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 730, 170));

        jLabel8.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel8.setText("Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 240, -1));

        jLabel9.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel9.setText("Category");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        category.setName("category"); // NOI18N
        jPanel3.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 240, -1));

        jLabel10.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel10.setText("DOB");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel11.setText("Address");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 240, -1));

        jLabel12.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel12.setText("NIC");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));
        jPanel3.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 240, -1));

        jLabel13.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel13.setText("Basic Salary");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));
        jPanel3.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 240, -1));

        jLabel14.setFont(new java.awt.Font("Lato Light", 0, 12)); // NOI18N
        jLabel14.setText("Phone");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 240, -1));

        dob.setName("dob"); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 240, -1));

        jDesktopPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 780, 500));

        jPanel2.setBackground(new java.awt.Color(105, 145, 152));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            category.setText("");
            name.setText("");
            address.setText("");
            nic.setText("");
            phone.setText("");
            basic.setText("");
            dob.setText("");
            
            String Category = category.getText();
            String Name = name.getText();
            String Address = address.getText();
            String NIC=nic.getText();
            int Phone = Integer.parseInt(phone.getText());
            double Basic= Double.parseDouble(basic.getText());
            String Search = search.getText();
            
            String q2="UPDATE employee SET Name='"+Name+"',Category='"+Category+"',Phone="+Phone+ ",Address='"+Address+"',NIC='"+NIC+"',BasicSalary="+Basic+" Where EID LIKE '"+Search+"'";
            DB.getDbCon().insert(q2);
            
            
            JOptionPane.showMessageDialog(null, "Record Update Successful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Record Update Failed!");
             Logger.getLogger(SearchUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       new Emp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        String Search = search.getText();

        try {
            String q1="SELECT EID,Name,Category,Phone,Address,Gender,NIC,DOB,BasicSalary FROM employee WHERE EID LIKE '%"+Search+"%' ";

            rset = DB.getDbCon().query(q1);
            jTable1.setModel(DbUtils.resultSetToTableModel(rset));

        } catch (SQLException ex) {
            Logger.getLogger(SearchUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         try {
            String sql1 = "select * from employee where EID ='"+search.getText()+"'";

            rset = DB.getDbCon().query(sql1);
            search.setText("");

            if(rset.next()){

                category.setText(rset.getString("Category"));
                name.setText(rset.getString("Name"));
                address.setText(rset.getString("Address"));
                nic.setText(rset.getString("NIC"));
                phone.setText(rset.getString("Phone"));
                basic.setText(rset.getString("BasicSalary"));
                dob.setText(rset.getString("DOB"));

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Employee ID does not exist!");
            }

        } catch (SQLException ex) {
           
        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       close();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
      search.setText("");
    }//GEN-LAST:event_searchMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            category.setText("");
            name.setText("");
            address.setText("");
            nic.setText("");
            phone.setText("");
            basic.setText("");
            dob.setText("");
        
        int r= jTable1.getSelectedRow();
                search.setText(((String)jTable1.getValueAt(r,0))); 
                category.setText(((String)jTable1.getValueAt(r,1)));  
                name.setText(((String)jTable1.getValueAt(r,2))); 
                address.setText(((String)jTable1.getValueAt(r,3)));
                dob.setText(jTable1.getValueAt(r,4).toString());
                nic.setText(jTable1.getValueAt(r,5).toString());
                phone.setText(jTable1.getValueAt(r,7).toString());               
                basic.setText(jTable1.getValueAt(r,8).toString());
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

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
            java.util.logging.Logger.getLogger(SearchUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField basic;
    private javax.swing.JTextField category;
    private javax.swing.JTextField dob;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
