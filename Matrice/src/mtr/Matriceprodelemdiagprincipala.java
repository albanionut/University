package mtr;
import java.util.Scanner;

public class Matriceprodelemdiagprincipala 
{
	static int n;
	static int a[][];

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		n = sc.nextInt();
		a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		int p = 1;
		for (int i = 0; i < n; i++) 
		{

			p = p * a[i][i];
		}
		System.out.println("Produsul este " + p);
		sc.close();
	}

}
