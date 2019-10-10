package exercitii;

import java.util.Scanner;

public class nr_maimari_ca5_diagsec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int i, j, nr = 0;
		for (i = 0; i <= n - 1; i++)
			for (j = 0; j <= n - 1; j++)
				a[i][j] = sc.nextInt();
		for (i = 0; i <= n - 1; i++)
			if (a[i][n - i - 1] >= 5)
				nr++;
		System.out.println("Numarul de elemente mai mari sau egale decat 5 de pe diagonala secundara este" + " " + nr);

	}

}
