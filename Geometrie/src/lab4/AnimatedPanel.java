package lab4;

import javafx.animation.PathTransition;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AnimatedPanel extends JPanel {
    private BufferedImage img;
    public double angle;
    public double start;

    public AnimatedPanel() {
        try {
            img = ImageIO.read(new File("C:\\Wallpapers\\f.png"));
            Timer timer = new Timer(12, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    angle += Math.toRadians(10);
                    repaint();
                }
            });
            timer.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        PathTransition transition = new PathTransition();

    }

//    public Dimension getPrefferedSize() {
//        return img == null ? super.getPreferredSize() :
//                new Dimension(3 * img.getWidth(), 3 * img.getHeight());
//    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.translate((super.getWidth()/2) -800, super.getHeight()/2); // asezarea componentei in mijlocul panelului
        graphics2D.rotate(angle);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(img, -img.getWidth() / 2, -img.getHeight() / 2, this);
    }
    PathTransition pathTransition = new PathTransition();

    public PathTransition getPathTransition() {
        return pathTransition;
    }
}

