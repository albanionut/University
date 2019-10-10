import java.util.Scanner;

public class Problema5 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("a=");
			int a = sc.nextInt();
			System.out.print("b=");
			int b = sc.nextInt();
			int max;
			max = a;
			if (a > b)
				max = a;
			else
				max = b;
			System.out.print("Maximul este " + max);
			sc.close();
		}

}

