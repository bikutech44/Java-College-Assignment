import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleUserForm4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 4");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Do you want to subscribe to our newsletter?");
        JCheckBox checkBox = new JCheckBox("Yes, subscribe me");

        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String subscriptionStatus = checkBox.isSelected() ? "Subscribed" : "Not Subscribed";
                JOptionPane.showMessageDialog(frame, "Subscription Status: " + subscriptionStatus);
            }
        });

        frame.add(label);
        frame.add(checkBox);
        frame.add(button);
        frame.setVisible(true);
    }
}
