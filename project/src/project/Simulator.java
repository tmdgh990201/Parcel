package project;

import javax.swing.*;
import java.awt.*;

public class Simulator extends JFrame
{
	Simulator() {
		setTitle("Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(515, 515);
		setVisible(true);
	}
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawLine(0, 400, 100, 400);
			g.drawLine(400, 100, 500, 100);
			
			int a = (int)(Math.random()*4 + 1);
			int b = 300/(a*3);
			System.out.println(b);			

			for (int i = 1; i < (a+3); i++) {
				g.drawLine(100, 400, 100, 400-b);
				g.drawLine(100, 400-b, 100+b, 400-b);
			}
		}
	}
	
	public static void main(String[] args)
	{
		new Simulator();
	}
}