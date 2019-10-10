import java.util.Scanner;
import java.util.Random;

public class Randomm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int x = rand.nextInt(10000);
		System.out.println("Numarul a fost generat");
		int OK = 0;
		while (OK == 0) {
			int n = sc.nextInt();
			if (n == x) {
				System.out.println("0");
				OK = 1;
			}
			if (n > x)
				System.out.println("1");
			if (n < x)
				System.out.println("-1");
		}

		sc.close();
	}

}
