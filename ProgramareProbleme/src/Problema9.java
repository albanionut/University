import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args) 
	{
		float R, L;
		Scanner sc = new Scanner(System.in);
		float pi = (float) 3.14;
		System.out.println("Lungimea=");
		L = sc.nextInt();
		R = ((float) L / (2 * pi));
		float s;
		s = pi * R * R;
		System.out.println("Aria=" + s);
		sc.close();

	}

}
