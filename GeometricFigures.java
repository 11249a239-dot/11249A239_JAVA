import java.applet.Applet;
import java.awt.Graphics;

public class GeometricFigures extends Applet {

    public void paint(Graphics g) {

        // Draw Rectangle
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 90, 170);

        // Draw Circle
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 280, 170);

        // Draw Line
        g.drawLine(50, 220, 200, 220);
        g.drawString("Line", 110, 240);

        // Draw Triangle
        int x[] = {300, 250, 350};
        int y[] = {210, 300, 300};

        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 280, 325);
    }
}