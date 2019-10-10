package divide_et_impera;

import java.util.Scanner;

public class quicksort {

	static int[] a;

	static void quicksort(int p, int u) {
		int m;
		if (p < u) {
			m = partitionare(p, u);
			quicksort(p, m);
			quicksort(m + 1, u);
		}

	}

	static int partitionare(int p, int u) {
		int piv, i = p, j = u, aux;
		piv = a[p];
		while (i < j) {
			while (a[i] < piv)
				i = i + 1;
			while (a[j] > piv)
				j = j - 1;
			if (i < j) {
				aux = a[i];
				a[i] = a[j];
				a[j] = aux;
				i = i + 1;
				j = j - 1;

			}

		}
		if (a[j] > piv)
			return j - 1;
		else
			return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		a=new int[n];
		
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();
		quicksort(0, n - 1);
		for (int i = 0; i <= n - 1; i++)
			System.out.println(a[i]);
	}

}
