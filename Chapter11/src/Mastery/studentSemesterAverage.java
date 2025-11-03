package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class studentSemesterAverage {

	private JFrame frame;
	private JTextField studentName;
	private JTextField gradeLevel;
	private JTextField studentNumber;
	private JTextField gradeOne;
	private JTextField gradeTwo;
	private JTextField gradeThree;
	private JTextField gradeFour;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 349);
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
		dis.setBounds(166, 192, 191, 14);
		frame.getContentPane().add(dis);
		
		studentName = new JTextField();
		studentName.setBounds(134, 8, 255, 20);
		frame.getContentPane().add(studentName);
		studentName.setColumns(10);
		
		gradeLevel = new JTextField();
		gradeLevel.setColumns(10);
		gradeLevel.setBounds(134, 33, 255, 20);
		frame.getContentPane().add(gradeLevel);
		
		studentNumber = new JTextField();
		studentNumber.setColumns(10);
		studentNumber.setBounds(134, 58, 255, 20);
		frame.getContentPane().add(studentNumber);
		
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
		
		JButton saveToFile = new JButton("Save to File");
		saveToFile.setBounds(50, 245, 124, 23);
		frame.getContentPane().add(saveToFile);
		
		JButton viewFileContents = new JButton("View File Contents");
		viewFileContents.setBounds(194, 245, 124, 23);
		frame.getContentPane().add(viewFileContents);
	}
}
