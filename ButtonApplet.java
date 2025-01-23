import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonApplet extends Applet implements ActionListener {
    Button button;

    public void init() {
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        button.setLabel("Clicked!");
    }
}
