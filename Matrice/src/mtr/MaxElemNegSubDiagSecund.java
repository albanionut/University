package mtr;

import java.util.Scanner;

public class MaxElemNegSubDiagSecund {

	public static void main(String[] args) {
		int n;
		int a[][];
		int max = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		n = sc.nextInt();
		a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) 
			{
				a[i][j] = sc.nextInt();
				if (a[i][j] < 0 && max>0 && j>(n - i-1))
					max = a[i][j];
			}
		if (max == 1)
			System.out.println("nu exista nr negative sub diag secundara");
		else 
		{
			for (int i = 0; i < n; i++) 
			{
				int j = n - i ;
				while (j < n) 
				{
					if (a[i][j] < 0 && max < a[i][j])
						max = a[i][j];
					j++;

				}
			}

		}
System.out.println("Max elem neg de sub diag secundara"+max);
sc.close();
	}

}
