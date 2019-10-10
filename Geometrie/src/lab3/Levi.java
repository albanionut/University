package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Levi extends JPanel implements MouseListener {
    int it = 0;//iteration

    Levi() {
        JFrame frame = new JFrame("Dragonul lui Levi");
        frame.setLocation(50, 50);
        frame.setSize(1000, 700);
        frame.addMouseListener(this);
        frame.add(this);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void mouseReleased() {
        //entered()
        //exited()
        //closed()
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawString("Nr iteratie : " + it, 15, 15);
        drawLevi(graphics, 250, 500, 0, 400, it);

    }

    public void drawLevi(Graphics graphics, double x1, double y1, double a1, double l1, int it) {
        double x2, y2, a2, a3;
        graphics.drawLine((int) x1, (int) y1, (int) (x1 + l1 * (Math.cos(a1))), (int) (y1 - (l1 * Math.sin(a1))));
        if (it > 0) {
            double l2 = l1 / Math.sqrt(2);
            it--;
            a2 = a1 + Math.PI / 4;
            a3 = a1 - Math.PI / 4;
            x2 = x1 + l2 * Math.cos(a2);
            y2 = y1 - l2 * Math.sin(a2);
            drawLevi(graphics, x1, y1, a2, l2, it);
            drawLevi(graphics, x2, y2, a3, l2, it);

        }
    }


    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            it++;
        } else {
            if ((mouseEvent.getButton() == MouseEvent.BUTTON2) && it > 0) ;
            it--;
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
}
