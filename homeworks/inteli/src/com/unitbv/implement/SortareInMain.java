package com.exercitii;

import java.util.Scanner;

public class SortareInMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n =sc.nextInt();
        int[] a = new int[n];
        System.out.println("Introduceti elementele vectoului.:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int aux = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }


}
