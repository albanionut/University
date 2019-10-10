package com.iag.poo.lab2.mains;

import com.iag.poo.lab2.classes.ClasaBaza;
import com.iag.poo.lab2.classes.ClasaDerivata;
import com.iag.poo.lab2.classes.ClasaDerivata2;

public class Main {
    public static void main(String[] args) {
        ClasaBaza clasa = new ClasaDerivata();
        System.out.println(clasa instanceof ClasaBaza);  //is used to test whether the object
        // is an instance of the specified type (class or subclass or interface).
        System.out.println(clasa instanceof ClasaDerivata);
        System.out.println(clasa.toString());
        ((ClasaDerivata) clasa).metoda();
        ClasaBaza clasa2 = new ClasaDerivata2();
        clasa = clasa2;
    }
}
