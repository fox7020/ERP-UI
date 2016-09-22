
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class issue extends javax.swing.JPanel {
    private Connection conn;
    HashMap <String,String[]> member = new HashMap<>();
    /**
     * Creates new form orderList
     */
    public static void main(String[] args){
        issue issue = new issue();
        issue.setVisible(true);
    }
    public issue() {
        initComponents();
        init();
        
    }
    private void init(){ 
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=erp;user=sa;password=00000000;");
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
        try{
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO issue(customerId,complaint,price,note) VALUES('"
                            + ""+combo_customerId.getSelectedItem().toString()+"','"
                            + ""+text_complaint.getText()+"','"
                            + ""+text_price.getText()+"','"
                            + ""+text_note.getText()+"')");
            pstmt.executeUpdate();
            
           textClear();
            
            pstmt.close();
        }catch(Exception e){
            e.printStackTrace();
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
    
    protected LinkedList select(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM issue");
            ResultSet result =  pstmt.executeQuery();
            
            
            LinkedList<String[]> rows = new LinkedList<String[]>();
            
            while(result.next()){
                String[] row = new String[4];
                row[0] = result.getString("customerId");
                row[1] = result.getString("complaint");
                row[2] = result.getString("price");
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
    protected String[] getColumn(){ 
        String[] columnName = new String[]{"customerId","complaint","price","note",};
        return columnName;
    }
    
    private void textClear(){
        label_customName.setText("");
        text_complaint.setText("");
        text_price.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        label_customerId = new javax.swing.JLabel();
        label_price = new javax.swing.JLabel();
        label_complaint = new javax.swing.JLabel();
        label_note = new javax.swing.JLabel();
        text_price = new javax.swing.JTextField();
        scroll_complaint = new javax.swing.JScrollPane();
        text_complaint = new javax.swing.JTextArea();
        scroll_note = new javax.swing.JScrollPane();
        text_note = new javax.swing.JTextArea();
        combo_customerId = new javax.swing.JComboBox<>();
        label_customName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(980, 470));
        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));

        jPanel1.setMaximumSize(new java.awt.Dimension(980, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_customerId.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_customerId.setText("客戶編號");
        jPanel1.add(label_customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        label_price.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_price.setText("金額");
        jPanel1.add(label_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        label_complaint.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_complaint.setText("客訴內容");
        jPanel1.add(label_complaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        label_note.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_note.setText("備註");
        jPanel1.add(label_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        text_price.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        text_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_priceKeyReleased(evt);
            }
        });
        jPanel1.add(text_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 75, 200, 35));

        text_complaint.setColumns(20);
        text_complaint.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        text_complaint.setRows(5);
        scroll_complaint.setViewportView(text_complaint);

        jPanel1.add(scroll_complaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 620, 150));

        scroll_note.setToolTipText("");
        scroll_note.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        text_note.setColumns(20);
        text_note.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        text_note.setRows(5);
        scroll_note.setViewportView(text_note);

        jPanel1.add(scroll_note, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 346, 620, 80));

        combo_customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_customerIdActionPerformed(evt);
            }
        });
        jPanel1.add(combo_customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 75, 80, 35));

        label_customName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        jPanel1.add(label_customName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_customerIdActionPerformed
        // TODO add your handling code here:
        String slt = combo_customerId.getSelectedItem().toString();
        for(int i = 0; i < member.get("memberNum").length;i++){
            if(member.get("memberNum")[i].equals(slt)){
                label_customName.setText(member.get("memberName")[i]);
            }
        }
    }//GEN-LAST:event_combo_customerIdActionPerformed

    private void text_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_priceKeyReleased
        // TODO add your handling code here:
        String re = "[1-9]\\d*?";
        if(text_price.getText().matches(re))
        System.out.println("OK");
        else
        System.out.println("XX");
    }//GEN-LAST:event_text_priceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_customerId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_complaint;
    private javax.swing.JLabel label_customName;
    private javax.swing.JLabel label_customerId;
    private javax.swing.JLabel label_note;
    private javax.swing.JLabel label_price;
    private javax.swing.JScrollPane scroll_complaint;
    private javax.swing.JScrollPane scroll_note;
    private javax.swing.JTextArea text_complaint;
    private javax.swing.JTextArea text_note;
    private javax.swing.JTextField text_price;
    // End of variables declaration//GEN-END:variables
}
