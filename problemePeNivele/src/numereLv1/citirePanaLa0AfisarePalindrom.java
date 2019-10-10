package numereLv1;

import java.util.Scanner;

public class citirePanaLa0AfisarePalindrom {
	/*
	 * Sa se citeasca numere pana se intalneste 0 si sa se afiseze acele numere care
	 * sunt palindroame
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduceti numere: ");
		int x;
		int c;
		int aux;
		do {
			c = 0;
			x = sc.nextInt();
			if (x != 0) {
				aux = x;
				while (aux != 0) {
					c = c * 10 + aux % 10;
					aux = aux / 10;

				}
			
			if (c == x)
				System.out.println("Palindrom: " + x);
			}

		} while (x != 0);
		sc.close();

	}

}
