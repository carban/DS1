package Vista;
import Controladora.*;
import Modelo.Users;
import java.awt.BorderLayout;
import javafx.scene.paint.Color;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class vistaGerente extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public vistaGerente(String userID) {
        this.setResizable(false);
        initComponents();
        System.out.println("------------->");
        Users profileInfo = control.consultProfile(userID);
        this.profileID.setText(profileInfo.getId());
        this.profileFName.setText(profileInfo.getFname());
        this.profileLName.setText(profileInfo.getLname());
        this.profileWP.setText(profileInfo.getPosition());
        this.profileState.setText(profileInfo.getState());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneSedes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        profileID = new javax.swing.JLabel();
        profileFName = new javax.swing.JLabel();
        profileLName = new javax.swing.JLabel();
        profileWP = new javax.swing.JLabel();
        profileState = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        fnameInput = new javax.swing.JTextField();
        lnameInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboPosition = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        passInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboPlace = new javax.swing.JComboBox<>();
        createButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        consultInput = new javax.swing.JTextField();
        consultButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        idSedeInput = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cityInput = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        adressInput = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        comboStateSede = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        comboJefe = new javax.swing.JComboBox<>();
        createButtonSedes = new javax.swing.JButton();
        jComboConsultaSede = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        consultButtonSedes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneSedes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPaneSedes.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneSedes.setFont(new java.awt.Font("Khmer OS", 1, 14)); // NOI18N

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Sign Out");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel14.setText("PROFILE");

        jLabel22.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel22.setText("ID: ");

        jLabel23.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel23.setText("First Name:");

        jLabel24.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel24.setText("Last Name:");

        jLabel25.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel25.setText("Work Position: ");

        jLabel26.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel26.setText("State: ");

        profileID.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        profileID.setText("jLabel27");

        profileFName.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        profileFName.setText("jLabel27");

        profileLName.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        profileLName.setText("jLabel27");

        profileWP.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        profileWP.setText("jLabel27");

        profileState.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        profileState.setText("jLabel27");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profileWP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileID)
                            .addComponent(profileFName))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileState)
                    .addComponent(profileLName))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(profileID))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(profileFName)
                    .addComponent(jLabel24)
                    .addComponent(profileLName))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(profileWP)
                    .addComponent(jLabel26)
                    .addComponent(profileState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );

        jTabbedPaneSedes.addTab("Profile", jPanel1);

        jLabel3.setText("ID user: ");

        jLabel4.setText("First Name: ");

        jLabel5.setText("Last Name: ");

        idInput.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        idInput.setBorder(null);

        fnameInput.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        fnameInput.setBorder(null);

        lnameInput.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lnameInput.setBorder(null);

        jLabel6.setText("Work Position: ");

        comboPosition.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe de Taller", "Vendedor" }));

        jLabel7.setText("Password: ");

        passInput.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        passInput.setBorder(null);

        jLabel8.setText("State: ");

        comboState.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "t", "f" }));

        jLabel9.setText("Place (ID, City, Address): ");

        comboPlace.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Place" }));
        comboPlace.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vistaGerente.this.focusGained(evt);
            }
        });
        comboPlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vistaGerente.this.mouseEntered(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(204, 255, 204));
        createButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        createButton.setText("SAVE");
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Consult and Edit User ");

        consultInput.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        consultInput.setBorder(null);

        consultButton.setBackground(new java.awt.Color(102, 153, 255));
        consultButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        consultButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        consultButton.setText("SEARCH");
        consultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel13.setText("USERS");

        jLabel11.setText("Create a new User");

        jLabel12.setText("ID user: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consultButton)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel13))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(consultInput, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(idInput, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                    .addComponent(passInput)))
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(fnameInput)
                                                    .addComponent(comboPosition, 0, 132, Short.MAX_VALUE)))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 237, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(consultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneSedes.addTab("Users", jPanel2);

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel15.setText("PLACES");

        jLabel1.setText("Crear una nueva sede");

        jLabel2.setText("Consultar o modificar sedes");

        jLabel16.setText("ID sede:");

        jLabel17.setText("Ciudad:");

        jLabel18.setText("Direccion:");

        jLabel19.setText("Estado:");

        comboStateSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T", "F" }));

        jLabel20.setText("Jefe:");

        comboJefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboJefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboJefeMouseEntered(evt);
            }
        });

        createButtonSedes.setBackground(new java.awt.Color(204, 255, 204));
        createButtonSedes.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        createButtonSedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        createButtonSedes.setText("SAVE");
        createButtonSedes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createButtonSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonSedesActionPerformed(evt);
            }
        });

        jComboConsultaSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione sede:" }));
        jComboConsultaSede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboConsultaSedeMouseEntered(evt);
            }
        });

        jLabel21.setText("Sede:");

        consultButtonSedes.setBackground(new java.awt.Color(102, 153, 255));
        consultButtonSedes.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        consultButtonSedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        consultButtonSedes.setText("SEARCH");
        consultButtonSedes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultButtonSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultButtonSedesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idSedeInput)
                                    .addComponent(comboStateSede, 0, 126, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel20))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(adressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(createButtonSedes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel21)
                                .addGap(40, 40, 40)
                                .addComponent(jComboConsultaSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(57, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(consultButtonSedes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(idSedeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(adressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(comboStateSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(comboJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createButtonSedes, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboConsultaSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(consultButtonSedes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPaneSedes.addTab("Places", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneSedes.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png")));
        jTabbedPaneSedes.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Images/users2.png")));
        jTabbedPaneSedes.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Images/house.png")));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultButtonActionPerformed
        if(consultInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Error, you have null elements");
        }else{
            try{
                int identification = Integer.parseInt(consultInput.getText());
                if(identification<0){
                    JOptionPane.showMessageDialog(null, "Incorrect Data \nTry again");
                }else{
                    control.consultUser(consultInput.getText());
                    this.cleanConsultSection();
                } 
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "The ID must be an Integer");
            }         
        }
    }//GEN-LAST:event_consultButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String[] cadena = comboPlace.getItemAt(comboPlace.getSelectedIndex()).split(",");
        //System.out.print(cadena[0]);
        if(idInput.getText().equals("") || fnameInput.getText().equals("") || lnameInput.getText().equals("") || passInput.getText().equals("") || cadena[0]=="Select Place"){
            JOptionPane.showMessageDialog(null, "Error, you have null elements");
        }else{
            try{
                int identification = Integer.parseInt(idInput.getText());
                if(identification<0){
                    JOptionPane.showMessageDialog(null, "Incorrect Data \nTry again");
                }else if(control.createUser(idInput.getText(), fnameInput.getText(), lnameInput.getText(), comboPosition.getItemAt(comboPosition.getSelectedIndex()), passInput.getText(), comboState.getItemAt(comboState.getSelectedIndex()), cadena[0])){
                    this.cleanCreateSection();
                    JOptionPane.showMessageDialog(null, "Success creating user");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Data \nTry again");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "The ID must be an Integer");
            }
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        control.alterCombo(comboPlace);
    }//GEN-LAST:event_mouseEntered

    private void focusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGained
        //control.alterCombo(comboPlace);
    }//GEN-LAST:event_focusGained

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        login log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void createButtonSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonSedesActionPerformed
        String[] cadena = comboJefe.getItemAt(comboJefe.getSelectedIndex()).split(",");
        if(idSedeInput.getText().equals("") || cityInput.getText().equals("") || adressInput.getText().equals("") || cadena[0].equals("Seleccione")){
            JOptionPane.showMessageDialog(null, "Error, hay algun campo vacio");
        }else{
            try{
                int id = Integer.parseInt(idSedeInput.getText());
                if(id <= 0){
                    JOptionPane.showMessageDialog(null, "El ID debe ser mayor o igual a cero");
                }
                else if(control.createSede(idSedeInput.getText(), cityInput.getText(), adressInput.getText(), comboStateSede.getItemAt(comboStateSede.getSelectedIndex()),cadena[0])){
                    this.cleanCreateSede();
                    JOptionPane.showMessageDialog(null, "Sede creada exitosamente");
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El campo ID debe ser numerico");
            }
        }
    }//GEN-LAST:event_createButtonSedesActionPerformed

    private void jComboConsultaSedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboConsultaSedeMouseEntered
        control.alterCombo(jComboConsultaSede);
    }//GEN-LAST:event_jComboConsultaSedeMouseEntered

    private void comboJefeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJefeMouseEntered
        control.alterComboJefe(comboJefe);
    }//GEN-LAST:event_comboJefeMouseEntered

    private void consultButtonSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultButtonSedesActionPerformed
        String[] cadena = jComboConsultaSede.getItemAt(jComboConsultaSede.getSelectedIndex()).split(",");
        if(jComboConsultaSede.getItemAt(jComboConsultaSede.getSelectedIndex()).equals("Seleccione sede:")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una sede");
        }else{
            control.consultSede(cadena[0]);
            //this.cleanConsultSection();
        }
    }//GEN-LAST:event_consultButtonSedesActionPerformed

    private void cleanCreateSection() {
        idInput.setText("");
        fnameInput.setText("");
        lnameInput.setText("");
        passInput.setText("");
    }
    
    private void cleanCreateSede() {
        idSedeInput.setText("");
        cityInput.setText("");
        adressInput.setText("");
    }
    
    private void cleanConsultSection(){
        consultInput.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressInput;
    private javax.swing.JTextField cityInput;
    private javax.swing.JComboBox<String> comboJefe;
    private javax.swing.JComboBox<String> comboPlace;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JComboBox<String> comboState;
    private javax.swing.JComboBox<String> comboStateSede;
    private javax.swing.JButton consultButton;
    private javax.swing.JButton consultButtonSedes;
    private javax.swing.JTextField consultInput;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createButtonSedes;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fnameInput;
    private javax.swing.JTextField idInput;
    private javax.swing.JTextField idSedeInput;
    private javax.swing.JComboBox<String> jComboConsultaSede;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPaneSedes;
    private javax.swing.JTextField lnameInput;
    private javax.swing.JTextField passInput;
    private javax.swing.JLabel profileFName;
    private javax.swing.JLabel profileID;
    private javax.swing.JLabel profileLName;
    private javax.swing.JLabel profileState;
    private javax.swing.JLabel profileWP;
    // End of variables declaration//GEN-END:variables


}
