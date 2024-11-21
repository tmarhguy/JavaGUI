import java.awt.*;
import javax.swing.*;

public class GhanaFlag {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ghana Flag");
        frame.setSize(800, 600);

        // Set BoxLayout for the frame's content pane
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Create an image for the star
        ImageIcon star = new ImageIcon("/Users/tyronemarhguy/Downloads/star.png");
        ImageIcon icon = new ImageIcon(star.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        // Create label to hold the star
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create color panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setPreferredSize(new Dimension(800, 200)); // Adjust size for proportionality

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setPreferredSize(new Dimension(800, 200));
        yellowPanel.setLayout(new BorderLayout());
        yellowPanel.add(label, BorderLayout.CENTER);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setPreferredSize(new Dimension(800, 200));

        // Add the panels to the content pane
        contentPane.add(redPanel);
        contentPane.add(yellowPanel);
        contentPane.add(greenPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
