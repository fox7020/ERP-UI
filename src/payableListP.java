/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class payableListP extends javax.swing.JPanel {

    /**
     * Creates new form payableListP
     */
    public payableListP() {
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
        purchaseLabel01 = new javax.swing.JLabel();
        purchaseLabel02 = new javax.swing.JLabel();
        purchaseLabel03 = new javax.swing.JLabel();
        purchaseLabel04 = new javax.swing.JLabel();
        purchaseLabel05 = new javax.swing.JLabel();
        purchaseLabel06 = new javax.swing.JLabel();
        amount_Accn = new javax.swing.JTextField();
        purchaseLabel07 = new javax.swing.JLabel();
        actualPayAmount_Accn = new javax.swing.JTextField();
        purchaseLabel08 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        note_Accn = new javax.swing.JTextArea();
        purchaseNum_Accn = new javax.swing.JComboBox<>();
        payDue_Accn = new com.toedter.calendar.JDateChooser();
        payDate_Accn = new com.toedter.calendar.JDateChooser();
        purchaseLabel8 = new javax.swing.JLabel();
        purchaseLabel9 = new javax.swing.JLabel();
        discount_Accn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ifClose_Accn = new javax.swing.JLabel();
        vendorName_Accn = new javax.swing.JLabel();
        payWith_Accn = new javax.swing.JComboBox<>();
        payableListID_Accn = new javax.swing.JLabel();
        vendorNum_Accn = new javax.swing.JComboBox<>();
        transactionDate_Accn = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(980, 470));
        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purchaseLabel01.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel01.setText("廠商編號");
        jPanel1.add(purchaseLabel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 51, -1, 32));

        purchaseLabel02.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel02.setText("進貨單號");
        jPanel1.add(purchaseLabel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 121, -1, 30));

        purchaseLabel03.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel03.setText("交易日期");
        jPanel1.add(purchaseLabel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 186, -1, 30));

        purchaseLabel04.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel04.setText("應付日期");
        jPanel1.add(purchaseLabel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 255, -1, 30));

        purchaseLabel05.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel05.setText("沖帳日期");
        jPanel1.add(purchaseLabel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 51, -1, 30));

        purchaseLabel06.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel06.setText("應付金額");
        purchaseLabel06.setToolTipText("");
        jPanel1.add(purchaseLabel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 320, -1, 30));

        amount_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        amount_Accn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amount_AccnKeyTyped(evt);
            }
        });
        jPanel1.add(amount_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 320, 180, 30));

        purchaseLabel07.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel07.setText("沖帳金額");
        jPanel1.add(purchaseLabel07, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 118, -1, 30));

        actualPayAmount_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        actualPayAmount_Accn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                actualPayAmount_AccnKeyTyped(evt);
            }
        });
        jPanel1.add(actualPayAmount_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 120, 216, 30));

        purchaseLabel08.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel08.setText("備註");
        jPanel1.add(purchaseLabel08, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 333, 111, 30));

        note_Accn.setColumns(20);
        note_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        note_Accn.setRows(5);
        jScrollPane4.setViewportView(note_Accn);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 323, 348, -1));

        purchaseNum_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseNum_Accn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(purchaseNum_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 121, 180, 30));

        payDue_Accn.setDateFormatString("yyyy/MM/dd");
        payDue_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(payDue_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 255, 180, 30));

        payDate_Accn.setDateFormatString("yyyy/MM/dd");
        payDate_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(payDate_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 51, 216, 30));

        purchaseLabel8.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel8.setText("付款方式");
        jPanel1.add(purchaseLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 254, -1, 30));

        purchaseLabel9.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        purchaseLabel9.setText("沖帳折讓金額");
        jPanel1.add(purchaseLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 186, -1, 30));

        discount_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        discount_Accn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discount_AccnKeyTyped(evt);
            }
        });
        jPanel1.add(discount_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 188, 216, 30));

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel1.setText("結案Y/N");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 389, 72, -1));

        ifClose_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        ifClose_Accn.setForeground(new java.awt.Color(255, 51, 51));
        ifClose_Accn.setText("結案預設N");
        jPanel1.add(ifClose_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 386, 180, 30));

        vendorName_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        vendorName_Accn.setText("廠商名稱");
        jPanel1.add(vendorName_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 51, 110, 32));

        payWith_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        payWith_Accn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        payWith_Accn.setMinimumSize(new java.awt.Dimension(73, 30));
        payWith_Accn.setPreferredSize(new java.awt.Dimension(73, 30));
        jPanel1.add(payWith_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 256, 216, -1));

        payableListID_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        payableListID_Accn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payableListID_Accn.setText("應付帳款單號");
        jPanel1.add(payableListID_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 21, 147, -1));

        vendorNum_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        vendorNum_Accn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vendorNum_Accn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorNum_AccnActionPerformed(evt);
            }
        });
        jPanel1.add(vendorNum_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 51, 180, 32));

        transactionDate_Accn.setDateFormatString("yyyy/MM/dd");
        transactionDate_Accn.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(transactionDate_Accn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 186, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vendorNum_AccnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorNum_AccnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorNum_AccnActionPerformed

    private void amount_AccnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amount_AccnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_AccnKeyTyped

    private void actualPayAmount_AccnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualPayAmount_AccnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_actualPayAmount_AccnKeyTyped

    private void discount_AccnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discount_AccnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_AccnKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualPayAmount_Accn;
    private javax.swing.JTextField amount_Accn;
    private javax.swing.JTextField discount_Accn;
    private javax.swing.JLabel ifClose_Accn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea note_Accn;
    private com.toedter.calendar.JDateChooser payDate_Accn;
    private com.toedter.calendar.JDateChooser payDue_Accn;
    private javax.swing.JComboBox<String> payWith_Accn;
    private javax.swing.JLabel payableListID_Accn;
    private javax.swing.JLabel purchaseLabel01;
    private javax.swing.JLabel purchaseLabel02;
    private javax.swing.JLabel purchaseLabel03;
    private javax.swing.JLabel purchaseLabel04;
    private javax.swing.JLabel purchaseLabel05;
    private javax.swing.JLabel purchaseLabel06;
    private javax.swing.JLabel purchaseLabel07;
    private javax.swing.JLabel purchaseLabel08;
    private javax.swing.JLabel purchaseLabel8;
    private javax.swing.JLabel purchaseLabel9;
    private javax.swing.JComboBox<String> purchaseNum_Accn;
    private com.toedter.calendar.JDateChooser transactionDate_Accn;
    private javax.swing.JLabel vendorName_Accn;
    private javax.swing.JComboBox<String> vendorNum_Accn;
    // End of variables declaration//GEN-END:variables
}
