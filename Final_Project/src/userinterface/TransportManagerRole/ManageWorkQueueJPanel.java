/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.Driver;
import Business.Organization.Transport;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.MainOfficeWorkRequest;
import Business.WorkQueue.TransportWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aadesh Randeria
 */
public class ManageWorkQueueJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Transport organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form ManageWorkQueueJPanel
     */
    public ManageWorkQueueJPanel(JPanel userProcessContainer, UserAccount account, Transport organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business= business;
        this.network=network;
        populateRequestTable();
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblManageWorkQueue.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getStatus();
            int quantity = ((FoodWorkRequest) request).getQuantity();
            row[2] = quantity;
            String location = ((FoodWorkRequest) request).getLocation();
            row[3]=location;
            String result = ((FoodWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            
            model.addRow(row);
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
        tblManageWorkQueue = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(173, 255, 255));

        tblManageWorkQueue.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        tblManageWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Quantity", "Location", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageWorkQueue);

        btnRefresh.setBackground(new java.awt.Color(255, 51, 0));
        btnRefresh.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setBackground(new java.awt.Color(255, 51, 0));
        btnRequest.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnRequest.setText("Request Test");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRequest)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequest))
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageWorkQueue.getSelectedRow();       
        
        if (selectedRow >= 0) {
            FoodWorkRequest request = (FoodWorkRequest) tblManageWorkQueue.getValueAt(selectedRow, 0);
            if(!request.getStatus().equalsIgnoreCase("Food Delivered")){
                request.setStatus("Processing");

                RequestTestJPanel rtjp = new RequestTestJPanel(userProcessContainer, organization, request, userAccount, business, network);
                userProcessContainer.add("RequestTestJPanel", rtjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid request"); 
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Please select a message to request."); 
            return;
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
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageWorkQueue;
    // End of variables declaration//GEN-END:variables
}
