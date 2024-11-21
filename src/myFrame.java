import javax.swing.*;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener {
    JButton button;

    public myFrame(){
        button = new JButton("Click Me");
        button.setBounds(150,200,200,100);
        button.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Button Implementation");
        setSize(500,500);
        setLayout(null);

        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button has been clicked!");
        }
    }
}
