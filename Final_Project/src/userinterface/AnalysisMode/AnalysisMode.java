/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalysisMode;

import Business.EcoSystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Aadesh Randeria
 */
public class AnalysisMode extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisMode
     */
    private JPanel container;
    private EcoSystem business;
    public AnalysisMode(JPanel container, EcoSystem business) {
        initComponents();
        this.container = container;
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

        tab6 = new javax.swing.JTabbedPane();
        barPanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnResultQuestion1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        piePanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnResultQuestion2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnResultQuestion3 = new javax.swing.JButton();
        comboBoxCity = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnResultQuestion4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane6 = new javax.swing.JSplitPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnResultQuestion5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnResultQuestion6 = new javax.swing.JButton();
        displayPanelno6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(19, 25, 37));

        tab6.setBackground(new java.awt.Color(255, 51, 0));
        tab6.setToolTipText("");
        tab6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        barPanel.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel7.setBackground(new java.awt.Color(13, 25, 37));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My first question is:");

        btnResultQuestion1.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion1.setText("View Result");
        btnResultQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(btnResultQuestion1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnResultQuestion1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(jPanel7);

        jPanel8.setBackground(new java.awt.Color(13, 25, 37));
        jPanel8.setLayout(new java.awt.BorderLayout());
        jSplitPane2.setRightComponent(jPanel8);

        barPanel.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        tab6.addTab("First Question", barPanel);

        jPanel2.setLayout(new java.awt.BorderLayout());

        piePanel.setLayout(new java.awt.BorderLayout());

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel9.setBackground(new java.awt.Color(13, 25, 37));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Second question is:");

        btnResultQuestion2.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion2.setText("View Result");
        btnResultQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(btnResultQuestion2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnResultQuestion2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jSplitPane3.setTopComponent(jPanel9);

        jPanel10.setBackground(new java.awt.Color(13, 25, 37));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(jPanel10);

        piePanel.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jPanel2.add(piePanel, java.awt.BorderLayout.CENTER);

        tab6.addTab("Second  Question", jPanel2);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jSplitPane4.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel11.setBackground(new java.awt.Color(13, 25, 37));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("My Third question is:");

        btnResultQuestion3.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion3.setText("View Result");
        btnResultQuestion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion3ActionPerformed(evt);
            }
        });

        comboBoxCity.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        comboBoxCity.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Cambridge", "Worcester" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResultQuestion3)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnResultQuestion3)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jSplitPane4.setTopComponent(jPanel11);

        jPanel12.setBackground(new java.awt.Color(13, 25, 37));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jSplitPane4.setRightComponent(jPanel12);

        jPanel1.add(jSplitPane4, java.awt.BorderLayout.CENTER);

        tab6.addTab("Third Question", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jSplitPane5.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel13.setBackground(new java.awt.Color(13, 25, 37));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("My Fourth question is:");

        btnResultQuestion4.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion4.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion4.setText("View Result");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btnResultQuestion4)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultQuestion4)
                    .addComponent(jLabel5))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPane5.setTopComponent(jPanel13);

        jPanel14.setBackground(new java.awt.Color(13, 25, 37));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jSplitPane5.setRightComponent(jPanel14);

        jPanel3.add(jSplitPane5, java.awt.BorderLayout.CENTER);

        tab6.addTab("Fourth Question", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jSplitPane6.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel15.setBackground(new java.awt.Color(13, 25, 37));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("My Fifth question is:");

        btnResultQuestion5.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion5.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion5.setText("View Result");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(btnResultQuestion5)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultQuestion5)
                    .addComponent(jLabel6))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPane6.setTopComponent(jPanel15);

        jPanel16.setBackground(new java.awt.Color(13, 25, 37));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jSplitPane6.setRightComponent(jPanel16);

        jPanel4.add(jSplitPane6, java.awt.BorderLayout.CENTER);

        tab6.addTab("Fifth Question", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel6.setBackground(new java.awt.Color(19, 25, 37));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("My Sixth question is:");

        btnResultQuestion6.setBackground(new java.awt.Color(255, 51, 0));
        btnResultQuestion6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        btnResultQuestion6.setForeground(new java.awt.Color(255, 255, 255));
        btnResultQuestion6.setText("View Result");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(btnResultQuestion6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnResultQuestion6))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel6);

        displayPanelno6.setBackground(new java.awt.Color(19, 25, 37));
        displayPanelno6.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(displayPanelno6);

        jPanel5.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        tab6.addTab("Sixth Question", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab6)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion1ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(business.getDonation(9), "Donation Amount", "Sept");
        barChartData.setValue(business.getDonation(10), "Donation Amount", "Oct");
        barChartData.setValue(business.getDonation(11), "Donation Amount", "Nov");
        JFreeChart barChart = ChartFactory.createBarChart("Food Donation", "Monthly", "Donation Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barP = new ChartPanel(barChart);
        barP.setVisible(true);
        barPanel.removeAll();
        barPanel.add(barP, BorderLayout.CENTER);
        barPanel.validate();
    }//GEN-LAST:event_btnResultQuestion1ActionPerformed

    private void btnResultQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion2ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieData = new DefaultPieDataset();
        pieData.setValue("Boston", business.getDonation("Boston"));
        pieData.setValue("Cambridge", business.getDonation("Cambridge"));
        pieData.setValue("Worchester", business.getDonation("Worchester"));
       // pieData.setValue("Four", new Integer(40));
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieData, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot();
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setVisible(true);
        piePanel.removeAll();
        piePanel.add(chartpanel, BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btnResultQuestion2ActionPerformed

    private void btnResultQuestion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion3ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
         HashMap<String, Integer> hmap=business.giveAcrossStores("Boston");//from combobox
         Set set = hmap.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         barChartData.setValue((Integer) mentry.getValue(), "Donation Amount", String.valueOf(mentry.getKey()));
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
        JFreeChart barChart = ChartFactory.createBarChart("Food Donation", "Store-wise", "Donation Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barP = new ChartPanel(barChart);
        barP.setVisible(true);
        barPanel.removeAll();
        barPanel.add(barP, BorderLayout.CENTER);
        barPanel.validate();
    }//GEN-LAST:event_btnResultQuestion3ActionPerformed

                                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barPanel;
    private javax.swing.JButton btnResultQuestion1;
    private javax.swing.JButton btnResultQuestion2;
    private javax.swing.JButton btnResultQuestion3;
    private javax.swing.JButton btnResultQuestion4;
    private javax.swing.JButton btnResultQuestion5;
    private javax.swing.JButton btnResultQuestion6;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JPanel displayPanelno6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JPanel piePanel;
    private javax.swing.JTabbedPane tab6;
    // End of variables declaration//GEN-END:variables
}
