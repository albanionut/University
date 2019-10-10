package lab1;
import java.awt.*;
import javax.swing.*;

public class SimpleFrame extends JFrame {
        public int[] xPoints={30 ,40 ,50, 60};
        public int[] yPoints={35 ,45 ,55, 65};
    public SimpleFrame(String s) throws HeadlessException {
        super(s);
    }
    public void paint(Graphics graphics){
        graphics.drawRect(40,40,200,100);
        graphics.drawOval(300,40,200,100);
        graphics.drawArc(500,40,200,100,15,80);
        graphics.draw3DRect(40,200,200,100,true);
        graphics.drawRoundRect(300,200,200,100,40,40);
        graphics.drawPolyline(xPoints,yPoints,5);
    }
}
