import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;

/**
 * @author Diana Aceasta clasa reprezinta view-ul quiz-ului
 */
public class View {

	/**
	 * modelul proiectului
	 */
	private Model model;
	/**
	 * frame-ul quiz-ului
	 */
	private JFrame frame;
	/**
	 * primul panle din frame
	 */
	private JPanel panel1;
	/**
	 * al doilea panel din frame
	 */
	private JPanel panel2;
	/**
	 * butonul corespunzator primei variante de raspuns
	 */
	private JButton r1;
	/**
	 * butonul corespunzator primei variante de raspuns
	 */
	private JButton r2;
	/**
	 * butonul corespunzator celei de-a doua variante de raspuns
	 */
	private JButton r3;
	/**
	 * butonul corespunzator celei de-a treia variante de raspuns
	 */
	private JButton r4;
	/**
	 * eticheta care contine textul corespunzator intrebarii
	 */
	private JLabel q;
	/**
	 * butonul de NEXT(treci la intrebarea urmatoare)
	 */
	private JButton next;
	/**
	 * butonul de PREVIOUS(treci la intrebarea precedenta)
	 */
	private JButton previous;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la prima intrebare
	 */
	private JButton a1;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a doua intrebare
	 */
	private JButton a2;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a treia intrebare
	 */
	private JButton a3;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a patra intrebare
	 */
	private JButton a4;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a cincea intrebare
	 */
	private JButton a5;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a sasea intrebare
	 */
	private JButton a6;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a saptea intrebare
	 */
	private JButton a7;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a opta intrebare
	 */
	private JButton a8;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a noua intrebare
	 */
	private JButton a9;
	/**
	 * butonul care precizeaza daca s-a dat sau nu un raspuns la a zecea intrebare
	 */
	private JButton a10;

	/**
	 * @param model Se initializeaza campurile, astfel realizandu-se view-ul
	 *              quiz-ului
	 */
	public View(Model model) {
		this.model = model;
		int i = 0;
		int a = 0;

		frame = new JFrame("QUIZ");
		frame.setPreferredSize(new Dimension(810, 500));
		frame.setLocation(650, 150);

		panel1 = new JPanel();
		panel2 = new JPanel();

		Color color2 = new Color(247, 202, 201);
		Color color3 = new Color(159, 146, 237);

		panel1.setBackground(color2);
		panel2.setBackground(color2);

		SpringLayout slPanel = new SpringLayout();
		panel1.setLayout(slPanel);
		panel2.setLayout(slPanel);

		q = new JLabel(model.getStringQuestion(i));
		q.setFont(new Font("Arial", 1, 20));
		q.setSize(new Dimension(0, 50));
		q.setForeground(color3);
		slPanel.putConstraint(SpringLayout.NORTH, q, 100, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, q, 0, SpringLayout.WEST, panel1);
		panel1.add(q);

		r1 = new JButton(model.getStringAnswer(a));
		r1.setPreferredSize(new Dimension(120, 50));
		r1.setBackground(color3);
		r1.setForeground(color2);
		r1.setFont(new Font("Arial", 1, 20));
		slPanel.putConstraint(SpringLayout.NORTH, r1, 60, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, r1, 258, SpringLayout.WEST, panel2);
		panel2.add(r1);

		r2 = new JButton(model.getStringAnswer(a + 1));
		r2.setPreferredSize(new Dimension(120, 50));
		r2.setBackground(color3);
		r2.setForeground(color2);
		r2.setFont(new Font("Arial", 1, 20));
		slPanel.putConstraint(SpringLayout.NORTH, r2, 60, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, r2, 388, SpringLayout.WEST, panel2);
		panel2.add(r2);

		r3 = new JButton(model.getStringAnswer(a + 2));
		r3.setPreferredSize(new Dimension(120, 50));
		r3.setBackground(color3);
		r3.setForeground(color2);
		r3.setFont(new Font("Arial", 1, 20));
		slPanel.putConstraint(SpringLayout.NORTH, r3, 0, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, r3, 258, SpringLayout.WEST, panel2);
		panel2.add(r3);

		r4 = new JButton(model.getStringAnswer(a + 3));
		r4.setPreferredSize(new Dimension(120, 50));
		r4.setBackground(color3);
		r4.setForeground(color2);
		r4.setFont(new Font("Arial", 1, 20));
		slPanel.putConstraint(SpringLayout.NORTH, r4, 0, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, r4, 388, SpringLayout.WEST, panel2);
		panel2.add(r4);

		next = new JButton("Next Question");
		next.setPreferredSize(new Dimension(170, 30));
		next.setBackground(color3);
		next.setForeground(color2);
		next.setFont(new Font("Arial", 1, 15));
		slPanel.putConstraint(SpringLayout.NORTH, next, 180, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, next, 600, SpringLayout.WEST, panel2);
		panel2.add(next);

		previous = new JButton("Previous Question");
		previous.setPreferredSize(new Dimension(170, 30));
		previous.setBackground(color3);
		previous.setForeground(color2);
		previous.setFont(new Font("Arial", 1, 15));
		slPanel.putConstraint(SpringLayout.NORTH, previous, 180, SpringLayout.NORTH, panel2);
		slPanel.putConstraint(SpringLayout.WEST, previous, 20, SpringLayout.WEST, panel2);
		panel2.add(previous);

		a1 = new JButton("?");
		a1.setPreferredSize(new Dimension(45, 30));
		a1.setBackground(color3);
		a1.setForeground(color2);
		a1.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a1, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a1, 140, SpringLayout.WEST, panel1);
		panel1.add(a1);

		a2 = new JButton("?");
		a2.setPreferredSize(new Dimension(45, 30));
		a2.setBackground(color3);
		a2.setForeground(color2);
		a2.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a2, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a2, 190, SpringLayout.WEST, panel1);
		panel1.add(a2);

		a3 = new JButton("?");
		a3.setPreferredSize(new Dimension(45, 30));
		a3.setBackground(color3);
		a3.setForeground(color2);
		a3.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a3, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a3, 240, SpringLayout.WEST, panel1);
		panel1.add(a3);

		a4 = new JButton("?");
		a4.setPreferredSize(new Dimension(45, 30));
		a4.setBackground(color3);
		a4.setForeground(color2);
		a4.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a4, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a4, 290, SpringLayout.WEST, panel1);
		panel1.add(a4);

		a5 = new JButton("?");
		a5.setPreferredSize(new Dimension(45, 30));
		a5.setBackground(color3);
		a5.setForeground(color2);
		a5.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a5, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a5, 340, SpringLayout.WEST, panel1);
		panel1.add(a5);

		a6 = new JButton("?");
		a6.setPreferredSize(new Dimension(45, 30));
		a6.setBackground(color3);
		a6.setForeground(color2);
		a6.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a6, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a6, 390, SpringLayout.WEST, panel1);
		panel1.add(a6);

		a7 = new JButton("?");
		a7.setPreferredSize(new Dimension(45, 30));
		a7.setBackground(color3);
		a7.setForeground(color2);
		a7.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a7, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a7, 440, SpringLayout.WEST, panel1);
		panel1.add(a7);

		a8 = new JButton("?");
		a8.setPreferredSize(new Dimension(45, 30));
		a8.setBackground(color3);
		a8.setForeground(color2);
		a8.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a8, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a8, 490, SpringLayout.WEST, panel1);
		panel1.add(a8);

		a9 = new JButton("?");
		a9.setPreferredSize(new Dimension(45, 30));
		a9.setBackground(color3);
		a9.setForeground(color2);
		a9.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a9, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a9, 540, SpringLayout.WEST, panel1);
		panel1.add(a9);

		a10 = new JButton("?");
		a10.setPreferredSize(new Dimension(45, 30));
		a10.setBackground(color3);
		a10.setForeground(color2);
		a10.setFont(new Font("Arial", 1, 13));
		slPanel.putConstraint(SpringLayout.NORTH, a10, 0, SpringLayout.NORTH, panel1);
		slPanel.putConstraint(SpringLayout.WEST, a10, 590, SpringLayout.WEST, panel1);
		panel1.add(a10);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 1));
		mainPanel.add(panel1);
		mainPanel.add(panel2);

		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
	}

	/**
	 * @param i
	 * @return Returneaza intrebarea curenta
	 */
	public String getQuestion(int i) {
		return model.getStringQuestion(i);
	}

	/**
	 * @param action
	 */
	public void r1Listener(ActionListener action) {
		this.r1.addActionListener(action);
	}

	/**
	 * @param action
	 */
	public void r2Listener(ActionListener action) {
		this.r2.addActionListener(action);
	}

	/**
	 * @param action
	 */
	public void r3Listener(ActionListener action) {
		this.r3.addActionListener(action);
	}

	/**
	 * @param action
	 */
	public void r4Listener(ActionListener action) {
		this.r4.addActionListener(action);
	}

	/**
	 * @param action
	 */
	public void nextListener(ActionListener action) {
		this.next.addActionListener(action);
	}

	/**
	 * @param action
	 */
	public void prevListener(ActionListener action) {
		this.previous.addActionListener(action);
	}

	/**
	 * @return label-ul intrebarii
	 */
	public JLabel getQ() {
		return this.q;
	}

	/**
	 * @return butonul primului raspuns al intreabrii
	 */
	public JButton getR1() {
		return this.r1;
	}

	/**
	 * @return butonul celui de-al doilea raspuns al intreabrii
	 */
	public JButton getR2() {
		return this.r2;
	}

	/**
	 * @return butonul celui de-al treilea raspuns al intreabrii
	 */
	public JButton getR3() {
		return this.r3;
	}

	/**
	 * @return butonul celui de-al patrulea raspuns al intreabrii
	 */
	public JButton getR4() {
		return this.r4;
	}

	/**
	 * @return frame-ul
	 */
	public JFrame getFrame() {
		return this.frame;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la prima intrebare
	 */
	public JButton getA1() {
		return this.a1;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a doua
	 *         intrebare
	 */
	public JButton getA2() {
		return this.a2;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a treia
	 *         intrebare
	 */
	public JButton getA3() {
		return this.a3;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a patra
	 *         intrebare
	 */
	public JButton getA4() {
		return this.a4;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a cincea
	 *         intrebare
	 */
	public JButton getA5() {
		return this.a5;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a sasea
	 *         intrebare
	 */
	public JButton getA6() {
		return this.a6;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a saptea
	 *         intrebare
	 */
	public JButton getA7() {
		return this.a7;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a opta
	 *         intrebare
	 */
	public JButton getA8() {
		return this.a8;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a noua
	 *         intrebare
	 */
	public JButton getA9() {
		return this.a9;
	}

	/**
	 * @return butonul care indica daca s-a dat un raspuns sau nu la cea de-a zecea
	 *         intrebare
	 */
	public JButton getA10() {
		return this.a10;
	}

	/**
	 * @return butonul care trece la intrebarea urmatoare
	 */
	public JButton getNext() {
		return this.next;
	}
}