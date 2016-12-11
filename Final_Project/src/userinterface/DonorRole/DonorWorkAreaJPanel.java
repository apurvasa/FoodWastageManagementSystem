/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.Donor.Donor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.MainOffice;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.MainOfficeWorkRequest;
import Business.WorkQueue.StoreWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Apurva Sawant
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DonorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;

    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public DonorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DonorOrganization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        
        populateComboBox();
        if (userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            locationTxt.setEnabled(false);
        }
        if (!userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            storeComboBox.setEnabled(false);
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
        donateBtn = new javax.swing.JButton();
        locationTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        storeComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboBoxCity = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel1.setText("Wish to donate food? Just notify us!");

        donateBtn.setBackground(new java.awt.Color(255, 51, 0));
        donateBtn.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        locationTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel3.setText("(This facility is not available for individuals)");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Location:");

        quantityTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setText("Store:");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel6.setText("(This facility is only available for individuals)");

        storeComboBox.setBackground(new java.awt.Color(255, 51, 0));
        storeComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        storeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setText("Network:");

        comboBoxCity.setBackground(new java.awt.Color(255, 51, 0));
        comboBoxCity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        comboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCityActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(donateBtn))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(donateBtn)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed

        if (!userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            boolean qtyFlag = false;
            boolean locFlag = false;
            if (quantityTxt.getText().isEmpty()) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!Validations.isDigit(quantityTxt.getText())) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (locationTxt.getText().isEmpty()) {
                locFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!qtyFlag & !locFlag){
                for (Donor donor : business.getDonorDiresctory().getDonorList()) {
                    if (userAccount.getDonor().equals(donor)) {
                        int old_quantity = donor.getDonationAmount();
                        int quantity = Integer.valueOf(quantityTxt.getText());
                        donor.setDonationAmount(old_quantity + quantity);
                    }

                }
                FoodWorkRequest request = new FoodWorkRequest();
                request.setSender(userAccount);
                request.setQuantity(Integer.valueOf(quantityTxt.getText()));
                request.setLocation(locationTxt.getText());
                request.setStatus("Request Sent");
                request.setMessage("Food ready for pickup");

                Enterprise en = null;
                for(Network network: business.getNetworkList()){
                    String net=(String)comboBoxCity.getSelectedItem();
                    if(network.getName().equalsIgnoreCase(net)){
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    //    System.out.println("Enterprise"+ enterprise.getName());
                    if (enterprise instanceof MainCenterEnterprise) {
                        //   System.out.println("Yes");
                        en = enterprise;
                        Organization org = null;
                        for (Organization organization : en.getOrganizationDirectory().getOrganizationList()) {

                            if (organization instanceof MainOffice) {
                                //         System.out.println("Yes Organization");
                                org = organization;
                                break;
                            }
                        }
                        if (org != null) {
                            //     System.out.println("Org"+org.getName());
                            //     System.out.println("User Account"+userAccount.getUsername());
                            org.getWorkQueue().getWorkRequestList().add(request);
                            //     System.out.println("Orga"+org.getWorkQueue().getWorkRequestList());
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            JOptionPane.showMessageDialog(null, "Food donated successfully.");
                            quantityTxt.setText("");
                            locationTxt.setText("");
                        }

                    }
                }
                }
            }
            }
        } else {
            //send work request to that particular store
            boolean qtyFlag = false;
            if (quantityTxt.getText().isEmpty()) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!Validations.isDigit(quantityTxt.getText())) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!qtyFlag){
                for (Donor donor : business.getDonorDiresctory().getDonorList()) {
                    if (userAccount.getDonor().equals(donor)) {
                        int old_quantity = donor.getDonationAmount();
                        int quantity = Integer.valueOf(quantityTxt.getText());
                        donor.setDonationAmount(old_quantity + quantity);
                    }

                }
                FoodWorkRequest request = new FoodWorkRequest();
                request.setSender(userAccount);
                request.setQuantity(Integer.parseInt(quantityTxt.getText()));
                request.setStatus("Food Received");
                request.setMessage("Food given at store");
                Store inStore = null;
                for(Network network: business.getNetworkList()){
                     String net=(String)comboBoxCity.getSelectedItem();
                    if(network.getName().equalsIgnoreCase(net)){
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    //    System.out.println("Enterprise"+ enterprise.getName());
                    if (enterprise instanceof MainCenterEnterprise) {
                        //   System.out.println("Yes");
                      //  en = enterprise;
                       
                   
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof StoreChain) {
                        for (Store store : ((StoreChain) org).getStoreChain()) {
                            Store selectedstore = (Store) storeComboBox.getSelectedItem();
                            if (store.getName().equals(selectedstore.getName())) {
                                inStore = store;
                                break;
                            }

                        }
                    }
                }}}
                    }}
                if (inStore != null) {
                    inStore.getWorkQueue().getWorkRequestList().add(request);
                    //     System.out.println("Orga"+org.getWorkQueue().getWorkRequestList());
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    JOptionPane.showMessageDialog(null, "Food donated successfully.");
                    quantityTxt.setText("");
                }
            }
        }
    }//GEN-LAST:event_donateBtnActionPerformed

    private void storeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeComboBoxActionPerformed

        
    }//GEN-LAST:event_storeComboBoxActionPerformed

    private void comboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCityActionPerformed
        Network network=(Network)comboBoxCity.getSelectedItem();
                populateStore(network);

    }//GEN-LAST:event_comboBoxCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBoxCity;
    private javax.swing.JButton donateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JComboBox storeComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {

        comboBoxCity.removeAll();
        
        for(Network network: business.getNetworkList()){
          comboBoxCity.addItem(network.getName());
        }
       
    }
    
    private void populateStore(Network network) {

        storeComboBox.removeAll();
       // for(Network net: business.getNetworkList()){
          //  String inNet=(String)comboBoxCity.getSelectedItem();
           // if(network.getName().equalsIgnoreCase(inNet)){
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){    
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof StoreChain) {
                for (Store store : ((StoreChain) org).getStoreChain()) {
                    storeComboBox.addItem(store);

                //}
           // }
        }
        }
        }
        }
    }
}
