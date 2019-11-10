package javalastproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sance01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sance01 frame = new sance01();
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
	public sance01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("\u0E1C\u0E39\u0E49\u0E08\u0E31\u0E14\u0E17\u0E33");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null ," นาย วิชฌากร จีกัน 61020762 " + "\n" + "  นาย รัฐกานต์ วาเพชร  61020740 ") ;
			}
		});
		button.setBounds(10, 380, 97, 24);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u0E16\u0E31\u0E14\u0E44\u0E1B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scane2 sca = new scane2();
				sca.setVisible(true);
			}
		});
		btnNewButton.setBounds(473, 379, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/newimg0001.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 582, 417);
		contentPane.add(label);
	}

}
