import java.applet.Applet;
import java.awt.*;

public class ColorShapesApplet extends Applet {

    public void paint(Graphics g) {

        // Draw red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 100);

        // Draw blue oval
        g.setColor(Color.BLUE);
        g.fillOval(250, 50, 150, 100);

        // Display message in bold font
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 100, 220);
    }
}