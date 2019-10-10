package divide_et_impera;

import java.util.Scanner;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random numar = new Random();
		int nr = numar.nextInt(10000);
		int a =0;
		boolean ok = false;
		while (ok == false) {
			System.out.println("Numarul introdus este=");
			 a = sc.nextInt();
			if (a == nr) {
				System.out.println("Numarul introdus corespunde");
			ok = true;
			}
			else if (a > nr)
				System.out.println("Numarul este prea mare");
			else
				System.out.println("Numarul este prea mic");

		}
	}

}
