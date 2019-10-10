package exercitii;

import java.util.Scanner;

public class pare_sub_diagprinc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int p=1;
		for (int i = 1; i <= n - 1; i++)
			for (int j = 0; j <= n - 1; j++)
			{
				System.out.println("a[" + i + "][" + j + "]");
				a[i][j]=sc.nextInt();
			}
        for (int i = 1; i <= n - 1; i++)
        	for (int j = 0; j <= i - 1; j++)	
        		if (a[i][j]%2==0)
        			p=p*a[i][j];
		
	System.out.println(p);

	}
}
