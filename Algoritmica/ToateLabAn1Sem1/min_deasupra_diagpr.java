package exercitii;

import java.util.Scanner;

public class min_deasupra_diagpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i <= n - 1; i++)
			for (int j = 0; j <= n - 1; j++) {
				System.out.println("a[" + i + "][" + j + "]");
				a[i][j] = sc.nextInt();
			}
			
		int min=Integer.MAX_VALUE;
					
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i][j]<min && a[i][j]>0)
					min=a[i][j];
		System.out.println("minimul este= " +min);
					
						
				
			
	}

}
