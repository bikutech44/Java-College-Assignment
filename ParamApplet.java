import java.applet.Applet;
import java.awt.Graphics;

public class ParamApplet extends Applet {
    String message;

    public void init() {
        message = getParameter("message");
        if (message == null) {
            message = "No message provided!";
        }
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }
}
