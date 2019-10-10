package backtracking;

import java.util.Scanner;

public class Arrangement {
	
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int m;
	static int x[];
	static int k;

	public static void back() {

		for (int i = 0; i <= m - 1; i++) {
			x[i] = 0;
		}
		k = 0;
		
		while (k >= 0) {
			if (k == m) {
				retSol();
				k--;
			} else if (x[k] < n) {
				x[k] = x[k] + 1;
				if (cont(k)) {
					k++;
				} else {
					x[k] = 0;
					k--;
				}
			}
		}
	}

	public static void retSol() {

		for (int i = 0; i <= m - 1; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public static boolean cont(int k) {
		for (int i = 0; i <= k - 1; i++) {
			
			if (x[k] == x[i]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("n:");
		n = sc.nextInt();
		System.out.println("m:");
		m = sc.nextInt();
		x = new int[n];
		back();
	}

}
