package homework2;

import java.awt.*;
import java.util.List;

public class DrawingLines extends Frame {
    List<Line> lines;
    public DrawingLines(List<Line> lines)
    {
        setTitle("Sierpinski Triangle Random Points");
        setSize(1024, 768);
        setVisible(true);
        this.lines = lines;
    }
    public void paint(Graphics g)
    {
        for(Line l : this.lines) {

            g.drawLine((l.getFirst().getX() +50) , (l.getFirst().getY() + 50) , (l.getSecond().getX() +50) ,(l.getSecond().getY() +50) );

        }
    }
}
