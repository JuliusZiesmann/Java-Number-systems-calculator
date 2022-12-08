package metrikFenster;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Dezimal to Oktal "Klasse Delegierung"
public class JDialog extends JFrame implements ActionListener {
	JTextField eingabe_my;
	JTextField ausgabe_my;
	JButton but_ende1;
	JButton but_berechnen1;

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 1L;

	public JDialog(String string) {
		
		

		JPanel p = new JPanel(null);

		p.setBackground(Color.cyan.darker());
		JLabel a = new JLabel("EINGABE <DEZIMAL>");
		a.setForeground(Color.BLUE);
		a.setBounds(55, 16, 235, 20);
		a.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		eingabe_my = new JTextField(15);
		eingabe_my.setLocation(20, 200);
		eingabe_my.setBounds(50, 40, 250, 30);
		eingabe_my.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		p.add(eingabe_my);

		JLabel b = new JLabel("AUSGABE <OKTAL> ");
		b.setForeground(Color.BLUE);
		b.setBounds(55, 77, 150, 20);
		b.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));

		ausgabe_my = new JTextField(17);
		ausgabe_my.setForeground(Color.RED);
		ausgabe_my.setLocation(10, 200);
		ausgabe_my.setBounds(50, 100, 250, 30);
		ausgabe_my.setEditable(false);

		p.add(ausgabe_my);
		p.add(a);
		p.add(b);

		getContentPane().add(p);

		JButton but_berechnen1 = new JButton("berechnen");
		but_berechnen1.setBounds(80, 200, 120, 30);
		but_berechnen1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
		getRootPane().setDefaultButton(but_berechnen1);
		but_berechnen1.addActionListener(this);
		p.add(but_berechnen1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inhalt = eingabe_my.getText();
		inhalt = inhalt.replace('.', '.');
		int bin = Integer.parseInt(inhalt);
		if (bin > 0) {
			ausgabe_my.setText(Integer.toOctalString(bin));
			ausgabe_my.getText();
			eingabe_my.getText();
		} else if ((bin <= 0) && (bin > 1000000000)) {
			ausgabe_my.setText("Nicht korrekte dezimal Zahl!");
			ausgabe_my.getText();
			eingabe_my.getText();
		}

	}

}
