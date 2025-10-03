package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;


public class localBank {

	private JFrame frame;
	private JTextField an;
	private JTextField amount;
	private JTextField first;
	private JTextField last;
	private JButton button;
	private JTextField txtAidenBank;
	private JLabel lblNewLabel_2;
	private JTextField originalBalance;
	private JLabel lblNewLabel_3;
	

	Bank myBank = new Bank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					localBank window = new localBank();
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
	public localBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 717, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox action = new JComboBox();
		action.setModel(new DefaultComboBoxModel(new String[] {"Select an action:", "Deposit", "Withdrawal", "Add Account", "Delete an acount"}));
		action.setBounds(0, 9, 188, 22);
		panel.add(action);
		
		JLabel lblNewLabel = new JLabel("Acount number:");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(0, 73, 149, 14);
		panel.add(lblNewLabel);
		
		an = new JTextField();
		an.setBounds(0, 98, 188, 20);
		panel.add(an);
		an.setColumns(10);
		
		JLabel add = new JLabel("Amount of deposit/withdrawal");
		add.setForeground(Color.RED);
		add.setBounds(0, 129, 149, 14);
		panel.add(add);
		
		amount = new JTextField();
		amount.setColumns(10);
		amount.setBounds(0, 154, 188, 20);
		panel.add(amount);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setBounds(42, 195, 102, 14);
		panel.add(lblNewLabel_1);
		
		first = new JTextField();
		first.setBounds(28, 216, 86, 20);
		panel.add(first);
		first.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setBounds(156, 195, 102, 14);
		panel.add(lblNewLabel_1_1);
		
		last = new JTextField();
		last.setColumns(10);
		last.setBounds(141, 216, 86, 20);
		panel.add(last);
		
		JLabel output = new JLabel("");
		output.setBounds(245, 184, 462, 66);
		panel.add(output);
		
		button = new JButton("Process Transaction ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String firstName;
			String lastName;
			String oldBalance;
			String option;
			int newBalance;
			String message;
			double nBalance;
			
			
			if(action.getSelectedItem().equals("Deposit"))//When the action "Deposit" is selected
			{
				//int OGB = Integer.parseInt(originalBalance.getText());
				//int added = Integer.parseInt(amount.getText());
				//output.setText( Integer.toString(OGB + added));
				message = myBank.transaction(1, an.getText(), Double.parseDouble(amount.getText()));
				
				output.setText("Your new balance is: " + message); //Outputting new balance
				
			}
			
			
			
			if(action.getSelectedItem().equals("Add Account")) //Add acount action
			{
				 nBalance = Double.parseDouble(originalBalance.getText());
				message =  myBank.addAccount(first.getText(), last.getText(), nBalance);
				
				output.setText("Your new Account is: " + message);
			}
			if(action.getSelectedItem().equals("Delete an acount")) //Withdrawal action
			{
				message = myBank.deleteAccount(an.getText());
				output.setText(message);
								
			}	}});
			
			
			if(action.getSelectedItem().equals("Delete an acount")) //Add delete action
			{
				double nBalance = Double.parseDouble(originalBalance.getText());
				String message =  myBank.deleteAccount(an.getText());
				
				output.setText("Your account has been deleted ");
				
			}
	
		button.setBounds(255, 161, 141, 23);
		panel.add(button);
		
		txtAidenBank = new JTextField();
		txtAidenBank.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 27));
		txtAidenBank.setBackground(new Color(240, 240, 240));
		txtAidenBank.setText("Aiden's Bank");
		txtAidenBank.setBounds(234, 9, 178, 58);
		panel.add(txtAidenBank);
		txtAidenBank.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Beginning Balance: ");
		lblNewLabel_2.setBounds(266, 73, 141, 14);
		panel.add(lblNewLabel_2);
		
		originalBalance = new JTextField();
		originalBalance.setBounds(266, 98, 86, 20);
		panel.add(originalBalance);
		originalBalance.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Complete all the information in RED");
		lblNewLabel_3.setBounds(0, 48, 224, 14);
		panel.add(lblNewLabel_3);
	}
}
