import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleUserForm5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 5");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your comments:");
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String comments = textArea.getText();
                JOptionPane.showMessageDialog(frame, "Your comments: " + comments);
            }
        });

        frame.add(label);
        frame.add(scrollPane);
        frame.add(button);
        frame.setVisible(true);
    }
}
