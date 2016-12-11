/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportManagerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Driver;
import Business.Organization.Organization;
import Business.Organization.Transport;
import Business.Role.DriverRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aadesh Randeria
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateOrganizationComboBox();

        populateData();
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateDriverComboBox(Organization organization) {
        comboBoxDriver.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            comboBoxDriver.addItem(employee);
        }
    }

    public void populateRoleComboBox(Organization organization) {
        comboBoxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            comboBoxRole.addItem(role);
        }
    }

    public void populateData() {
        DefaultTableModel model = (DefaultTableModel) tblManageUserAccount.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblManageUserAccount.getModel()).addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageUserAccount = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxDriver = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        comboBoxRole = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(173, 255, 255));

        tblManageUserAccount.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        tblManageUserAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageUserAccount);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setText("Driver:");

        comboBoxDriver.setBackground(new java.awt.Color(255, 51, 0));
        comboBoxDriver.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Role:");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setText("User Name:");

        txtUserName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Password:");

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(255, 51, 0));
        btnCreate.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        comboBoxRole.setBackground(new java.awt.Color(255, 51, 0));
        comboBoxRole.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setText("Organization");

        organizationJComboBox.setBackground(new java.awt.Color(255, 51, 0));
        organizationJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxDriver, javax.swing.GroupLayout.Alignment.LEADING, 0, 308, Short.MAX_VALUE)
                                    .addComponent(comboBoxRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUserName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(44, 44, 44)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreate))
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add youelser handling code here:
        boolean userFlag = false;
        boolean passFlag = false;
        if (txtUserName.getText().isEmpty()) {
            userFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your user name", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (txtPassword.getText().isEmpty()) {
            passFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter a password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!userFlag & !passFlag) {
            String userName = txtUserName.getText();
            char[] value = txtPassword.getPassword();
            String password = new String(value);
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
            Employee employee = (Employee) comboBoxDriver.getSelectedItem();
            Role role = (Role) comboBoxRole.getSelectedItem();

            if (organization instanceof Driver) {
                employee.setStatus("Available");
            }

            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

            populateData();

            JOptionPane.showMessageDialog(null, "User Account added successfully.");
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateDriverComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox comboBoxDriver;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable tblManageUserAccount;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
