package lab2;

import javax.swing.*;
import java.awt.*;

public class DrawApp extends JFrame {
    private  DrawCanvas canvas;
    public DrawApp(){
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(900,800));
        setContentPane(canvas);//permite adaugaraea de obiecte
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setTitle("APP");
        setVisible(true);
    }
    private class DrawCanvas extends JPanel {
        public void paintComponent(Graphics graphics){
            graphics.drawRect(40,40,200,100);
            Color red =new Color(128,0,0);
            graphics.setColor(red);


        }
    }

}
