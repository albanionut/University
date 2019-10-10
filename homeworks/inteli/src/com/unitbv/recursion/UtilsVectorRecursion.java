package com.unitbv.recursion;

import java.util.Scanner;

public class UtilsVectorRecursion {
    public UtilsVectorRecursion() {
    }

    public static Scanner sc = new Scanner(System.in);

    public static void citireVector(int i, int n, int a[]) {
        System.out.println("Elementul:" + i);
        if (i < n) {
            a[i] = sc.nextInt();
            citireVector(i + 1, n, a);
        }
    }

    public static void afisareVector(int i, int n, int a[]) {
        if (i < n) {
            System.out.print(a[i] + " ");
            afisareVector(i + 1, n, a);
        }
    }

    public static int sumaVector(int i, int n, int a[]) {
        if (i == n) return 0;
        else
            return a[i] + sumaVector(i + 1, n, a);
    }

    public static int produsVector(int i, int n, int a[]) {
        if (i == n) return 1;
        else
            return a[i] * produsVector(i + 1, n, a);
    }

}
