import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Diana Aceasta clasa reprezinta controller-ul proiectului
 */
public class Controller {

	/**
	 * modelul proiectului
	 */
	private Model model;
	/**
	 * view-ul proiectului
	 */
	private View view;
	/**
	 * un intreg care ne ajuta sa indentificam la ce intrabare ne aflam intr-un
	 * anumit moment
	 */
	private int i;
	/**
	 * frame-ul ferestrei care se deschide dupa finalizarea quiz-ului
	 */
	private JFrame frame1;
	/**
	 * o eticheta care contine punctajul obtinut de jucator la quiz
	 */
	private JLabel scor;
	/**
	 * o eticheta care contine o parte din textul afisat la finalul quiz-ului
	 */
	private JLabel jlabel;
	/**
	 * panel-ul pe care il contine frame-ul
	 */
	private JPanel panel1;

	/**
	 * @param model modelul proiectului
	 * @param view  view-ul proiectului Constructorul acestei clase
	 */
	public Controller(Model model, View view) {
		this.i = 0;
		this.model = model;
		this.view = view;
		view.r1Listener(new R1ButtonActionListener());
		view.r2Listener(new R2ButtonActionListener());
		view.r3Listener(new R3ButtonActionListener());
		view.r4Listener(new R4ButtonActionListener());
		view.nextListener(new NextButtonActionListener());
		view.prevListener(new PrevButtonActionListener());
	}

	int s = 0;
	int l = 0;
	int m = 0;
	int n = 0;
	int o = 0;

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul de
	 *         raspuns R1
	 */
	private class R1ButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de raspuns R1
		 * @return descrie comportamentul aplicatiei dupa apasarea butonului R1 in
		 *         functie de intrebarea actuala dar si de numarul precedent de apasari
		 *         a unui buton de raspuns pentru aceasta intrebare
		 */
		public void actionPerformed(ActionEvent e) {
			if (i == 0)
				view.getA1().setText("!");
			else if (i == 3)
				view.getA4().setText("!");
			else if (i == 4)
				view.getA5().setText("!");
			else if (i == 5)
				view.getA6().setText("!");
			else if (i == 8)
				view.getA9().setText("!");
			else if (i == 2) {
				view.getA3().setText("!");
			} else if (i == 6) {
				view.getA7().setText("!");
			} else if (i == 1 && view.getA2().getText() == "?") {
				s = s + 1;
				view.getA2().setText("!");
			} else if (i == 7 && view.getA8().getText() == "?") {
				s = s + 1;
				view.getA8().setText("!");
			} else if (i == 9 && view.getA10().getText() == "?") {
				s = s + 1;
				view.getA10().setText("!");
			}
		}
	}

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul de
	 *         raspuns R2
	 */
	private class R2ButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de raspuns R2
		 * @return descrie comportamentul aplicatiei dupa apasarea butonului R2 in
		 *         functie de intrebarea actuala dar si de numarul precedent de apasari
		 *         a unui buton de raspuns pentru aceasta intrebare
		 */
		public void actionPerformed(ActionEvent e) {
			if (i == 0)
				view.getA1().setText("!");
			else if (i == 1)
				view.getA2().setText("!");
			else if (i == 5)
				view.getA6().setText("!");
			else if (i == 7)
				view.getA8().setText("!");
			else if (i == 9)
				view.getA10().setText("!");
			else if (i == 2) {
				view.getA3().setText("!");
			} else if (i == 6) {
				view.getA7().setText("!");
			} else if (i == 3 && view.getA4().getText() == "?") {
				s = s + 1;
				view.getA4().setText("!");
			} else if (i == 8 && view.getA9().getText() == "?") {
				s = s + 1;
				view.getA9().setText("!");
			} else if (i == 4 && view.getA5().getText() == "?") {
				s = s + 1;
				view.getA5().setText("!");
			}
		}
	}

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul de
	 *         raspuns R3
	 */
	private class R3ButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de raspuns R3
		 * @return descrie comportamentul aplicatiei dupa apasarea butonului R3 in
		 *         functie de intrebarea actuala dar si de numarul precedent de apasari
		 *         a unui buton de raspuns pentru aceasta intrebare
		 */
		public void actionPerformed(ActionEvent e) {
			if (i == 2)
				view.getA3().setText("!");
			else if (i == 1)
				view.getA2().setText("!");
			else if (i == 3)
				view.getA4().setText("!");
			else if (i == 4)
				view.getA5().setText("!");
			else if (i == 6)
				view.getA7().setText("!");
			else if (i == 7)
				view.getA8().setText("!");
			else if (i == 8)
				view.getA9().setText("!");
			else if (i == 9)
				view.getA10().setText("!");
			else if (i == 0 && view.getA1().getText() == "?") {
				s = s + 1;
				view.getA1().setText("!");
			} else if (i == 5 && view.getA6().getText() == "?") {
				s = s + 1;
				view.getA6().setText("!");
			}
		}
	}

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul de
	 *         raspuns R4
	 */
	private class R4ButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de raspuns R4
		 * @return descrie comportamentul aplicatiei dupa apasarea butonului R4 in
		 *         functie de intrebarea actuala dar si de numarul precedent de apasari
		 *         a unui buton de raspuns pentru aceasta intrebare
		 */
		public void actionPerformed(ActionEvent e) {
			if (i == 0)
				view.getA1().setText("!");
			else if (i == 1)
				view.getA2().setText("!");
			else if (i == 3)
				view.getA4().setText("!");
			else if (i == 4)
				view.getA5().setText("!");
			else if (i == 5)
				view.getA6().setText("!");
			else if (i == 7)
				view.getA8().setText("!");
			else if (i == 8)
				view.getA9().setText("!");
			else if (i == 9)
				view.getA10().setText("!");
			else if (i == 2 && view.getA3().getText() == "?") {
				s = s + 1;
				view.getA3().setText("!");
			} else if (i == 6 && view.getA7().getText() == "?") {
				s = s + 1;
				view.getA7().setText("!");
			}
		}
	}

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul NEXT
	 */
	private class NextButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de NEXT
		 * @return descrie comportamentul aplicatiei dupa apasarea butonului NEXT(trece
		 *         la intrebarea urmatoare pentru oricare dintre intrebari, mai putin
		 *         pentru ultima) in cazul in care ne aflam la ultima intrebare va
		 *         aparea in loc de NEXT, SUBMIT, iar apasarea lui va duce la
		 *         finalizarea quiz-ului si afisarea punctajului obtinut de jucator
		 */
		public void actionPerformed(ActionEvent e) {
			if (l != 36) {
				l = l + 4;
				i = i + 1;
				view.getQ().setText(model.getStringQuestion(i));
				view.getR1().setText(model.getStringAnswer(l));
				view.getR2().setText(model.getStringAnswer(l + 1));
				view.getR3().setText(model.getStringAnswer(l + 2));
				view.getR4().setText(model.getStringAnswer(l + 3));
				if (l == 36)
					view.getNext().setText("Submit");
			} else {
				view.getNext().setText("Submit");
				Color color2 = new Color(247, 202, 201);
				Color color3 = new Color(159, 146, 237);

				frame1 = new JFrame("RASPUNS QUIZ");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setPreferredSize(new Dimension(500, 100));
				frame1.setLocation(800, 250);

				panel1 = new JPanel();
				panel1.setBackground(color2);

				jlabel = new JLabel("AI OBTINUT NOTA: ");
				jlabel.setFont(new Font("Arial", 1, 20));
				jlabel.setSize(new Dimension(100, 50));
				jlabel.setForeground(color3);
				panel1.add(jlabel);

				scor = new JLabel(Integer.toString(s));
				scor.setFont(new Font("Arial", 1, 20));
				scor.setSize(new Dimension(100, 50));
				scor.setBackground(color2);
				scor.setForeground(color3);
				panel1.add(scor);

				JPanel panel = new JPanel();
				panel.setLayout(new GridLayout(0, 1));
				panel.add(panel1);

				frame1.setContentPane(panel);
				frame1.setVisible(true);
				frame1.pack();
			}

		}
	}

	/**
	 * @author Diana Aceasta clasa contine metoda de actiune pentru butonul PREVIOUS
	 */
	private class PrevButtonActionListener implements ActionListener {
		/**
		 * @param e ->clik pe butonul de PREVIOUS
		 * @return descrie comportamentul aplicatie dupa apasarea butonului PREVIOUS
		 *         care te duce la intrebarea precedenta
		 */
		public void actionPerformed(ActionEvent e) {
			if (l != 0) {
				l = l - 4;
				i = i - 1;
				view.getQ().setText(model.getStringQuestion(i));
				view.getR1().setText(model.getStringAnswer(l));
				view.getR2().setText(model.getStringAnswer(l + 1));
				view.getR3().setText(model.getStringAnswer(l + 2));
				view.getR4().setText(model.getStringAnswer(l + 3));
			}
			if (l != 36)
				view.getNext().setText("Next Question ");

		}
	}
}
