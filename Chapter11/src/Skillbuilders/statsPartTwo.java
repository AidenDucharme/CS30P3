package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class statsPartTwo {
	
	

	private JFrame frame;
	private JTextField nunStudentFeild;
	
	StudentData inputDialog = new StudentData();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statsPartTwo window = new statsPartTwo();
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
	public statsPartTwo() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(424, 0, 10, 261);
		frame.getContentPane().add(panel);
		
		JTextField fileNameFeild = new JTextField();
		fileNameFeild.setText("Enter File Name Here");
		fileNameFeild.setBounds(23, 56, 125, 20);
		frame.getContentPane().add(fileNameFeild);
		fileNameFeild.setColumns(10);
		
		nunStudentFeild = new JTextField();
		nunStudentFeild.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
			
				if(nunStudentFeild.getText().equals(""))
				{
					nunStudentFeild.setText("");
				}
				
				
				
			}
		});
		nunStudentFeild.setText("Enter Number Of Students Here");
		nunStudentFeild.setBounds(10, 102, 186, 20);
		frame.getContentPane().add(nunStudentFeild);
		nunStudentFeild.setColumns(10);
		
		JButton CDF = new JButton("Create Data Feild");
		CDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fileName = fileNameFeild.getName().trim();
				String numSudentsText = nunStudentFeild.getText().trim();
				
				if(fileName.isEmpty() || numSudentsText.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter both file name and number of students.", "Input Error", JOptionPane.WARNING_MESSAGE); 
				}
				
				
				try
				{
				int numStu = Integer.parseInt(numSudentsText);
				StringBuilder studentData = new StringBuilder();
				for(int i = 0; i < numStu; i++)
				{
					int result = JOptionPane.showConfirmDialog(null, inputDialog, 
							"Enter data for student" + (i + 1),
							JOptionPane.OK_CANCEL_OPTION);
					
					
					if (result != JOptionPane.OK_OPTION)
					{
					break;
					}
					
		
			String stuName =  inputDialog.getTxtEnterStudentGrade().getText().trim();
			String score =  inputDialog.getTxtEnterStudentGrade().getText().trim();
		
		if (stuName.isEmpty() || score.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter both name and score for student " + (i + 1), "Input Error", JOptionPane.WARNING_MESSAGE); 	
		}
		
		
					
				}
					
					
					
					
				}
				
				
				
				
				
			}
		});
		CDF.setBounds(177, 55, 208, 23);
		frame.getContentPane().add(CDF);
		
		JButton AS = new JButton("Analyze Scores");
		AS.setBounds(206, 101, 208, 23);
		frame.getContentPane().add(AS);
		
		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			
			{
				if(fileNameFeild.getText().equals(""))
				{
					fileNameFeild.setText("");
				}
				
				
			}
		});
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBackground(new Color(240, 240, 240));
		textArea.setBounds(10, 133, 404, 117);
		frame.getContentPane().add(textArea);
	}
}
