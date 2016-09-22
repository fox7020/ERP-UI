/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fox70
 */
public class ProfitReport extends javax.swing.JPanel {

    /**
     * Creates new form Employee
     */
    public ProfitReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbReport = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lbProfit = new javax.swing.JLabel();
        lbSales1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbExpend = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(980, 470));
        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel12.setText("當月盈餘");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        jLabel10.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel10.setText("當月銷售");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 20));

        cbReport.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        cbReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "支出報表", "銷售報表" }));
        jPanel1.add(cbReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 210, -1));

        cbMonth.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(cbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 210, -1));

        jLabel11.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel11.setText("當月支出");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        lbProfit.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        lbProfit.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lbProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 247, 30));

        lbSales1.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(lbSales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 247, 30));

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel1.setText("年份");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 30));

        cbYear.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });
        jPanel1.add(cbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, -1));

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel3.setText("觀看");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, 31));

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jLabel2.setText("月份");
        jLabel2.setName(""); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 31));

        lbExpend.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(lbExpend, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 247, 30));

        jLabel7.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 241, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbReport;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbExpend;
    private javax.swing.JLabel lbProfit;
    private javax.swing.JLabel lbSales1;
    // End of variables declaration//GEN-END:variables
}
