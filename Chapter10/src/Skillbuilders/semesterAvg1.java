package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class semesterAvg1 {

	private JFrame frame;
	private JTextField affg;
	private JTextField afsg;
	private JTextField aftg;
	private JTextField averageOutput;
	private JTextField inputG1;
	private JTextField inputG2;
	private JTextField inputG3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semesterAvg1 window = new semesterAvg1();
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
	public semesterAvg1() {
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
		
		
		
		affg = new JTextField();
		affg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		affg.setBounds(29, 11, 206, 66);
		affg.setBackground(new Color(240, 240, 240));
		affg.setText("Enter the first grade:");
		frame.getContentPane().add(affg);
		affg.setColumns(10);
		
		afsg = new JTextField();
		afsg.setText("Enter the second grade:");
		afsg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		afsg.setColumns(10);
		afsg.setBackground(UIManager.getColor("Button.background"));
		afsg.setBounds(29, 76, 206, 60);
		frame.getContentPane().add(afsg);
		
		aftg = new JTextField();
		aftg.setText("Enter the third grade:");
		aftg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		aftg.setColumns(10);
		aftg.setBackground(UIManager.getColor("Button.background"));
		aftg.setBounds(29, 135, 206, 60);
		frame.getContentPane().add(aftg);
		
		
		
		
		inputG1 = new JTextField();
		inputG1.setBounds(245, 27, 179, 40);
		frame.getContentPane().add(inputG1);
		inputG1.setColumns(10);
		
		inputG2 = new JTextField();
		inputG2.setBounds(245, 89, 179, 40);
		frame.getContentPane().add(inputG2);
		inputG2.setColumns(10);
		
		inputG3 = new JTextField();
		inputG3.setColumns(10);
		inputG3.setBounds(245, 148, 179, 40);
		frame.getContentPane().add(inputG3);
		
		
		averageOutput = new JTextField();
		averageOutput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		averageOutput.setColumns(10);
		averageOutput.setBackground(UIManager.getColor("Button.background"));
		averageOutput.setBounds(247, 196, 177, 60);
		frame.getContentPane().add(averageOutput);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				int val1 = Integer.parseInt(inputG1.getText());
				
				int val2 = Integer.parseInt(inputG2.getText());
				
				int val3 = Integer.parseInt(inputG3.getText());
			
				int cal = ((val1 + val2 + val3) / 3);
				
				averageOutput.setText( Integer.toString(cal));
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		submit.setBounds(58, 206, 158, 40);
		frame.getContentPane().add(submit);
		
		
		
	
	}
}
