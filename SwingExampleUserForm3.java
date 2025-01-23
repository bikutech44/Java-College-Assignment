import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExampleUserForm3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example 3");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your age:");
        String[] ages = {"18", "19", "20", "21", "22"};
        JComboBox<String> comboBox = new JComboBox<>(ages);

        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String age = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Your age: " + age);
            }
        });

        frame.add(label);
        frame.add(comboBox);
        frame.add(button);
        frame.setVisible(true);
    }
}
