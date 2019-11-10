package javalastproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class scane4 extends JFrame {

	private JPanel contentPane;
	private TextArea mead;
	private JTextField menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scane4 frame = new scane4();
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
	public scane4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0E01\u0E25\u0E31\u0E1A");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null ," จะต้องเริ่มต้นกรอกใหม่  "); 
				dispose();
				scane3 sca = new scane3();
				sca.setVisible(true);
			}
		});
		btnNewButton.setBounds(12, 378, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0E40\u0E2A\u0E23\u0E47\u0E08\u0E2A\u0E34\u0E49\u0E19");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scane6 sca = new scane6();
				sca.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(458, 378, 97, 25);
		contentPane.add(btnNewButton_1);
		
		Button button = new Button("\u0E04\u0E34\u0E27\u0E17\u0E35\u0E48\u0E23\u0E2D\u0E08\u0E31\u0E14\u0E2A\u0E48\u0E07");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , " Q is " + " " + (int)(Math.random()*10)+1 ) ;
			}
		});
		button.setBounds(29, 32, 79, 25);
		contentPane.add(button);
		
		JButton btnNewButton_3 = new JButton("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scane5 sca = new scane5();
				sca.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(353, 378, 97, 25);
		contentPane.add(btnNewButton_3);
		
		
		//mead = new JTextField();
		//mead.setEditable(false);
		//mead.setFont(new Font("Angsana New", Font.PLAIN, 19));
		//mead.setText(scane3.inpt+" "+scane3.menu1+""+scane3.mean1 + " " + scane3.more1 + " "+ "จำนวน " + scane3.number1 + " กล่อง");
		//mead.setBounds(27, 81, 528, 133);
		//contentPane.add(mead);
	//	mead.setColumns(10);
		
		mead = new TextArea();
		mead.setBackground(new Color(255, 255, 255));
		mead.setEditable(false);
		mead.setFont(new Font("Angsana New", Font.PLAIN, 19));
		mead.setText(" คุณ " + scane3.inpt+"\n"+ " 1. " + scane3.menu1+""+scane3.mean1 + " " + scane3.more1 + " "+ "จำนวน " + scane3.number1 + " กล่อง" +
		"\n" + " 2. " + scane3.menu2+""+scane3.mean2 + " " + scane3.more2 + " "+ "จำนวน " + scane3.number2 + " กล่อง" +
		"\n" + " 3. " + scane3.menu3+""+scane3.mean3 + " " + scane3.more3 + " "+ "จำนวน " + scane3.number3 + " กล่อง" +
		"\n" + " ที่อยู่ " + "\n" + "   " +scane3.inpt2 +
		"\n   " + " ราคารวมทั้งหมด   " +      scane3.answer + "  บาท ");
		mead.setBounds(29, 63, 526, 246);
		contentPane.add(mead);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/newimg04.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 582, 417);
		contentPane.add(lblNewLabel);
		
	}
}
