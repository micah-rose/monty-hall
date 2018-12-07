/**********************
 * Author: Micah L
 * A09 - Final Project
 * Course: CSIS 1410
 **********************/

package a09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MontyHallGUI extends JFrame 
{

	private JPanel contentPane;
	Random rand = new Random();
	static String fileName = "Assignments/a09/prizes.txt";
	int clicks; //integer for click counting
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{	
		List<Door> gameDoors = new ArrayList<Door>(Arrays.asList(Door.values()));
		printPrizeList(gameDoors);
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MontyHallGUI frame = new MontyHallGUI();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * method for writing a text file with a list of available prizes
	 * @param gameDoors
	 */
	public static void printPrizeList(List<Door> gameDoors)
	{
		try (PrintWriter writer = new PrintWriter(fileName))
    	{
			for (Door el : gameDoors)
			{
				writer.format("%s%n", el);
			}
		} 
    	catch (IOException e) 
    	{
    		System.out.printf("File %s not found", fileName);
		}
		return;
	}

	/**
	 * Create the frame.
	 */
	public MontyHallGUI() 
	{
//Setting up JFrame and panels
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMontyHallPick = new JLabel("Monty Hall: Pick Your Prize!!");
		lblMontyHallPick.setForeground(Color.ORANGE);
		lblMontyHallPick.setFont(new Font("Raanana", Font.BOLD, 35));
		lblMontyHallPick.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMontyHallPick, BorderLayout.NORTH);
		
		JPanel pnlMonty = new JPanel();
		FlowLayout fl_pnlMonty = (FlowLayout) pnlMonty.getLayout();
		fl_pnlMonty.setHgap(10);
		contentPane.add(pnlMonty, BorderLayout.SOUTH);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setBackground(Color.WHITE);
		contentPane.add(pnlButtons, BorderLayout.CENTER);
		pnlButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
//Win/Lose label
		JLabel lblWinLose = new JLabel(" ");
		lblWinLose.setHorizontalAlignment(SwingConstants.LEFT);
		lblWinLose.setForeground(Color.BLUE);
		lblWinLose.setFont(new Font("Osaka", Font.BOLD, 35));
		pnlMonty.add(lblWinLose);
		
//Start Game button
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setHorizontalAlignment(SwingConstants.LEFT);
		btnStartGame.setHorizontalTextPosition(SwingConstants.CENTER);
		btnStartGame.setFont(new Font("Raanana", Font.PLAIN, 16));
		pnlMonty.add(btnStartGame);
		
//Keep Prize Button
		JButton btnIDigThis = new JButton("I dig this prize!!");
		btnIDigThis.setHorizontalAlignment(SwingConstants.LEFT);
		btnIDigThis.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIDigThis.setFont(new Font("Raanana", Font.PLAIN, 16));
		pnlMonty.add(btnIDigThis);
		btnIDigThis.setVisible(false);
		
//Play Again button
		JButton btnPlayAgain = new JButton("Play again?");
		btnPlayAgain.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayAgain.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlayAgain.setFont(new Font("Raanana", Font.PLAIN, 16));
		pnlMonty.add(btnPlayAgain);
		btnPlayAgain.setVisible(false);
		
//Prize List button
		JButton btnPrizeList = new JButton("Prize List");
		btnPrizeList.setHorizontalAlignment(SwingConstants.LEFT);
		btnPrizeList.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPrizeList.setFont(new Font("Raanana", Font.PLAIN, 16));
		pnlMonty.add(btnPrizeList);
		btnPrizeList.setVisible(false);
		
//Door buttons
		//Door 1
		JButton btnDoor1 = new JButton("Door 1");
		btnDoor1.setBackground(Color.WHITE);
		btnDoor1.setForeground(Color.DARK_GRAY);
		btnDoor1.setFont(new Font("Raanana", Font.BOLD, 20));
		btnDoor1.setBorder(new EmptyBorder(20, 100, 0, 125));
		btnDoor1.setOpaque(true);
		btnDoor1.setIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		btnDoor1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDoor1.setHorizontalTextPosition(SwingConstants.CENTER);
		pnlButtons.add(btnDoor1);
		
		//Door 2
		JButton btnDoor2 = new JButton("Door 2");
		btnDoor2.setBackground(Color.WHITE);
		btnDoor2.setForeground(Color.DARK_GRAY);
		btnDoor2.setFont(new Font("Raanana", Font.BOLD, 20));
		btnDoor2.setBorder(new EmptyBorder(20, 40, 0, 125));
		btnDoor2.setOpaque(true);
		btnDoor2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDoor2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDoor2.setIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		pnlButtons.add(btnDoor2);
		
		//Door 3
		JButton btnDoor3 = new JButton("Door 3");
		btnDoor3.setBackground(Color.WHITE);
		btnDoor3.setForeground(Color.DARK_GRAY);
		btnDoor3.setFont(new Font("Raanana", Font.BOLD, 20));
		btnDoor3.setOpaque(true);
		btnDoor3.setBorder(new EmptyBorder(20, 40, 0, 125));
		btnDoor3.setIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		btnDoor3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDoor3.setVerticalTextPosition(SwingConstants.BOTTOM);
		pnlButtons.add(btnDoor3);
		
//Disables doors until game starts
		btnDoor1.setEnabled(false);
		btnDoor2.setEnabled(false);
		btnDoor3.setEnabled(false);
		
//Prevents disabled doors from being grayed out prior to game starting
		btnDoor1.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		btnDoor2.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		btnDoor3.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
		
//Start Game Action Listener
		btnStartGame.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnStartGame.setVisible(false);
				btnDoor1.setEnabled(true);
				btnDoor2.setEnabled(true);
				btnDoor3.setEnabled(true);
			}
		});
		
//Door 1 Action Listener
		btnDoor1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				Game g1 = new Game(Door.values()[rand.nextInt(6)]);				
				btnDoor1.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource(g1.getPrizeImage())));
				
				clicks++;
				
				if(clicks == 2) 
				{
					btnIDigThis.setVisible(false);
					lblWinLose.setText("Thanks for playing!!");
					btnPlayAgain.setVisible(true);
					btnPrizeList.setVisible(true);
					
					btnDoor1.setEnabled(false);
					btnDoor2.setEnabled(false);
					btnDoor3.setEnabled(false);
				} else
				{
					btnIDigThis.setVisible(true);
		
					//Disables doors from being clicked more than once
					btnDoor1.setEnabled(false);
					btnDoor2.setEnabled(true);
					btnDoor3.setEnabled(true);
						
					//Prevents disabled doors from being grayed out
					btnDoor2.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
					btnDoor3.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
				}
			}
		});
		
//Door 2 Action Listener	
		btnDoor2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Game g2 = new Game(Door.values()[rand.nextInt(6)]);	
				btnDoor2.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource(g2.getPrizeImage())));
				
				clicks++;
				
				if(clicks == 2) 
				{
					btnIDigThis.setVisible(false);
					lblWinLose.setText("Thanks for playing!!");
					btnPlayAgain.setVisible(true);
					btnPrizeList.setVisible(true);
					
					btnDoor1.setEnabled(false);
					btnDoor2.setEnabled(false);
					btnDoor3.setEnabled(false);
				} else
				{
					btnIDigThis.setVisible(true);
					
					//Disables doors from being clicked more than once
					btnDoor2.setEnabled(false);
					btnDoor1.setEnabled(true);
					btnDoor3.setEnabled(true);
					
					//Prevents disabled doors from being grayed out
					btnDoor1.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
					btnDoor3.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));					
				}			
			}
		});
		
//Door 3 Action Listener		
		btnDoor3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Game g3 = new Game(Door.values()[rand.nextInt(6)]);	
				btnDoor3.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource(g3.getPrizeImage())));
				
				clicks++;
				
				if(clicks == 2) 
				{
					btnIDigThis.setVisible(false);
					lblWinLose.setText("Thanks for playing!!");
					btnPlayAgain.setVisible(true);
					btnPrizeList.setVisible(true);
					
					btnDoor1.setEnabled(false);
					btnDoor2.setEnabled(false);
					btnDoor3.setEnabled(false);
				} else
				{
					btnIDigThis.setVisible(true);
					
					//Disables doors from being clicked more than once
					btnDoor3.setEnabled(false);
					btnDoor1.setEnabled(true);
					btnDoor2.setEnabled(true);
					
					//Prevents disabled doors from being grayed out
					btnDoor1.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
					btnDoor2.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
				}
			}
		});
		
//Keep Prize Action Listener
		btnIDigThis.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnIDigThis.setVisible(false);
				btnPlayAgain.setVisible(true);
				btnPrizeList.setVisible(true);
				lblWinLose.setText("Thanks for playing!!");
			}
		});
		
//Play Again Action Listener
		btnPlayAgain.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				clicks = 0;
				
				btnStartGame.setVisible(true);
				btnDoor1.setEnabled(false);
				btnDoor2.setEnabled(false);
				btnDoor3.setEnabled(false);
				btnPlayAgain.setVisible(false);
				btnPrizeList.setVisible(false);
				lblWinLose.setText("");
				
				btnDoor1.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
				btnDoor2.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
				btnDoor3.setDisabledIcon(new ImageIcon(MontyHallGUI.class.getResource("/a09/doorShut.jpg")));
			}
		});	
		
//Prize List Action Listener - reads from text file to display list of available prizes
		btnPrizeList.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				btnPrizeList.setVisible(false);
				lblWinLose.setText("Look at all the things!!");
				
				try (Scanner in = new Scanner(new File(fileName)))
				{	
					while(in.hasNextLine()) 
					{
						String line = in.next();
						System.out.println(line);
						in.nextLine();
						
					}
					in.close();
					
				} catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		});
	}
}