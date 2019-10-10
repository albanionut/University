package mtr;

import java.util.Scanner;

public class NrElemRoundDeasupraDiagSecund 
{

	public static void main(String[] args) 
	{
		int n;
		int nr = 0, k = 0;
		int a[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		n = sc.nextInt();
		a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();

		for (int i = 0; i < n - 2; i++)
			for (int j = 0; j < n - 2 - i; j++) 
			{
				while (a[i][j] != 0) 
				{
					if (a[i][j] % 2 == 0)
						k++;
					else
						k--;
					a[i][j] /= 2;
				}
				if (k == 0)
					nr++;
			}

		System.out.println(nr);
		sc.close();

	}

}
