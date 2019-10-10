package sort;

import java.util.*;

public class kount {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Length of array: ");
		 int n = sc.nextInt();
		 int[] a = new int[n];
		 int[] b = new int[n];
		 int[] c = new int[n];
		 
		 System.out.println("Elements of array: ");
		 
		 
		 for (int i = 0; i <= n - 1; i++) {
			 a[i] = sc.nextInt();
			 b[i] = 0;
			 c[i] = a[i];
			 
		 }
		 for (int i = 0; i <= n-2; i++) {
			 for (int j = i+1; j <= n-1; j++) {
				 if (a[i] > a[j]) {
					  b[i] ++;
				 }
				 else {
					 b[j] ++;
					
				 }
			 }
		 }
		 
		 
		 for (int i = 0; i <= n-1; i++) {
			 a[b[i]] = c[i];
			
		 }
			for (int i = 0; i <= n-1; i++)  {
				System.out.print(a[i] + " ");
			}
		 sc.close();	 
		 
		 
	 }
	}


