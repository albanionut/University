/*Scrieti o functie recursiva cu numele cifre care primeste prin pramentrul n un numar natual si furnizeaza: 
- prin parametrul p numarul format cu cifrele pare ale lui n, 
- prin parametrul i numarul format cu cifrele impare ale lui n. 
Exemplu: 
In urma apelului cifre(4536597,p,i); variabila p va fi egala cu 46, iar i cu 53597.*/
import java.util.Scanner;

public class difPozParImpar {

	public static int diferenta(int v[], int i, int n) {
		if (n == i)
			return 0;
		if (i % 2 == 0)
			return v[i] + diferenta(v, i++, n);
		return -1 * v[i] + diferenta(v, i++, n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cate elemente are vectorul?: ");
		int n = sc.nextInt();
		int v[] = new int[n];
		System.out.println("Vectorul este?: ");
		for (int i = 1; i < n+1; i++) {
			v[i] = sc.nextInt();
		}
		System.out.println(diferenta(v,1,n));
		sc.close();
		
	}

}
