package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class statsPart1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statsPart1 window = new statsPart1();
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
	public statsPart1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel tidalLabel = new JLabel("Student Test Scores Analysis");
		tidalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tidalLabel.setBounds(98, 21, 223, 48);
		panel.add(tidalLabel);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setEditable(false);
		resultArea.setRows(15);
		resultArea.setColumns(40);
		resultArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		resultArea.setBackground(new Color(240, 240, 240));
		resultArea.setBounds(50, 80, 333, 243);
		panel.add(resultArea);
		
		JButton analyzeButton = new JButton("Analyze Scores");
		analyzeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			//Clear previous results
			resultArea.setText("");
			
			File dataFile = new File("..\\Chapter11\\src\\Skillbuilders\\test.txt");;
			FileReader in;
			BufferedReader readFile;
			
			String stuName, score;
			
			double scoreValue;
			double lowScore = 100;
			double highScore = 0;
			double averageScore = 0;
			double totalScore = 0;
			int numScores = 0;
			
			NumberFormat percent = NumberFormat.getPercentInstance();
				
			StringBuilder output = new StringBuilder();
			
			try
			{
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			output.append("STUDENT SCORES: \n");
			output.append("--------------------");

			while((stuName = readFile.readLine()) != null)
			{
			score = readFile.readLine();
			
			numScores += 1;
			
			scoreValue = Double.parseDouble(score);
			
			output.append(stuName + "" + percent.format(scoreValue/100) + "\n");
			
			totalScore += scoreValue;
			
			if(scoreValue < lowScore)
			{
				lowScore = scoreValue;
			}
			if(scoreValue > highScore)
			{
				highScore = scoreValue;
			}
			
			
			
		
			
			}
			
averageScore = totalScore / numScores;
			
			output.append("\nSTATISTICS: \n");
			output.append("-----------------\n");
			
			output.append("Low Score: " + percent.format(lowScore/100) + "\n");
			output.append("High Score: " + percent.format(highScore/100) + "\n");
			output.append("AverageScore: " + percent.format(averageScore/100) + "\n");
			output.append("Total Students: " + numScores + "\n");
			
			resultArea.setText(output.toString());
			
			readFile.close();
			in.close();
			
			
			
			
			
			}
			catch(FileNotFoundException ex)
			{
			System.out.println("File could not be found.");
			System.err.println("FileNotFoundException: " + ex.getMessage());
			}
			
			catch (IOException ex)
			{
				System.out.println("problem reading file");
				System.err.println("IOException: " + ex.getMessage());
			}

				
				
			}
		});
		analyzeButton.setBounds(154, 351, 144, 23);
		panel.add(analyzeButton);
	}
}
