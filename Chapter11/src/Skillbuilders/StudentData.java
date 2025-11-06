package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class StudentData {

	private JFrame frame;
	private JTextField txtEnterStudentsName;
	private JTextField txtEnterStudentGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentData window = new StudentData();
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
	public StudentData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		txtEnterStudentsName = new JTextField();
		txtEnterStudentsName.setText("Enter Students Name");
		frame.getContentPane().add(txtEnterStudentsName);
		txtEnterStudentsName.setColumns(10);
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		
		txtEnterStudentGrade = new JTextField();
		txtEnterStudentGrade.setText("Enter Student Grade");
		txtEnterStudentGrade.setColumns(10);
		frame.getContentPane().add(txtEnterStudentGrade);
	}

	public JTextField getTxtEnterStudentGrade() {
		return txtEnterStudentGrade;
	}
}
