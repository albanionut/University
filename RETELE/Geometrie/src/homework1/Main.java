package homework1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti x si y pentru punctul A:");
        Punct A =new Punct(sc.nextDouble(),sc.nextDouble());

        System.out.println("Introduceti x si y pentru punctul B:");
        Punct B =new Punct(sc.nextDouble(),sc.nextDouble());

        System.out.println("Introduceti x si y pentru punctul C:");
        Punct C =new Punct(sc.nextDouble(),sc.nextDouble());

        System.out.println("Introduceti x si y pentru punctul D:");
        Punct D =new Punct(sc.nextDouble(),sc.nextDouble());

        Service service = new Service();
        System.out.println(service.getAria(A,B,C));
        service.getCoordCenterCircle(A,B,C);
        service.getRadius(A,B,C);
        service.equationSideAB(A,B,C);

        System.out.println(service.getArea(A,B,C,D));
        service.theType(A,B,C,D);
        sc.close();

    }
}
