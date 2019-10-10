package divide_et_impera;

import java.util.Scanner;

public class Suma_el_pare_vector {
	static int[] a;

	static int sumapar(int p, int u) {
		int m;
		if (p == u) {
			if (a[p] % 2 == 0) {
				{
					return a[p];
				}
			}

			else {
				return 0;
			}
		} else {
			m = (p + u) / 2;
			return sumapar(p, m) + sumapar(m + 1, u);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i <= n - 1; i++)
			a[i] = sc.nextInt();
		System.out.println(sumapar(1, 7));
	}
}??
