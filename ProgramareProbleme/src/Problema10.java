import java.util.Scanner;
public class Problema10 {

	public static void main(String[] args) {
		float A, R;
		Scanner sc = new Scanner(System.in);
		float pi = (float) 3.14;
		System.out.println("Aria=");
		A = sc.nextFloat();
		R = (float) Math.sqrt(A / pi);
		System.out.println(R);
		sc.close();

	}

}
