package com.unitbv.service;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilsVector {
    public UtilsVector() {
    }

    public static Scanner sc = new Scanner(System.in);


    /**
     * Sum of the members of vector.
     *
     * @param vector the vector
     * @return the int
     */
    public int sumaVector(ArrayList<Integer> vector) {
        int sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += vector.get(i);
        }
        return sum;
    }

    /**
     * The produc of vector members.
     *
     * @param vector the vector
     * @return the int
     */
    public int produsVector(ArrayList<Integer> vector) {
        int produs = 1;

        for (int i = 0; i < vector.size(); i++) {
            produs = produs * vector.get(i);
        }
        return produs;
    }

//    public static void citireVector(ArrayList<Integer> vector){
//        for (int i = 0; i < vector.size() ; i++) {
//            vector.get(i)=sc.nextInt();
//        }
//    }

}
