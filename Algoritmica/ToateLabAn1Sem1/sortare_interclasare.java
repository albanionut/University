package divide_et_impera;

import java.util.Scanner;

public class sortare_interclasare {

	static int n;
	static int[] a;

	static void mergesort(int p, int u) {
		int m;
		if (p < u) {
			m = (p + u) / 2;
			mergesort(p, m);
			mergesort(m + 1, u);
			interclasare(p, m, u);
		}
	}

	static void interclasare(int p, int m, int u) {
		int i, j, k, l;
		int[] b = new int[u - p + 1];
		i = p;
		j = m + 1;
		k = 0;
		while (i <= m && j <= u) {
			if (a[i] < a[j])
				b[k++] = a[i++];
			else b[k++]=a[j++];
		}

		for (l = i; l <= m; l++) {
			b[k] = a[l];
			k = k + 1;
		}
		for (l = j; l <= u; l++) {
			b[k] = a[l];
			k = k + 1;
		}
		for (i = p; i <= u; i++) {
			a[i] = b[i - p];
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n=sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		mergesort(0, n - 1);
		for (int i = 0; i <= n - 1; i++) {
			System.out.println(a[i]);
		}

	}

}
