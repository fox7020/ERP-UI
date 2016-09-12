import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
public class Product extends javax.swing.JPanel{
	
	public Product() {
		initComponents();
	}
	
	private void initComponents() {
		label_productNum = new javax.swing.JLabel();
        label_pNum = new javax.swing.JLabel();
        label_productName = new javax.swing.JLabel();
        label_note = new javax.swing.JLabel();
        label_price = new javax.swing.JLabel();
        text_price = new javax.swing.JFormattedTextField();
        label_category = new javax.swing.JLabel();
        CBcategory = new javax.swing.JComboBox<>();
        text_productName = new javax.swing.JTextField();
        text_note = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(980, 470));

        label_productNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_productNum.setText("產品編號");

        label_pNum.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        label_productName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_productName.setText("品名");

        label_note.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_note.setText("備註");

        label_price.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_price.setText("單價");

        ((JFormattedTextField) text_price).setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        text_price.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        text_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        label_category.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        label_category.setText("類別");

        CBcategory.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N
        CBcategory.setModel(new DefaultComboBoxModel(new String[] {"","原味茶系列", "鮮奶茶系列", "拿鐵系列", "美味抹茶系列", "100%鮮果系列"}));

        text_productName.setFont(new java.awt.Font("微軟正黑體", 0, 15)); // NOI18N

        text_note.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_productNum)
                    .addComponent(label_productName)
                    .addComponent(label_note))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_pNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_category)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_price)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_price, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(315, 315, 315))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_note)
                        .addGap(297, 297, 297))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_productNum)
                            .addComponent(label_pNum))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_productName)
                            .addComponent(text_productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_price)
                            .addComponent(text_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_category)
                            .addComponent(CBcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_note, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_note))
                .addContainerGap(56, Short.MAX_VALUE))
		);
		this.setLayout(layout);
	}// </editor-fold>
	
	private void txtVendorNumKeyReleased(java.awt.event.KeyEvent evt) {}
	
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel label_category;
	private javax.swing.JLabel label_note;
	private javax.swing.JLabel label_price;
	private javax.swing.JLabel label_productName;
	private javax.swing.JLabel label_productNum;
	private JTextField text_note;
	private javax.swing.JTextField text_price;
	private javax.swing.JTextField text_productName;
	private JComboBox CBcategory;
	private JLabel label_pNum;
	private JFormattedTextField formattedTextField;
}
