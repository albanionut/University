package greedy;

import java.util.Scanner;

public class waitingTime {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int mid;
	static int[] t;
	static int[] o;
	static int i;
	static int j;
	static int aux;
	
	
	public static void quickSort(int first, int last) {

		if (first < last) {
			mid = partition(first, last);
			quickSort(first, mid);
			quickSort(mid + 1, last);
		}

	}

	public static int partition(int first, int last) {
		int piv = t[first];
		 i = first;
		 j = last;
		 
		 while(i<j) {
			 
			 while(t[i] < piv) {
				 i++;
			 }
			 
			 while(t[j] > piv) {
				 j--;
			 }
			 
			 if(i < j) {
				 aux = t[i];
				 t[i] = t[j];
				 t[j] = aux;
				 
				 aux = o[i];
				 o[i] = o[j];
				 o[j] = aux;
				 
				 i++;
				 j--;
				 
			 }
			 
		 }
		
		 if(t[j] > piv) {
			 return j-1;
		 } else {
			 return j;
		 }
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("How many customers: ");
		n = sc.nextInt();
		int[] t = new int[n];
		int[] o = new int[n];
		
		System.out.println("Waiting times of customers in order: ");
		for(int i = 0; i<= n-1; i++) {
			t[i] = sc.nextInt();
			o[i] = i;
		}
		
		quickSort(0, n-1);
		
		for(int i = 0; i<= n-1; i++) {
			System.out.println("Customer " + o[i] + " needs to wait " + t[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
