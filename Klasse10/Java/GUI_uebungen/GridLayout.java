package Wiederholung;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4, 5));
		Container c = frame.getContentPane();
		for (int i = 0; i < 18; i++) {
			c.add(new JButton(String.valueOf(i)));
		}
		
		frame.setVisible(true);

	}

}
