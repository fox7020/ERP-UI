/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fox70
 */
public class Attendance extends javax.swing.JPanel {

    /**
     * Creates new form Employee
     */
    public Attendance() {
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
        jLabel1 = new javax.swing.JLabel();
        txtEmployeeNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JEditorPane();
        cbLeaveSheet = new javax.swing.JComboBox<>();
        txtOffWork = new javax.swing.JFormattedTextField();
        txtOnWork1 = new javax.swing.JFormattedTextField();
        lbDepartment = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 470));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel1.setText("員工編號");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 62, -1, -1));

        txtEmployeeNum.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        txtEmployeeNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNumKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmployeeNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 63, 225, -1));

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel2.setText("上班時間");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel3.setText("下班時間");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel4.setText("假別");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 298, 72, -1));

        jLabel7.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel8.setText("部門");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 62, -1, -1));

        jLabel10.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel10.setText("備註");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 150, -1, -1));

        txtNote.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(txtNote);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 150, 317, 175));

        cbLeaveSheet.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        cbLeaveSheet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "無", "事假", "病假", "喪假", "生理假", "育嬰假" }));
        jPanel1.add(cbLeaveSheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 298, 225, -1));

        txtOffWork.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss"))));
        txtOffWork.setToolTipText("yyyy/MM/dd HH:mm:ss");
        txtOffWork.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(txtOffWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 228, 225, -1));

        txtOnWork1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss"))));
        txtOnWork1.setToolTipText("yyyy/MM/dd HH:mm:ss");
        txtOnWork1.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(txtOnWork1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 150, 225, -1));

        lbDepartment.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jPanel1.add(lbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 62, 302, 27));

        lbName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 60, 89, 29));

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

    private void txtEmployeeNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNumKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLeaveSheet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDepartment;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtEmployeeNum;
    private javax.swing.JEditorPane txtNote;
    private javax.swing.JFormattedTextField txtOffWork;
    private javax.swing.JFormattedTextField txtOnWork1;
    // End of variables declaration//GEN-END:variables
}
