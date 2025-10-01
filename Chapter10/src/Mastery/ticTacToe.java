package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;




import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ticTacToe {

    private JFrame frame;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JLabel winner;
    private String player = "X"; // Start with X

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	ticTacToe window = new ticTacToe();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ticTacToe() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Tic Tac Toe");
        frame.setBounds(100, 100, 450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Create buttons
        b1 = new JButton(""); b1.setBounds(10, 10, 120, 70); frame.add(b1);
        b2 = new JButton(""); b2.setBounds(150, 10, 120, 70); frame.add(b2);
        b3 = new JButton(""); b3.setBounds(290, 10, 120, 70); frame.add(b3);

        b4 = new JButton(""); b4.setBounds(10, 90, 120, 70); frame.add(b4);
        b5 = new JButton(""); b5.setBounds(150, 90, 120, 70); frame.add(b5);
        b6 = new JButton(""); b6.setBounds(290, 90, 120, 70); frame.add(b6);

        b7 = new JButton(""); b7.setBounds(10, 170, 120, 70); frame.add(b7);
        b8 = new JButton(""); b8.setBounds(150, 170, 120, 70); frame.add(b8);
        b9 = new JButton(""); b9.setBounds(290, 170, 120, 70); frame.add(b9);

        // Winner label
        winner = new JLabel("");
        winner.setFont(new Font("Arial", Font.BOLD, 24));
        winner.setBounds(120, 260, 250, 50);
        frame.add(winner);

        // Add listeners directly
        b1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b1); }});
        b2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b2); }});
        b3.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b3); }});
        b4.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b4); }});
        b5.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b5); }});
        b6.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b6); }});
        b7.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b7); }});
        b8.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b8); }});
        b9.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { buttonClicked(b9); }});
    }

    private void buttonClicked(JButton b) {
        if (!b.getText().equals("")) return; // already used

        b.setText(player);

        // ✅ Win checking done here in the same method
        if (
            // Rows
            (b1.getText().equals(player) && b2.getText().equals(player) && b3.getText().equals(player)) ||
            (b4.getText().equals(player) && b5.getText().equals(player) && b6.getText().equals(player)) ||
            (b7.getText().equals(player) && b8.getText().equals(player) && b9.getText().equals(player)) ||

            // Columns
            (b1.getText().equals(player) && b4.getText().equals(player) && b7.getText().equals(player)) ||
            (b2.getText().equals(player) && b5.getText().equals(player) && b8.getText().equals(player)) ||
            (b3.getText().equals(player) && b6.getText().equals(player) && b9.getText().equals(player)) ||

            // Diagonals
            (b1.getText().equals(player) && b5.getText().equals(player) && b9.getText().equals(player)) ||
            (b3.getText().equals(player) && b5.getText().equals(player) && b7.getText().equals(player))
        ) {
            winner.setText(player + " Wins!");
            disableButtons();
        } else {
            // Switch player if no winner yet
            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }
        }
    }

    private void disableButtons() {
        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
        b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
        b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
    }


}





/*public class ticTacToe {

	private JFrame frame;
	
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	String player = "X"; //declaring a valiable to represent what player's turn it is
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticTacToe window = new ticTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ticTacToe() {
		initialize();
	}

	
	
	
	
	private boolean checkWinner() {
	    // Check top row
	    if (!b1.getText().equals("") &&
	        b1.getText().equals(b2.getText()) &&
	        b2.getText().equals(b3.getText())) {
	        return true;
	    }
	    // Add other win conditions here (middle row, bottom row, columns, diagonals)
	    return false;
	}

	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 332);
		frame.getContentPane().add(layeredPane);
		
		b1= new JButton("");
		b1.setBounds(10, 11, 129, 68);
		layeredPane.add(b1);
		
		 b4 = new JButton("");
		b4.setBounds(10, 91, 129, 68);
		layeredPane.add(b4);
		
		 b7 = new JButton("");
		b7.setBounds(10, 171, 129, 68);
		layeredPane.add(b7);
		
		 b2 = new JButton("");
		b2.setBounds(154, 11, 129, 68);
		layeredPane.add(b2);
		
		 b3 = new JButton("");
		b3.setBounds(293, 11, 129, 68);
		layeredPane.add(b3);
		
		 b5 = new JButton("");
		b5.setBounds(154, 91, 129, 68);
		layeredPane.add(b5);
		
	 b8 = new JButton("");
		b8.setBounds(154, 171, 129, 68);
		layeredPane.add(b8);
		
		 b6 = new JButton("");
		b6.setBounds(293, 91, 129, 68);
		layeredPane.add(b6);
		
		 b9 = new JButton("");
		b9.setBounds(293, 171, 129, 68);
		layeredPane.add(b9);
		
		JLabel winner = new JLabel("");
		winner.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 43));
		winner.setBounds(154, 250, 129, 82);
		layeredPane.add(winner);
	
		
		
		
		
		
		
	
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				b1.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					
				else 
				{
					player = "X";
					
				}}});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b2.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b3.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b4.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b5.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b6.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player  = "X";
					}}});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b7.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b8.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				b9.setText(player);
				if (player.equals("X")) {
					player = "O";
				}	
					else {
					player = "X";
					}}});
		
		
		if ((b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) ||
			    (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O"))) {
			    winner.setText(player + " Wins!");
			}
		
		
		
	*/	
		
		
	
	

