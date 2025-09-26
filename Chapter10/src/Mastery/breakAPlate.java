package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class breakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					breakAPlate window = new breakAPlate();
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
	public breakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		//Creating variables for images:
		ImageIcon noPlatesBroken = new ImageIcon("../Chapter10/src/Mastery/unbrokenPlates.gif"); //none of the plates are broken
		ImageIcon twoPlatesBroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif"); //two of the plates are broken
		ImageIcon threePlatesBroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif"); //three of the plates are broken
		ImageIcon tigerPlush = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif"); //tiger plush prize
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif"); //sticker prize

		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 746, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 730, 519);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		JLabel textOuput = new JLabel("You win: ");
		textOuput.setBounds(264, 375, 80, 30);
		panel.add(textOuput);
		
		JLabel prizeVisual = new JLabel("");
		prizeVisual.setBounds(328, 350, 121, 87);
		panel.add(prizeVisual);
		
		JLabel visual = new JLabel("");
		visual.setBounds(245, 107, 315, 175);
		panel.add(visual);
		
		JButton playB = new JButton("PLAY!!");
		playB.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) //When the button, "play" is pressed 
			
			{
				visual.setIcon(noPlatesBroken); //Setting the plates so that none of them are broken before the player plays the game.
				
				int ran = (int)(Math.random() * 2);   //Generate a random number between 0 and 1.

				
				if (ran == 1) //What happens if the random number is 1
				{
					visual.setIcon(threePlatesBroken); //Changing the plate image to show all the plates are broken 
					prizeVisual.setIcon(tigerPlush); //Displaying the tiger plush prize 
				}
				
				if (ran == 0) //What happens if the random number is 1

				{ 
					visual.setIcon(twoPlatesBroken); //setting the plate image to show two of the plates are broken
					prizeVisual.setIcon(sticker); //Displaying the sticker prize 
		
				}
				
				
				
				
			}
		});
		playB.setBounds(328, 304, 89, 23);
		panel.add(playB);
		
		JLabel lblNewLabel = new JLabel("CARNIVAL GAME");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setBounds(264, 37, 244, 70);
		panel.add(lblNewLabel);
		
	}
}
