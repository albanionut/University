package exercitii;

import java.util.Scanner;

public class sortare_selectie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		int pozMin=0, aux;
		System.out.println("Vectorul este:");
		for (int i = 0; i <= n - 1; i++) {
			a[i]= sc.nextInt();
		}
		for (int i = 0; i <= n - 2; i++) // Determina numarul minim de elemente a[i],....,a[n-1]
		{
		 pozMin = 0;
			pozMin = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (a[j] < a[pozMin]) {
					pozMin = j;
				}
			}
			aux = a[pozMin];
			a[pozMin] = a[i];
			a[i] = aux;
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i]+ "");
		}
		sc.close();

	}
}