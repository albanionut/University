package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Generator test = new Generator();
        Random rand = new Random();
        Point p1 = new Point(rand.nextInt(400),rand.nextInt(200));
        Point p2 = new Point(rand.nextInt(700),rand.nextInt(720));
        Point p3 = new Point(rand.nextInt(200),rand.nextInt(720));
        List<Line> list = new ArrayList<Line>();
        list.add(new Line(p1,p2));
        list.add(new Line(p2,p3));
        list.add(new Line(p3,p1));
        test.generate(p1, p2, p3,3, 1 , list);

        new DrawingLines( list );
    }

}

