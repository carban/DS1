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
        this.comboWP.addItem(u.getPosition());
        this.comboS.addItem(u.getState());        
        
    }

    consultEdit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        inputFN = new javax.swing.JTextField();
        inputLN = new javax.swing.JTextField();
        comboWP = new javax.swing.JComboBox<>();
        comboS = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Consult / Edit");

        jLabel2.setText("ID user: ");

        jLabel3.setText("First name:");

        jLabel4.setText("Last name: ");

        jLabel5.setText("Work position: ");

        jLabel6.setText("State: ");

        inputID.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputID.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        inputID.setFocusable(false);

        inputFN.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputFN.setFocusable(false);

        inputLN.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        inputLN.setFocusable(false);

        comboWP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboWP.setFocusable(false);

        comboS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        comboS.setFocusable(false);

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        saveButton.setText("SAVE");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputID)
                            .addComponent(inputFN)
                            .addComponent(inputLN)
                            .addComponent(comboWP, 0, 225, Short.MAX_VALUE)
                            .addComponent(comboS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputFN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputLN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboWP, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboS, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn))
                .addGap(51, 51, 51))
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
                    }else if(control.updateUser(inputID.getText(), inputFN.getText(), inputLN.getText(), comboWP.getItemAt(comboWP.getSelectedIndex()), comboS.getItemAt(comboS.getSelectedIndex()))){
                        refresh = true;
                        JOptionPane.showMessageDialog(null, "Success updating user");
//                        this.dispose();
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
    private javax.swing.JTextField inputFN;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputLN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
