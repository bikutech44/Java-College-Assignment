import java.applet.Applet;
import java.awt.Graphics;

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 50); // Rectangle
        g.drawOval(150, 20, 50, 50); // Circle
        g.drawLine(20, 100, 200, 100); // Line
    }
}
