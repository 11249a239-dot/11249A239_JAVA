import java.applet.Applet;
import java.awt.*;

public class HouseApplet extends Applet {

    public void paint(Graphics g) {

        // House body
        g.setColor(Color.PINK);
        g.fillRect(100, 150, 250, 150);

        // Roof
        g.setColor(Color.BLUE);
        int x[] = {80, 225, 370};
        int y[] = {150, 50, 150};
        g.fillPolygon(x, y, 3);

        // Door
        g.setColor(Color.BLUE);
        g.fillRect(195, 220, 60, 80);

        // Left window
        g.setColor(Color.WHITE);
        g.fillRect(125, 180, 50, 50);

        // Right window
        g.fillRect(275, 180, 50, 50);

        // Window lines
        g.setColor(Color.BLACK);
        g.drawLine(150, 180, 150, 230);
        g.drawLine(125, 205, 175, 205);

        g.drawLine(300, 180, 300, 230);
        g.drawLine(275, 205, 325, 205);

        // Door knob
        g.setColor(Color.BLACK);
        g.fillOval(240, 255, 8, 8);

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Simple House", 160, 340);
    }
}
    

