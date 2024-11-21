import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JButton northLabel = new JButton("North");
        JButton southLabel = new JButton("South");
        JButton eastLabel = new JButton("East");
        JButton westLabel = new JButton("West");
        JButton centerLabel = new JButton("Center");

        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);



        frame.setVisible(true);
    }
}