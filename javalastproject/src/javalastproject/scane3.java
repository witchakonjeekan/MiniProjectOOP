package javalastproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Checkbox;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class scane3 extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address1;
	JPanel jp = new JPanel();
//	JTextField manu01;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scane3 frame = new scane3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static String answer;
	
	public static String menu1;
	public static String mean1;
	public static String more1;
	public static int number1;
	
	public static String menu2;
	public static String mean2;
	public static String more2;
	public static int number2;
	
	
	public static String menu3;
	public static String mean3;
	public static String more3;
	public static int number3;
	
	public static String inpt;
	public static String inpt2;
	
	private String textField;
	
	private static JComboBox comboBox1;
	private static JComboBox comboBox2;
	private static JComboBox comboBox4;
	private static JComboBox comboBox5;
	private static JComboBox comboBox6;
	private static JComboBox comboBox8;
	private static JComboBox comboBox9;
	private static JComboBox comboBox10;
	private static JComboBox comboBox12;
	private JRadioButton nor1;
	private JRadioButton spe1;
	private JRadioButton nor2;
	private JRadioButton spe2;
	private JRadioButton nor3;
	private JRadioButton spe3;
	private static JButton total;

	
	public scane3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0E01\u0E25\u0E31\u0E1A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scane2 scane2 = new scane2();		
				scane2.setVisible(true);

			}
		});
		btnNewButton.setBounds(12, 378, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0E16\u0E31\u0E14\u0E44\u0E1B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				inpt = (String) name.getText();
				inpt2 = (String) address1.getText();
				
				menu1 = (String) comboBox1.getSelectedItem();
				mean1 = (String) comboBox2.getSelectedItem();
				number1 = (int) comboBox4.getSelectedItem();
				
				menu2 = (String) comboBox5.getSelectedItem();
				mean2 = (String) comboBox6.getSelectedItem();
				number2 = (int) comboBox8.getSelectedItem();
				
				menu3 = (String) comboBox9.getSelectedItem();
				mean3 = (String) comboBox10.getSelectedItem();
				number3 = (int) comboBox12.getSelectedItem();
				
				scane4 sca31 = new scane4();
				sca31.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(489, 378, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0E0A\u0E37\u0E48\u0E2D");
		btnNewButton_2.setFont(new Font("Angsana New", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(76, 73, 49, 25);
		contentPane.add(btnNewButton_2);
		
		name = new JTextField();
		name.setFont(new Font("Angsana New", Font.PLAIN, 20));
		name.setBounds(137, 72, 319, 26);
		contentPane.add(name);
		name.setColumns(10);
		
		address1 = new JTextField();
		address1.setFont(new Font("Angsana New", Font.PLAIN, 20));
		address1.setBounds(46, 311, 466, 44);
		contentPane.add(address1);
		address1.setColumns(10);
		
		total = new JButton("\u0E23\u0E32\u0E04\u0E32\u0E23\u0E27\u0E21\u0E17\u0E31\u0E49\u0E07\u0E2B\u0E21\u0E14");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				int total = 0;
				String more01 = ("");
				String more02 = ("");
				String more03 = ("");
				if (nor1.isSelected()) {
					more01 = (" แบบปกติ ");
					total = 30;
					sum += total*(int)comboBox4.getSelectedItem();
					}
				if (spe1.isSelected()) {
					more01 = (" แบบพิเศษ ");
					total =35;
					sum += total*(int)comboBox4.getSelectedItem();
				}
				if (nor2.isSelected()) {
					more02 = (" แบบปกติ ");
					total =30;
					sum += total*(int)comboBox8.getSelectedItem();
					}
				if (spe2.isSelected()) {
					more02 = (" แบบพิเศษ ");
					total =35;
					sum += total*(int)comboBox8.getSelectedItem();
				}
				if (nor3.isSelected()) {
					more03 = (" แบบปกติ ");
					total =30;
					sum += total*(int)comboBox12.getSelectedItem();
				}
				if (spe3.isSelected()) {
					more03 = (" แบบพิเศษ ");
					total =35;
					sum += total*(int)comboBox12.getSelectedItem();
				}
				JOptionPane.showMessageDialog(null ,"Price := " + sum) ;
				answer = String.valueOf(sum);
				more1 = more01;
				more2 = more02;
				more3 = more03;
			}
		});
		total.setBounds(234, 379, 133, 22);
		contentPane.add(total);
		
		JButton button = new JButton("1");
		button.setBounds(23, 111, 49, 22);
		contentPane.add(button);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(222, 107, 49, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBounds(433, 107, 49, 25);
		contentPane.add(btnNewButton_5);
		
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox1.addItem(" กะเพรา ");
		comboBox1.addItem(" คะน้า ");
		comboBox1.addItem(" แพนง ");
		comboBox1.addItem(" ข้าวผัด ");
		comboBox1.addItem("แกงเขียวหวาน ");
		comboBox1.addItem(" แกงเผ็ด ");
		comboBox1.addItem(" แกงกระหรี่ ");
		comboBox1.addItem(" ต้มข่า ");
		comboBox1.addItem(" ผัดผักรวม ");
		comboBox1.addItem(" ราดหน้า ");
		comboBox1.setSelectedItem(null);
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox1.setToolTipText("");
		comboBox1.setBounds(23, 139, 128, 22);
		contentPane.add(comboBox1);
		
		
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox2.addItem(" หมู ");
		comboBox2.addItem(" ไก่ ");
		comboBox2.addItem(" ทะเล ");
		comboBox2.setSelectedItem(null);
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox2.setBounds(21, 175, 88, 22);
		contentPane.add(comboBox2);
		
		comboBox4 = new JComboBox();
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox4.addItem(1);
		comboBox4.addItem(2);
		comboBox4.addItem(3);
		comboBox4.addItem(4);
		comboBox4.addItem(5);
		comboBox4.addItem(6);
		comboBox4.addItem(7);
		comboBox4.addItem(8);
		comboBox4.addItem(9);
		comboBox4.addItem(10);
		comboBox4.setSelectedItem(null);
		comboBox4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox4.setBounds(23, 245, 79, 22);
		contentPane.add(comboBox4);
		
		comboBox5 = new JComboBox();
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox5.addItem(" กะเพรา ");
		comboBox5.addItem(" คะน้า ");
		comboBox5.addItem(" แพนง ");
		comboBox5.addItem(" ข้าวผัด ");
		comboBox5.addItem("แกงเขียวหวาน ");
		comboBox5.addItem(" แกงเผ็ด ");
		comboBox5.addItem(" แกงกระหรี่ ");
		comboBox5.addItem(" ต้มข่า ");
		comboBox5.addItem(" ผัดผักรวม ");
		comboBox5.addItem(" ราดหน้า ");
		comboBox5.setSelectedItem(null);
		comboBox5.addItem(" - ");
		comboBox5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox5.setToolTipText("");
		comboBox5.setBounds(222, 139, 128, 22);
		contentPane.add(comboBox5);
		
		comboBox6 = new JComboBox();
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox6.addItem(" หมู ");
		comboBox6.addItem(" ไก่ ");
		comboBox6.addItem(" ทะเล ");
		comboBox6.addItem(" - ");
		comboBox6.setSelectedItem(null);
		comboBox6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox6.setBounds(222, 174, 88, 22);
		contentPane.add(comboBox6);
		
		comboBox8 = new JComboBox();
		comboBox8.setModel(new DefaultComboBoxModel());
		comboBox8.addItem(1);
		comboBox8.addItem(2);
		comboBox8.addItem(3);
		comboBox8.addItem(4);
		comboBox8.addItem(5);
		comboBox8.addItem(6);
		comboBox8.addItem(7);
		comboBox8.addItem(8);
		comboBox8.addItem(9);
		comboBox8.addItem(10);
		comboBox8.addItem(0);
		comboBox8.setSelectedItem(null);
		comboBox8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox8.setBounds(222, 245, 79, 22);
		contentPane.add(comboBox8);
		
		comboBox9 = new JComboBox();
		comboBox9.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox9.addItem(" กะเพรา ");
		comboBox9.addItem(" คะน้า ");
		comboBox9.addItem(" แพนง ");
		comboBox9.addItem(" ข้าวผัด ");
		comboBox9.addItem("แกงเขียวหวาน ");
		comboBox9.addItem(" แกงเผ็ด ");
		comboBox9.addItem(" แกงกระหรี่ ");
		comboBox9.addItem(" ต้มข่า ");
		comboBox9.addItem(" ผัดผักรวม ");
		comboBox9.addItem(" ราดหน้า ");
		comboBox9.addItem(" - ");
		comboBox9.setSelectedItem(null);
		comboBox9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox9.setToolTipText("");
		comboBox9.setBounds(433, 140, 128, 22);
		contentPane.add(comboBox9);
		
		comboBox10 = new JComboBox();
		comboBox10.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox10.addItem(" หมู ");
		comboBox10.addItem(" ไก่ ");
		comboBox10.addItem(" ทะเล ");
		comboBox10.addItem(" - ");
		comboBox10.setSelectedItem(null);
		comboBox10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox10.setBounds(433, 175, 88, 22);
		contentPane.add(comboBox10);
		
		comboBox12 = new JComboBox();
		comboBox12.setModel(new DefaultComboBoxModel());
		comboBox12.addItem(1);
		comboBox12.addItem(2);
		comboBox12.addItem(3);
		comboBox12.addItem(4);
		comboBox12.addItem(5);
		comboBox12.addItem(6);
		comboBox12.addItem(7);
		comboBox12.addItem(8);
		comboBox12.addItem(9);
		comboBox12.addItem(10);
		comboBox12.addItem(0);
		comboBox12.setSelectedItem(null);
		comboBox12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox12.setBounds(433, 246, 79, 22);
		contentPane.add(comboBox12);
		
		Button button_1 = new Button("\u0E17\u0E35\u0E48\u0E2D\u0E22\u0E39\u0E48");
		button_1.setBounds(46, 281, 79, 24);
		contentPane.add(button_1);

		
		JButton btnNewButton_6 = new JButton("");
		Image img2 = new ImageIcon(this.getClass().getResource("/x1.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img2));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox9.setSelectedItem(" - ");
				comboBox10.setSelectedItem(" - ");
				comboBox12.setSelectedItem(0);
			}
		});
		btnNewButton_6.setBounds(529, 260, 41, 38);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		Image img1 = new ImageIcon(this.getClass().getResource("/x1.png")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(img1));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox5.setSelectedItem(" - ");
				comboBox6.setSelectedItem(" - ");
				comboBox8.setSelectedItem(0);
			}
		});
		btnNewButton_7.setBounds(313, 260, 41, 38);
		contentPane.add(btnNewButton_7);
		
		
		nor1 = new JRadioButton("\u0E1B\u0E01\u0E15\u0E34");
		nor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nor1.isSelected()) {
					spe1.setSelected(false);
				}
			}
		});
		nor1.setBounds(23, 211, 58, 25);
		contentPane.add(nor1);
		
		spe1 = new JRadioButton("\u0E1E\u0E34\u0E40\u0E28\u0E29");
		spe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spe1.isSelected()) {
					nor1.setSelected(false);
				}
			}
		});
		spe1.setBounds(85, 211, 64, 25);
		contentPane.add(spe1);
		
		nor2 = new JRadioButton("\u0E1B\u0E01\u0E15\u0E34");
		nor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nor2.isSelected()) {
					spe2.setSelected(false);
				}
			}
		});
		nor2.setBounds(208, 211, 58, 25);
		contentPane.add(nor2);
		
		spe2 = new JRadioButton("\u0E1E\u0E34\u0E40\u0E28\u0E29");
		spe2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spe2.isSelected()) {
					nor2.setSelected(false);
				}
			}
		});
		spe2.setBounds(270, 211, 64, 25);
		contentPane.add(spe2);
		
		nor3 = new JRadioButton("\u0E1B\u0E01\u0E15\u0E34");
		nor3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nor3.isSelected()) {
					spe3.setSelected(false);
				}
			}
		});
		nor3.setBounds(411, 211, 58, 25);
		contentPane.add(nor3);
		
		spe3 = new JRadioButton("\u0E1E\u0E34\u0E40\u0E28\u0E29");
		spe3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spe3.isSelected()) {
					nor3.setSelected(false);
				}
			}
		});
		spe3.setBounds(473, 212, 64, 25);
		contentPane.add(spe3);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/newimg03.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 600, 429);
		contentPane.add(lblNewLabel);
		
		
//		textField = new JTextField();
//		textField.setBounds(50, 317, 485, 48);
//		contentPane.add(textField);
//		textField.setColumns(10);
		
	}
}
