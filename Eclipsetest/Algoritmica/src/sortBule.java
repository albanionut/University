import java.util.Scanner;

public class sortBule {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cate elemente ale vectorul?: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int ok;
		int aux;
		do { 
		ok=1;
		for(int i=0;i<n-1;i++) {
			if (a[i]>a[i+1]) {
			aux	= a[i];
			a[i] = a[i+1];
			a[i+1]=aux;
			ok=0;
			}
		}
		
		}while (ok!=1);
			
		for (int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		sc.close();
		
			
			

	}

}
