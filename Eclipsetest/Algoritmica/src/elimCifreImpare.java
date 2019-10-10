import java.util.Scanner;

public class elimCifreImpare {
	public static int eliminare(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 == 0)
			return n % 10 + 10 * eliminare(n / 10);
		return eliminare(n / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numarul este: ");
		int n = sc.nextInt();
		System.out.println("Noul numar: " + eliminare(n));
		sc.close();

	}

}
