package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import Model.Order;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
//import Controller.OrderGateway;
import Controller.DelivererGateway;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

public class DelivererGui {

	public JFrame frame;
	private JTextField textField;
	private DelivererGateway dlvr = new DelivererGateway();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelivererGui window = new DelivererGui();
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
	public DelivererGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 154, 697, 255);
		frame.getContentPane().add(textArea);
		textField = new JTextField();
		
		JButton btnDestinatii = new JButton("Vizualizare comenzi");
		btnDestinatii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(" ");											
				try {
					String adresa = textField.getText();
					
					List<Order> orderList = dlvr.findAll(adresa);
					
					for (Order o : orderList) {
						textArea.append(o.toString() + "\n");						
					}							
		
			} catch (Exception ex) {
				// TODO: handle exception
			}	
				
			}
				
		});
		btnDestinatii.setBounds(31, 58, 177, 23);
		frame.getContentPane().add(btnDestinatii);
		
		
		textField.setBounds(88, 104, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAdresa = new JLabel("Adresa");
		lblAdresa.setBounds(10, 107, 68, 14);
		frame.getContentPane().add(lblAdresa);
		
		JButton btnVizualizare = new JButton("Toate comenzile");
		btnVizualizare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				textArea.setText(dlvr.view());
				
			}
		});
		btnVizualizare.setBounds(515, 58, 165, 23);
		frame.getContentPane().add(btnVizualizare);
		
		JTextArea textArea_1 = new JTextArea();
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int total = 0;
				
				try {
					String adresa = textField.getText();
					
					List<Order> orderList = dlvr.findAll(adresa);
					
					for (Order o : orderList) {
						total += o.getPret();						
					}			
					
					textArea_1.setText(total + "");
				}
				catch (Exception e1) {
					
				}
				
			
				
				
				
			}
		});
		btnTotal.setBounds(344, 58, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 25));
		textArea_1.setForeground(Color.RED);
		textArea_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1.setBounds(344, 92, 89, 42);
		frame.getContentPane().add(textArea_1);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnLogOut.setBounds(677, 11, 89, 23);
		frame.getContentPane().add(btnLogOut);
	}
	
}
