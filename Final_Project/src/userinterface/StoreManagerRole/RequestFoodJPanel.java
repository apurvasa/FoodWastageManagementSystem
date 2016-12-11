/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.Inventory;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.StoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class RequestFoodJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Store organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;

    DefaultTableModel model;

    /**
     * Creates new form RequestFoodJPanel
     */
    public RequestFoodJPanel(JPanel userProcessContainer, UserAccount account, Store organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network=network;
        model = (DefaultTableModel) tblStores.getModel();
        model.setRowCount(0);
        populateTable();
        populatestoreTable();

    }

    public LinkedHashMap sortHashMapByValuesD(HashMap passedMap) {
        List mapKeys = new ArrayList(passedMap.keySet());
        List mapValues = new ArrayList(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap sortedMap = new LinkedHashMap();

        Iterator valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Object val = valueIt.next();
            Iterator keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Object key = keyIt.next();
                String comp1 = passedMap.get(key).toString();
                String comp2 = val.toString();

                if (comp1.equals(comp2)) {
                    passedMap.remove(key);
                    mapKeys.remove(key);
                    sortedMap.put((String) key, (Double) val);
                    break;
                }

            }

        }
        return sortedMap;
    }

    public void populateTable() {
        HashMap<String, Double> map = new HashMap<String, Double>();
        if (enterprise instanceof MainCenterEnterprise) {
            StoreChain org1 = null;
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof StoreChain) {
                    org1 = (StoreChain) org;
                }
                for (Store s : org1.getStoreChain()) {
                    System.out.println("store" + s);
                    double x1 = organization.getLatitude();
                    double y1 = organization.getLongitude();
                    double x2 = s.getLatitude();
                    double y2 = s.getLongitude();
                    double distance = 0;
                    double x3 = (x1 - x2) * (x1 - x2);
                    double y3 = (y1 - y2) * (y1 - y2);
                    distance = Math.sqrt(x3 + y3);
                    System.out.println("distance" + distance);
                    map.put(s.getName(), distance);
                }
            }
        }
        LinkedHashMap lmap = new LinkedHashMap();
        lmap = sortHashMapByValuesD(map);
        Iterator iterator = lmap.keySet().iterator();
        DefaultTableModel model = (DefaultTableModel) tblStores.getModel();

        model.setRowCount(0);
        int count=0;
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            String value = lmap.get(key).toString();
            if (!value.equals("0.0") && count<4) {

                Object[] row = new Object[2];
                row[0] = key;
                row[1] = Double.parseDouble(value);

                model.addRow(row);
                count++;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        requestBtn = new javax.swing.JButton();
        btnRequestInventory = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(173, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setText("Nearby Stores:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tblStores.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        tblStores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Distance(Kms)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 448, 116));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Quantity: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        quantityTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 123, -1));

        requestBtn.setBackground(new java.awt.Color(255, 51, 0));
        requestBtn.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        requestBtn.setText("Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btnRequestInventory.setBackground(new java.awt.Color(255, 51, 0));
        btnRequestInventory.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnRequestInventory.setText("Request Inventory");
        btnRequestInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestInventoryActionPerformed(evt);
            }
        });
        add(btnRequestInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populatestoreTable() {

//        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
//        {
//            if(org instanceof StoreChain)
//            {    
//                for(Store store: ((StoreChain) org).getStoreChain())
//                {
//                    for(int i=0; i<tblStores.getRowCount(); i++)
//                    {    
//                   if(store.getName().equals(tblStores.getValueAt(i, 0)))
//                   {
//                       
//                       model.setRowCount(0);
//                      
//                       Object[] row = new Object[6];
//                       row[0] = request;
//                   }
//                    }
//                }
//            }
//        }
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = ((FoodWorkRequest) request).getQuantity();

            String result = ((FoodWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;

            model.addRow(row);

        }
//        boolean flag = false;
//        for (int i = 0; i < tblStoreWorkQueue.getRowCount(); i++) {
//            String result = (String) tblStoreWorkQueue.getValueAt(i, 4);
//            if (!result.equalsIgnoreCase("No")) {
//                flag = true;
//            }
//        }
//        if (flag == false) {
//            btnRequestInventory.setEnabled(true);
//        }
    }

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
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
            FoodWorkRequest request = new FoodWorkRequest();
            request.setMessage("Request for food");

            request.setSender(userAccount);
            request.setSenderOrganization(organization);
            request.setQuantity(Integer.parseInt(quantityTxt.getText()));
            request.setStatus("Request Sent");
            //     request.setLocation(store.getLocation());

            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof StoreChain) {
                    for (Store store : ((StoreChain) org).getStoreChain()) {
                        for (int i = 0; i < tblStores.getRowCount(); i++) {
                            if (store.getName().equals(tblStores.getValueAt(i, 0))) {
                                request.setLocation(store.getLocation());
                                store.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                populateRequestTable(request, store);
                                JOptionPane.showMessageDialog(null, "Request sent successfully.");
                                quantityTxt.setText("");
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_requestBtnActionPerformed

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtActionPerformed

    private void btnRequestInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestInventoryActionPerformed
        // TODO add your handling code here:
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
            FoodWorkRequest request = new FoodWorkRequest();
            request.setMessage("Request for food");
            request.setSender(userAccount);
            request.setQuantity(Integer.parseInt(quantityTxt.getText()));
            request.setStatus("Sent");
            request.setSenderOrganization(organization);
            request.setLocation(organization.getLocation());
            Organization org = null;
            
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof MainCenterEnterprise) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            if (o instanceof Inventory) {
                                org = o;
                                break;

                            }
                        }
                        if (org != null) {
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            JOptionPane.showMessageDialog(null, "Request sent successfully.");
                            quantityTxt.setText("");
                        }
                    }
                }
            
        }
    }//GEN-LAST:event_btnRequestInventoryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    public void populateRequestTable(FoodWorkRequest request, Store store) {

//                       DefaultTableModel model = (DefaultTableModel) tblStoreWorkQueue.getModel();
//                       model.setRowCount(0);
        Object[] row = new Object[6];
        row[0] = request;
        //  System.out.println("store:"+store);
        row[1] = store;
        row[2] = request.getStatus();
        row[3] = request.getQuantity();
        row[4] = request.getLocation();
        //     String result = request.getResult();
        //       row[4] = result == null ? "Waiting" : result;

        model.addRow(row);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestInventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTable tblStores;
    // End of variables declaration//GEN-END:variables
}
