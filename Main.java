import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // North
        JButton northBtn = new JButton("NORTH");
        frame.add(northBtn, BorderLayout.NORTH);

        // South
        JButton southBtn = new JButton("SOUTH");
        frame.add(southBtn, BorderLayout.SOUTH);

        // East
        JButton eastBtn = new JButton("EAST");
        frame.add(eastBtn, BorderLayout.EAST);

        // West
        JButton westBtn = new JButton("WEST");
        frame.add(westBtn, BorderLayout.WEST);

        // Center
        JButton centerBtn = new JButton("CENTER");
        frame.add(centerBtn, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
