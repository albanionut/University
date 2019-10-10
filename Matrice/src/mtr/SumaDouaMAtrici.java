package mtr;

import java.util.Scanner;

public class SumaDouaMAtrici {
	static Scanner sc = new Scanner(System.in);

	public static void Citire(int a[][], int b[][], int n, int m) {
		System.out.println("\n Maricea A:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();

		System.out.println("\n Maricea B:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				b[i][j] = sc.nextInt();
	}

	public static void Afisare(int a[][], int b[][], int c[][], int n, int m) {
		System.out.println("\n Matricea A+B :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) 
				System.out.print(c[i][j] + " ");
		System.out.println();
			}
	}

	public static void Suma(int a[][], int b[][], int c[][], int n, int m) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				c[i][j] = a[i][j] + b[i][j];
	}

	public static void main(String[] args) {
		int n, m;
		System.out.println("Cate linii au matricile : ");
		n = sc.nextInt();
		System.out.println("Cate coloane au matricile : ");
		m = sc.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];
		Citire(a, b, n, m);
		Suma(a, b, c, n, m);
		Afisare(a, b, c, n, m);

		sc.close();
	}

}
