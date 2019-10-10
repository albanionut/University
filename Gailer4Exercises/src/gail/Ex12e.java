package gail;

import java.util.Scanner;

public class Ex12e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year of Birth: ");
		int birth = sc.nextInt();
		System.out.println("Current year: ");
		int cyear = sc.nextInt();
		int age;
		if (cyear > birth)
			age = cyear - birth;
		else
			age = 100 + cyear - birth;
		System.out.println("Your age: " + age);
		sc.close();

	}

}
