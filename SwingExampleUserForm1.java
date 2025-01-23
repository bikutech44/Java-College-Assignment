import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleUserForm1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 1");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your email:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = textField.getText();
                JOptionPane.showMessageDialog(frame, "Your email: " + email);
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
}
