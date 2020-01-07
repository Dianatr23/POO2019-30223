import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * @author Diana Aceasta clasa reprezinta view-ul meniului care se deschide la
 *         rularea aplicatiei
 */
public class MainMenuFrame extends Frame {

	/**
	 * Sunt declarate 3 butoane care deschid 3 ferestre: Butonul care deschide
	 * fereastra de START care porneste quiz-ul
	 */
	private JButton btnStart;
	/**
	 * Butonul care deschide fereastra POINTS care informeaza jucatorul despre
	 * punctajul maxim care poate fi acordat, dar si modul in care va fi punctat in
	 * functie de raspunsurile date
	 */
	private JButton btnPoints;
	/**
	 * Butonul care deschide fereastra ABOUT care informeaza jucatorul in legatura
	 * cu detalii despre quiz-ul pe care urmeaza sa il rezolve
	 */
	private JButton btnAbout;

	/**
	 * @param title Constructorul acestei clase
	 */
	public MainMenuFrame(String title) {
		super(title);
		Color color2 = new Color(247, 202, 201);
		Color color3 = new Color(159, 146, 237);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		btnStart = new JButton("Start");
		btnStart.setBackground(color3);
		btnStart.setForeground(color2);
		slPanel.putConstraint(SpringLayout.NORTH, btnStart, 265, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnStart, 93, SpringLayout.WEST, pan);
		pan.add(btnStart);

		btnPoints = new JButton("Points");
		btnPoints.setBackground(color3);
		btnPoints.setForeground(color2);
		slPanel.putConstraint(SpringLayout.NORTH, btnPoints, 165, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnPoints, 93, SpringLayout.WEST, pan);
		pan.add(btnPoints);

		btnAbout = new JButton("About");
		btnAbout.setBackground(color3);
		btnAbout.setForeground(color2);
		slPanel.putConstraint(SpringLayout.NORTH, btnAbout, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAbout, 93, SpringLayout.WEST, pan);
		pan.add(btnAbout);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	/**
	 * @param a
	 */
	public void setStartButtonActionListener(ActionListener a) {
		btnStart.addActionListener(a);
	}

	/**
	 * @param a
	 */
	public void setPointsButtonActionListener(ActionListener a) {
		btnPoints.addActionListener(a);
	}

	/**
	 * @param a
	 */
	public void setAboutButtonActionListener(ActionListener a) {
		btnAbout.addActionListener(a);
	}
}