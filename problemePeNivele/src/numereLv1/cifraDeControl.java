package numereLv1;

import java.util.Scanner;

public class cifraDeControl {
	/*
	 * Fie n un numar citit de la tastatura.Scrieti un program care calculeaza si
	 * afiseaza cifra de control a lui n.Cifra de control a unui numar natural se
	 * obtine calculand suma cifrelor numarului , apoi suma cifrelor sumei samd pana
	 * se obtine o singura cifra
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int s = 0;
		while (n > 9) {
		s = 0;
			while (n != 0) {
				int c = n % 10;
				s = s + c;
				n = n / 10;

			}
		n = s;
		}
		System.out.println("Cifra de control a lui n este " + s);
		sc.close();
	}

}
