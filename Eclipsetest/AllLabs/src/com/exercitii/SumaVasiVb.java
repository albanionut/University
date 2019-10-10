package com.exercitii;

import java.util.Scanner;

public class SumaVasiVb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }
        for (int s = 0; s < n; s++) {
            c[s] = a[s] + b[s];
        }
        for (int s = 0; s < n; s++) {
            System.out.print(c[s] +" ");
        }
    }
}
