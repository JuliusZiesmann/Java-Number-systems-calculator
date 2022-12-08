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

//Oktal to Dezimal "Klasse Delegierung"
public class JDialog4 extends JFrame implements ActionListener {
	JTextField eingabe_my4;
	JTextField ausgabe_my4;
	JButton but_ende4;
	JButton but_berechnen4;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDialog4(String string) {
		JPanel p3 = new JPanel(null);
		p3.setBackground(Color.cyan.darker());
		JLabel a3 = new JLabel("EINGABE <OKTAL>");
		a3.setForeground(Color.BLUE);
		a3.setBounds(55, 16, 235, 20);
		a3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my4 = new JTextField(15);
		eingabe_my4.setLocation(20, 200);
		eingabe_my4.setBounds(50, 40, 250, 30);
		eingabe_my4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p3.add(eingabe_my4);

		JLabel b3 = new JLabel("AUSGABE <DEZIMAL> ");
		b3.setForeground(Color.BLUE);
		b3.setBounds(55, 77, 250, 20);
		b3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my4 = new JTextField(17);
		ausgabe_my4.setForeground(Color.RED);
		ausgabe_my4.setLocation(10, 200);
		ausgabe_my4.setBounds(50, 100, 250, 30);
		ausgabe_my4.setEditable(false);

		p3.add(ausgabe_my4);
		p3.add(a3);
		p3.add(b3);

		getContentPane().add(p3);

		JButton but_berechnen4 = new JButton("berechnen");
		but_berechnen4.setBounds(80, 200, 120, 30);
		but_berechnen4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen4);
		but_berechnen4.addActionListener(this);
		p3.add(but_berechnen4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String inhalt = eingabe_my4.getText();
		inhalt = inhalt.replace('.', '.');
		int oktal = Integer.parseInt(inhalt);

		if (oktal >= 0) {

			String oktalString = Integer.toString(oktal);
			oktalString = oktalString.replace('.', '.');
			int decimal1 = Integer.parseInt(oktalString, 8);

			ausgabe_my4.setText(Integer.toString(decimal1));
			ausgabe_my4.getText();
			eingabe_my4.getText();
		} else {
			ausgabe_my4.setText("Nicht korrekte dezimal Zahl!");
			ausgabe_my4.getText();
			eingabe_my4.getText();
		}

	}
}
