package interfaces;

import classes.User;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        
        //Login Image fit to screen
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("chromed-recruitment-online-searching-for-employee-1.png")));
        
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel2.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLoginUserName = new javax.swing.JTextField();
        cmbLoginUserType = new javax.swing.JComboBox<>();
        btnUserLogin = new javax.swing.JButton();
        lblLoginName = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        lblLoginType = new javax.swing.JLabel();
        txtUserLoginPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("COLOMBO INSTITUE OF STUDIES");

        jLabel3.setText("Employee Management System");

        txtLoginUserName.setToolTipText("");

        cmbLoginUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "HR Manager", "HR Assistant" }));
        cmbLoginUserType.setToolTipText("");
        cmbLoginUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoginUserTypeActionPerformed(evt);
            }
        });

        btnUserLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnUserLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUserLogin.setText("Login");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        lblLoginName.setText("Username");

        lblLoginPassword.setText("Password");

        lblLoginType.setText("Select User Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoginUserName)
                        .addComponent(cmbLoginUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblLoginName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoginType)
                            .addComponent(lblLoginPassword))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblLoginName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginType)
                .addGap(3, 3, 3)
                .addComponent(cmbLoginUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbLoginUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoginUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLoginUserTypeActionPerformed

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        
        if(checkEmptyFields()){
           
            User user = new User();
            user.setUserName(txtLoginUserName.getText());
            user.setUserPassword(txtUserLoginPassword.getText());
            user.setUserType(cmbLoginUserType.getSelectedItem().toString());
        
            String userTp = user.getUserType();
            String userN = user.getUserName();
        
            if(user.userLogin()){
            
                JOptionPane.showMessageDialog(null, "WELCOME TO EMPLOYEE MANAGEMENT SYSTEM!","WELCOME",JOptionPane.INFORMATION_MESSAGE);
            
                if(userTp.equals("HR Manager") || userTp.equals("HR Assistant")){
                    EmployeeManage manager = new EmployeeManage(userTp,userN);
                    manager.setVisible(true);
                    this.setVisible(false);
                }else if(userTp.equals("Admin")){
                    UserManage um = new UserManage(userTp);
                    um.setVisible(true);
                    this.setVisible(false);
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "USER LOGIN FAILD TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
                txtLoginUserName.setText(null);
                txtUserLoginPassword.setText(null);
            
            }
            
        }
        
        
    }//GEN-LAST:event_btnUserLoginActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    
    
    //CHECK EMPTY FIELDS
    private boolean checkEmptyFields(){
        
        JTextField checkEmptyFilds[] = {txtLoginUserName,txtUserLoginPassword};
        
        for(JTextField txt : checkEmptyFilds){
            
            String field = txt.getText().trim();
            
            if(field.isEmpty()){
                
                JOptionPane.showMessageDialog(null, "CHECK YOUR BLANK FIELDS PLEASE!","BLANK",JOptionPane.ERROR_MESSAGE
                );
                return false;
            }
            
        }
        
        return true;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JComboBox<String> cmbLoginUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginType;
    private javax.swing.JTextField txtLoginUserName;
    private javax.swing.JPasswordField txtUserLoginPassword;
    // End of variables declaration//GEN-END:variables
}
