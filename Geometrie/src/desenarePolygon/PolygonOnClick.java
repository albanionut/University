package desenarePolygon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        PolygonOnClick polygonOnClick = new PolygonOnClick();
    }
}


public class PolygonOnClick extends JPanel implements MouseListener, MouseMotionListener {
    ArrayList<Point> points = new ArrayList<>();
    static boolean isClosed = false;

    PolygonOnClick() {
        JFrame frame = new JFrame("Polygon ON CLICK");
        frame.addMouseListener(this);
        frame.setLocation(80, 50);
        frame.setSize(1000, 700);
        frame.add(this);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawString("Click stanga pentru a incepe a desena , click dreapta pentru a inchide poligonul ", 15, 15);

        for (int i = 1; i < points.size(); i++) {
            graphics.drawLine((int) points.get(i - 1).getX(), (int) points.get(i - 1).getY(), (int) points.get(i).getX(), (int) points.get(i).getY());
        }
        if (isClosed) {
            graphics.drawLine((int) points.get(points.size() - 1).getX(), (int) points.get(points.size() - 1).getY(), (int) points.get(0).getX(), (int) points.get(0).getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!isClosed) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                points.add(e.getPoint().getLocation());
            }
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            isClosed = true;
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
