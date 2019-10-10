import java.util.Scanner;

class Punkt_01 {
	int x, y;

	Punkt_01(int xI, int yI) {
		x = xI;
		y = yI;
	}
}

public class ConstructiaPunkt 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2, Sx = 0, Sy = 0;
		System.out.print("Geben Sie die Koordinaten der 2 Punkte ein");
		System.out.println();
		System.out.print("Für den Punkt A");
		System.out.println();
		System.out.print("x1=");
		x1 = sc.nextInt();
		System.out.print("y1=");
		y1 = sc.nextInt();
		System.out.print("Die neuen Koordinaten von Punkt A sind");
		System.out.println();
		System.out.print("x2=");
		x2 = sc.nextInt();
		System.out.print("y2=");
		y2 = sc.nextInt();
		Punkt_01 A = new Punkt_01(x1, y1);
		Punkt_01 A1 = new Punkt_01(x2, y2);
		Sx = A.x + A1.x;
		Sy = A.y + A1.y;
		System.out.print("Die Summe der Koordinaten ist der Punkt S(" + Sx + ", " + Sy + ")");
		System.out.println();
		Sx = A.x - A1.x;
		Sy = A.y - A1.y;
		System.out.print("Die Unterschied der Koordinaten sind die Punkte");
		System.out.println();
		System.out.print("D1(" + Sx + ", " + Sy + ")");
		Sx = A1.x - A.x;
		Sy = A1.y - A.y;
		System.out.println();
		System.out.print("D2(" + Sx + ", " + Sy + ")");
		Sx = A.x - A1.x;
		Sy = A1.y - A.y;
		System.out.println();
		System.out.print("D3(" + Sx + ", " + Sy + ")");
		Sx = A1.x - A.x;
		Sy = A.y - A1.y;
		System.out.println();
		System.out.print("D4(" + Sx + ", " + Sy + ")");
		sc.close();

	}

}
