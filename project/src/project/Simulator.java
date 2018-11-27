package project;

import javax.swing.*;
import java.awt.*;

public class Simulator extends JFrame
{
	Simulator() {
		setTitle("Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(515, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawLine(0, 400, 50, 400);
			g.drawLine(450, 100, 500, 100);
		}
	}
	
	public static void main(String[] args)
	{
		new Simulator();
	}
}