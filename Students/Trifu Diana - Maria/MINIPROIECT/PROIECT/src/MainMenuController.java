import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * @author Diana Aceasta clasa reprezinta controller-ul meniului principal al
 *         jocului
 */
public class MainMenuController {

	/**
	 * Frame-ul meniului principal
	 */
	private JFrame frame;

	/**
	 * @param frame Constructorul ecestei clase
	 */
	public MainMenuController(MainMenuFrame frame) {
		this.frame = frame;
		frame.setStartButtonActionListener(new StartButtonActionListener());
		frame.setAboutButtonActionListener(new AboutButtonActionListener());
		frame.setPointsButtonActionListener(new PointsButtonActionListener());
	}

	/**
	 * @author Diana Actiune pe butonul START
	 */
	private class StartButtonActionListener implements ActionListener {

		/**
		 * @return Metoda care deschide fereastra cu quiz-ul dupa apasarea butonului
		 *         START din meniu
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			Model model = new Model();
			View view = new View(model);
			Controller controller = new Controller(model, view);
		}
	}

	/**
	 * @author Diana Actiune pe butonul ABOUT
	 */
	private class AboutButtonActionListener implements ActionListener {

		/**
		 * @return Metoda care deschide fereastra cu informatii despre quiz dupa
		 *         apasarea butonului ABOUT din meniu
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			AboutView view = new AboutView();

		}
	}

	/**
	 * @author Diana Actiune pe butonul POINTS
	 */
	private class PointsButtonActionListener implements ActionListener {

		/**
		 * @return Metoda care deschide fereastra cu informatii despre punctaj dupa
		 *         apasarea butonului POINTS din meniu
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			PointsView view = new PointsView();

		}
	}
}
