import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Diana Aceasta Clasa este folosita pentru fereastra care se deschide
 *         dupa ce este apasat butonul POINTS din meniul principal
 */
public class PointsView {

	/**
	 * frame-ul ferestrei care apare dupa apasarea butonului POINTS din meniul
	 * principal
	 */
	private JFrame frame;
	/**
	 * panel-ul pe care il contine frame-ul
	 */
	private JPanel panel1;
	/**
	 * eticheta care contine textul cu detalii despre punctaj/acordarea punctajului
	 * la acest quiz
	 */
	private JLabel jlabel;

	/**
	 * Constructorul pentru aceasta clasa
	 */
	public PointsView() {
		frame = new JFrame("POINTS");
		frame.setPreferredSize(new Dimension(1400, 150));
		frame.setLocation(500, 150);

		panel1 = new JPanel();
		Color color2 = new Color(247, 202, 201);
		Color color3 = new Color(159, 146, 237);

		panel1.setBackground(color2);

		jlabel = new JLabel(
				"Fiecare dintre cele 10 intrebari are un singur raspuns corect. Odata ce a fost dat un raspuns,");
		jlabel.setFont(new Font("Arial", 1, 20));
		jlabel.setSize(new Dimension(500, 100));
		jlabel.setForeground(color3);
		panel1.add(jlabel);

		jlabel = new JLabel(
				"acesta nu se mai poate schimba. Pentru fiecare raspuns corect se va primi un punct, nota maxima fiind 10.");
		jlabel.setFont(new Font("Arial", 1, 20));
		jlabel.setSize(new Dimension(500, 100));
		jlabel.setForeground(color3);
		panel1.add(jlabel);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 1));
		mainPanel.add(panel1);

		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
	}
}
