
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 許哲浩
 */
public class orderItem extends javax.swing.JPanel {
    private Connection conn;
    HashMap <String,String[]> products = new HashMap<>();
    /**
     * Creates new form orderList
     */
    public orderItem() {
        initComponents();
        init();
    }
    
    private void init(){ 
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=erp;user=sa;password=00000000;");
             LinkedList<String[]> prods = selectProduct();
            String[] prodNum = new String[prods.size()];
            String[] prodName  = new String[prods.size()];

            for(int i = 0; i < prods.size();i++){
                prodNum[i] = prods.get(i)[0];
                prodName[i] = prods.get(i)[1];
            }

            products.put("memberNum", prodNum);
            products.put("memberName", prodName);
            combo_productNum.setModel(new javax.swing.DefaultComboBoxModel<>(prodNum));
            
            
            
            
            
            System.out.println("conn OK");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
        
    protected void insert(){
        try{
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO orderitem(orderNum,productNum,qty,note) VALUES('"
                            + ""+combo_orderNum.getSelectedItem().toString()+"','"
                            + ""+combo_productNum.getSelectedItem().toString()+"','"
                            + ""+text_qty.getText()+"','"
                            + ""+text_note.getText()+"')");
            pstmt.executeUpdate();
            
           textClear();
            
            pstmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    protected LinkedList select(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orderitem");
            ResultSet result =  pstmt.executeQuery();
            
            
            LinkedList<String[]> rows = new LinkedList<String[]>();
            
            while(result.next()){
                String[] row = new String[4];
                row[0] = result.getString("orderNum");
                row[1] = result.getString("productNum");
                row[2] = result.getString("qty");
                row[3] = result.getString("note");

                rows.add(row);
            }

            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private LinkedList selectProduct(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product");
            ResultSet result =  pstmt.executeQuery();                    
            LinkedList<String[]> rows = new LinkedList<String[]>();
           
            while(result.next()){
                String[] product = new String[2];
                product[0] = result.getString("productNum");
                product[1] = result.getString("productName");
                rows.add(product);
            }
            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    protected String[] getColumn(){ 
        String[] columnName = 
                new String[]{"orderNum","productNum","qty","note"};
        return columnName;
    }
    
    private void textClear(){
        combo_orderNum.setSelectedItem("");
//        combo_productNum.;
        text_qty.setText("");      
        text_note.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_orderNum = new javax.swing.JLabel();
        label_productNum = new javax.swing.JLabel();
        label_qty = new javax.swing.JLabel();
        label_note = new javax.swing.JLabel();
        text_qty = new javax.swing.JTextField();
        scroll_note = new javax.swing.JScrollPane();
        text_note = new javax.swing.JTextArea();
        combo_productNum = new javax.swing.JComboBox<>();
        label_productName = new javax.swing.JLabel();
        combo_orderNum = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_orderNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_orderNum.setText("訂單編號");
        add(label_orderNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        label_productNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_productNum.setText("產品編號");
        add(label_productNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        label_qty.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_qty.setText("數量");
        add(label_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        label_note.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_note.setText("備註");
        add(label_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        text_qty.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        text_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_qtyKeyTyped(evt);
            }
        });
        add(text_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 165, 200, 35));

        text_note.setColumns(20);
        text_note.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        text_note.setRows(5);
        scroll_note.setViewportView(text_note);

        add(scroll_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 660, -1));

        combo_productNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        combo_productNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_productNumActionPerformed(evt);
            }
        });
        add(combo_productNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 75, 80, 35));

        label_productName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        add(label_productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 75, 150, 40));

        combo_orderNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        add(combo_orderNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_productNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_productNumActionPerformed
        // TODO add your handling code here:
        String slt = combo_productNum.getSelectedItem().toString();
        for(int i = 0; i < products.get("memberNum").length;i++){
            if(products.get("memberNum")[i].equals(slt)){
                label_productName.setText(products.get("memberName")[i]);
            }
        }
    }//GEN-LAST:event_combo_productNumActionPerformed

    private void text_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_qtyKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_text_qtyKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_orderNum;
    private javax.swing.JComboBox<String> combo_productNum;
    private javax.swing.JLabel label_note;
    private javax.swing.JLabel label_orderNum;
    private javax.swing.JLabel label_productName;
    private javax.swing.JLabel label_productNum;
    private javax.swing.JLabel label_qty;
    private javax.swing.JScrollPane scroll_note;
    private javax.swing.JTextArea text_note;
    private javax.swing.JTextField text_qty;
    // End of variables declaration//GEN-END:variables
}
