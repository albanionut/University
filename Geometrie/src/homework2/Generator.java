package homework2;

import java.util.List;

public class Generator {

    public void generate(Point p1, Point p2, Point p3, int numSteps, int step, List<Line> list) {


        Point m1 = new Point((p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
        Point m2 = new Point((p3.getX()+p2.getX())/2,(p3.getY()+p2.getY())/2);
        Point m3 = new Point((p1.getX()+p3.getX())/2,(p1.getY()+p3.getY())/2);

        list.add(new Line(m1,m2));
        list.add(new Line(m2,m3));
        list.add(new Line(m3,m1));

        if(step < numSteps) {
            generate(m1, p2, m2, numSteps  , step +1 , list);
            generate(m3, m2, p3, numSteps  , step +1 , list);
            generate(p1, m1, m3, numSteps  , step +1 , list);
        }

    }
}
