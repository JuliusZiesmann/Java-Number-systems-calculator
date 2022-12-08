package metrikFenster;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MetrikSystemen extends JFrame implements ActionListener {
	public JComboBox<String> cmb1;
	public JButton but_ende;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		MetrikSystemen ms = new MetrikSystemen();
		ms.setVisible(true);
		SwingUtilities.invokeLater(() -> new MetrikSystemen());
		final MetrikSystemen instance = new MetrikSystemen();

		instance.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));

		instance.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Ende")) {
			int antwort = JOptionPane.showConfirmDialog(this, "Wollen Sie das Programm wirklich beenden?", "beenden",
					JOptionPane.OK_CANCEL_OPTION);
			if (antwort == JOptionPane.OK_OPTION) {
				System.exit(0);

			}
		}
	}

	public class BildLaden {
	}

	private void init() {
		setSize(450, 340);
		setLocationRelativeTo(null);
		setTitle("Umrechnung von Zahlensystemen");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel l1 = new JLabel(showImg());
		add(l1);

	}

	private ImageIcon showImg() {
		BufferedImage icon = null;
		try {
			icon = ImageIO.read(new File("grf/zahlsystemen.jpg"));
		} catch (IOException e) {
			e.printStackTrace();

		}
		return new ImageIcon(icon);
	}

	// Konstruktor
	public MetrikSystemen() {
		init();
		creatheNorth();
		creatheSouth();

	}

	private void creatheSouth() {
		JPanel s = new JPanel();
		JButton but_ende = new JButton("Ende");

		but_ende.addActionListener(this);
		s.add(but_ende);
		getContentPane().add(BorderLayout.SOUTH, s);
	}

	private void creatheNorth() {
		JPanel n = new JPanel();

		String array[] = { "Wählen Sie bitte, was Sie umwandeln möchten!", "Dezimal in Binär", "Dezimal in Oktal",
				"Binär in Dezimal", "Oktal in Dezimal", "Hexadezimal in Dezimal", "Dezimal in Hexadezimal" };
		JComboBox<String> cmb1 = new JComboBox<String>(array);

		cmb1.setBounds(300, 100, 90, 5);
		n.add(cmb1);
		getContentPane().add(BorderLayout.NORTH, n);
		cmb1.setSelectedIndex(0);

		cmb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cmb1.getSelectedItem() == "Dezimal in Oktal") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog jd2 = new JDialog("DEZIMAL to OKTAL");
					jd2.setSize(400, 300);

					jd2.setLocationRelativeTo(null);

					jd2.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd2.setVisible(true);

				} else if (cmb1.getSelectedItem() == "Dezimal in Binär") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog2 jd3 = new JDialog2("DEZIMAL to OKTAL");

					jd3.setSize(400, 300);

					jd3.setLocationRelativeTo(null);
					jd3.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd3.setVisible(true);

				} else if (cmb1.getSelectedItem() == "Binär in Dezimal") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog3 jd4 = new JDialog3("BINAR to DEZIMAL");

					jd4.setSize(400, 300);

					jd4.setLocationRelativeTo(null);
					jd4.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd4.setVisible(true);

				} else if (cmb1.getSelectedItem() == "Oktal in Dezimal") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog4 jd5 = new JDialog4("OKTAL to DEZIMAL");

					jd5.setSize(400, 300);

					jd5.setLocationRelativeTo(null);
					jd5.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd5.setVisible(true);

				} else if (cmb1.getSelectedItem() == "Dezimal in Hexadezimal") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog6 jd7 = new JDialog6("DEZIMAL to HEXADEZIMAL");

					jd7.setSize(400, 300);

					jd7.setLocationRelativeTo(null);
					jd7.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd7.setVisible(true);

				} else if (cmb1.getSelectedItem() == "Hexadezimal in Dezimal") {
					JOptionPane.showMessageDialog(null, cmb1.getSelectedItem().toString() + "  wurde gewählt");
					JDialog5 jd6 = new JDialog5("HEXADEZIMAL to DEZIMAL");

					jd6.setSize(400, 300);

					jd6.setLocationRelativeTo(null);
					jd6.setIconImage(Toolkit.getDefaultToolkit().getImage(new File("grf/Converter ZS.jpg").toString()));
					jd6.setVisible(true);

				} else {

				}
				return;

			}

		});

	}

}
