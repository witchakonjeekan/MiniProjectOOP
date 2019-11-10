package javalastproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Window;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class scane2 extends JFrame {

	private JPanel contentPane;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scane2 frame = new scane2();
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
	public scane2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setFont(new Font("Cordia New", Font.BOLD, 21));
		textArea.setText("1. \u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\r\n\t-\t\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E2B\u0E21\u0E39\r\n\t- \t\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E44\u0E01\u0E48\r\n\t-\t\u0E01\u0E30\u0E40\u0E1E\u0E23\u0E32\u0E17\u0E30\u0E40\u0E25 \r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17 \t\r\n2.  \u0E04\u0E30\u0E19\u0E49\u0E32\r\n\t-\t\u0E04\u0E30\u0E19\u0E49\u0E32\u0E2B\u0E21\u0E39\r\n\t-\t\u0E04\u0E30\u0E19\u0E49\u0E32\u0E44\u0E01\u0E48\r\n\t-\t\u0E04\u0E30\u0E19\u0E49\u0E32\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n3. \u0E41\u0E1E\u0E19\u0E07\r\n\t-\t\u0E41\u0E1E\u0E19\u0E07\u0E2B\u0E21\u0E39\r\n\t-\t\u0E41\u0E1E\u0E19\u0E07\u0E44\u0E01\u0E48\r\n\t-\t\u0E41\u0E1E\u0E19\u0E07\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n4. \u0E02\u0E49\u0E32\u0E27\u0E1C\u0E31\u0E14\r\n\t-\t\u0E02\u0E49\u0E32\u0E27\u0E1C\u0E31\u0E14\u0E2B\u0E21\u0E39\r\n\t-\t\u0E02\u0E49\u0E32\u0E27\u0E1C\u0E31\u0E14\u0E44\u0E01\u0E48\r\n\t-\t\u0E02\u0E49\u0E32\u0E27\u0E1C\u0E31\u0E14\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n5. \u0E41\u0E01\u0E07\u0E40\u0E02\u0E35\u0E22\u0E27\u0E2B\u0E27\u0E32\u0E19\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E02\u0E35\u0E22\u0E27\u0E2B\u0E27\u0E32\u0E19\u0E2B\u0E21\u0E39\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E02\u0E35\u0E22\u0E27\u0E2B\u0E27\u0E32\u0E19\u0E44\u0E01\u0E48\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E02\u0E35\u0E22\u0E27\u0E2B\u0E27\u0E32\u0E19\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n6. \u0E41\u0E01\u0E07\u0E40\u0E1C\u0E47\u0E14\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E1C\u0E47\u0E14\u0E2B\u0E21\u0E39\u001E\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E1C\u0E47\u0E14\u0E44\u0E01\u0E48\r\n\t-\t\u0E41\u0E01\u0E07\u0E40\u0E1C\u0E47\u0E14\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n7. \u0E41\u0E01\u0E07\u0E01\u0E23\u0E30\u0E2B\u0E23\u0E35\r\n\t-\t\u0E41\u0E01\u0E07\u0E01\u0E23\u0E30\u0E2B\u0E23\u0E35\u0E2B\u0E21\u0E39\r\n\t-\t\u0E41\u0E01\u0E07\u0E01\u0E23\u0E30\u0E2B\u0E23\u0E35\u0E44\u0E01\u0E48\r\n\t-\t\u0E41\u0E01\u0E07\u0E01\u0E23\u0E30\u0E2B\u0E23\u0E35\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n8. \u0E15\u0E49\u0E21\u0E02\u0E48\u0E32 \r\n\t-\t\u0E15\u0E49\u0E21\u0E02\u0E48\u0E32\u0E2B\u0E21\u0E39\r\n\t-\t\u0E15\u0E49\u0E21\u0E02\u0E48\u0E32\u0E44\u0E01\u0E48\r\n\t-\t\u0E15\u0E49\u0E21\u0E02\u0E48\u0E32\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n9. \u0E1C\u0E31\u0E14\u0E1C\u0E31\u0E01\u0E23\u0E27\u0E21\r\n\t-\t\u0E1C\u0E31\u0E14\u0E1C\u0E31\u0E01\u0E23\u0E27\u0E21\u0E2B\u0E21\u0E39\r\n\t-\t\u0E1C\u0E31\u0E14\u0E1C\u0E31\u0E01\u0E23\u0E27\u0E21\u0E44\u0E01\u0E48\r\n\t-\t\u0E1C\u0E31\u0E14\u0E1C\u0E31\u0E01\u0E23\u0E27\u0E21\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17\r\n10. \u0E23\u0E32\u0E14\u0E2B\u0E19\u0E49\u0E32\r\n\t-\t\u0E23\u0E32\u0E14\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E21\u0E39\r\n\t-\t\u0E23\u0E32\u0E14\u0E2B\u0E19\u0E49\u0E32\u0E44\u0E01\u0E48\r\n\t-\t\u0E23\u0E32\u0E14\u0E2B\u0E19\u0E49\u0E32\u0E17\u0E30\u0E40\u0E25\r\n\t\t\t\t\t\t\u0E1B\u0E01\u0E15\u0E34 30 \u0E1A\u0E32\u0E17\r\n\t\t\t\t\t\t\u0E1E\u0E34\u0E40\u0E28\u0E29 35 \u0E1A\u0E32\u0E17");
		textArea.setBounds(12, 38, 559, 319);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("\u0E16\u0E31\u0E14\u0E44\u0E1B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				scane3 sca3 = new scane3();
				sca3.setVisible(true);
			}

		});
		btnNewButton.setBounds(470, 376, 101, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("\u0E01\u0E25\u0E31\u0E1A");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				sance01 sc1 = new sance01();				
				sc1.setVisible(true);
			}

		});
		btnBack.setBounds(12, 377, 105, 30);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/newimg02.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 582, 437);
		contentPane.add(lblNewLabel);
	}
}
