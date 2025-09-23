import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Demo30P3 {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=70,499
	 */
	private final JPanel panel_1 = new JPanel();
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo30P3 window = new Demo30P3();
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
	public Demo30P3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon cresent = new ImageIcon("../Chapter10/src/825-logo.png");
		
		
		
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 64));
		frame.setBounds(100, 100, 699, 757);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter() 
		{
			
			
			public void keyTyped(KeyEvent e)
			{
				
				
				if(FN.getText().equals("First Name"))
			FN.setText(" ");
				
			}
		});
		FN.setForeground(new Color(255, 128, 64));
		FN.setFont(new Font("Tahoma", Font.BOLD, 18));
		FN.setText("First Name");
		FN.setBounds(10, 21, 129, 20);
		frame.getContentPane().add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.setForeground(new Color(255, 128, 64));
		LN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(LN.getText().equals("Last Name"))
					LN.setText("");
				
			}
		});
		LN.setText("Last Name");
		LN.setColumns(10);
		LN.setBounds(10, 50, 129, 20);
		frame.getContentPane().add(LN);
		
		JComboBox gradeLevel = new JComboBox();
		gradeLevel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		gradeLevel.setForeground(new Color(255, 128, 64));
		gradeLevel.setModel(new DefaultComboBoxModel(new String[] {"Select Grade Level", "12", "11", "10"}));
		gradeLevel.setBounds(10, 81, 149, 119);
		frame.getContentPane().add(gradeLevel);
		
		
		JLabel IMGA = new JLabel("");
		IMGA.setBounds(465, 346, 208, 79);
		frame.getContentPane().add(IMGA);
		
		JComboBox schoolSelect = new JComboBox();
		schoolSelect.setForeground(new Color(255, 128, 64));
		schoolSelect.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Cresent Hights", "James Fowler", "William Aberhart "}));
		schoolSelect.setFont(new Font("Yu Gothic Light", Font.PLAIN, 17));
		schoolSelect.setBounds(178, 87, 200, 119);
		frame.getContentPane().add(schoolSelect);
		
		JTextArea display = new JTextArea();
		display.setForeground(new Color(255, 255, 255));
		display.setBackground(new Color(255, 128, 64));
		display.setBounds(28, 255, 435, 98);
		frame.getContentPane().add(display);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String grade = "";
				String school = "";
				String firstN = FN.getText();
				String lastN = LN.getText();
				
		//grades		
				
		if(gradeLevel.getSelectedItem().equals("12"))
		{
			grade = "12";
		}
		else if(gradeLevel.getSelectedItem().equals("11"))
		{
			grade = "11";
		}
		else 
		{
			grade = "10";
			
		}
		
		//School
		
		if(schoolSelect.getSelectedItem().equals("Cresent Hights"))
		{
			school = "Cresent Hights High School";
			IMGA.setIcon(cresent);
		}
		else if(schoolSelect.getSelectedItem().equals("James Fowler"))
		{
		 school = "James Fowler High School";
		}
		else 
		{
			school = "William Aberhart High School";
		}
		
				display.setText(firstN + " " + lastN + " is in grade " + grade + " at " + school);
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		submit.setForeground(new Color(255, 128, 64));
		submit.setBounds(465, 62, 208, 254);
		frame.getContentPane().add(submit);
		
		
	}
}
