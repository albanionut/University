package mtr;

import java.util.Scanner;

public class NrElemMaiMari5DiagSecundara 
{
	public static void main(String[] args) 
	{
		int n, j, i;
		int a[][];
		int nr = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		n = sc.nextInt();
		a = new int[n][n];
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				a[i][j] = sc.nextInt();

		for (i = 0; i < n; i++) 
		{

			if (a[i][n - i - 1] >= 5)
				nr++;

		}
		System.out.println("Elementele >=5 sunt  "+nr);
		sc.close();
	}

}
