import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    public MouseMotionListenerExample() {
        addMouseMotionListener(this); // Add mouse motion listener
        setSize(300, 300);
        setVisible(true);
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged at: " + e.getX() + ", " + e.getY());
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved at: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
