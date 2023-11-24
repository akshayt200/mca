import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q29_AwtGuiExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT GUI Example");
        Panel panel = new Panel(new GridLayout(3,1));
        Label nameLabel = new Label("Your Name:");
        Label classLabel = new Label("Your Class:");
        JRadioButton r1 = new JRadioButton("MCA-I");
        JRadioButton r2 = new JRadioButton("MCA-II");
        JRadioButton r3= new JRadioButton("MCA-III");
        Checkbox checkboxMusic = new Checkbox("Music");
        Checkbox checkboxDance = new Checkbox("Dance");
        Checkbox checkboxSports = new Checkbox("Sports");
        TextField textField = new TextField("Name: ......., Class: ......., Hobbies: .......");

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        panel.add(nameLabel);
        panel.add(classLabel);

        CheckboxGroup classGroup = new CheckboxGroup();
        CheckboxGroup hobbiesGroup = new CheckboxGroup();

        panel.add(new Checkbox("MCA-I", classGroup, false));
        panel.add(new Checkbox("MCA-II", classGroup, false));
        panel.add(new Checkbox("MCA-III", classGroup, false));

        panel.add(new Checkbox("Music", hobbiesGroup, false));
        panel.add(new Checkbox("Dance", hobbiesGroup, false));
        panel.add(new Checkbox("Sports", hobbiesGroup, false));

        frame.add(panel, BorderLayout.WEST);
        frame.add(textField, BorderLayout.CENTER);
    }
}
