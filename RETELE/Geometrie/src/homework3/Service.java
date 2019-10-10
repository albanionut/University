package homework3;

public class Service {



    static double getArea(Point pointA, Point pointB, Point pointC) {
        double area;

        // Heron's formula
        // s - semiperimeter
        // a, b, c - sides
        // Area = sqrt( s(s-a)(s-b)(s-c) )

        double sideA = getSide(pointB, pointC);

        double sideB = getSide(pointA, pointC);

        double sideC = getSide(pointA, pointB);

        double semiPerimeter = getPerimeter(sideA, sideB, sideC) / 2;

        area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        return area;
    }

    static double getSide(Point pointA, Point pointB) {
        double side = Math
                .sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));

        return side;
    }

    static double getPerimeter(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;

        return perimeter;
    }

    static Point getMidPoint(Point pointA, Point pointB) {

        Point midPoint = new Point();
        midPoint.setX((pointA.getX() + pointB.getX())/2);
        midPoint.setY((pointA.getY() + pointB.getY())/2);

        return midPoint;

    }

    static Point getCenterInCircle(Point pointA, Point pointB, Point pointC) {
        Point center = new Point();

        double sideA = getSide(pointB, pointC);

        double sideB = getSide(pointA, pointC);

        double sideC = getSide(pointA, pointB);

        center.setX((sideA * pointA.getX() + sideB * pointB.getX() + sideC * pointC.getX()) / (sideA + sideB + sideC));

        center.setY((sideA * pointA.getY() + sideB * pointB.getY() + sideC * pointC.getY()) / (sideA + sideB + sideC));

        return center;
    }

    static double getRadiusInCircle(Point pointA, Point pointB, Point pointC) {
        double radius;

        double sideA = getSide(pointB, pointC);

        double sideB = getSide(pointA, pointC);

        double sideC = getSide(pointA, pointB);

        double semiPerimeter = getPerimeter(sideA, sideB, sideC) / 2;

        double area = getArea(pointA, pointB, pointC);

        radius = area / semiPerimeter;

        return radius;

    }



}
