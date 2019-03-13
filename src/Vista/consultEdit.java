package Vista;

import Controladora.Controladora;
import Modelo.Users;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;

public class consultEdit extends javax.swing.JFrame {

    Controladora control = new Controladora();
    boolean editing = false;
    boolean refresh = false;
    
    public consultEdit(Users u) {
        this.setResizable(false);
        initComponents();
                
        this.inputID.setText(u.getId());
        this.inputFN.setText(u.getFname());
        this.inputLN.setText(u.getLname());
        this.inputTel.setText(u.getTel());
        this.inputDir.setText(u.getDir());
        this.comboWP.addItem(u.getPosition());
        this.comboS.addItem(u.getState());        
        
    }

    consultEdit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputID = new javax.swing.JTextField();
        inputFN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputLN = new javax.swing.JTextField();
        inputTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboWP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboS = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        inputDir = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        inputID.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputID.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        inputID.setFocusable(false);

        inputFN.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputFN.setFocusable(false);

        jLabel2.setText("ID user: ");

        jLabel3.setText("First name:");

        jLabel4.setText("Last name: ");

        inputLN.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputLN.setFocusable(false);

        inputTel.setFocusable(false);

        jLabel7.setText("Telefono:");

        jLabel8.setText("Direccion:");

        comboWP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboWP.setFocusable(false);

        jLabel5.setText("Work position: ");

        jLabel6.setText("State: ");

        comboS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboS.setFocusable(false);

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 204, 204));
        editButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        editButton.setText("EDIT");
        editButton.setBorderPainted(false);
        editButton.setContentAreaFilled(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        inputDir.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(saveButton)
                        .addGap(37, 37, 37)
                        .addComponent(editButton)
                        .addGap(44, 44, 44)
                        .addComponent(exitBtn)
                        .addGap(94, 94, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputTel)
                                    .addComponent(inputID)
                                    .addComponent(inputFN)
                                    .addComponent(comboWP, 0, 225, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboS, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputDir, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputLN, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(inputDir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboWP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitBtn))
                        .addGap(27, 27, 27))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Consultar / Editar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if(editing){
            if(inputID.getText().equals("") || inputFN.getText().equals("") || inputLN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error, you have null elements");
            }else{
                try{
                    int identification = Integer.parseInt(inputID.getText());
                    if(identification<0){
                        JOptionPane.showMessageDialog(null, "Datos incorrectos \nintentelo nuevamente1");
                    }else if(control.updateUser(inputID.getText(), inputFN.getText(), inputLN.getText(), inputTel.getText(), inputDir.getText(), comboWP.getItemAt(comboWP.getSelectedIndex()), comboS.getItemAt(comboS.getSelectedIndex()))){
                        refresh = true;
                        JOptionPane.showMessageDialog(null, "Success updating user");
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Datos incorrectos \nintentelo nuevamente2");
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "The ID must be an Integer");
                }
            }            
        }else{
            editing = false;
            this.dispose();
        }
        

    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        editing = true;
        //LA CEDULA NO SE PUEDE MODIFICAR POR RAZONES OBVIAS...XD
        //this.inputID.setFocusable(true); 
        this.inputFN.setFocusable(true);
        this.inputLN.setFocusable(true);
        this.inputTel.setFocusable(true);
        this.inputDir.setFocusable(true);
        
        this.comboWP.setFocusable(true);
        if(comboWP.getItemAt(comboWP.getSelectedIndex()).equals("Jefe de Taller")){
           this.comboWP.addItem("Vendedor"); 
        }else{
           this.comboWP.addItem("Jefe de Taller"); 
        }        
        
        this.comboS.setFocusable(true);
        if(comboS.getItemAt(comboS.getSelectedIndex()).equals("t")){
           this.comboS.addItem("f"); 
        }else{
           this.comboS.addItem("t"); 
        }
        
        this.getContentPane().setBackground(java.awt.Color.pink);
        //this.inputID.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_editButtonActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboS;
    private javax.swing.JComboBox<String> comboWP;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField inputDir;
    private javax.swing.JTextField inputFN;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputLN;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
