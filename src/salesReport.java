
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Properties;
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
public class salesReport extends javax.swing.JPanel {
    private Connection conn;
    private Properties prop;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    private boolean isYearSelected;
    private boolean isMonthSelected;
    private boolean isProductSelected;
    //記錄當前選擇的欄位值
    private String sltYear;
    private String sltMonth;
    private String sltShift;
    private int unitPrice;
    
    //欄位名稱
    private String[] shiftfields;
    private LinkedList<String> productfields;
    private LinkedList<String> yearfields;
    private LinkedList<String> monthfields;
    

    private LinkedList<String[]> orderList;//存訂單資訊(id,年,月)
    private LinkedList<String[]> productList;//存產品資訊(id,名稱,價格)
    private LinkedList<String> listNums; //記錄符合日期區間的訂單ID 
    private LinkedList<String> finalLists; //記錄符合全部條件的訂單ID 
    
    //TO DO 要將所有結果存入LinkedList中
    private LinkedList<String[]> data = new LinkedList<String[]>();
    private String[] datas = new String[5];
    
    public salesReport() {
        initComponents();
        init();
        setDBProp();
        orderList = selectOrderList(); 
        setDefault();
        selectAttendance();
    }
    private void init(){       
        shiftfields = new String[]{"全部","早班","中班","晚班"};
        productfields = new LinkedList<String>();   
        yearfields = new LinkedList<String>();
        monthfields = new LinkedList<String>();    
        orderList = new LinkedList<String[]>();
        productList = new LinkedList<String[]>();
        listNums = new LinkedList<String>();
        finalLists = new LinkedList<>();
        isYearSelected = false;
        isMonthSelected = false;
        isProductSelected = false;
        sltYear = new String();
        sltMonth = new String();
        sltShift = new String();

        
    }
    
    
    private void setDBProp() {

		prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "");
		prop.setProperty("characterEncoding", "UTF-8");
		prop.setProperty("useUnicode", "true");
		prop.setProperty("useSSL", "False");
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/erp", prop);
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=erp;user=sa;password=00000000;");
                        System.out.println("salesReport.setDBProp()");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    
    private void setItem(JComboBox<String> cbox , String[] fields){        
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(fields));
    }
    private void setDefault(){
        setItem(year, getDateFields(yearfields));
        month.setVisible(false);
        shift.setVisible(false);
        employee.setVisible(false);
        product.setVisible(false);

    }

    private LinkedList selectProduct(LinkedList<String> proNums){
        productfields.clear();
        productfields.add("---全部---");
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM product");
            ResultSet result =  pstmt.executeQuery();
            
            
            LinkedList<String[]> rows = new LinkedList<String[]>();
            while(result.next()){
                String[] row = new String[3];
                row[0] = result.getString("productNum");
                row[1] = result.getString("productName");
                row[2] = result.getString("price");
                if(proNums != null){
                    for(int i = 0; i < proNums.size();i++){
                        if(row[0].equals(proNums.get(i)))
                            productfields.add( row[0] + "--" + row[1]);
                    }
                }
                rows.add(row);
            }

            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private LinkedList<String[]> selectOrderItem(String onum){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orderItem WHERE orderNum = ?");
            pstmt.setString(1, onum);
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
            
            result.close();
            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private LinkedList selectOrderList(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orderList");
            ResultSet result =  pstmt.executeQuery();
           
            LinkedList<String[]> rows = new LinkedList<String[]>();
            while(result.next()){
                
                Calendar c = Calendar.getInstance();
                c.setTime(result.getDate("orderDate"));
                String y = Integer.toString(c.get(Calendar.YEAR));
                String m = Integer.toString(c.get(Calendar.MONTH)+1);                
                String[] row = new String[3];
                row[0] = result.getString("orderNum");
                row[1] = y;
                row[2] = m;

                if(yearfields.indexOf(y) < 0)yearfields.add(y);                
                rows.add(row);
                
                System.out.println(row[0] + ":" + row[1] + ":" + row[2]);
            }           
            //排序
            java.util.Collections.sort(yearfields);
            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
  
    private String[] selectOrderList(String onum){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM orderList WHERE orderNum = ?");
            pstmt.setString(1, onum);
            ResultSet result =  pstmt.executeQuery();
           
            String[] row = new String[6];
            if(result.next()){
                row[0] = result.getString("orderNum");
                row[1] = result.getString("customerId");
                row[2] = result.getString("orderDate");
                row[3] = result.getString("status");
                row[4] = result.getString("dispatch");
                row[5] = result.getString("note");

            }           
            
            result.close();
            pstmt.close();
            return row;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    protected LinkedList<String[]> getData(){
        return data;
    }
    private String[] getDateFields(LinkedList<String> date){
        String[] strDate = new String[date.size()];
        for(int i = 0; i < date.size();i++){
            strDate[i] = date.get(i);
        }
        return strDate;
    }
    private void getProductNum(){
        //找符合日期區間的訂單ID
        LinkedList<LinkedList<String[]>> productInfo = new LinkedList<>();
        LinkedList<String> prodNums = new LinkedList<>();
        listNums.clear();
        for(int i = 0; i < orderList.size();i++){
            if(sltYear.equals(orderList.get(i)[1])&&sltMonth.equals(orderList.get(i)[2]))
                listNums.add(orderList.get(i)[0]);
        }
        //用訂單ID去orderItem找產品編號
        for(int i = 0; i < listNums.size();i++){
            productInfo.add(selectOrderItem(listNums.get(i)));
        }
        //用產品編號去product找產品名稱
        for(int i = 0; i < productInfo.size();i++){
            for(int j = 0; j < productInfo.get(i).size();j++){
                String prodNum = productInfo.get(i).get(j)[1];
                if(prodNums.indexOf(prodNum) < 0){
                    System.out.println("prodNum : " + prodNum);
                    prodNums.add(prodNum);
                }
            }
        }    
        selectProduct(prodNums);
    }
    private int getQty(LinkedList<String> orderNum,String productNum){
        int qty = 0;
        for(int i = 0; i < orderNum.size();i++){
            LinkedList<String[]> temp = selectOrderItem(orderNum.get(i));
            for(int j = 0; j < temp.size();j++){
                if(temp.get(j)[1].equals(productNum)){
                    qty += Integer.parseInt(temp.get(j)[2]);
                    finalLists.add(orderNum.get(i));
                }
            }
        }
        
        return qty;
    }
    private int getTotal(String strSlt){
        //取得單價
        productList = selectProduct(null);
        for(int i = 0; i < productList.size();i++){
            if(productList.get(i)[0].equals(strSlt)){
                unitPrice = Integer.parseInt(productList.get(i)[2]);
            }
        }
        //取得總數量
        int qty = getQty(listNums,strSlt);    
        return qty * unitPrice;
    }
    
    
    private void setProduct(){
        if(isYearSelected == isMonthSelected == true){
            getProductNum();
            String pfields[] = new String[productfields.size()];
            for(int i = 0; i < productfields.size();i++){
                pfields[i] = productfields.get(i);
            }       
            setItem(product,pfields);
//            product.setVisible(true);
        }
    }
    private void setData(){
        data.clear();
        if(isYearSelected == isMonthSelected == isProductSelected ==true){
            for(int i = 0; i < finalLists.size();i++){
                String[] list = selectOrderList(finalLists.get(i));
                LinkedList<String[]> items = selectOrderItem(finalLists.get(i));
                for(int j = 0; j<items.size();j++){
                    String[] merge = new String[9];
                    merge[0] = list[0];
                    merge[1] = list[2];
                    merge[2] = list[1];
                    merge[3] = items.get(j)[1];
                    merge[4] = items.get(j)[2];
                    merge[5] = list[3];
                    merge[6] = list[4];
                    merge[7] = list[5];
                    merge[8] = items.get(j)[3];
                    data.add(merge);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        shift = new javax.swing.JComboBox<>();
        product = new javax.swing.JComboBox<>();
        label_total = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        label_shift = new javax.swing.JLabel();
        label_product = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelEmp = new javax.swing.JLabel();
        employee = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(980, 470));
        setPreferredSize(new java.awt.Dimension(980, 470));

        jPanel1.setMaximumSize(new java.awt.Dimension(980, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 470));

        year.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        year.setToolTipText("");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        shift.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });

        product.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        label_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_total.setText("總額");

        label_date.setText("日期區間");
        label_date.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        label_shift.setText("班別");

        label_product.setText("產品");

        jLabel1.setText("年");

        jLabel2.setText("月");

        labelEmp.setText("值班人員");

        employee.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(label_date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(label_shift)
                            .addGap(74, 74, 74)
                            .addComponent(labelEmp)
                            .addGap(38, 38, 38)
                            .addComponent(label_product))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel1))
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel2)))
                            .addGap(72, 72, 72)
                            .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_date)
                        .addComponent(label_shift)
                        .addComponent(labelEmp)
                        .addComponent(label_product))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))))
                    .addContainerGap(237, Short.MAX_VALUE)))
        );

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

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        isYearSelected = true;
        javax.swing.JComboBox cb = (javax.swing.JComboBox)evt.getSource();
        sltYear = cb.getSelectedItem().toString();
        monthfields.clear();    //選擇後將之前的清空
        
        //取得訂單資訊中該年存在的月份
        for(int i = 0; i < orderList.size();i++){
            if(orderList.get(i)[1].equals(cb.getSelectedItem())){
                if(monthfields.indexOf(orderList.get(i)[2]) < 0)
                    monthfields.add(orderList.get(i)[2]);
            }
        }

        
        java.util.Collections.sort(monthfields);    //排序
        setItem(month,getDateFields(monthfields));  
        month.setVisible(true);
        setProduct();
        setData();

    }//GEN-LAST:event_yearActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        isMonthSelected = true;
        javax.swing.JComboBox cb = (javax.swing.JComboBox)evt.getSource();
        sltMonth = cb.getSelectedItem().toString();
        
        //取得符合日期區間的訂單ID
        for(int i = 0; i < orderList.size();i++){
            if(orderList.get(i)[1].equals(sltYear)&&orderList.get(i).equals(sltMonth))
                listNums.add(orderList.get(i)[0]);
        }  
        setItem(shift,shiftfields);
        shift.setVisible(true);
        setProduct();

        setData();
    }//GEN-LAST:event_monthActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed

        javax.swing.JComboBox cb = (javax.swing.JComboBox)evt.getSource();
        String sltStr = cb.getSelectedItem().toString();
        switch(sltStr){
            case "全部":
                sltShift = "0";
                selectAttendance();
                break;
            case "早班":
                sltShift = "8";
                break;
            case "中班":
                sltShift = "13";
                break;
            case "晚班":
                sltShift = "18";
                break;
        }
        
        datas[1] = sltShift;
        employee.setVisible(true);
    }//GEN-LAST:event_shiftActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed

        javax.swing.JComboBox cb = (javax.swing.JComboBox)evt.getSource();
        System.out.println(cb.getSelectedItem());
        
        
        
        datas[2] = cb.getSelectedItem().toString();
        
        String pfields[] = new String[productfields.size()];
        for(int i = 0; i < productfields.size();i++){
            pfields[i] = productfields.get(i);
        }        
        setItem(product,pfields);
        product.setVisible(true);
    }//GEN-LAST:event_employeeActionPerformed

    
    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        isProductSelected = true;
        javax.swing.JComboBox cb = (javax.swing.JComboBox)evt.getSource();
        String strSlt = cb.getSelectedItem().toString().substring(0, 1);
        int total = 0;
        if(strSlt.equals("-")){
            for(int i = 0; i < cb.getItemCount();i++){
                String all = cb.getItemAt(i).toString().substring(0, 1);
                total += getTotal(all);
            }
        }else{
            total = getTotal(strSlt);
        }        
        label_total.setText(total + "");
        setData();
        finalLists.clear();
    }//GEN-LAST:event_productActionPerformed

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> employee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmp;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_product;
    private javax.swing.JLabel label_shift;
    private javax.swing.JLabel label_total;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

    protected LinkedList<String[]> selectAttendance(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM attendance");
            
            ResultSet result =  pstmt.executeQuery();
            
            
            LinkedList<String[]> rows = new LinkedList<String[]>();
            
            while(result.next()){
                String[] row = new String[3];
                row[0] = result.getString("employeeNum");
                row[1] = result.getString("work");  //上班打卡時間
                row[2] = result.getString("offwork");//下班打卡時間              
                rows.add(row);
                System.out.println("work : " + row[1]);
            }

            pstmt.close();
            return rows;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
