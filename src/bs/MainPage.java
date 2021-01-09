package bs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class MainPage {

	Connection conn = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JPanel panel;
	private JPasswordField passwordField;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
		conn = connectDB.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Sarlavha = new JLabel(" Billing Tizimi");
		Sarlavha.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Sarlavha.setBounds(323, 26, 493, 92);
		frame.getContentPane().add(Sarlavha);
		
		JButton register_btn_big = new JButton("Ro'yxatdan O'tish");
		register_btn_big.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register_btn_big.setVisible(false);
				panel.setVisible(true);
			}
		});
		register_btn_big.setFont(new Font("Tahoma", Font.PLAIN, 20));
		register_btn_big.setBounds(97, 223, 324, 46);
		frame.getContentPane().add(register_btn_big);
		
		textField = new JTextField();
		textField.setBounds(696, 249, 173, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(696, 316, 173, 20);
		frame.getContentPane().add(textField_1);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(600, 255, 86, 14);
		frame.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(600, 319, 86, 14);
		frame.getContentPane().add(lblPassword);
		
		btnNewButton_1 = new JButton("Kirsih");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(737, 366, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Yangi Foydalanuvchi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(182, 162, 143, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Tizim A'zosi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(673, 162, 143, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(30, 207, 461, 327);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 11, 202, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(215, 61, 202, 20);
		panel.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(215, 158, 202, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_3 = new JLabel("Ismingiz");
		lblNewLabel_3.setBounds(54, 14, 61, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("username yarating");
		lblNewLabel_3_1.setBounds(54, 64, 135, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("password tanlang");
		lblNewLabel_3_1_1.setBounds(54, 113, 114, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Tashkilot nomi");
		lblNewLabel_3_1_1_1.setBounds(54, 161, 93, 14);
		panel.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(164, 293, 89, 23);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(215, 110, 202, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Tug'ulgan sana");
		lblNewLabel_3_1_1_1_1.setBounds(54, 212, 93, 14);
		panel.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Telefon raqam");
		lblNewLabel_3_1_1_1_1_1.setBounds(54, 259, 93, 14);
		panel.add(lblNewLabel_3_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(215, 209, 202, 20);
		panel.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(215, 256, 202, 20);
		panel.add(textField_6);
	}
}
