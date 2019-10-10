package com.unitbv.service;

import com.unitbv.recursion.UtilsVectorRecursion;

import java.util.Scanner;


public class Main {
    public static int[] a;
    private static UtilsMatrix utilsMatrix;//declarare obiect
    private static UtilsVector utilsVector;
    private static UtilsNumber utilsNumber;
    public static UtilsVectorRecursion utilsVectorRecursion;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        utilsMatrix = new UtilsMatrix();//initializare obiectului
        utilsVector = new UtilsVector();
        utilsNumber = new UtilsNumber();
        utilsVectorRecursion = new UtilsVectorRecursion();


        for (int i = 0; i < 10; i++) {
            System.out.print(utilsNumber.fibonacci(i) + " ");
        }

        System.out.println();
        System.out.println("n=");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(utilsVectorRecursion.sumaVector(0, n, a));
        System.out.println(utilsVectorRecursion.produsVector(0, n, a));


    }

}
