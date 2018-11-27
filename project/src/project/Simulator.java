package project;

import java.awt.*;
import javax.swing.*;

class Simulator extends JPanel {
	public void paint(Graphics g) {
		g.drawRect(10, 10, 300, 300);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("simulator");
		Container c = frame.getContentPane();
		
		Simulator simulator = new Simulator();
		c.add(simulator, BorderLayout.CENTER);
		
		frame.setLocation(0, 0);
		frame.setPreferredSize(new Dimension(335, 460));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}