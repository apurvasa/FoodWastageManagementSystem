/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InspectionCenterEnterprise;
import Business.Network.Network;
import Business.Organization.Lab;
import Business.Organization.LabAssistant;
import Business.Organization.Organization;
import Business.Role.LabAssistantRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.LabAssistantWorkRequest;
import Business.WorkQueue.LabManagerWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aadesh Randeria
 */
public class RequestTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTestJPanel
     */
    private JPanel userProcessContainer;
    private Lab organization;
    private LabManagerWorkRequest request;
    private UserAccount account;
    private Network network;
    RequestTestJPanel(JPanel userProcessContainer, Lab organization, LabManagerWorkRequest request, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.request = request;
        this.account = account;
        this.network = network;
        
        populateLabAssistantComboBox();
    }
    
    public void populateLabAssistantComboBox() {
        comboBoxLabAssistant.removeAllItems();
        
            Enterprise en = null;
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof InspectionCenterEnterprise)
                {
                    en=e;
                    for(Organization o : en.getOrganizationDirectory().getOrganizationList()) {
                        if(o instanceof LabAssistant){
                          for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()) {
                              comboBoxLabAssistant.addItem(ua);
                          } 
                        }
                    }
                    
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

        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxLabAssistant = new javax.swing.JComboBox();

        jLabel1.setText("Message:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setText("Request Test");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Lab Assistant:");

        comboBoxLabAssistant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequest))
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        boolean msgFlag = false;
        if (txtMessage.getText().isEmpty()) {
            msgFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your message", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!msgFlag) {
            UserAccount ua = (UserAccount)comboBoxLabAssistant.getSelectedItem();
           // LabManagerWorkRequest request=new LabManagerWorkRequest();
            request.setSender(account);
            //request.setLabAssistantName(ua);
            request.setMessage(txtMessage.getText());
            request.setStatus("Sent to lab assistant");
            Enterprise en=null;
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("Enterprise"+ enterprise.getName());
                 if(enterprise instanceof InspectionCenterEnterprise){
                     System.out.println("Yes");
                    en = enterprise;
                    Organization org = null;
                    UserAccount isLabAssistant = null;
                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()){
                        
                        if (organization instanceof LabAssistant){
//                            System.out.println("Yes Organization");
//                            org = organization;
//                            break;
                            
                            isLabAssistant = ua;
                        }
                    }
                    if (isLabAssistant!=null){
//                        System.out.println("Driver"+isDriver.getgetName());
                        System.out.println("User Account"+account.getUsername());
                        isLabAssistant.getWorkQueue().getWorkRequestList().add(request);
                        System.out.println("LabAssistant"+isLabAssistant.getWorkQueue().getWorkRequestList());
                        account.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null, "Request sent successfully.");
                        txtMessage.setText("");
                    }
                    
                }
            }   
        }      
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox comboBoxLabAssistant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
