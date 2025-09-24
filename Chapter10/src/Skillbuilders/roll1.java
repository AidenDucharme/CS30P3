package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class roll1 {

	private JFrame frame;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roll1 window = new roll1();
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
	public roll1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/Skillbuilders/1dice.png");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/Skillbuilders/2dice.png");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/Skillbuilders/3dice.png");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/Skillbuilders/4dice.png");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/Skillbuilders/5dice.png");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/Skillbuilders/6dice.png");
		
		result = new JTextField();
		result.setBounds(42, 54, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel picture = new JLabel("New label");
		picture.setBounds(59, 184, 144, 14);
		frame.getContentPane().add(picture);
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel pic = new JLabel("");
		pic.setBounds(82, 159, 46, 14);
		frame.getContentPane().add(pic);
		
		JButton rButton = new JButton("ROLL!");
		rButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ran = ((int)((1 - 6 + 1) * Math.random() + 2));

				if (ran == 1)
				{
					picture.setText("1");
					picture.setIcon(d1);
				}
				if (ran == 2)
				{
					picture.setText("2");
					picture.setIcon(d1);
				}
				if (ran == 3)
				{
					picture.setText("3");
					picture.setIcon(d1);
				}
				if (ran == 4)
				{
					picture.setText("4");
					picture.setIcon(d1);
				}
				if (ran == 5)
				{
					picture.setText("5");
					picture.setIcon(d1);
				}
				if (ran == 6)
				{
					picture.setText("6");
					picture.setIcon(d1);
				}
				
				
			}
		});
		rButton.setBounds(247, 101, 89, 23);
		frame.getContentPane().add(rButton);
		
		
	}
}
