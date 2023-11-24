

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Q28_JListDoubleClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Double-Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        JList<String> nameList = new JList<>(names);

        nameList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedIndex = nameList.getSelectedIndex();
                    System.out.println("Double-clicked on item at index: " + selectedIndex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        frame.add(new JScrollPane(nameList));
        frame.setVisible(true);
    }
}
