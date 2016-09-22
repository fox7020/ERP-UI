
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 許哲浩
 */
public class orderList extends javax.swing.JPanel {
    private Connection conn;
    HashMap <String,String[]> member = new HashMap<>();
    
    private String[] statusfields = new String[]{"新訂單","製作中","已出貨"};
    private String[] dispatchfields = new String[]{"外送","店取"};
    /**
     * Creates new form orderList
     */
    public orderList() {
        initComponents();
        init();
    }
    
    private void init(){ 
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=erp;user=sa;password=00000000;");
            
            
            setItem(combo_dispatch, dispatchfields);
            setItem(combo_status, statusfields);
            System.out.println("conn OK");
            
            LinkedList<String[]> members = selectMember();
            String[] memberNum = new String[members.size()];
            String[] memberName  = new String[members.size()];

            for(int i = 0; i < members.size();i++){
                memberNum[i] = members.get(i)[0];
                memberName[i] = members.get(i)[1];
            }

            member.put("memberNum", memberNum);
            member.put("memberName", memberName);
            combo_customerId.setModel(new javax.swing.DefaultComboBoxModel<>(memberNum));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    protected void insert(){
        //須set JDateChoose的Format才能直接用
        java.util.Date date = date_orderDate.getDate();        
        String strDate = java.text.DateFormat.getDateInstance().format(date);      
        System.out.println(strDate);
        PreparedStatement pstmt;
        try{
            pstmt = conn.prepareStatement(
                    "INSERT INTO orderlist(orderNum,customerId,orderDate,status,dispatch,note) VALUES('"
                            + ""+text_orderNum.getText()+"','"
                            + ""+combo_customerId.getSelectedItem().toString()+"','"
                            + ""+strDate+"','"
                            + ""+combo_status.getSelectedItem().toString()+"','"
                            + ""+combo_dispatch.getSelectedItem().toString()+"','"
                            + ""+text_note.getText()+"')");
            pstmt.executeUpdate();
            
           textClear();
            
            pstmt.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void setItem(JComboBox<String> cbox , String[] fields){        
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(fields));
    }
    protected LinkedList select(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orderlist");
            ResultSet result =  pstmt.executeQuery();
            
            
            LinkedList<String[]> rows = new LinkedList<String[]>();
            
            while(result.next()){
                String[] row = new String[6];
                row[0] = result.getString("orderNum");
                row[1] = result.getString("customerId");
                row[2] = result.getString("orderDate");
                row[3] = result.getString("status");
                row[4] = result.getString("dispatch");
                row[5] = result.getString("note");

                rows.add(row);
            }

            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private LinkedList selectMember(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member");
            ResultSet result =  pstmt.executeQuery();                    
            LinkedList<String[]> rows = new LinkedList<String[]>();
           
            while(result.next()){
                String[] member = new String[2];
                member[0] = result.getString("customerId");
                member[1] = result.getString("memberName");
                rows.add(member);
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
                new String[]{"orderNum","customerId","orderDate","status","dispatch","note"};
        return columnName;
    }
    
    private void textClear(){
        text_orderNum.setText("");
        combo_customerId.setSelectedIndex(0);
        date_orderDate.setDate(null);
        combo_dispatch.setSelectedIndex(0);
        combo_status.setSelectedIndex(0);
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
        label_customerId = new javax.swing.JLabel();
        label_orderDate = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        label_dispatch = new javax.swing.JLabel();
        label_note = new javax.swing.JLabel();
        text_orderNum = new javax.swing.JTextField();
        date_orderDate = new com.toedter.calendar.JDateChooser();
        scroll_note = new javax.swing.JScrollPane();
        text_note = new javax.swing.JTextArea();
        combo_customerId = new javax.swing.JComboBox<>();
        combo_dispatch = new javax.swing.JComboBox<>();
        combo_status = new javax.swing.JComboBox<>();
        label_customerName = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_orderNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_orderNum.setText("訂單編號");
        add(label_orderNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        label_customerId.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_customerId.setText("客戶編號");
        add(label_customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        label_orderDate.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_orderDate.setText("下單日期");
        add(label_orderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 20));

        label_status.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_status.setText("狀態");
        add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        label_dispatch.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_dispatch.setText("配送方式");
        add(label_dispatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        label_note.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_note.setText("備註");
        add(label_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        text_orderNum.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        text_orderNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_orderNumKeyReleased(evt);
            }
        });
        add(text_orderNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 75, 200, 35));

        date_orderDate.setDateFormatString("yyyy/M/d h:m:s");
        add(date_orderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 195, 200, 35));

        text_note.setColumns(20);
        text_note.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        text_note.setRows(5);
        scroll_note.setViewportView(text_note);

        add(scroll_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        combo_customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_customerIdActionPerformed(evt);
            }
        });
        add(combo_customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 75, 80, 35));

        add(combo_dispatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, 80, 35));

        add(combo_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 195, 80, 35));

        label_customerName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        add(label_customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 75, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_customerIdActionPerformed
        // TODO add your handling code here:
        String slt = combo_customerId.getSelectedItem().toString();
        for(int i = 0; i < member.get("memberNum").length;i++){
            if(member.get("memberNum")[i].equals(slt)){
                label_customerName.setText(member.get("memberName")[i]);
            }
        }
    }//GEN-LAST:event_combo_customerIdActionPerformed

    private void text_orderNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_orderNumKeyReleased
        String re = "\\d*?";
        if(text_orderNum.getText().matches(re))
            System.out.println("OK");
        else
            System.out.println("XX");
    }//GEN-LAST:event_text_orderNumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_customerId;
    private javax.swing.JComboBox<String> combo_dispatch;
    private javax.swing.JComboBox<String> combo_status;
    private com.toedter.calendar.JDateChooser date_orderDate;
    private javax.swing.JLabel label_customerId;
    private javax.swing.JLabel label_customerName;
    private javax.swing.JLabel label_dispatch;
    private javax.swing.JLabel label_note;
    private javax.swing.JLabel label_orderDate;
    private javax.swing.JLabel label_orderNum;
    private javax.swing.JLabel label_status;
    private javax.swing.JScrollPane scroll_note;
    private javax.swing.JTextArea text_note;
    private javax.swing.JTextField text_orderNum;
    // End of variables declaration//GEN-END:variables
}
