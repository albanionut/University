package Vectori;

import java.util.Scanner;

public class vectoriLvl1 {

	public static void main(String[] args) {
		//SUMA NR PARE SI SUMA NR IMPARE IN VECTOR
		Scanner sc = new Scanner(System.in);
		System.out.println("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		int sumaPare = 0, sumaImpare = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			if (a[i] % 2 == 0)
				sumaPare += a[i];
			else
				sumaImpare += a[i];
		}
		System.out.println("Suma pare = " + sumaPare);
		System.out.println("Suma impare = " + sumaImpare);
		//CATE NR AU EXACT 3 CIFRE NENULE
		int cifreNenule = 0;
		int nrCautate = 0;
		for (int i = 0; i < n; i++) {
			while (a[i] != 0) {
				int c = a[i] % 10;
				if (c != 0) {
					cifreNenule += 1;
				}
				if (cifreNenule == 3) {
					nrCautate = nrCautate + 1;
				}
				a[i] = a[i] / 10;

			}

		}
		System.out.println("Numere care au exact 3 cifre nenule sunt in numar de : "+nrCautate);
		sc.close();
	}

}
