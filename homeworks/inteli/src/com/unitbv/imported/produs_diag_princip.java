package exercitii;

import java.util.Scanner;

public class produs_diag_princip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i <= n - 1; i++)
			for (int j = 0; j <= n - 1; j++)
			{
				System.out.println("a[" + i + "][" + j + "]");
		a[i][j]=sc.nextInt();
	}
int p=1;
for(int i=0;i<=n-1;i++)
	for (int j = 0; j <= n - 1; j++)
	{
	 p=p*a[i][i];
			System.out.println(p);
	
}
	}

}
