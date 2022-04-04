package com.thecherno.chernochat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblNewLabel;
	private JTextField txtAddress;
	private JTextField txtPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,380);
		setLocationRelativeTo(null);
//		setBounds(100, 100, 300, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(54, 58, 177, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(74, 61, 45, 13);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(128, 29, 30, 19);
		contentPane.add(lblNewLabel);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(54, 116, 177, 19);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIpAddress.setBounds(109, 87, 70, 19);
		contentPane.add(lblIpAddress);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(54, 197, 177, 19);
		contentPane.add(txtPort);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPort.setBounds(125, 168, 36, 19);
		contentPane.add(lblPort);
		
		JLabel lblAddressDesc = new JLabel("(eg. 192.168.3.92)");
		lblAddressDesc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAddressDesc.setBounds(100, 131, 86, 19);
		contentPane.add(lblAddressDesc);
		
		JLabel lblPortDesc = new JLabel("(eg. 6655)");
		lblPortDesc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPortDesc.setBounds(119, 210, 48, 19);
		contentPane.add(lblPortDesc);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Pressed!");
				String name = txtName.getText();
				String address = txtAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, address, port);
			}
		});
		btnNewButton.setBounds(100, 291, 85, 21);
		contentPane.add(btnNewButton);
	}
	
	/**
	 * Login stuff here
	 */
	private void login(String name, String address, int port) {
		// TODO Auto-generated method stub
		dispose();
		System.out.println(name + ", " + address + ", " + port + " ");
		
	}
}
