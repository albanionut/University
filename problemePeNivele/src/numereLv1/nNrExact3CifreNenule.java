package numereLv1;

import java.util.Scanner;

public class nNrExact3CifreNenule {
	/*
	 * Se citesc de la astatura n numere naturale. Sa se verifice cate dintre
	 * acestea au exact 3 cifre nenule
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cate numere doriti sa introduceti?: ");
		int n = sc.nextInt();
		int x;

		for (int i = 0; i <= n - 1; i++) {
			int n_cifre = 0;
			x = sc.nextInt();
			int aux = x;
			while (x != 0) {
				if (x % 10 != 0) {
					n_cifre = n_cifre + 1;
				}
				x = x / 10;

			}
			if (n_cifre == 3)
				System.out.println("Numarul este corespunzator " + aux);
			else
				System.out.println("Numarul nu este corespunzator");
		}
		sc.close();

	}

}
