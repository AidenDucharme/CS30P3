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
	private JLabel BB;
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

	
	public localBank() {
		initialize();
	}

	
	private void initialize() {
		
		//Adding the elements for the program
		
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 717, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel acountNumber = new JLabel("Acount number:");
		acountNumber.setForeground(new Color(0, 0, 0));
		acountNumber.setBounds(0, 73, 149, 14);
		panel.add(acountNumber);
		
		an = new JTextField();
		an.setBounds(0, 98, 188, 20);
		panel.add(an);
		an.setColumns(10);
		
		JLabel DoW = new JLabel("Amount of deposit/withdrawal");
		DoW.setForeground(new Color(0, 0, 0));
		DoW.setBounds(0, 129, 149, 14);
		panel.add(DoW);
		
		amount = new JTextField();
		amount.setColumns(10);
		amount.setBounds(0, 154, 188, 20);
		panel.add(amount);
		
		JLabel Fnn = new JLabel("First Name: ");
		Fnn.setBounds(42, 195, 102, 14);
		panel.add(Fnn);
		
		first = new JTextField();
		first.setBounds(28, 216, 86, 20);
		panel.add(first);
		first.setColumns(10);
		
		JLabel Lnn = new JLabel("Last Name: ");
		Lnn.setBounds(156, 195, 102, 14);
		panel.add(Lnn);
		
		last = new JTextField();
		last.setColumns(10);
		last.setBounds(141, 216, 86, 20);
		panel.add(last);
		
		JLabel output = new JLabel("");
		output.setBounds(396, 184, 311, 66);
		panel.add(output);
		
		
		
		
		
		
		JComboBox action = new JComboBox(); //When an option is selected on the drop down menu
		action.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				
				if(action.getSelectedItem().equals("Add Account")) //if "Add Account" is selected, first and last name, along with the bank balance sections are highlighted red
				{
					
				Fnn.setForeground(new Color(255, 0, 0));
				Lnn.setForeground(new Color(255, 0, 0));
				BB.setForeground(new Color(255, 0, 0));
				DoW.setForeground(new Color(0, 0, 0));//The other sections are set to black
				acountNumber.setForeground(new Color(0, 0, 0));
					
				}
				if(action.getSelectedItem().equals("Deposit")) //If deposit is selected, acount number and amount deposited boxs are highlighted red
				{
				
				acountNumber.setForeground(new Color(255, 0, 0));
				DoW.setForeground(new Color(255, 0, 0));
				Fnn.setForeground(new Color(0, 0, 0));
				Lnn.setForeground(new Color(0, 0, 0)); //The rest of the boxs remain black
				BB.setForeground(new Color(0, 0, 0));
				
				}
				if(action.getSelectedItem().equals("Withdrawl")) 
				{
				acountNumber.setForeground(new Color(255, 0, 0));
				DoW.setForeground(new Color(255, 0, 0)); //Same idea to the options above
				Fnn.setForeground(new Color(0, 0, 0));
				Lnn.setForeground(new Color(0, 0, 0));
				BB.setForeground(new Color(0, 0, 0));
				
				}
				if(action.getSelectedItem().equals("Delete an acount")) 
				{
				acountNumber.setForeground(new Color(255, 0, 0));
				DoW.setForeground(new Color(0, 0, 0));
				Fnn.setForeground(new Color(0, 0, 0));//Same idea to the options above
				Lnn.setForeground(new Color(0, 0, 0));
				BB.setForeground(new Color(0, 0, 0));
				}
				
				
			}
		});
		action.setModel(new DefaultComboBoxModel(new String[] {"Select an action:", "Deposit", "Withdrawal", "Add Account", "Delete an acount"}));
		action.setBounds(0, 9, 188, 22);
		panel.add(action);
		
		
		
		button = new JButton("Process Transaction ");
		button.addActionListener(new ActionListener() { //Activated when the "process transaction" button is pressed
			public void actionPerformed(ActionEvent e) {
				///Declaring variables
			String firstName;
			String lastName;
			String oldBalance;
			String option;
			int newBalance;
			String message;
			double nBalance;
			
			
			if(action.getSelectedItem().equals("Deposit"))//When the action "Deposit" is selected
			{
			
				
				message = myBank.transaction(1, an.getText(), Double.parseDouble(amount.getText()));
				
				output.setText("Your new balance is: " + message); //Outputting new balance
				
				
			}
			
			
			
			if(action.getSelectedItem().equals("Add Account")) //if add account option is selected
			{
				
				
				
				 nBalance = Double.parseDouble(originalBalance.getText());
				message =  myBank.addAccount(first.getText(), last.getText(), nBalance);
				
				output.setText("Your new Account is: " + message);
			}
			if(action.getSelectedItem().equals("Delete an acount")) //Withdrawal action
			{
				message = myBank.deleteAccount(an.getText());
				output.setText(message); //outputting
								
			}	}});
			
			
			if(action.getSelectedItem().equals("Delete an acount")) //Add delete action
			{
				double nBalance = Double.parseDouble(originalBalance.getText());
				String message =  myBank.deleteAccount(an.getText());
				
				output.setText("Your account has been deleted "); //outputting 
				
			}
	
		button.setBounds(245, 215, 141, 23);
		panel.add(button);
		
		txtAidenBank = new JTextField();
		txtAidenBank.setForeground(new Color(64, 0, 64));
		txtAidenBank.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 27));
		txtAidenBank.setBackground(new Color(240, 240, 240));
		txtAidenBank.setText("Aiden's Bank");
		txtAidenBank.setBounds(512, 4, 178, 58);
		panel.add(txtAidenBank);
		txtAidenBank.setColumns(10);
		
		BB = new JLabel("Beginning Balance: ");
		BB.setBounds(215, 73, 141, 14);
		panel.add(BB);
		
		originalBalance = new JTextField();
		originalBalance.setBounds(215, 98, 86, 20);
		panel.add(originalBalance);
		originalBalance.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Complete all the information in RED");
		lblNewLabel_3.setBounds(0, 48, 224, 14);
		panel.add(lblNewLabel_3);
	}
}
