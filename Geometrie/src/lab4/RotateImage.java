package lab4;

import javax.swing.*;
import java.awt.*;

public class RotateImage {
    public RotateImage() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Rotate");
                AnimatedPanel panel = new AnimatedPanel();
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
    }

    public static void main(String[] args) {
        new RotateImage();
    }
}
