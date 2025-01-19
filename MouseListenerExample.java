import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    public MouseListenerExample() {
        addMouseListener(this); // Add mouse listener
        setSize(300, 300);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the window");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the window");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
