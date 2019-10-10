package divide_et_impera;

import java.util.Scanner;

public class cautare_binara {

	static int[] a;

	static int caut_bin(int p, int u, int x) {
		int m;
		if (p <= u) {
			m = (p + u) / 2;
			if (x == a[m]) {
				return m;
			} else {
				if (x < a[m])
					return caut_bin(p, m - 1, x);
				else
					return caut_bin(m + 1, u, x);
			}
		} else
			return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n= ");
		int n = sc.nextInt();
		System.out.println("x= ");
		int x = sc.nextInt();
		a = new int[n];
		int poz;
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		poz = caut_bin(0, n - 1, x);
		if (poz != -1) 
			System.out.println("poz= " + poz);
			else System.out.println("Nu exista");
		

	}
}
