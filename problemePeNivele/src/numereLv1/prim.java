package numereLv1;
import java.util.Scanner;
public class prim {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numarul este: ");
		int x =sc.nextInt();
		int nr=0;
		for(int i=1;i<=x;i++) {
			if (x % i ==0) 
			   nr=nr+1;
		}
		if (nr==2) 
			System.out.println("Numarul de mai sus este prim ");
		else System.out.println("Numarul de mai sus NU este prim");
			
	sc.close();
	}

}
