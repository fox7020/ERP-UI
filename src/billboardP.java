/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class billboardP extends javax.swing.JPanel {

    /**
     * Creates new form billboardP
     */
    public billboardP() {
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
        billboardLabel01 = new javax.swing.JLabel();
        billboardLabel02 = new javax.swing.JLabel();
        billboardLabel03 = new javax.swing.JLabel();
        issueDate_billboard = new com.toedter.calendar.JDateChooser();
        billboardLabel04 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        announce_billboard = new javax.swing.JTextArea();
        id_billboard = new javax.swing.JLabel();
        employeeNum_billboard = new javax.swing.JComboBox<>();
        billboardLabel05 = new javax.swing.JLabel();
        deadline_billboard = new com.toedter.calendar.JDateChooser();
        billboardLabel06 = new javax.swing.JLabel();
        remark_billboard = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        employeeName_billboard = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(980, 470));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billboardLabel01.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel01.setText("公告編號");
        jPanel1.add(billboardLabel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 53, -1, 30));

        billboardLabel02.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel02.setText("公告日期");
        jPanel1.add(billboardLabel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 123, -1, 30));

        billboardLabel03.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel03.setText("公告維護者");
        jPanel1.add(billboardLabel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 189, -1, 30));

        issueDate_billboard.setDateFormatString("yyyy/MM/dd");
        issueDate_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(issueDate_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 123, 180, 30));

        billboardLabel04.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel04.setText("公告內容");
        jPanel1.add(billboardLabel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 264, -1, 30));

        announce_billboard.setColumns(20);
        announce_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        announce_billboard.setRows(5);
        jScrollPane4.setViewportView(announce_billboard);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 300, 833, -1));

        id_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        id_billboard.setText("系統自動產生");
        jPanel1.add(id_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 53, 180, 30));

        employeeNum_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        employeeNum_billboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeNum_billboard.setMinimumSize(new java.awt.Dimension(73, 30));
        employeeNum_billboard.setPreferredSize(new java.awt.Dimension(73, 30));
        employeeNum_billboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNum_billboardActionPerformed(evt);
            }
        });
        jPanel1.add(employeeNum_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 189, 180, -1));

        billboardLabel05.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel05.setText("有效日期");
        jPanel1.add(billboardLabel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 123, -1, 30));

        deadline_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(deadline_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 123, 282, 30));

        billboardLabel06.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        billboardLabel06.setText("備註");
        jPanel1.add(billboardLabel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 192, 72, -1));

        remark_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(remark_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 189, 282, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 248, 833, 10));

        employeeName_billboard.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        employeeName_billboard.setText("員工名");
        jPanel1.add(employeeName_billboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 192, 146, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNum_billboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNum_billboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNum_billboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea announce_billboard;
    private javax.swing.JLabel billboardLabel01;
    private javax.swing.JLabel billboardLabel02;
    private javax.swing.JLabel billboardLabel03;
    private javax.swing.JLabel billboardLabel04;
    private javax.swing.JLabel billboardLabel05;
    private javax.swing.JLabel billboardLabel06;
    private com.toedter.calendar.JDateChooser deadline_billboard;
    private javax.swing.JLabel employeeName_billboard;
    private javax.swing.JComboBox<String> employeeNum_billboard;
    private javax.swing.JLabel id_billboard;
    private com.toedter.calendar.JDateChooser issueDate_billboard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField remark_billboard;
    // End of variables declaration//GEN-END:variables
}
