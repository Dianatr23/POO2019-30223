
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DragDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drag Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DragBallPanel());
        frame.pack();
        frame.setVisible(true);
    }

}
