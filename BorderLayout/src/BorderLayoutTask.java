import javax.swing.*;
import java.awt.*;

public class BorderLayoutTask {

    JFrame frame;
    JLabel titleLabel;
    JPanel panelWest;
    JTextArea textArea;
    JButton submitButton;

    public BorderLayoutTask() {
        frame = new JFrame("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        titleLabel = new JLabel("Application Title", SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        panelWest = new JPanel();
        panelWest.setLayout(new GridLayout(3, 1));

        panelWest.add(new JButton("Option 1"));
        panelWest.add(new JButton("Option 2"));
        panelWest.add(new JButton("Option 3"));

        frame.add(panelWest, BorderLayout.WEST);

        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        frame.add(submitButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}



