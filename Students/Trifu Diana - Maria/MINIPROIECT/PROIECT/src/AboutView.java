import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Diana Aceasta Clasa este folosita pentru fereastra care se deschide
 *         dupa ce este apasat butonul ABOUT din meniul principal
 */
public class AboutView {
	/**
	 * frame-ul ferestrei care se deschide dupa apasarea butonului ABOUT din meniul
	 * principal
	 */
	private JFrame frame;
	/**
	 * panel-ul pe care il contine frame-ul
	 */
	private JPanel panel1;
	/**
	 * eticheta care contine textul cu informatii despre acest quiz
	 */
	private JLabel jlabel;

	/**
	 * Constructorul acestei clase
	 */
	public AboutView() {

		frame = new JFrame("ABOUT THE QUIZ");
		frame.setPreferredSize(new Dimension(810, 150));
		frame.setLocation(650, 150);

		panel1 = new JPanel();

		Color color2 = new Color(247, 202, 201);
		Color color3 = new Color(159, 146, 237);

		panel1.setBackground(color2);

		jlabel = new JLabel("Acest quiz contine 10 intrebari cu scopul de a il ajuta pe jucator");
		jlabel.setFont(new Font("Arial", 1, 20));
		jlabel.setSize(new Dimension(300, 100));
		jlabel.setForeground(color3);
		panel1.add(jlabel);

		jlabel = new JLabel("sa isi verifice cunostintele sale in domeniul algoritmilor fundamentali.");
		jlabel.setFont(new Font("Arial", 1, 20));
		jlabel.setSize(new Dimension(300, 100));
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
