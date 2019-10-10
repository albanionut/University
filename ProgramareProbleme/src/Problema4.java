import java.util.Scanner;

public class Problema4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("Sirul incepe de la: ");
		int k = sc.nextInt();
		int s = 0;
		if (k < n) 
		{
			for (int i = k; i <= n; i++)
				s = s + i;
			System.out.print("Suma este: "+s);
		}
		else System.out.print("Cifra cu care incepe sirul este prea mare.Sugestie sa fie <n");
		sc.close();
	}

}
