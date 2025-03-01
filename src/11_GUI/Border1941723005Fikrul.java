package ManajemenLayout;

/**
 *
 * @author muhammadFikrulHaqi
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border1941723005Fikrul extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    public Border1941723005Fikrul() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JButton("1"), BorderLayout.NORTH);
        panel.add(new JButton("2"), BorderLayout.WEST);
        panel.add(new JButton("3"), BorderLayout.CENTER);
        panel.add(new JButton("4"), BorderLayout.EAST);
        panel.add(new JButton("5"), BorderLayout.SOUTH);

        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }

}
