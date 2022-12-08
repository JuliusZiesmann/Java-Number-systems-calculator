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

//Binar to Dezimal "Klasse Delegierung"
public class JDialog3 extends JFrame implements ActionListener {
	JTextField eingabe_my3;
	JTextField ausgabe_my3;
	JButton but_ende3;
	JButton but_berechnen3;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDialog3(String string) {
		JPanel p2 = new JPanel(null);
		p2.setBackground(Color.cyan.darker());
		JLabel a2 = new JLabel("EINGABE <BINÄR>");
		a2.setForeground(Color.BLUE);
		a2.setBounds(55, 16, 235, 20);
		a2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my3 = new JTextField(15);
		eingabe_my3.setLocation(20, 200);
		eingabe_my3.setBounds(50, 40, 250, 30);
		eingabe_my3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p2.add(eingabe_my3);

		JLabel b2 = new JLabel("AUSGABE <DEZIMAL> ");
		b2.setForeground(Color.BLUE);
		b2.setBounds(55, 77, 250, 20);
		b2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my3 = new JTextField(17);
		ausgabe_my3.setForeground(Color.RED);
		ausgabe_my3.setLocation(10, 200);
		ausgabe_my3.setBounds(50, 100, 250, 30);
		ausgabe_my3.setEditable(false);

		p2.add(ausgabe_my3);
		p2.add(a2);
		p2.add(b2);

		getContentPane().add(p2);

		JButton but_berechnen3 = new JButton("berechnen");
		but_berechnen3.setBounds(80, 200, 120, 30);
		but_berechnen3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen3);
		but_berechnen3.addActionListener(this);
		p2.add(but_berechnen3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String inhalt = eingabe_my3.getText();
		inhalt = inhalt.replace('.', '.');
		int binary2 = Integer.parseInt(inhalt);

		if (binary2 >= 0) {

			String binaryString = Integer.toString(binary2);
			binaryString = binaryString.replace('.', '.');
			int decimal = Integer.parseInt(binaryString, 2);

			ausgabe_my3.setText(Integer.toString(decimal));
			ausgabe_my3.getText();
			eingabe_my3.getText();
		} else {
			ausgabe_my3.setText("Nicht korrekte dezimal Zahl!");
			ausgabe_my3.getText();
			eingabe_my3.getText();
		}
	}
}


