package gail;
import java.util.Scanner;
public class Ex12g {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int a[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Cati ani ai?:");
		int ani =sc.nextInt();
		System.out.println("Cate luni ?:");
		int luni =sc.nextInt();
		System.out.println("Cate zile ?:");
		int zile =sc.nextInt();
		for(int i=0;i<luni;i++)
			zile=zile+a[i];
		zile=zile+ani*365;
		System.out.println("Ai trait: "+(zile*24*60*60)+" secunde");
		
		sc.close();
	}

}
