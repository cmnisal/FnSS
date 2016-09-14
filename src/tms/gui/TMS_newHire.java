package tms.gui;

import fnss.functions.DB;
import fnss.functions.DocNumGenerator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afkii
 */
public class TMS_newHire extends javax.swing.JFrame {

    /**
     * Creates new form tmsNewHire
     */
    public TMS_newHire() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        loadTypesCombo();
    }

    //parent ui
    public TMS_newHire(JFrame ui) {
        try {
            parentUI = ui;
            initComponents();
            this.setLocationRelativeTo(null);
            this.setExtendedState(MAXIMIZED_BOTH);
            loadTypesCombo();
        } catch (Exception ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    JFrame parentUI;

    //load from table row double click
    public TMS_newHire(String hireId) {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.setExtendedState(MAXIMIZED_BOTH);
            loadTypesCombo();

            String query = "SELECT hire.vehicleRegNo, "
                    + "vehicle.type, "
                    + "vehicle.capacity, "
                    + "hire.cusID, "
                    + "hire.startMilage, "
                    + "hire.endMilage, "
                    + "hire.startDate, "
                    + "hire.endDate, "
                    + "hire.estimatedEnd, "
                    + "hire.calcMethod, "
                    + "hire.depositAmt, "
                    + "hire.estimatedRental"
                    + "FROM tms_hire hire, tms_hirevehicle vehicle"
                    + "WHERE hire.hireID = '" + hireId + "' "
                    + "AND hire.vehicleRegNo =  vehicle.vehicleRegNo;";
            System.out.println(query);
        } catch (Exception ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //load vehicle type into combobox
    private void loadTypesCombo() {
        try {
            String query = "SELECT distinct type FROM tms_hirevehicle";
            System.out.println(query);
            ResultSet rs = DB.getDbCon().query(query);
            while (rs.next()) {
                String type = rs.getString("type");
                typeComboBox.addItem(type);
            }
            loadVehicles(typeComboBox.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //load regNumbers into combobox after type selected
    private void loadVehicles(String type) {
        try {
            vehicleNumComboBox.removeAllItems();
            String query = "SELECT * FROM tms_hirevehicle WHERE type = '" + type + "'";
            System.out.println(query);
            ResultSet rs = DB.getDbCon().query(query);
            while (rs.next()) {
                String regNo = rs.getString("vehicleRegNo");
                vehicleNumComboBox.addItem(regNo);
            }
            loadCapacity(vehicleNumComboBox.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //load capacity
    private void loadCapacity(String regno) {
        try {
            String query = "SELECT * FROM tms_hirevehicle WHERE vehicleRegNo = '" + regno + "'";
            System.out.println(query);
            ResultSet rs = DB.getDbCon().query(query);
            while (rs.next()) {
                String capacity = rs.getString("capacity");
                capacityTxt.setText(capacity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //rental calculation method-------------------------------------------------------------------
    private double calcRental(String regNo) {
        double rental = 0;
        String calcMethod = calcMethodComboBox.getSelectedItem().toString();
        double rate = 0;
        int duration = 0;

        //calculating rental duration
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("hh:mm");
        
        Date d1 = null;
        Date d2 = null;
        try {
            JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinnerEnd,"HH:mm");de.getTextField().getText();
            d1 = format.parse(new SimpleDateFormat("yy/MM/dd").format(jXDatePicker1.getDate()) + " " +new JSpinner.DateEditor(jSpinnerEnd,"HH:mm").getTextField().getText());
            d2 = format.parse(new SimpleDateFormat("yy/MM/dd").format(jXDatePicker2.getDate()) + " " + new JSpinner.DateEditor(jSpinnerStart,"HH:mm").getTextField().getText());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = d2.getTime() - d1.getTime();
        long diffHours = diff / (60 * 60 * 1000);

        if (calcMethod == "Daily") {
            try {
                String query = "SELECT dailyRate FROM tms_hirevehicle "
                        + "WHERE vehicleRegNo = '" + regNo + "';";
                System.out.println(query);
                ResultSet rs = DB.getDbCon().query(query);
                while (rs.next()) {
                    rate = rs.getDouble("dailyRate");
                }

                rental = rate * (int) (diffHours / 24);

            } catch (SQLException ex) {
                Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (calcMethod == "Hourly") {
            try {
                String query = "SELECT hourlyRate FROM tms_hirevehicle "
                        + "WHERE vehicleRegNo = '" + regNo + "';";
                System.out.println(query);
                ResultSet rs = DB.getDbCon().query(query);
                while (rs.next()) {
                    rate = rs.getDouble("hourlyRate");
                }

                rental = rate * (int) diffHours;

            } catch (SQLException ex) {
                Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return rental;
    }

    //close button function
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
        functionImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        contentArea = new javax.swing.JPanel();
        whiteArea = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCusSearch = new javax.swing.JLabel();
        lblStartHire = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        capacityTxt = new javax.swing.JTextField();
        currentMilateTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        calcMethodComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        depAmntTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cusNameTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cusMobileTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cusNicTxt = new javax.swing.JTextField();
        lblEndHire = new javax.swing.JLabel();
        lblHireID = new javax.swing.JLabel();
        vehicleNumComboBox = new javax.swing.JComboBox<>();
        jSpinnerStart = new javax.swing.JSpinner(new SpinnerDateModel());
        jSpinnerEnd = new javax.swing.JSpinner(new SpinnerDateModel());
        lblRental = new javax.swing.JLabel();
        exitButton = new javax.swing.JPanel();
        exitButtonLable = new javax.swing.JLabel();
        backButton = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        blueStrip = new javax.swing.JPanel();
        lblBlueStrip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        functionImage.setOpaque(false);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tms/gui/images/tanker 95 x 95.png"))); // NOI18N

        javax.swing.GroupLayout functionImageLayout = new javax.swing.GroupLayout(functionImage);
        functionImage.setLayout(functionImageLayout);
        functionImageLayout.setHorizontalGroup(
            functionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionImageLayout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(lblImage)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        functionImageLayout.setVerticalGroup(
            functionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionImageLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        jLayeredPane1.add(functionImage);

        contentArea.setOpaque(false);

        whiteArea.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Clarendon Blk BT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 71, 71));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hire");

        lblCusSearch.setBackground(new java.awt.Color(231, 76, 60));
        lblCusSearch.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        lblCusSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblCusSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCusSearch.setText("Search Customer");
        lblCusSearch.setOpaque(true);
        lblCusSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCusSearchMouseReleased(evt);
            }
        });

        lblStartHire.setBackground(new java.awt.Color(231, 76, 60));
        lblStartHire.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblStartHire.setForeground(new java.awt.Color(255, 255, 255));
        lblStartHire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartHire.setText("Start Hire");
        lblStartHire.setOpaque(true);
        lblStartHire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblStartHireMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 71, 71));
        jLabel3.setText("Type");

        jLabel4.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 71, 71));
        jLabel4.setText("Vehicle Number");

        typeComboBox.setFont(new java.awt.Font("Lato Medium", 0, 11)); // NOI18N
        typeComboBox.setForeground(new java.awt.Color(71, 71, 71));
        typeComboBox.setBorder(null);
        typeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        typeComboBox.setOpaque(false);
        typeComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                typeComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });
        typeComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                typeComboBoxPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 71, 71));
        jLabel5.setText("Capacity");

        capacityTxt.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 71, 71));
        jLabel9.setText("End Milage");

        jLabel10.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 71, 71));
        jLabel10.setText("Start");

        jLabel11.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 71, 71));
        jLabel11.setText("End");

        jLabel12.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 71, 71));
        jLabel12.setText("Calculation Method");

        calcMethodComboBox.setFont(new java.awt.Font("Lato Medium", 0, 11)); // NOI18N
        calcMethodComboBox.setForeground(new java.awt.Color(71, 71, 71));
        calcMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Hourly" }));
        calcMethodComboBox.setBorder(null);
        calcMethodComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calcMethodComboBox.setOpaque(false);
        calcMethodComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcMethodComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 71, 71));
        jLabel13.setText("Deposit Amount");

        jLabel14.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 71, 71));
        jLabel14.setText("Costomer Name");

        jLabel15.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 71, 71));
        jLabel15.setText("Customer Mobile");

        jLabel16.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(71, 71, 71));
        jLabel16.setText("Customer NIC");

        lblEndHire.setBackground(new java.awt.Color(231, 76, 60));
        lblEndHire.setFont(new java.awt.Font("Lato Semibold", 0, 24)); // NOI18N
        lblEndHire.setForeground(new java.awt.Color(255, 255, 255));
        lblEndHire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndHire.setText("End Hire");
        lblEndHire.setOpaque(true);

        lblHireID.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        lblHireID.setForeground(new java.awt.Color(71, 71, 71));
        lblHireID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        vehicleNumComboBox.setFont(new java.awt.Font("Lato Medium", 0, 11)); // NOI18N
        vehicleNumComboBox.setForeground(new java.awt.Color(71, 71, 71));
        vehicleNumComboBox.setBorder(null);
        vehicleNumComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vehicleNumComboBox.setOpaque(false);
        vehicleNumComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                vehicleNumComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        vehicleNumComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleNumComboBoxActionPerformed(evt);
            }
        });

        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(jSpinnerStart, "HH:mm");
        jSpinnerStart.setEditor(timeEditor);
        jSpinnerStart.setValue(new Date());
        jSpinnerStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(jSpinnerEnd, "HH:mm");
        jSpinnerEnd.setEditor(timeEditor1);
        jSpinnerEnd.setValue(new Date());
        jSpinnerEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblRental.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        lblRental.setForeground(new java.awt.Color(71, 71, 71));
        lblRental.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout whiteAreaLayout = new javax.swing.GroupLayout(whiteArea);
        whiteArea.setLayout(whiteAreaLayout);
        whiteAreaLayout.setHorizontalGroup(
            whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteAreaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whiteAreaLayout.createSequentialGroup()
                                .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(whiteAreaLayout.createSequentialGroup()
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerStart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(capacityTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(currentMilateTxt)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vehicleNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(whiteAreaLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(33, 33, 33)
                                    .addComponent(cusNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(whiteAreaLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(44, 44, 44)
                                        .addComponent(cusNicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(whiteAreaLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(26, 26, 26)
                                        .addComponent(cusMobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(whiteAreaLayout.createSequentialGroup()
                                        .addComponent(lblStartHire, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEndHire, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblRental, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHireID, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calcMethodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depAmntTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        whiteAreaLayout.setVerticalGroup(
            whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(lblHireID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(vehicleNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(capacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentMilateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cusNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cusMobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cusNicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteAreaLayout.createSequentialGroup()
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(calcMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depAmntTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(7, 7, 7)
                        .addGroup(whiteAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndHire, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartHire, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblRental, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout contentAreaLayout = new javax.swing.GroupLayout(contentArea);
        contentArea.setLayout(contentAreaLayout);
        contentAreaLayout.setHorizontalGroup(
            contentAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentAreaLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(whiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        contentAreaLayout.setVerticalGroup(
            contentAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentAreaLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(whiteArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLayeredPane1.add(contentArea);

        exitButton.setOpaque(false);

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

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(exitButtonLable)
                .addGap(10, 10, 10))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(exitButtonLable)
                .addContainerGap(591, Short.MAX_VALUE))
        );

        jLayeredPane1.add(exitButton);

        backButton.setOpaque(false);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/back.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout backButtonLayout = new javax.swing.GroupLayout(backButton);
        backButton.setLayout(backButtonLayout);
        backButtonLayout.setHorizontalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backButtonLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBack)
                .addContainerGap(719, Short.MAX_VALUE))
        );
        backButtonLayout.setVerticalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backButtonLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBack)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        jLayeredPane1.add(backButton);

        blueStrip.setOpaque(false);

        lblBlueStrip.setBackground(new java.awt.Color(52, 73, 94));
        lblBlueStrip.setOpaque(true);

        javax.swing.GroupLayout blueStripLayout = new javax.swing.GroupLayout(blueStrip);
        blueStrip.setLayout(blueStripLayout);
        blueStripLayout.setHorizontalGroup(
            blueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStripLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBlueStrip, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        blueStripLayout.setVerticalGroup(
            blueStripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStripLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBlueStrip, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        jLayeredPane1.add(blueStrip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonLableMouseClicked
        close();
    }//GEN-LAST:event_exitButtonLableMouseClicked

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void calcMethodComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMethodComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcMethodComboBoxActionPerformed

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            parentUI.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblCusSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusSearchMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCusSearchMouseReleased

    private void vehicleNumComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleNumComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleNumComboBoxActionPerformed

    private void typeComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_typeComboBoxPropertyChange

    }//GEN-LAST:event_typeComboBoxPropertyChange

    private void typeComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_typeComboBoxPopupMenuWillBecomeInvisible
        loadVehicles(typeComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_typeComboBoxPopupMenuWillBecomeInvisible

    private void vehicleNumComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_vehicleNumComboBoxPopupMenuWillBecomeInvisible
        loadCapacity(vehicleNumComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_vehicleNumComboBoxPopupMenuWillBecomeInvisible

    String customerID = "";

    private void lblStartHireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartHireMouseReleased
        try {
            String hireid = new DocNumGenerator().nextVal("HIRE");//gererate new hire ID
            
            String query = "INSERT INTO `fnss`.`tms_hire`\n"
                    + "(`hireID`, `vehicleRegNo`, `cusID`, `startMilage`, `startDate`, \n"
                    + "`estimatedEnd`, `calcMethod`, `depositAmt`, `estimatedRental`, `active`)\n"
                    + "VALUES\n"
                    + "('" + hireid + "',\n"
                    + "'" + vehicleNumComboBox.getSelectedItem().toString() + "',\n"
                    + "'" + customerID + "',\n"
                    + "(SELECT milage FROM tms_hirevehicle WHERE vehicleRegNo = '" + vehicleNumComboBox.getSelectedItem().toString() + "'),\n"
                    + "'" + new SimpleDateFormat("YYYY/MM/DD").format(jXDatePicker1.getDate()) + "',\n"
                    + "'" + new SimpleDateFormat("YYYY/MM/DD").format(jXDatePicker2.getDate()) + "',\n"
                    + "'" + calcMethodComboBox.getSelectedItem().toString() + "',\n"
                    + "" + Double.parseDouble(depAmntTxt.getText()) + ",\n"
                    + "" + calcRental(vehicleNumComboBox.getSelectedItem().toString()) + ",\n"
                    + "1);";
            System.out.println(query);
            //lblHireID.setText(hireid);
            
            try {
                DB.getDbCon().insert(query);

                if (JOptionPane.showConfirmDialog(null, "Proceed?") == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(this, "New Hire Started!");
                    new TMS_manageHires().setVisible(true);
                    this.dispose();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(TMS_addUpdateVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblStartHireMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
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
                java.util.logging.Logger.getLogger(TMS_newHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(TMS_newHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(TMS_newHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TMS_newHire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TMS_newHire().setVisible(true);

                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TMS_newHire.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backButton;
    private javax.swing.JPanel blueStrip;
    private javax.swing.JComboBox<String> calcMethodComboBox;
    private javax.swing.JTextField capacityTxt;
    private javax.swing.JPanel contentArea;
    private javax.swing.JTextField currentMilateTxt;
    private javax.swing.JTextField cusMobileTxt;
    private javax.swing.JTextField cusNameTxt;
    private javax.swing.JTextField cusNicTxt;
    private javax.swing.JTextField depAmntTxt;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitButtonLable;
    private javax.swing.JPanel functionImage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSpinner jSpinnerEnd;
    private javax.swing.JSpinner jSpinnerStart;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBlueStrip;
    private javax.swing.JLabel lblCusSearch;
    private javax.swing.JLabel lblEndHire;
    private javax.swing.JLabel lblHireID;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblRental;
    private javax.swing.JLabel lblStartHire;
    public javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JComboBox<String> vehicleNumComboBox;
    private javax.swing.JPanel whiteArea;
    // End of variables declaration//GEN-END:variables
}
