import java.util.Scanner;

public class Problema8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Baza mica=");
		int B = sc.nextInt();
		System.out.print("Baza mare=");
		int b = sc.nextInt();
		System.out.print("Inaltimea=");
		int h = sc.nextInt();
		float s = (float) ((b + B) * h) / 2;
		System.out.print(s);
		sc.close();

	}

}
