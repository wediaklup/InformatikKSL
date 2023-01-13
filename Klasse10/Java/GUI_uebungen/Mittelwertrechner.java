package Wiederholung;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Event;
import java.awt.Button;

public class Mittelwertrechner extends JFrame {

	JLabel labText;
	JTextField tfWert1, tfWert2, tfErgebnis;
	Button cmdBerechnen, cmdNeu, cmdCancel;
	Float fltWert1, fltWert2, fltErgebnis;
	Font fntFett, fntHead, fntAusgabe;

	private String strWert1 = "";
	private String strWert2 = "";
	private String strErgebnis = "";

	public Mittelwert() {
		this.setSize(415, 415);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);

		fntFett = new Font("SansSerif", 1, 14);
		fntHead = new Font("SansSerif", 1, 20);

		labText = new JLabel("Mittelwertrechner");
		labText.setForeground(new Color(127, 200, 42));
		labText.setFont(fntHead);
		labText.setBounds(10, 10, 380, 80);
		this.add(labText);

		tfWert1 = new JTextField("0");
		tfWert1.setEditable(true);
		tfWert1.setBounds(10, 100, 180, 50);
		this.add(tfWert1);

		tfWert2 = new JTextField("0");
		tfWert2.setEditable(true);
		tfWert2.setBounds(210, 100, 180, 50);
		this.add(tfWert2);

		tfErgebnis = new JTextField("0");
		tfErgebnis.setEditable(false);
		tfErgebnis.setBounds(10, 170, 380, 50);
		this.add(tfErgebnis);

		cmdBerechnen = new Button("Berechnen");
		cmdBerechnen.setBounds(10, 300, 180, 50);
		this.add(cmdBerechnen);

		cmdNeu = new Button("Felder löschen");
		cmdNeu.setBounds(210, 300, 180, 50);
		this.add(cmdNeu);

		// cmdCancel = new Button("Felder löschen");
		// cmdCancel.setBounds(210, 300, 180, 50);
		// this.add(cmdNeu);

		this.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	public boolean handleEvent(Event e) {
		if (e.target == cmdBerechnen && e.id == Event.ACTION_EVENT) {
			rechnen();
		} else if (e.target == cmdNeu && e.id == Event.ACTION_EVENT) {
			neu();
		}
		return false;
	}

	public void rechnen() {
		fltWert1 = Float.valueOf(tfWert1.getText());
		fltWert2 = Float.valueOf(tfWert2.getText());
		float a = fltWert1.floatValue(), b = fltWert2.floatValue();
		fltErgebnis = Float.valueOf((a + b) / 2);
		tfErgebnis.setText(fltErgebnis.toString());
	}

	public void neu() {
		tfWert1.setText("0");
		tfWert2.setText("0");
		tfErgebnis.setText("");
	}

	public static void main(String[] args) {
		new Mittelwertrechner();
		System.out.println("Main Ende");
	}

}
