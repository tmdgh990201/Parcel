package project;

import java.awt.*;
import javax.swing.*;

public class Simulator {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Simulator");
		frame.setBounds(0, 0, 320, 420);
		frame.setLayout(new BorderLayout());     
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		
		// �г�1 ����
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(320, 310));
		panel1.setLayout(new FlowLayout());

		// �г�2 ����
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 3));
		panel2.add(new JButton("LEFT"));
		panel2.add(new JButton("FORWARD"));
		panel2.add(new JButton("RIGHT"));
		// �����ӿ� �г� ���
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}