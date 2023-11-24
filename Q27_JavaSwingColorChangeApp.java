
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q27_JavaSwingColorChangeApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Color Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a label with text "Core Java Programming"
        JLabel label = new JLabel("Core Java Programming");
        label.setFont(new Font("Times New Roman", Font.BOLD, 24));

        // Create buttons for changing background color
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        // Add action listeners to the buttons
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setBackground(Color.RED);
                label.setOpaque(true);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setBackground(Color.GREEN);
                label.setOpaque(true);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setBackground(Color.BLUE);
                label.setOpaque(true);
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

