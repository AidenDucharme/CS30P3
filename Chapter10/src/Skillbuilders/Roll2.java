package Skillbuilders;

import java.lang.Math;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Roll2 {

	private JFrame frame;
	private JTextField info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll2 window = new Roll2();
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
	public Roll2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon d1 = new ImageIcon("../Chapter10/src/Skillbuilders/1dice.png");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/Skillbuilders/2dice.png");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/Skillbuilders/3dice.png");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/Skillbuilders/4dice.png");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/Skillbuilders/5dice.png");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/Skillbuilders/6dice.png");
	
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 527, 371);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel image = new JLabel("");
		image.setBounds(113, 11, 380, 228);
		panel.add(image);
		
		info = new JTextField();
		info.setBackground(new Color(0, 128, 0));
		info.setFont(new Font("Tahoma", Font.PLAIN, 46));
		info.setBounds(89, 236, 323, 76);
		panel.add(info);
		info.setColumns(10);
		
		
		JButton submit = new JButton("ROLL!");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int ran = (int)(Math.random() * 6) + 1;


				if (ran == 1)
				{
					info.setText("1");
					image.setIcon(d1);
				}
				if (ran == 2)
				{
					info.setText("2");
					image.setIcon(d2);
				}
				if (ran == 3)
				{
					info.setText("3");
					image.setIcon(d3);
				}
				if (ran == 4)
				{
					info.setText("4");
					image.setIcon(d4);
				}
				if (ran == 5)
				{
					info.setText("5");
					image.setIcon(d5);
				}
				if (ran == 6)
				{
					info.setText("6");
					image.setIcon(d6);
				}
	
				
			}
		});
		submit.setBounds(147, 313, 221, 58);
		panel.add(submit);
		
	
	
		
		
	}
}


