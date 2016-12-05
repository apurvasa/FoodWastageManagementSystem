/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Lab;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Aadesh Randeria
 */
public class LabManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Lab organization;
    private Enterprise enterprise;
    private EcoSystem business;
    public LabManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Lab organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
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
        btnManageLabAssistant = new javax.swing.JButton();
        btnUserAccount = new javax.swing.JButton();
        btnWorkQueue = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("My Work Area - Lab Manager Role");

        btnManageLabAssistant.setText("Manage Lab Assistant");
        btnManageLabAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLabAssistantActionPerformed(evt);
            }
        });

        btnUserAccount.setText("Manage User Account");
        btnUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountActionPerformed(evt);
            }
        });

        btnWorkQueue.setText("Manage Work Queue");
        btnWorkQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkQueueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnManageLabAssistant)
                    .addComponent(btnUserAccount)
                    .addComponent(btnWorkQueue))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageLabAssistant, btnUserAccount, btnWorkQueue});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnManageLabAssistant)
                .addGap(18, 18, 18)
                .addComponent(btnUserAccount)
                .addGap(18, 18, 18)
                .addComponent(btnWorkQueue)
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageLabAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLabAssistantActionPerformed
        // TODO add your handling code here:
        ManageLabAssistantJPanel mlajp = new ManageLabAssistantJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageLabAssistantJPanel", mlajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageLabAssistantActionPerformed

    private void btnUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserAccountActionPerformed

    private void btnWorkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkQueueActionPerformed
        // TODO add your handling code here:
        ManageWorkQueueJPanel mwqtjp = new ManageWorkQueueJPanel(userProcessContainer, account, organization, enterprise, business);
        userProcessContainer.add("ManageWorkQueueJPanel", mwqtjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkQueueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageLabAssistant;
    private javax.swing.JButton btnUserAccount;
    private javax.swing.JButton btnWorkQueue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
