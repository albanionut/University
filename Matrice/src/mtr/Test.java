package mtr;

import java.util.Scanner;

public class Test {
	static Scanner sc=new Scanner(System.in);
	static void citire(int a[][],int n, int m, int b[][])
	{	System.out.println("Prima matice: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("A doua matrice: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				b[i][j]=sc.nextInt();
		}
		
	}
	static void MatriceSuma(int n, int m, int a[][], int b[][], int c[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				c[i][j]=a[i][j]+b[i][j];
		}}
	static void AfisareMatriceSuma(int n, int m, int a[][])
	{
		System.out.println("Matricea suma este: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n, m;
		System.out.println("Numarul de linii al celor doua matrici: ");
		n=sc.nextInt();
		System.out.println("Numarul de coloane al celor doua matrici: ");
		m=sc.nextInt();
		int [][]a=new int[n][m];
		int [][]b=new int[n][m];
		int [][]c=new int[n][m];
		citire(a,n,m,b);
		MatriceSuma(n,m,a,b,c);
		AfisareMatriceSuma(n,m,c);

	}

}
