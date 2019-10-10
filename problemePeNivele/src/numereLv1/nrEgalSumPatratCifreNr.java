package numereLv1;

import java.util.Scanner;

public class nrEgalSumPatratCifreNr {
	/*
	 * Sa se determine toate numerele intregi mai mici decat 
	 * n care sunt egale cu
	 * suma patratelor cifrelor lor
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n=");
		int n=sc.nextInt();
		int c;
		int s=0;
		int aux;
		
		for(int i=1;i<n;i++ ) {
			s=0;
			aux=i;
			while (aux!=0){
				c=aux%10;
				c=c*c;
				s=s+c;
				aux=aux/10;	
			}
			if (s==i) System.out.print(i+" ");
			
		}
		
		sc.close();

	}

}
