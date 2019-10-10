package homework3;

import javax.swing.*;
import java.awt.*;

public class Draw extends JFrame {

    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;
    private static final Dimension DIMENSION = new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT);
    private DrawCanvas canvas;

    public Draw() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(DIMENSION);
        setContentPane(canvas);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Inscribed and Circumscribed circles");
        setVisible(true);

    }

    public class DrawCanvas extends JPanel {

        public void paintComponent(Graphics graphics) {

            int[] xPoints = {250, 350, 600};
            int[] yPoints = {400, 100, 400};

            Point pointA = new Point(xPoints[0], yPoints[0]);
            Point pointB = new Point(xPoints[1], yPoints[1]);
            Point pointC = new Point(xPoints[2], yPoints[2]);

            // labeling the points
            graphics.drawString("A", xPoints[0]-10, yPoints[0]);
            graphics.drawString("B", xPoints[1], yPoints[1]);
            graphics.drawString("C", xPoints[2], yPoints[2]);

            // drawing the triangle
            graphics.setColor(Color.BLUE);
            graphics.fillPolygon(xPoints, yPoints, 3);

            Point centerInCircle = Service.getCenterInCircle(pointA, pointB, pointC);
            int radiusInCircle = (int) Service.getRadiusInCircle(pointA, pointB, pointC);

            // drawing the inscribed circle
            graphics.setColor(Color.BLACK);
            graphics.fillOval((int) centerInCircle.getX() - radiusInCircle, (int) centerInCircle.getY() - radiusInCircle,
                    radiusInCircle * 2, radiusInCircle * 2);


        }

    }

    public static void main(String[] args) {

        new Draw();
    }
}
