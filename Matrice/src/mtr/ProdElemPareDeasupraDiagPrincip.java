package mtr;
import java.util.Scanner;

public class ProdElemPareDeasupraDiagPrincip 
{

	public static void main(String[] args) 
	{
		int n;
		int a[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		n = sc.nextInt();
		a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		int p = 1;
		for (int i = 0; i < n; i++) 
		{
			
			int j = i + 1;
			while (j<n) 
			{
				if (a[i][j] % 2 == 0)
					p *= a[i][j];
				j++;

			}

		}
	
		System.out.println("Produsul este= "+ p);
		sc.close();
	}
}