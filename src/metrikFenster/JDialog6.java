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

//Dezimal to Hexadezimal "Klasse Delegierung"
public class JDialog6 extends JFrame implements ActionListener {
	JTextField eingabe_my6;
	JTextField ausgabe_my6;

	JButton but_berechnen6;

	public JDialog6(String string) {
		JPanel p5 = new JPanel(null);
		p5.setBackground(Color.cyan.darker());
		JLabel a5 = new JLabel("EINGABE <DEZIMAL>");
		a5.setForeground(Color.BLUE);
		a5.setBounds(55, 16, 270, 20);
		a5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my6 = new JTextField(15);
		eingabe_my6.setLocation(20, 200);
		eingabe_my6.setBounds(50, 40, 250, 30);
		eingabe_my6.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p5.add(eingabe_my6);

		JLabel b5 = new JLabel("AUSGABE <HEXADEZIMAL> ");
		b5.setForeground(Color.BLUE);
		b5.setBounds(55, 77, 250, 20);
		b5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my6 = new JTextField(17);
		ausgabe_my6.setForeground(Color.RED);
		ausgabe_my6.setLocation(10, 200);
		ausgabe_my6.setBounds(50, 100, 250, 30);
		ausgabe_my6.setEditable(false);

		p5.add(ausgabe_my6);
		p5.add(a5);
		p5.add(b5);

		getContentPane().add(p5);

		JButton but_berechnen6 = new JButton("berechnen");
		but_berechnen6.setBounds(80, 200, 120, 30);
		but_berechnen6.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen6);
		but_berechnen6.addActionListener(this);
		p5.add(but_berechnen6);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {

		String inhalt = eingabe_my6.getText();
		inhalt = inhalt.replace('.', '.');
		int decimal3 = Integer.parseInt(inhalt);
		if (decimal3 > 0) {
			ausgabe_my6.setText(Integer.toHexString(decimal3));
			ausgabe_my6.getText();
			eingabe_my6.getText();
		} else if ((decimal3 <= 0) && (decimal3 > 1000000000)) {
			ausgabe_my6.setText("Nicht korrekte dezimal Zahl!");
			ausgabe_my6.getText();
			eingabe_my6.getText();
		}

	}

}
