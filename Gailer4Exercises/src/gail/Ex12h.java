package gail;
import java.util.Scanner;


public class Ex12h {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ani: ");
		int ani=sc.nextInt();
		System.out.println("Ora: ");
		float ora=sc.nextFloat();
		if (ani > 13) {
			if (ora>17.00 && ora<22.00) System.out.println("Biletul costa 8$");
			else if (ora>22.00)  System.out.println("Biletul costa 4$");
			else System.out.println("Biletul costa 5$");
		}
		else {
			if (ora>17.00 && ora<22.00) System.out.println("Biletul costa 4$");
			else
			if (ora>22.00)  System.out.println("Politica ne obliga sa nu va dam bilet");
			else   System.out.println("Biletul costa 2$");
		}
		
		sc.close();
		
		
		
		
	

	}

}
