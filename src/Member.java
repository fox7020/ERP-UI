import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;

public class Member extends javax.swing.JPanel{
	
	public Member() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		label_customerId = new javax.swing.JLabel();
		label_password = new javax.swing.JLabel();
		label_memberName = new javax.swing.JLabel();
		label_tel = new javax.swing.JLabel();
		label_note = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		text_customerId = new javax.swing.JTextField();
		text_password = new javax.swing.JTextField();
		text_memberName = new javax.swing.JTextField();
		text_tel = new javax.swing.JTextField();
		label_gender = new javax.swing.JLabel();
		text_gender = new javax.swing.JTextField();
		label_address = new javax.swing.JLabel();
		text_address = new javax.swing.JTextField();

		setPreferredSize(new java.awt.Dimension(980, 470));

		label_customerId.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_customerId.setText("客戶編號");

		label_password.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_password.setText("客戶密碼");

		label_memberName.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_memberName.setText("客戶名稱");

		label_tel.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_tel.setText("電話");

		label_note.setFont(new Font("微軟正黑體", Font.PLAIN, 14)); // NOI18N
		label_note.setText("備註");
		label_note.setToolTipText("");

		text_customerId.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
		text_customerId.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				text_customerIdActionPerformed(evt);
			}
		});

		text_password.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N

		text_memberName.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N

		text_tel.setFont(new java.awt.Font("微軟正黑體", 0, 14));

		label_gender.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_gender.setText("性別");

		text_gender.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N

		label_address.setFont(new Font("微軟正黑體", Font.PLAIN, 15)); // NOI18N
		label_address.setText("地址");

		text_address.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
		text_note = new javax.swing.JTextArea();
		
				text_note.setColumns(20);
				text_note.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
				text_note.setRows(5);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(66)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_note)
						.addComponent(label_customerId)
						.addComponent(label_password)
						.addComponent(label_memberName))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(text_memberName, Alignment.TRAILING)
								.addComponent(text_password)
								.addComponent(text_customerId, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_tel)
								.addComponent(label_gender)
								.addComponent(label_address))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(text_tel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(text_address, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(text_gender, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
						.addComponent(text_note, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(53)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(label_tel)
									.addGap(13))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(text_tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(text_customerId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_gender)
								.addComponent(text_gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(text_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_address)
								.addComponent(text_address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(text_memberName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_memberName)))
						.addGroup(layout.createSequentialGroup()
							.addComponent(label_customerId)
							.addGap(13)
							.addComponent(label_password)))
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(64)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_note)
								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(text_note, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		this.setLayout(layout);
	}// </editor-fold>
	
	private void txtVendorNumKeyReleased(java.awt.event.KeyEvent evt) {
		
	}
	
	private void text_customerIdActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JLabel label_address;
	private javax.swing.JLabel label_customerId;
	private javax.swing.JLabel label_gender;
	private javax.swing.JLabel label_memberName;
	private javax.swing.JLabel label_note;
	private javax.swing.JLabel label_password;
	private javax.swing.JLabel label_tel;
	private javax.swing.JTextField text_address;
	private javax.swing.JTextField text_customerId;
	private javax.swing.JTextField text_gender;
	private javax.swing.JTextField text_memberName;
	private javax.swing.JTextArea text_note;
	private javax.swing.JTextField text_password;
	private javax.swing.JTextField text_tel;
	// End of variables declaration
}
