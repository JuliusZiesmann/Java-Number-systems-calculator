package metrikFenster;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;

//Hexadezimal to Dezimal "Klasse Delegierung"
public class JDialog5 extends JFrame implements ActionListener {
	JTextField eingabe_my5;
	JTextField ausgabe_my5;
	JButton but_ende5;
	JButton but_berechnen5;

	public JDialog5(String string) {
		JPanel p4 = new JPanel(null);
		p4.setBackground(Color.cyan.darker());
		JLabel a4 = new JLabel("EINGABE <HEXADEZIMAL>");
		a4.setForeground(Color.BLUE);
		a4.setBounds(55, 16, 270, 20);
		a4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my5 = new JTextField(15);
		eingabe_my5.setLocation(20, 200);
		eingabe_my5.setBounds(50, 40, 250, 30);
		eingabe_my5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p4.add(eingabe_my5);

		JLabel b4 = new JLabel("AUSGABE <DEZIMAL> ");
		b4.setForeground(Color.BLUE);
		b4.setBounds(55, 77, 250, 20);
		b4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my5 = new JTextField(17);
		ausgabe_my5.setForeground(Color.RED);
		ausgabe_my5.setLocation(10, 200);
		ausgabe_my5.setBounds(50, 100, 250, 30);
		ausgabe_my5.setEditable(false);

		p4.add(ausgabe_my5);
		p4.add(a4);
		p4.add(b4);

		getContentPane().add(p4);

		JButton but_berechnen5 = new JButton("berechnen");
		but_berechnen5.setBounds(80, 200, 120, 30);
		but_berechnen5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen5);
		but_berechnen5.addActionListener(this);
		p4.add(but_berechnen5);
		;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		String inhalt = eingabe_my5.getText();
		String decimal2 = Integer.toString(Integer.parseInt(inhalt, 16));

		ausgabe_my5.setText(decimal2);
		ausgabe_my5.getText();
		eingabe_my5.getText();

	}

}
