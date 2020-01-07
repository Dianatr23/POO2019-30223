import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Diana Aceasta clasa defineste un tip de frame care extinde clasa
 *         JFrame existenta deja in Java
 */
public abstract class Frame extends JFrame {

	protected JPanel contentPanel;

	/**
	 * @param title Constructorul acestei clase
	 */
	public Frame(String title) {
		Color color3 = new Color(159, 146, 237);
		setBackground(color3);
		setTitle(title);
		setSize(600, 600);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(color3);
		add(contentPanel, BorderLayout.CENTER);
	}
}