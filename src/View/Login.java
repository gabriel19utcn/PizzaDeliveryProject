package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;


//import Model.Employee;


import javax.swing.JLabel;
import java.awt.event.ActionListener;
//import java.time.LocalDate;
import java.awt.event.ActionEvent;

import Controller.EmployeeGateway;
import Controller.LoginGateway;
import View.AdminGui;
import View.ClientGui;
//import Controller.EmployeeGateway;


public class Login {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private LoginGateway login = new LoginGateway();
	private ClientGui clientGui = new ClientGui();
	private AdminGui adminGui = new AdminGui();
	private DelivererGui deliverGui = new DelivererGui();
	private EmployeeGateway employeeGateway = new EmployeeGateway();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField = new JTextField();
		textField_1 = new JTextField();
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String usrn  = textField.getText();
					String pass  = textField_1.getText();
				
					
					if (login.checkIfAdmin(usrn, pass)) {
						adminGui.frame.setVisible(true);
					} else {
						clientGui.frame.setVisible(true);
					}
				
					
					//logging
					//Employee currentEmployee = employeeGateway.find(usrn);
				//	int employeeId = currentEmployee.getId();
					//Log log = new Log(LocalDate.now(), employeeId, "login");
				//	LogRepository.currentUserId = employeeId;
					//logRepository.insertLogIntoDb(log);
					
							
				
			} catch (Exception ex) {
			ex.printStackTrace();	
			}	
				
				
			
				
			}
		});
		btnLogin.setBounds(151, 188, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		
		textField.setBounds(131, 33, 163, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1.setBounds(131, 94, 163, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(24, 36, 71, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(24, 97, 71, 14);
		frame.getContentPane().add(lblPassword);
	}

}
