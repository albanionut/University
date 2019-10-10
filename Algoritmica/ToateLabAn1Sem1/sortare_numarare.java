package exercitii;

import java.util.Scanner;

public class sortare_numarare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {

			System.out.println("a[i]");

			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			b[i] = 0;
			c[i] = a[i];
		}
		for (int i = 0; i <= n - 2; i++)
		{
			for (int j = i + 1; j < n - 1; j++) {
				int[] a = new int[n];
				int[] b = new int[n];
				if (a[i] > a[j])
					b[i] = b[i] + 1;
				else
					b[j] = b[j] + 1;
			}
			}
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i > n - 1; i++) {
			a[b[i]] = c[i];
		}
		for (int i = 0; i < n - 1; i++)
			{System.out.println(a[i]);
			}
	}

}