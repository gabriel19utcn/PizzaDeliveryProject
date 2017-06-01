package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.Employee;

//import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
//import javax.swing.table.DefaultTableModel;

import Controller.EmployeeGateway;
import Controller.OrderGateway;
//import View.Login;

public class AdminGui {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	private EmployeeGateway emp  = new EmployeeGateway();
	private OrderGateway ord =  new OrderGateway();
	//private Login lg = new Login();
	
	JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGui window = new AdminGui();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 769, 406);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(309, 80, 430, 272);
		panel.add(textArea);
		
		JButton button = new JButton("Create ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int id = Integer.parseInt(textField.getText());
					String name  = textField_1.getText();
					String usrn  = textField_2.getText();
					String pass  = textField_3.getText();
					int isad = Integer.parseInt(textField_4.getText());
					
				
					Employee newEmployee = new Employee(id , name , usrn, pass, isad);
					
					emp.create(newEmployee);
								
				
			} catch (Exception ex) {
			ex.printStackTrace();	
			}	

				
			}
		});
		button.setBounds(30, 27, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Update");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					int id = Integer.parseInt(textField.getText());
					String name  = textField_1.getText();
					String usrn  = textField_2.getText();
					String pass  = textField_3.getText();
					int isad = Integer.parseInt(textField_4.getText());
					
				
					Employee newEmployee = new Employee(id , name , usrn, pass, isad);
					
					emp.update(newEmployee);
								
				
			} catch (Exception ex) {
			ex.printStackTrace();	
			}	
				
				
			}
				
		});
		button_1.setBounds(144, 27, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					int id = Integer.parseInt(textField.getText());
					 
				Employee newEmployee = new Employee(id);
				
								
				emp.delete(newEmployee);
								
				
			} catch (Exception ex) {
			ex.printStackTrace();	
			}	
				
				
			}
			
		});
		
		button_2.setBounds(257, 27, 89, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("View");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			String listResult = emp.view();
			textArea.setText(listResult);
				
			//		table.setToolTipText(ord.view());
			
			}
		});
		button_3.setBounds(366, 27, 89, 23);
		panel.add(button_3);
		
		JLabel lblId = new JLabel("idUser");
		lblId.setBounds(10, 85, 68, 14);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 125, 46, 14);
		panel.add(lblName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 165, 68, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 201, 89, 14);
		panel.add(lblPassword);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 237, 46, 14);
		panel.add(lblType);
		
		textField = new JTextField();
		textField.setBounds(65, 82, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 122, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 162, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 198, 96, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(66, 234, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		JTextArea textArea_1 = new JTextArea();
		JButton btnVizualizareComenzi = new JButton("Vizualizare comenzi");
		btnVizualizareComenzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_1.setText(ord.view());
				
			
				
			}
		});
		btnVizualizareComenzi.setBounds(561, 123, 134, 23);
		panel_1.add(btnVizualizareComenzi);
		
		
		textArea_1.setBounds(20, 25, 516, 286);
		panel_1.add(textArea_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	frame.setVisible(false);
				//lg.frame.setVisible(true);
				
			}
		});
		btnLogout.setBounds(665, 0, 89, 23);
		panel_1.add(btnLogout);
	}
}
