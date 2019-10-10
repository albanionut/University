package mtr;

import java.util.Scanner;

public class MinElemTriunghiNord 
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
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < (n - 1) / 2 - 1; i++)
			for (int j = i + 1; j < n - i - 2; j++) 
			{
				if (a[i][j] < min)
					min = a[i][j];
			}

		System.out.println("Min este =  " + min);
		sc.close();

	}

}
