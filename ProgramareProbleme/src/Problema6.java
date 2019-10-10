import java.util.Scanner;

public class Problema6 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		System.out.print("c=");
		int c = sc.nextInt();
		float p;
		float s;
		p = (float) (a + b + c) / 2;
		s = (float) Math.sqrt((p - a) * (p - b) * (p - c));
		System.out.print(s);
		sc.close();

	}

}