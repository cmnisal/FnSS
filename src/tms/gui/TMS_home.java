package tms.gui;
import javax.swing.JOptionPane;

/**
 *
 * @author afkii
 */
public class TMS_home extends javax.swing.JFrame {

    /**
     * Creates new form tmsHome
     */
    public TMS_home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelFunctionImage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelExit = new javax.swing.JPanel();
        exitButtonLable = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        panelWhiteArea = new javax.swing.JPanel();
        panelButtonSet = new javax.swing.JPanel();
        lblNewHire = new javax.swing.JLabel();
        lblManageHires = new javax.swing.JLabel();
        lblHireHistory = new javax.swing.JLabel();
        lblManageVehicles = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelBlueStrip = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        panelFunctionImage.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tms/gui/images/47086972nbvc.png"))); // NOI18N

        javax.swing.GroupLayout panelFunctionImageLayout = new javax.swing.GroupLayout(panelFunctionImage);
        panelFunctionImage.setLayout(panelFunctionImageLayout);
        panelFunctionImageLayout.setHorizontalGroup(
            panelFunctionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunctionImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFunctionImageLayout.setVerticalGroup(
            panelFunctionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunctionImageLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(954, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panelFunctionImage);

        panelExit.setOpaque(false);

        exitButtonLable.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        exitButtonLable.setForeground(new java.awt.Color(255, 255, 255));
        exitButtonLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        exitButtonLable.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exitButtonLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonLableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addContainerGap(1120, Short.MAX_VALUE)
                .addComponent(exitButtonLable)
                .addContainerGap())
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButtonLable)
                .addContainerGap(1191, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panelExit);

        panelContent.setOpaque(false);

        panelWhiteArea.setBackground(new java.awt.Color(255, 255, 255));

        panelButtonSet.setOpaque(false);

        lblNewHire.setBackground(new java.awt.Color(231, 76, 60));
        lblNewHire.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblNewHire.setForeground(new java.awt.Color(255, 255, 255));
        lblNewHire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewHire.setText("New Hire");
        lblNewHire.setOpaque(true);
        lblNewHire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewHireMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNewHireMouseReleased(evt);
            }
        });

        lblManageHires.setBackground(new java.awt.Color(231, 76, 60));
        lblManageHires.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblManageHires.setForeground(new java.awt.Color(255, 255, 255));
        lblManageHires.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageHires.setText("Manage Hires");
        lblManageHires.setOpaque(true);
        lblManageHires.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblManageHiresMouseReleased(evt);
            }
        });

        lblHireHistory.setBackground(new java.awt.Color(231, 76, 60));
        lblHireHistory.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblHireHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblHireHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHireHistory.setText("Hire History");
        lblHireHistory.setOpaque(true);
        lblHireHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblHireHistoryMouseReleased(evt);
            }
        });

        lblManageVehicles.setBackground(new java.awt.Color(231, 76, 60));
        lblManageVehicles.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblManageVehicles.setForeground(new java.awt.Color(255, 255, 255));
        lblManageVehicles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageVehicles.setText("Manage Vehicles");
        lblManageVehicles.setOpaque(true);
        lblManageVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblManageVehiclesMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelButtonSetLayout = new javax.swing.GroupLayout(panelButtonSet);
        panelButtonSet.setLayout(panelButtonSetLayout);
        panelButtonSetLayout.setHorizontalGroup(
            panelButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblManageHires, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNewHire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHireHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblManageVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelButtonSetLayout.setVerticalGroup(
            panelButtonSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonSetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewHire, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblManageHires, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHireHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblManageVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Clarendon Blk BT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 71, 71));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TMS Home Page");

        javax.swing.GroupLayout panelWhiteAreaLayout = new javax.swing.GroupLayout(panelWhiteArea);
        panelWhiteArea.setLayout(panelWhiteAreaLayout);
        panelWhiteAreaLayout.setHorizontalGroup(
            panelWhiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteAreaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(panelWhiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelButtonSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        panelWhiteAreaLayout.setVerticalGroup(
            panelWhiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWhiteAreaLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelButtonSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(panelWhiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(panelWhiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panelContent);

        panelBlueStrip.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(52, 73, 94));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout panelBlueStripLayout = new javax.swing.GroupLayout(panelBlueStrip);
        panelBlueStrip.setLayout(panelBlueStripLayout);
        panelBlueStripLayout.setHorizontalGroup(
            panelBlueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlueStripLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panelBlueStripLayout.setVerticalGroup(
            panelBlueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlueStripLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 962, Short.MAX_VALUE))
        );

        jLayeredPane1.add(panelBlueStrip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonLableMouseClicked
        close();
    }//GEN-LAST:event_exitButtonLableMouseClicked

    private void lblNewHireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewHireMouseClicked
        
    }//GEN-LAST:event_lblNewHireMouseClicked

    private void lblNewHireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewHireMouseReleased
        new TMS_newHire(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblNewHireMouseReleased

    private void lblManageHiresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageHiresMouseReleased
        new TMS_manageHires().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblManageHiresMouseReleased

    private void lblHireHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHireHistoryMouseReleased
        new TMS_hireHistory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblHireHistoryMouseReleased

    private void lblManageVehiclesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVehiclesMouseReleased
        new TMS_manageVehicles().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblManageVehiclesMouseReleased

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
            java.util.logging.Logger.getLogger(TMS_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TMS_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TMS_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TMS_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMS_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitButtonLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblHireHistory;
    private javax.swing.JLabel lblManageHires;
    private javax.swing.JLabel lblManageVehicles;
    private javax.swing.JLabel lblNewHire;
    private javax.swing.JPanel panelBlueStrip;
    private javax.swing.JPanel panelButtonSet;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelFunctionImage;
    private javax.swing.JPanel panelWhiteArea;
    // End of variables declaration//GEN-END:variables
}
