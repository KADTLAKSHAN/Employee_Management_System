package interfaces;

import classes.Admin;
import classes.MyConnection;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class UserManage extends javax.swing.JFrame {
    
    private String userType;

    public UserManage(String userTp) {
        initComponents();
        userType = userTp;
        viewAll();
        
        addTableSelectionListener();
        
    }
    
    public UserManage(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMUID = new javax.swing.JLabel();
        txtMUUserName = new javax.swing.JTextField();
        lblMUPassword = new javax.swing.JLabel();
        lblMUUserType = new javax.swing.JLabel();
        txtMUSearch = new javax.swing.JTextField();
        btnMUSearch = new javax.swing.JButton();
        btnMUAdd = new javax.swing.JButton();
        btnMUUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnMUDelete = new javax.swing.JButton();
        btnMULogout = new javax.swing.JButton();
        cmbMUUserType = new javax.swing.JComboBox<>();
        txtMUPassword = new javax.swing.JPasswordField();
        btnMURefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMUID.setText("USERNAME");
        jPanel1.add(lblMUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(txtMUUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 251, 32));

        lblMUPassword.setText("USER PASSWORD");
        jPanel1.add(lblMUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblMUUserType.setText("USER TYPE");
        jPanel1.add(lblMUUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(txtMUSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 260, 39));

        btnMUSearch.setText("SEARCH");
        btnMUSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnMUSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 120, 33));

        btnMUAdd.setText("ADD");
        btnMUAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnMUAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 99, 33));

        btnMUUpdate.setText("UPDATE");
        btnMUUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnMUUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 99, 33));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "USERNAME", "USER PASSWORD", "USER TYPE"
            }
        ));
        jScrollPane1.setViewportView(tblUser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 670, 350));

        btnMUDelete.setText("DELETE");
        btnMUDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnMUDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 99, 33));

        btnMULogout.setText("LOGOUT");
        btnMULogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnMULogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 99, 33));

        cmbMUUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "HR Manager", "HR Assistant" }));
        jPanel1.add(cmbMUUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 30));
        jPanel1.add(txtMUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        btnMURefresh.setText("REFRESH");
        btnMURefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMURefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnMURefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 120, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMUSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUSearchActionPerformed
        Admin search = new Admin();
        search.setUserName(txtMUSearch.getText());
        
        if(search.userSearch()){
            JOptionPane.showMessageDialog(null, "USER FOUND!","USER SEARCHING..",JOptionPane.INFORMATION_MESSAGE);
            txtMUUserName.setText(search.getUserName());
            txtMUPassword.setText(search.getUserPassword());
            cmbMUUserType.setSelectedItem(search.getUserType());
            
            DefaultTableModel model = (DefaultTableModel)tblUser.getModel();
            model.setRowCount(0);
            
            model.addRow(new String[]{search.getUserName(),search.getUserPassword(),search.getUserType()});
        }else{
            JOptionPane.showMessageDialog(null, "USER NOT FOUND, TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMUSearchActionPerformed

    private void btnMUUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUUpdateActionPerformed
        Admin update = new Admin();
        update.setUserName(txtMUUserName.getText());
        update.setUserPassword(txtMUPassword.getText());
        update.setUserType(cmbMUUserType.getSelectedItem().toString());
        
        if(update.userUpdate()){
            JOptionPane.showMessageDialog(null, "USER UPDATED!","USER UPDATE",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "USER NOT UPDATED, TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        viewAll();
        clear();
        
        
        
    }//GEN-LAST:event_btnMUUpdateActionPerformed

    private void btnMUDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUDeleteActionPerformed
        Admin delete = new Admin();
        delete.setUserName(txtMUUserName.getText());
        
        if(delete.deleteUser()){
            JOptionPane.showMessageDialog(null, "USER DELETED!","USER DELETE",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "USER NOT DELETED, TRY AGAIN!","NOT FOUND!",JOptionPane.ERROR_MESSAGE);
        }
        
        viewAll();
        clear();
    }//GEN-LAST:event_btnMUDeleteActionPerformed

    private void btnMUAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUAddActionPerformed
        Admin admin = new Admin();
        admin.setUserName(txtMUUserName.getText());
        admin.setUserPassword(txtMUPassword.getText());
        admin.setUserType(cmbMUUserType.getSelectedItem().toString());
        
        if(admin.addUser()){
            JOptionPane.showMessageDialog(null, "NEW USER ADDED!","NEW USER",JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            JOptionPane.showMessageDialog(null, "USER NOT INSERTED, TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
        
        viewAll();
        clear();
    }//GEN-LAST:event_btnMUAddActionPerformed

    private void btnMURefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMURefreshActionPerformed
        
        viewAll();
        clear();
    }//GEN-LAST:event_btnMURefreshActionPerformed

    private void btnMULogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULogoutActionPerformed
        LoginPage logout = new LoginPage();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMULogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManage().setVisible(true);
            }
        });
    }
    
    public void addTableSelectionListener(){
       tblUser.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
               if(!e.getValueIsAdjusting()){
                   int selectedRow = tblUser.getSelectedRow();
                   
                   if(selectedRow != -1){
                       String username = tblUser.getValueAt(selectedRow,0).toString();
                       String password = tblUser.getValueAt(selectedRow, 1).toString();
                       String userType = tblUser.getValueAt(selectedRow, 2).toString();
                       
                       
                       txtMUUserName.setText(username);
                       txtMUPassword.setText(password);
                       cmbMUUserType.setSelectedItem(userType);
                   }
               }
           }
       });
    }
    
    
    
    
    private void viewAll(){
        
        DefaultTableModel model = (DefaultTableModel)tblUser.getModel();
        model.setRowCount(0);
        
        Admin admin = new Admin();
        admin.viewAll();
        try {
            MyConnection.rs = MyConnection.pst.executeQuery();
            while(MyConnection.rs.next()){
                model.addRow(new String[]{MyConnection.rs.getString(1),MyConnection.rs.getString(2),MyConnection.rs.getString(3)});
            }
            MyConnection.con.close();
        } catch (Exception e) {
            
            System.out.println("FrontEnd UserManage View All Error " + e.getMessage());
            
        }
        
    }
    
    private void clear(){
        
        txtMUUserName.setText(null);
        txtMUPassword.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMUAdd;
    private javax.swing.JButton btnMUDelete;
    private javax.swing.JButton btnMULogout;
    private javax.swing.JButton btnMURefresh;
    private javax.swing.JButton btnMUSearch;
    private javax.swing.JButton btnMUUpdate;
    private javax.swing.JComboBox<String> cmbMUUserType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMUID;
    private javax.swing.JLabel lblMUPassword;
    private javax.swing.JLabel lblMUUserType;
    private javax.swing.JTable tblUser;
    private javax.swing.JPasswordField txtMUPassword;
    private javax.swing.JTextField txtMUSearch;
    private javax.swing.JTextField txtMUUserName;
    // End of variables declaration//GEN-END:variables
}
