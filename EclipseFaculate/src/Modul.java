import java.util.Scanner;

public class Modul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("x=");
	int x=sc.nextInt();
	int m;
	if (x>=0)
		 m=x;
		else m=-x;
	System.out.print("Modulul lui x este "+m);
	sc.close();
		
	}

}
