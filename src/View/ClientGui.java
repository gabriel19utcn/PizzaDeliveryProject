package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import Controller.OrderGateway;

import java.awt.event.ActionListener;
//import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import Model.Order;

public class ClientGui {

	private OrderGateway ord =  new OrderGateway();
	
	
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	JTextArea textArea = new JTextArea();
	JTextArea textArea_1 = new JTextArea();
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGui window = new ClientGui();
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
	public ClientGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 938, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bismark", "Canibale", "Capriciosa", "Con Pollo", "Diavola", "Margherita", "Mexicana", "Prosciutto", "Quatro Stagioni", "Salami"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Bismark")){
					textArea.setText("-sos rosii \n  -bacon\n  -ceapa\n  -mozzarella\n  -ou batut\n ");
				}
					if(comboBox.getSelectedItem().equals("Canibale")){
						textArea.setText("sos rosii\n sunca\n salam\n bacon\n cabanos\n mozzarella\n ");
				}
				if(comboBox.getSelectedItem().equals("Capriciosa")){
					
					textArea.setText("sos rosii\n sunca\n legume mexicane\n ardei\n gras\n masline\n mozzarella\n ");
				}
				if(comboBox.getSelectedItem().equals("Con Pollo")){
					
					textArea.setText("sos rosii\n sunca de pui\n ardei gras\n porumb\n masline\n");
				}
				if(comboBox.getSelectedItem().equals("Diavola")){
	
					textArea.setText("sos rosii\n salam picant\n bacon\n peperoncino\n mozzarella\n ");
				}

				if(comboBox.getSelectedItem().equals("Margherita")){
	
					textArea.setText("sos rosii\n mozzarella\n");
				}

				if(comboBox.getSelectedItem().equals("Mexicana")){
	
					textArea.setText("sos rosii\n salam picant\n cabanosn ceapa\n mozzarella\n usturoi\n ou batut\n cartofi prajiti\n ");
				}
				if(comboBox.getSelectedItem().equals("Prosciutto")){
	
					textArea.setText("sos rosii\n sunca\n ciuperci\n mozzarella\n ");
				}
				if(comboBox.getSelectedItem().equals("Quatro Stagioni")){
	
					textArea.setText("sos rosii\n sunca\n salam\n porumb\n rosii\n mozzarella\n");
				}
				if(comboBox.getSelectedItem().equals("Salami")){
	
					textArea.setText("sos rosii\n salam\n mozzarella\n ");
				}

				
				
			}
		});
		
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(144, 53, 159, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setBounds(68, 56, 46, 14);
		frame.getContentPane().add(lblPizza);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"mica", "medie", "mare"}));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox_1.getSelectedItem().equals("mica")){
					textArea_1.setText("10");
					}
				
				if(comboBox_1.getSelectedItem().equals("medie")){
					textArea_1.setText("15");
					}
				
				
				if(comboBox_1.getSelectedItem().equals("mare")){
					textArea_1.setText("20");
					}
				
			}
		});
		
		
		comboBox_1.setBounds(334, 53, 121, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setBounds(536, 27, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblNumarTelefon = new JLabel("Numar Telefon:");
		lblNumarTelefon.setBounds(57, 130, 87, 14);
		frame.getContentPane().add(lblNumarTelefon);
		
		JLabel lblAddresa = new JLabel("Addresa:");
		lblAddresa.setBounds(57, 155, 67, 14);
		frame.getContentPane().add(lblAddresa);
		
		JLabel lblNume = new JLabel("Nume :");
		lblNume.setBounds(57, 105, 46, 14);
		frame.getContentPane().add(lblNume);
		
		textField = new JTextField();
		textField.setBounds(168, 102, 135, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 127, 135, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 152, 167, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPlaseazaComanda = new JButton("Plaseaza Comanda");
		btnPlaseazaComanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					//String pizz = "pizza mea";
					//String tip = "pizza mare";
					String pizz = comboBox.getSelectedItem().toString();
					String tip = comboBox_1.getSelectedItem().toString();
					String num = textField.getText();
					int nrtel = Integer.parseInt(textField_1.getText());
					String adres =  textField_2.getText();
					int pret = Integer.parseInt(textArea_1.getText());
						
				Order newOrder = new Order(pizz, tip , num , nrtel , adres , pret);
				
				ord.plasareComanda(newOrder);
				
					
				}catch(Exception ex){
					ex.printStackTrace();
					
				}
				
				
				
			}
		});
		btnPlaseazaComanda.setBounds(100, 209, 159, 23);
		frame.getContentPane().add(btnPlaseazaComanda);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setForeground(Color.BLUE);
		
		
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setBounds(607, 265, 272, 247);
		frame.getContentPane().add(textArea);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		textArea_1.setForeground(Color.RED);
		
		
		textArea_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1.setBounds(588, 11, 105, 41);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(45, 335, 513, 197);
		frame.getContentPane().add(textArea_2);
		
		textField_3 = new JTextField();
		
		JButton btnComenzileMele = new JButton("Comenzile mele");
		btnComenzileMele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textArea_2.setText("");											
				try {
					String numm = textField.getText();
					
					List<Order> orderList = ord.findAll(numm);
					
					for (Order o : orderList) {
						textArea_2.append(o.toString() + "\n");						
					}							
		
			} catch (Exception ex) {
				// TODO: handle exception
			}	
				
			}
		});
		btnComenzileMele.setBounds(100, 243, 121, 23);
		frame.getContentPane().add(btnComenzileMele);
		textField_3 = new JTextField();
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = 0;
				
				try {
					String numm = textField.getText();
					
					List<Order> orderList = ord.findAll(numm);
					
					for (Order o : orderList) {
						total += o.getPret();						
					}			
					
					textField_3.setText(total + "");
				}
				catch (Exception e1) {
					
				}
				
			}
		});
		btnTotal.setBounds(100, 277, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		textField_3.setBackground(UIManager.getColor("Button.background"));
		textField_3.setBounds(234, 278, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogOut.setBounds(823, 101, 89, 23);
		frame.getContentPane().add(btnLogOut);
	}
}
