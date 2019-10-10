package com.exercitii;

import java.util.Scanner;

public class MinPareVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimul este :" + min);
    }
}
