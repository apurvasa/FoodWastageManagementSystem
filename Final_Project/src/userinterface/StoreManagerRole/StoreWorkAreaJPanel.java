/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TransportAgencyEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.RecordList;
import Business.Organization.Records;
import Business.Organization.Store;
import Business.Organization.Transport;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.StoreWorkRequest;
import Business.WorkQueue.TransportWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userinterface.InventoryManagerRole.InventoryManagerWorkAreaJPanel.randInt;

/**
 *
 * @author Apurva Sawant
 */
public class StoreWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Store organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form StoreWorkAreaJPanel
     */
    

    public StoreWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Store organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        this.network=network;
        txtStock.setText(Integer.toString(organization.getStock()));
        if(Integer.parseInt(txtStock.getText())<5)
        {
          btnRequestFood.setEnabled(true);
        }
       populateRequestTable();
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblStore.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            int quantity = ((FoodWorkRequest) request).getQuantity();
            row[3] = quantity;
            

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
        tblStore = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnRequestFood = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGiveAway = new javax.swing.JTextField();
        btnGiveAway = new javax.swing.JButton();
        btnDailySub = new javax.swing.JButton();

        tblStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStore);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnRequestFood.setText("Request Food");
        btnRequestFood.setEnabled(false);
        btnRequestFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFoodActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Food");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Stock:");

        btnSend.setText("Send Food");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel2.setText("Give Away:");

        btnGiveAway.setText("Give Away");
        btnGiveAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveAwayActionPerformed(evt);
            }
        });

        btnDailySub.setText("Daily Submission");
        btnDailySub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)
                                        .addComponent(btnRequestFood)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGiveAway, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDailySub)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiveAway, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiveAway, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSend)
                    .addComponent(btnRequestFood))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiveAway)
                    .addComponent(btnDailySub))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRequestFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFoodActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestFoodJPanel", new RequestFoodJPanel(userProcessContainer, userAccount,organization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestFoodActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStore.getSelectedRow();
        
        
        if (selectedRow >= 0) {
            FoodWorkRequest request = (FoodWorkRequest) tblStore.getValueAt(selectedRow, 0);

            if(request.getMessage().equalsIgnoreCase("Food given at store"))
            {    
            request.setStatus("Added");
            int stock=organization.getStock();
            int quantity = ((FoodWorkRequest) request).getQuantity();
            int total=stock+quantity;
            organization.setStock(total);
            txtStock.setText(Integer.toString(total));
            JOptionPane.showMessageDialog(null, "Stock Updated Successfully."); 
            organization.getWorkQueue().getWorkRequestList().remove(request);
            populateRequestTable();

        }else {
                JOptionPane.showMessageDialog(null, "Please select a valid request to process."); 
                return;
              }
        } else {
           JOptionPane.showMessageDialog(null, "Please select a request message to process."); 
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
       int selectedRow = tblStore.getSelectedRow();
        
            if (selectedRow >= 0) {
   //         StoreWorkRequest request = (StoreWorkRequest) tblStore.getValueAt(selectedRow, 0);
              FoodWorkRequest request = (FoodWorkRequest) tblStore.getValueAt(selectedRow, 0);
//           for(WorkRequest request1: organization.getWorkQueue().getWorkRequestList())
//           {
//               System.out.println("req:"+request.getId());
//               System.out.println("req1:"+request1.getId()+" "+request1.getClass());
//               
//               if(request1.getId()==request.getId())
//               {
//                   
//                request1.setStatus("Food Sent");
//                //organization.getWorkQueue().getWorkRequestList().remove(request1);
//                
//               }
//           
//           }
            
            if(request.getMessage().equalsIgnoreCase("Request for food"))
            { 
                if(request.getStatus().equalsIgnoreCase("Request Sent"))
                {
                    if((organization.getStock()-request.getQuantity())>10)
                    {
            request.setStatus("Food Sent for delivery");
         //   request.setResult("Yes");
            int stock=organization.getStock();
            int quantity = ((FoodWorkRequest) request).getQuantity();
            int total=stock-quantity;
            organization.setStock(total);
            
            txtStock.setText(Integer.toString(total));
            JOptionPane.showMessageDialog(null, "Food request accepted"); 
            populateRequestTable();
                FoodWorkRequest trasnportRequest=new FoodWorkRequest();
                trasnportRequest.setQuantity(quantity);
                trasnportRequest.setLocation(organization.getLocation());
                
                Enterprise en=null;
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("Enterprise"+ enterprise.getName());
                 if(enterprise instanceof TransportAgencyEnterprise){
                     System.out.println("Yes");
                    en = enterprise;
                    Organization org = null;
                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()){
                        
                        if (organization instanceof Transport){
                          //  System.out.println("Yes Organization");
                            org = organization;
                            break;
                        }
                    }
                    if (org!=null){
                      //  System.out.println("Org"+org.getName());
                      //  System.out.println("User Account"+userAccount.getUsername());
                        org.getWorkQueue().getWorkRequestList().add(request);
                      //  System.out.println("Orga"+org.getWorkQueue().getWorkRequestList());
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                    }
                  }
               }
              }else{
                       JOptionPane.showMessageDialog(null, "Stock is below the threshold. Cannot process the request."); 
                    }
             }else {
                       JOptionPane.showMessageDialog(null, "Request already processed by another store."); 
                   }
            }
            else {
                    JOptionPane.showMessageDialog(null, "Invalid action. You cannot send food for this request."); 
                 }
            }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnGiveAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveAwayActionPerformed
        // TODO add your handling code here:
        int stock=organization.getStock();
        int giveAway=randInt(1,3);
        int existingGiveAway=organization.getGiveAway();
        int total=giveAway+existingGiveAway;
        organization.setGiveAway(total);
        int totalStock=stock-giveAway;
        organization.setStock(totalStock);
        txtStock.setText(String.valueOf(totalStock));
        txtGiveAway.setText(String.valueOf(total));
        JOptionPane.showMessageDialog(null, "Food Successfully donated");

    }//GEN-LAST:event_btnGiveAwayActionPerformed

    private void btnDailySubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySubActionPerformed
        // TODO add your handling code here:
        int finalStock=organization.getFinalStock();
        int giveAwaycount= organization.getGiveAway();
        Records records=new Records();
        records.setFoodDonated(finalStock);
        records.setFoodGiven(giveAwaycount);
        records.setRequestDate(business.getCurrentDate());
        System.out.println("current date"+business.getCurrentDate());
        RecordList list=new RecordList();
        list.addRecords(records);
        organization.setRecordList(list);
        JOptionPane.showMessageDialog(null, "Daily Records Submitted Successfully");

    }//GEN-LAST:event_btnDailySubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDailySub;
    private javax.swing.JButton btnGiveAway;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequestFood;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStore;
    private javax.swing.JTextField txtGiveAway;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
