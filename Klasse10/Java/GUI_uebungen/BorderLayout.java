package Wiederholung;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		Container c = frame.getContentPane();
		c.add(new JLabel("North"), BorderLayout.NORTH);
		c.add(new JLabel("East"), BorderLayout.EAST);
		c.add(new JLabel("South"), BorderLayout.SOUTH);
		c.add(new JLabel("West"), BorderLayout.WEST);
		frame.setVisible(true);
	}

}
