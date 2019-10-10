package divide_et_impera;
import java.util.Scanner;
public class hanoi {

	static void Hanoi(int n, int i, int j) {
		if (n>0) {
			Hanoi(n-1,i,6-i-j);
			System.out.println(i + " "+ j);
		Hanoi(n-1,6-i-j,j);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n=");
		int n=sc.nextInt();
		Hanoi(n,1,2);
		

	}

}
