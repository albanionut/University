package exercitii;

import java.util.Scanner;

public class sortare_insertie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		int j, aux;

		for (int i = 0; i <= n - 1; i++) 
			a[i]= sc.nextInt();
		
		for (int i = 0; i <= n - 1; i++) // se insereaza a[i] in subsirul deja sortat a[0],...,a[i-1]
		{

			aux = a[i];
			j = i - 1;

			while (j >= 0 && a[j] > aux) {
				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = aux;
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
