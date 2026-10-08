import java.awt.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo() {

        // Set BorderLayout
        setLayout(new BorderLayout());

        // Create components
        Label header = new Label("HEADER", Label.CENTER);
        Label footer = new Label("FOOTER", Label.CENTER);
        Button menu = new Button("MENU");
        Button options = new Button("OPTIONS");
        TextArea content = new TextArea("Application Content");

        // Add components to different regions
        add(header, BorderLayout.NORTH);
        add(footer, BorderLayout.SOUTH);
        add(menu, BorderLayout.WEST);
        add(options, BorderLayout.EAST);
        add(content, BorderLayout.CENTER);

        // Frame settings
        setTitle("Application Dashboard");
        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
