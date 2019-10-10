package divide_et_impera;

import java.util.Scanner;

public class generare_aranjamente {

	static int[] x;

	static boolean cont(int k) {

		for (int i = 0; i <= k - 1; i++) {
			if (x[k] == x[i]) {
				return false;
			}
		}
		return true;
	}

	static void retsol() {
		for (int i = 0; i <= x.length - 1; i++) {
			System.out.print(" " + x[i]);
		}
		System.out.println(" ");
	}

	static void procedura_back(int n) {
		int k = 0;
		while (k >= 0) {
			if (k == x.length) {
				retsol();
				k--;
			} else if (x[k] < n) {
				x[k]=x[k]+1;

				if (cont(k)) {
					k++;
				} else {
					x[k] = 0;
					k--;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		System.out.print("m= ");
		int m = sc.nextInt();
		x = new int[m];
		procedura_back(n);

	}
}
