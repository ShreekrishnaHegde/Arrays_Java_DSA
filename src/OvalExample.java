import javax.swing.*;
import java.awt.*;

public class OvalExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(10, 10, 200, 100); // Draws an oval with specified x, y, width, and height
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new OvalExample());
        frame.setVisible(true);
    }
}