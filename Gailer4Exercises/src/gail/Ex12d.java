package gail;

import java.util.Scanner;

public class Ex12d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The price per pound of package A: ");
		double pounda = sc.nextDouble();
		System.out.println("The percent lean in package A: ");
		double percenta = sc.nextDouble();
		System.out.println("The price per pound of package B: ");
		double poundb = sc.nextDouble();
		System.out.println("The percent lean in package B: ");
		double percentb = sc.nextDouble();
		double x, y;
		x = (pounda * 100) / percenta;
		y = (poundb * 100) / percentb;
		
		System.out.println("Package A cost per pound of lean:= "+x);
		System.out.println("Package B cost per pound of lean:= "+y);
		
		
		if (x <= y)
			System.out.println("\n Package A is the best value " + x);
		else
			System.out.println("\n Package B is the best value " + y);
		sc.close();

	}

}
