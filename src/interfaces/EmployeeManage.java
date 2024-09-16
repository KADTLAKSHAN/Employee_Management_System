package interfaces;

import classes.Employee;
import classes.MyConnection;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

    

public class EmployeeManage extends javax.swing.JFrame {
    
    private String userT;
    private String userN;
    
    public EmployeeManage(String ut, String un){
        initComponents();
        userT = ut;
        userN= un;
        txtManEmpUserName.setText(userN);
        readCMBDepartment();
        readCMBDesignation();
        viewAll();
        
        addTableSelectionListener();
        
        
        //disable user buttons
        
        if(userT.equals("HR Assistant")){
            btnManEmpDep.setEnabled(false);
            btnManEmpDes.setEnabled(false);
        }
        
    }

    
    public EmployeeManage() {
        initComponents();
        readCMBDepartment();
        readCMBDesignation();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblManEmpID = new javax.swing.JLabel();
        txtManEmpID = new javax.swing.JTextField();
        txtManEmpFN = new javax.swing.JTextField();
        lblManEmpFN = new javax.swing.JLabel();
        txtManEmpLN = new javax.swing.JTextField();
        lblManEmpLN = new javax.swing.JLabel();
        txtManEmpAdd = new javax.swing.JTextField();
        lblManEmpAdd = new javax.swing.JLabel();
        txtManEmpPhoneNumber = new javax.swing.JTextField();
        lblManEmpPhoneNo = new javax.swing.JLabel();
        txtManEmpEPF = new javax.swing.JTextField();
        lblManEmpEPF = new javax.swing.JLabel();
        txtManEmpSearch = new javax.swing.JTextField();
        btnManEmpSearch = new javax.swing.JButton();
        btnManEmpAdd = new javax.swing.JButton();
        btnManEmpUpdate = new javax.swing.JButton();
        btnManEmpDes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManEmp = new javax.swing.JTable();
        btnManEmpDelete = new javax.swing.JButton();
        btnManEmpLogout = new javax.swing.JButton();
        btnManEmpDep = new javax.swing.JButton();
        lblManEmpDep = new javax.swing.JLabel();
        cmbManEmpDep = new javax.swing.JComboBox<>();
        lblManEmpDes = new javax.swing.JLabel();
        cmbManEmpDes = new javax.swing.JComboBox<>();
        txtManEmpUserName = new javax.swing.JTextField();
        lblManEmpSystemUserName = new javax.swing.JLabel();
        btnManEmpRefersh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManEmpID.setText("EMPLOYEE ID");
        jPanel1.add(lblManEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(txtManEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 251, 32));
        jPanel1.add(txtManEmpFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 251, 32));

        lblManEmpFN.setText("EMPLOYEE FIRST NAME");
        jPanel1.add(lblManEmpFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(txtManEmpLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 251, 32));

        lblManEmpLN.setText("EMPLOYEE LAST NAME");
        jPanel1.add(lblManEmpLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(txtManEmpAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 251, 32));

        lblManEmpAdd.setText("EMPLOYEE ADDRESS");
        jPanel1.add(lblManEmpAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(txtManEmpPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 251, 32));

        lblManEmpPhoneNo.setText("EMPLOYEE PHONE NUMBER");
        jPanel1.add(lblManEmpPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel1.add(txtManEmpEPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 251, 32));

        lblManEmpEPF.setText("EMPLOYEE EPF NUMBER");
        jPanel1.add(lblManEmpEPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel1.add(txtManEmpSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 260, 39));

        btnManEmpSearch.setText("SEARCH");
        btnManEmpSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 120, 33));

        btnManEmpAdd.setText("ADD");
        btnManEmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 99, 33));

        btnManEmpUpdate.setText("UPDATE");
        btnManEmpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 99, 33));

        btnManEmpDes.setText("MANAGE DESIGNATION");
        btnManEmpDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpDesActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 190, 33));

        tblManEmp.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        tblManEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FIRST NAME", "LAST NAME", "ADDRESS", "PHONE NO", "EPF NO", "DEPARTMENT", "DESIGNATION", "ADDED USER"
            }
        ));
        jScrollPane1.setViewportView(tblManEmp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 730, 350));

        btnManEmpDelete.setText("DELETE");
        btnManEmpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 99, 33));

        btnManEmpLogout.setText("LOGOUT");
        btnManEmpLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 99, 33));

        btnManEmpDep.setText("MANAGE DEPARTMENTS");
        btnManEmpDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpDepActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 190, 33));

        lblManEmpDep.setText("EMPLOYEE DEPARTMENT");
        jPanel1.add(lblManEmpDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jPanel1.add(cmbManEmpDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 250, 30));

        lblManEmpDes.setText("EMPLOYEE DESIGNATION");
        jPanel1.add(lblManEmpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jPanel1.add(cmbManEmpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 250, 30));

        txtManEmpUserName.setEditable(false);
        txtManEmpUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        txtManEmpUserName.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(txtManEmpUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 210, 30));

        lblManEmpSystemUserName.setText("System Username");
        jPanel1.add(lblManEmpSystemUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        btnManEmpRefersh.setText("REFRESH TABLE");
        btnManEmpRefersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManEmpRefershActionPerformed(evt);
            }
        });
        jPanel1.add(btnManEmpRefersh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 140, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManEmpSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpSearchActionPerformed
        Employee search = new Employee();
        search.setEmpID(txtManEmpSearch.getText());
        search.setEmpFirstName(txtManEmpSearch.getText());
        search.setEmpLastName(txtManEmpSearch.getText());
        
        if(search.searchEmployee()){
            
            txtManEmpID.setText(search.getEmpID());
            txtManEmpFN.setText(search.getEmpFirstName());
            txtManEmpLN.setText(search.getEmpLastName());
            txtManEmpAdd.setText(search.getEmpAddress());
            txtManEmpPhoneNumber.setText(search.getEmpPhoneNo());
            txtManEmpEPF.setText(search.getEmpEPFNo());
            cmbManEmpDep.setSelectedItem(search.departmentSearchByID(search.getDepID()));
            cmbManEmpDes.setSelectedItem(search.designationSearchByID(search.getDesID()));
            
            DefaultTableModel model = (DefaultTableModel)tblManEmp.getModel();
            model.setRowCount(0);
            
            model.addRow(new String[]{search.getEmpID(),search.getEmpFirstName(),search.getEmpLastName(),search.getEmpAddress(),search.getEmpPhoneNo(),search.getEmpEPFNo(),search.departmentSearchByID(search.getDepID()),search.designationSearchByID(search.getDesID()),search.getUserName()});
            
            
        }else{
            JOptionPane.showMessageDialog(null, "EMPLOYEE NOT FOUND!","NOT FOUND",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnManEmpSearchActionPerformed

    private void btnManEmpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpUpdateActionPerformed
        Employee update = new Employee();
        update.setEmpID(txtManEmpID.getText());
        update.setEmpFirstName(txtManEmpFN.getText());
        update.setEmpLastName(txtManEmpLN.getText());
        update.setEmpAddress(txtManEmpAdd.getText());
        update.setEmpPhoneNo(txtManEmpPhoneNumber.getText());
        update.setEmpEPFNo(txtManEmpEPF.getText());
        update.setDepID(update.departmentSearchByName(cmbManEmpDep.getSelectedItem().toString()));
        update.setDesID(update.designationSearchByName(cmbManEmpDes.getSelectedItem().toString()));
        update.setUserName(txtManEmpUserName.getText());
        
        if(update.updateEmployee()){
            JOptionPane.showMessageDialog(null, "EMPLOYEE UPDATED!", "EMPLOYEE ADDED", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "EMPLOYEE UPDATE FAILED!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        clear();
        viewAll();
        
    }//GEN-LAST:event_btnManEmpUpdateActionPerformed

    private void btnManEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpDeleteActionPerformed
        Employee delete = new Employee();
        delete.setEmpID(txtManEmpID.getText());
        
        if(delete.deleteEmployee()){
            JOptionPane.showMessageDialog(null, "EMPLOYEE DELETED!","DELETE",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "EMPLOYEE NOT DELETED, TRY AGAIN!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        viewAll();
        clear();
    }//GEN-LAST:event_btnManEmpDeleteActionPerformed

    private void btnManEmpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpAddActionPerformed
        Employee add = new Employee();
        add.setEmpID(txtManEmpID.getText());
        add.setEmpFirstName(txtManEmpFN.getText());
        add.setEmpLastName(txtManEmpLN.getText());
        add.setEmpAddress(txtManEmpAdd.getText());
        add.setEmpPhoneNo(txtManEmpPhoneNumber.getText());
        add.setEmpEPFNo(txtManEmpEPF.getText());
        add.setDepID(add.departmentSearchByName(cmbManEmpDep.getSelectedItem().toString()));
        add.setDesID(add.designationSearchByName(cmbManEmpDes.getSelectedItem().toString()));
        add.setUserName(txtManEmpUserName.getText());
        
        if(add.addEmployee()){
            JOptionPane.showMessageDialog(null, "EMPLOYEE ADDED!", "EMPLOYEE ADDED", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "EMPLOYEE ADD FAILED!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        clear();
        viewAll();
        
    }//GEN-LAST:event_btnManEmpAddActionPerformed

    private void btnManEmpRefershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpRefershActionPerformed
        viewAll();
        clear();
    }//GEN-LAST:event_btnManEmpRefershActionPerformed

    private void btnManEmpLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpLogoutActionPerformed
        LoginPage logout = new LoginPage();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManEmpLogoutActionPerformed

    private void btnManEmpDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpDesActionPerformed
        DesignationsManage des = new DesignationsManage(userN,userT);
        des.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManEmpDesActionPerformed

    private void btnManEmpDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManEmpDepActionPerformed
        DepartmentManage dep = new DepartmentManage(userN,userT);
        dep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManEmpDepActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManage().setVisible(true);
            }
        });
    }
    
    public void addTableSelectionListener(){
       tblManEmp.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
               if(!e.getValueIsAdjusting()){
                   int selectedRow = tblManEmp.getSelectedRow();
                   
                   if(selectedRow != -1){
                       txtManEmpID.setText(tblManEmp.getValueAt(selectedRow,0).toString());
                       txtManEmpFN.setText(tblManEmp.getValueAt(selectedRow, 1).toString());
                       txtManEmpLN.setText(tblManEmp.getValueAt(selectedRow, 2).toString());
                       txtManEmpAdd.setText(tblManEmp.getValueAt(selectedRow, 3).toString());
                       txtManEmpPhoneNumber.setText(tblManEmp.getValueAt(selectedRow, 4).toString());
                       txtManEmpEPF.setText(tblManEmp.getValueAt(selectedRow, 5).toString());
                       cmbManEmpDep.setSelectedItem(tblManEmp.getValueAt(selectedRow, 6).toString());
                       cmbManEmpDes.setSelectedItem(tblManEmp.getValueAt(selectedRow, 7).toString());
                       txtManEmpUserName.setText(tblManEmp.getValueAt(selectedRow, 8).toString());
                       
                       
                       
                   }
               }
           }
       });
    }
    
    private void readCMBDepartment(){
        try {
            String sql = "SELECT depID, depName FROM tblDepartment";
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            while(MyConnection.rs.next()){
                String id = MyConnection.rs.getString("depID");
                String depName = MyConnection.rs.getString("depName");
                cmbManEmpDep.addItem(depName);
            }
            MyConnection.con.close();
            
            
        } catch (Exception e) {
            System.out.println("Department Combo box error (constructor method)" + e.getMessage());
        }
    }
    
    private void readCMBDesignation(){
        try {
            
            String sql = "SELECT desName FROM tblDesignation";
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            while(MyConnection.rs.next()){
                String desName = MyConnection.rs.getString("desName");
                cmbManEmpDes.addItem(desName);
            }
            MyConnection.con.close();
            
        } catch (Exception e) {
            System.out.println("Designation Combo box error (constructor method)" + e.getMessage());
        }
        
    }
    
    private void loginOut(){
        LoginPage logout = new LoginPage();
        logout.setVisible(true);
        this.setVisible(false);
    }
    
    private void clear(){
        txtManEmpID.setText(null);
        txtManEmpFN.setText(null);
        txtManEmpLN.setText(null);
        txtManEmpAdd.setText(null);
        txtManEmpEPF.setText(null);
        txtManEmpPhoneNumber.setText(null);
    }
    
    private void viewAll(){
        
        DefaultTableModel model = (DefaultTableModel)tblManEmp.getModel();
        model.setRowCount(0);
        
        Employee show = new Employee();
        show.viewAll();
        
        try {
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            while(MyConnection.rs.next()){
                
                model.addRow(new String[]{MyConnection.rs.getString(1), MyConnection.rs.getString(2), MyConnection.rs.getString(3), MyConnection.rs.getString(4), MyConnection.rs.getString(5), MyConnection.rs.getString(6), show.departmentSearchByID(MyConnection.rs.getString(7)), show.designationSearchByID(MyConnection.rs.getString(8)),MyConnection.rs.getString(9)});
                
            }
            MyConnection.con.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "EMPLOYEES NOT FOUND SYSTEM ERROR!" + e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManEmpAdd;
    private javax.swing.JButton btnManEmpDelete;
    private javax.swing.JButton btnManEmpDep;
    private javax.swing.JButton btnManEmpDes;
    private javax.swing.JButton btnManEmpLogout;
    private javax.swing.JButton btnManEmpRefersh;
    private javax.swing.JButton btnManEmpSearch;
    private javax.swing.JButton btnManEmpUpdate;
    private javax.swing.JComboBox<String> cmbManEmpDep;
    private javax.swing.JComboBox<String> cmbManEmpDes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManEmpAdd;
    private javax.swing.JLabel lblManEmpDep;
    private javax.swing.JLabel lblManEmpDes;
    private javax.swing.JLabel lblManEmpEPF;
    private javax.swing.JLabel lblManEmpFN;
    private javax.swing.JLabel lblManEmpID;
    private javax.swing.JLabel lblManEmpLN;
    private javax.swing.JLabel lblManEmpPhoneNo;
    private javax.swing.JLabel lblManEmpSystemUserName;
    private javax.swing.JTable tblManEmp;
    private javax.swing.JTextField txtManEmpAdd;
    private javax.swing.JTextField txtManEmpEPF;
    private javax.swing.JTextField txtManEmpFN;
    private javax.swing.JTextField txtManEmpID;
    private javax.swing.JTextField txtManEmpLN;
    private javax.swing.JTextField txtManEmpPhoneNumber;
    private javax.swing.JTextField txtManEmpSearch;
    private javax.swing.JTextField txtManEmpUserName;
    // End of variables declaration//GEN-END:variables
}
