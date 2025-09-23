package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metricConversion {

	private JFrame frame;
	private JTextField asking;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricConversion window = new metricConversion();
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
	public metricConversion() {
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
		
		asking = new JTextField();
		asking.setFont(new Font("Tahoma", Font.PLAIN, 21));
		asking.setBackground(new Color(240, 240, 240));
		asking.setText("Select a conversion type:");
		asking.setBounds(86, 46, 243, 32);
		frame.getContentPane().add(asking);
		asking.setColumns(10);
		
		JComboBox conversions = new JComboBox(); 
		conversions.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String conversionss = "";
				if(conversions.getSelectedItem().equals("inches to centimeters"))
				

					if(conversions.getSelectedItem().equals("inches to centimeters"))
					{
						conversionss = "";
						conversionss = "1 inch = 2.54 centimeters";
					}
					if(conversions.getSelectedItem().equals("feet to meters "))
					{
						conversionss = "";
						conversionss = "1 foot = 0.3048m";
					}
					if(conversions.getSelectedItem().equals("gallon to liters"))
					{
						conversionss = "";
						conversionss = "1 gallon = 4.5461 liters";
						
					}
					if(conversions.getSelectedItem().equals("pounds to killograms"))
					{
						conversionss = "";
						conversionss = "1 lb = 0.45359237 kg";
						
					}
					
					display.setText(conversionss);
			}
		});
	
		
				
			
		
		conversions.setModel(new DefaultComboBoxModel(new String[] {"inches to centimeters", "feet to meters ", "gallon to liters", "pounds to killograms"}));
		conversions.setBounds(86, 89, 243, 22);
		frame.getContentPane().add(conversions);
		
		
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.PLAIN, 21));
		display.setColumns(10);
		display.setBackground(UIManager.getColor("Button.background"));
		display.setBounds(86, 148, 243, 32);
		frame.getContentPane().add(display);
	}
}
