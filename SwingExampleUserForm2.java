import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleUserForm2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 2");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = male.isSelected() ? "Male" : "Female";
                JOptionPane.showMessageDialog(frame, "Gender: " + gender);
            }
        });

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(button);
        frame.setVisible(true);
    }
}
