package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class myFilePartTwo {

	private JFrame frame;
	private static final String FILE_PATH = "C:\\Users\\38309001\\git\\CS30P3\\Chapter11\\src\\Skillbuilders\\zzz.txt";
	private File textFile;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFilePartTwo window = new myFilePartTwo();
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
	public myFilePartTwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		textFile = new File(FILE_PATH);
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(424, 0, 10, 261);
		frame.getContentPane().add(panel);
		
		JLabel dis = new JLabel("");
		dis.setBounds(55, 21, 292, 74);
		frame.getContentPane().add(dis);
		
		JButton KF = new JButton("Keep File");
		KF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(textFile.exists())
				{
					dis.setText("The file already exists");
				}
				else
				{
					try
					{
						if(textFile.createNewFile())
						{
							dis.setText("The file is created");
						}
						else
						{
							dis.setText("The file can not be created");
						}
					}
					catch(IOException ex)
					{
						dis.setText("Error: " + ex.getMessage());
						System.err.println("IOExeption: " + ex.getMessage());
					}
				}
				
				
				
				
				
			}
			
			
			
		});
		KF.setBounds(55, 176, 89, 23);
		frame.getContentPane().add(KF);
		
		
		
		JButton DF = new JButton("Delete File");
		DF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFile.delete())
				{
					dis.setText("The file has been deleted");
				}
				else 
				{
					dis.setText("Failed to delete the file.");
				}
				
				
				
			}
		});
		DF.setBounds(231, 176, 89, 23);
		frame.getContentPane().add(DF);
	}
}
