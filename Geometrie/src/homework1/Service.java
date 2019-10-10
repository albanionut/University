package homework1;

import java.lang.Math;

public class Service {
    public double getAria(Punct A, Punct B, Punct C) {
        double delta;
        delta = ((B.getX() - A.getX()) * (C.getY() - A.getY()) - (C.getX() - A.getX()) * (B.getY() - A.getY()));
        return (0.5 * Math.abs(delta));
    }

    public double getLengthBC(Punct B, Punct C) {
        double a;
        a = Math.sqrt(Math.pow((C.getX() - B.getX()), 2) + Math.pow((C.getY() - B.getY()), 2));
        return a;
    }

    public double getLengthBD(Punct B, Punct D) {
        double a;
        a = Math.sqrt(Math.pow((D.getX() - B.getX()), 2) + Math.pow((D.getY() - B.getY()), 2));
        return a;
    }

    public double getLengthAC(Punct A, Punct C) {
        double b;
        b = Math.sqrt(Math.pow((C.getX() - A.getX()), 2) + Math.pow((C.getY() - A.getY()), 2));
        return b;
    }

    public double getLengthAB(Punct A, Punct B) {
        double c;
        c = Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
        return c;
    }

    public double getLengthCD(Punct C, Punct D) {
        double d;
        d = Math.sqrt(Math.pow((D.getX() - C.getX()), 2) + Math.pow((D.getY() - C.getY()), 2));
        return d;
    }

    public double getLengthDA(Punct D, Punct A) {
        double b;
        b = Math.sqrt(Math.pow((A.getX() - D.getX()), 2) + Math.pow((A.getY() - D.getY()), 2));
        return b;
    }

    public void getCoordCenterCircle(Punct A, Punct B, Punct C) {
        double x, y;
        x = ((getLengthBC(B, C) * A.getX() + getLengthAC(A, C) * B.getX() + getLengthAB(A, B) * C.getX()) / (getLengthAB(A, B) + getLengthAC(A, C) + getLengthBC(B, C)));
        y = ((getLengthBC(B, C) * A.getY() + getLengthAC(A, C) * B.getY() + getLengthAB(A, B) * C.getY()) / (getLengthAB(A, B) + getLengthAC(A, C) + getLengthBC(B, C)));
        System.out.println("Coordonatele centrului cercului : {" + "x=" + x + ", y=" + y + '}');
    }

    public void getRadius(Punct A, Punct B, Punct C) {
        double perimeter = (getLengthAB(A, B) + getLengthBC(B, C) + getLengthAC(A, C)) / (double) 2;
        double radius = getAria(A, B, C) / perimeter;
        System.out.println("Radius= " + radius);
    }

    public void equationSideAB(Punct A, Punct B, Punct C) {
        try {
            System.out.println("AB: ");
            System.out.println((B.getY() - A.getY()) / (B.getX() - A.getX()) + "x" + " - " + (B.getX() - A.getX()));
            System.out.println("AC: ");
            System.out.println((C.getY() - A.getY()) / (C.getX() - A.getX()) + "x" + " - " + (C.getX() - A.getX()));
            System.out.println("BC: ");
            System.out.println((C.getY() - B.getY()) / (C.getX() - B.getX()) + "x" + " - " + (C.getX() - B.getX()));

        } catch (ArithmeticException e) {
            System.out.println("Don't include dividing by 0 ");
            e.printStackTrace();
        }

    }

    public double getArea(Punct A, Punct B, Punct C, Punct D) {
        double area = ((A.getX() * B.getY() - A.getY() * B.getX()) +
                (B.getX() * C.getY() - B.getY() * C.getX()) +
                (C.getX() * D.getY() - C.getY() * D.getX()) +
                (D.getX() * A.getY() - D.getY() * A.getX()
                ));
        area = Math.abs(area) / 2.0;
        System.out.println("Area of quadrilateral is:");
        return area;
    }

    public double slopeAB(Punct A, Punct B) {
        double slope = ((B.getY() - A.getY()) / (B.getX() - A.getX()));
        return slope;
    }

    public double slopeCD(Punct C, Punct D) {
        double slope = ((D.getY() - C.getY()) / (D.getX() - C.getX()));
        return slope;
    }

    public double slopeBC(Punct B, Punct C) {
        double slope = ((C.getY() - B.getY()) / (C.getX() - B.getX()));
        return slope;
    }

    public double slopeDA(Punct D, Punct A) {
        double slope = ((A.getY() - D.getY()) / (A.getX() - D.getX()));
        return slope;
    }

    //Dou drepte sunt paralele dac i numai dac pantele lor sunt egale.
    // Dou drepte sunt perpendiculare dac i numai dac produsul pantelor este -1.
    public void theType(Punct A, Punct B, Punct C, Punct D) {
        if (((getLengthAB(A,B) == getLengthCD(C,D) || getLengthAB(A,B) == getLengthCD(B,C)) && (getLengthBC(B,C) == getLengthDA(D,A) || getLengthCD(C,D) == getLengthDA(D,A)))) {
            System.out.println("The quadrilateral is Parallelogram");
        }
        if (getLengthAB(A, B) == getLengthBC(B, C))
            if (getLengthBC(B, C)==getLengthCD(C, D))
                if (getLengthCD(C, D)==getLengthDA(D, A))
                    if ((getLengthAC(A,C) == getLengthBD(B, D))) {
                        System.out.println("The quadrilateral is Square");
                    } else{
                        System.out.println("The quadrilateral is Diamond");
                    }
    }


}



