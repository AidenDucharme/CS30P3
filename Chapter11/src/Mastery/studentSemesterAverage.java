package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class studentSemesterAverage {
	
	
	
	private static final String FILE_PATH = "C:\\Users\\38309001\\git\\CS30P3\\Chapter11\\src\\Skillbuilders\\studentTXT";
	private File textFile;
	

	private JFrame frame;
	private JTextField studentName;
	private JTextField gradeLevel;
	private JTextField semesterNumber;
	private JTextField gradeOne;
	private JTextField gradeTwo;
	private JTextField gradeThree;
	private JTextField gradeFour;
	private JLabel avgDis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentSemesterAverage window = new studentSemesterAverage();
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
	public studentSemesterAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		textFile = new File(FILE_PATH);
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 261);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Student Name:");
		lblNewLabel.setBounds(20, 11, 78, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel dddd = new JLabel("Grade Level:");
		dddd.setBounds(20, 36, 191, 14);
		frame.getContentPane().add(dddd);
		
		JLabel lblSemesterNumber = new JLabel("Semester Number:");
		lblSemesterNumber.setBounds(20, 61, 191, 14);
		frame.getContentPane().add(lblSemesterNumber);
		
		JLabel lblGrade = new JLabel("Grade 1:");
		lblGrade.setBounds(20, 86, 191, 14);
		frame.getContentPane().add(lblGrade);
		
		JLabel lblGrade_4 = new JLabel("Grade 2:");
		lblGrade_4.setBounds(20, 116, 191, 14);
		frame.getContentPane().add(lblGrade_4);
		
		JLabel lblGrade_1 = new JLabel("Grade 3:");
		lblGrade_1.setBounds(20, 141, 191, 14);
		frame.getContentPane().add(lblGrade_1);
		
		JLabel lblGrade_2 = new JLabel("Grade 4:");
		lblGrade_2.setBounds(20, 167, 191, 14);
		frame.getContentPane().add(lblGrade_2);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setBounds(20, 192, 136, 14);
		frame.getContentPane().add(lblAverage);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 217, 404, 172);
		frame.getContentPane().add(dis);
		
		studentName = new JTextField();
		studentName.setBounds(134, 8, 255, 20);
		frame.getContentPane().add(studentName);
		studentName.setColumns(10);
		
		gradeLevel = new JTextField();
		gradeLevel.setColumns(10);
		gradeLevel.setBounds(134, 33, 255, 20);
		frame.getContentPane().add(gradeLevel);
		
		semesterNumber = new JTextField();
		semesterNumber.setColumns(10);
		semesterNumber.setBounds(134, 58, 255, 20);
		frame.getContentPane().add(semesterNumber);
		
		gradeOne = new JTextField();
		gradeOne.setColumns(10);
		gradeOne.setBounds(134, 83, 255, 20);
		frame.getContentPane().add(gradeOne);
		
		gradeTwo = new JTextField();
		gradeTwo.setColumns(10);
		gradeTwo.setBounds(134, 113, 255, 20);
		frame.getContentPane().add(gradeTwo);
		
		gradeThree = new JTextField();
		gradeThree.setColumns(10);
		gradeThree.setBounds(134, 141, 255, 20);
		frame.getContentPane().add(gradeThree);
		
		gradeFour = new JTextField();
		gradeFour.setColumns(10);
		gradeFour.setBounds(134, 166, 255, 20);
		frame.getContentPane().add(gradeFour);
		
		
		if(textFile.exists())
		{
			try
			{
				if(textFile.createNewFile())
				{
					dis.setText("The file is created");
				}
				
			}
			catch(IOException ex)
			{
				dis.setText("Error: " + ex.getMessage());
				System.err.println("IOExeption: " + ex.getMessage());
			}
		}
		
		
		
		
		
		
		
		JButton saveToFile = new JButton("Save to File");
		saveToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				File dataFile = new File("..\\Chapter11\src\\Skillbuilders\studentTXT");;
				FileReader in;
				BufferedReader readFile;
				
				String stuName;
				
				double gradeL =  Double.parseDouble(gradeLevel.getText());
				double semesterN =  Double.parseDouble(semesterNumber.getText());
				double gradeO =  Double.parseDouble(gradeOne.getText());
				double gradeT =  Double.parseDouble(gradeTwo.getText());
				double gradeTh =  Double.parseDouble(gradeThree.getText());
				double gradeF =  Double.parseDouble(gradeFour.getText());
				
				double averaged;

				NumberFormat percent = NumberFormat.getPercentInstance();
				StringBuilder output = new StringBuilder();
				
				  try (FileWriter writer = new FileWriter(filename, true)) {
			            
				  } catch (IOException e) {
			           dis.setText("touble saving");
			           
			           
			           
			           
			          
				
				
				
		}
		
		});
		saveToFile.setBounds(10, 400, 124, 23);
		frame.getContentPane().add(saveToFile);
		
		JButton viewFileContents = new JButton("View File Contents");
		viewFileContents.setBounds(144, 400, 124, 23);
		frame.getContentPane().add(viewFileContents);
		
		avgDis = new JLabel("");
		avgDis.setBounds(71, 192, 46, 14);
		frame.getContentPane().add(avgDis);
	}
}
