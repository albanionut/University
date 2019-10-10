package mtr;

import java.util.Scanner;

public class MaxElemImparTrgEst {
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
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) 
			{
				while (i < j && i + j > n + 1) 
				{
					if ((a[i][j] % 2 == 1) && a[i][j] > max)
						max = a[i][j];
				}
			}
		System.out.println("Max este =  " + max);
		sc.close();
	}
}
