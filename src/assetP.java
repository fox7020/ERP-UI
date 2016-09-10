
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class assetP extends javax.swing.JPanel {

    /**
     * Creates new form assetP
     */
    public assetP() {
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

        assetLabel01 = new javax.swing.JLabel();
        assetLabel02 = new javax.swing.JLabel();
        assetLabel03 = new javax.swing.JLabel();
        assetLabel04 = new javax.swing.JLabel();
        buyDate_asset = new com.toedter.calendar.JDateChooser();
        assetLabel05 = new javax.swing.JLabel();
        assetLabel06 = new javax.swing.JLabel();
        value_asset = new javax.swing.JTextField();
        assetLabel07 = new javax.swing.JLabel();
        lifespan_asset = new javax.swing.JTextField();
        assetLabel08 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        note_asset = new javax.swing.JTextArea();
        id_asset = new javax.swing.JLabel();
        department_asset = new javax.swing.JComboBox<>();
        assetName_asset = new javax.swing.JTextField();
        qty_asset = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assetLabel01.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel01.setText("資產編號");
        add(assetLabel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 53, -1, 30));

        assetLabel02.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel02.setText("資產名稱");
        add(assetLabel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 123, -1, 30));

        assetLabel03.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel03.setText("採購日期");
        add(assetLabel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 194, -1, 30));

        assetLabel04.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel04.setText("使用部門");
        add(assetLabel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 264, -1, 30));

        buyDate_asset.setDateFormatString("yyyy/MM/dd");
        buyDate_asset.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        add(buyDate_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 194, 180, 30));

        assetLabel05.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel05.setText("數量");
        add(assetLabel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 53, -1, 30));

        assetLabel06.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel06.setText("購入金額");
        assetLabel06.setToolTipText("");
        add(assetLabel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 123, -1, 30));

        value_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        value_asset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                value_assetKeyTyped(evt);
            }
        });
        add(value_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 123, 150, 30));

        assetLabel07.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel07.setText("折舊年限");
        add(assetLabel07, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 191, -1, 30));

        lifespan_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        lifespan_asset.setMinimumSize(new java.awt.Dimension(6, 30));
        lifespan_asset.setPreferredSize(new java.awt.Dimension(6, 30));
        lifespan_asset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lifespan_assetKeyTyped(evt);
            }
        });
        add(lifespan_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 191, 150, -1));

        assetLabel08.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        assetLabel08.setText("其它備註");
        add(assetLabel08, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 264, -1, 30));

        note_asset.setColumns(20);
        note_asset.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        note_asset.setRows(5);
        jScrollPane4.setViewportView(note_asset);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 264, 341, -1));

        id_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        id_asset.setText("系統自動產生");
        add(id_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 53, 180, 30));

        department_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        department_asset.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        department_asset.setMinimumSize(new java.awt.Dimension(73, 30));
        department_asset.setPreferredSize(new java.awt.Dimension(73, 30));
        department_asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                department_assetActionPerformed(evt);
            }
        });
        add(department_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 264, 180, -1));

        assetName_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        add(assetName_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 123, 180, -1));

        qty_asset.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        qty_asset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty_assetKeyTyped(evt);
            }
        });
        add(qty_asset, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 53, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void department_assetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_department_assetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_department_assetActionPerformed

    private void qty_assetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty_assetKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_qty_assetKeyTyped

    private void value_assetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_value_assetKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_value_assetKeyTyped

    private void lifespan_assetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lifespan_assetKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lifespan_assetKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assetLabel01;
    private javax.swing.JLabel assetLabel02;
    private javax.swing.JLabel assetLabel03;
    private javax.swing.JLabel assetLabel04;
    private javax.swing.JLabel assetLabel05;
    private javax.swing.JLabel assetLabel06;
    private javax.swing.JLabel assetLabel07;
    private javax.swing.JLabel assetLabel08;
    private javax.swing.JTextField assetName_asset;
    private com.toedter.calendar.JDateChooser buyDate_asset;
    private javax.swing.JComboBox<String> department_asset;
    private javax.swing.JLabel id_asset;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField lifespan_asset;
    private javax.swing.JTextArea note_asset;
    private javax.swing.JTextField qty_asset;
    private javax.swing.JTextField value_asset;
    // End of variables declaration//GEN-END:variables
}
