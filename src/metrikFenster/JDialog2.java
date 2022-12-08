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

//Dezimal to Binar "Klasse Delegierung"
public class JDialog2 extends JFrame implements ActionListener {
	JTextField eingabe_my2;
	JTextField ausgabe_my2;
	JButton but_ende2;
	JButton but_berechnen2;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDialog2(String string) {

		JPanel p1 = new JPanel(null);

		p1.setBackground(Color.cyan.darker());
		JLabel a1 = new JLabel("EINGABE <DEZIMAL>");
		a1.setForeground(Color.BLUE);
		a1.setBounds(55, 16, 235, 20);
		a1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my2 = new JTextField(15);
		eingabe_my2.setLocation(20, 200);
		eingabe_my2.setBounds(50, 40, 250, 30);
		eingabe_my2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p1.add(eingabe_my2);

		JLabel b1 = new JLabel("AUSGABE <BINÄR> ");
		b1.setForeground(Color.BLUE);
		b1.setBounds(55, 77, 150, 20);
		b1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my2 = new JTextField(17);
		ausgabe_my2.setForeground(Color.RED);
		ausgabe_my2.setLocation(10, 200);
		ausgabe_my2.setBounds(50, 100, 250, 30);
		ausgabe_my2.setEditable(false);

		p1.add(ausgabe_my2);
		p1.add(a1);
		p1.add(b1);

		getContentPane().add(p1);

		JButton but_berechnen2 = new JButton("berechnen");
		but_berechnen2.setBounds(80, 200, 120, 30);
		but_berechnen2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen2);
		but_berechnen2.addActionListener(this);
		p1.add(but_berechnen2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String inhalt = eingabe_my2.getText();
		inhalt = inhalt.replace('.', '.');
		int bin1 = Integer.parseInt(inhalt);
		if (bin1 > 0) {
			ausgabe_my2.setText(Integer.toBinaryString(bin1));
			ausgabe_my2.getText();
			eingabe_my2.getText();
		} else {
			ausgabe_my2.setText("Nicht korrekte dezimal Zahl!");
			ausgabe_my2.getText();
			eingabe_my2.getText();
		}
	}
}
