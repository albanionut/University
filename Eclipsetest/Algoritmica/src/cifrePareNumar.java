/*Scrieti o functie recursiva cu numele cifre care primeste prin pramentrul n un numar natual si furnizeaza: 
- prin parametrul p numarul format cu cifrele pare ale lui n, 
- prin parametrul i numarul format cu cifrele impare ale lui n. 
Exemplu: 
In urma apelului cifre(4536597,p,i); variabila p va fi egala cu 46, iar i cu 53597.*/

import java.util.Scanner;

public class cifrePareNumar {

	public static int cifrePare(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 == 0)
			return n % 10 + 10 * cifrePare(n / 10);
		else
			return cifrePare(n / 10);
	}

	public static int cifreImpare(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 != 0)
			return n % 10 + 10 * cifreImpare(n / 10);
		else
			return cifreImpare(n / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numarul este: ");
		int n = sc.nextInt();
		int p = cifrePare(n);
		int i = cifreImpare(n);
		System.out.println("nr cu cifre pare: " + p);
		System.out.println("nr cu cifre impare: " + i);
		sc.close();
	}

}
