package com.unitbv;

import com.unitbv.model.Joc;
import com.unitbv.model.Jucator;
import com.unitbv.operatii.OperatiiJucator;
import com.unitbv.operatii.OperatiiTurneu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Joc> jocs=new ArrayList<>();
        int capat;
        Scanner sc=new Scanner(System.in);
        Jucator jucator1 = new Jucator("Alban");
        Jucator jucator2 = new Jucator("Sandel");
        Jucator jucator3 = new Jucator("Marcel");
        Jucator jucator4 = new Jucator("Florin");

        List<Jucator> jucatori=new ArrayList<>();
        OperatiiJucator.addJucator(jucator1,jucatori);
        OperatiiJucator.addJucator(jucator2,jucatori);
        OperatiiJucator.addJucator(jucator3,jucatori);
        OperatiiJucator.addJucator(jucator4,jucatori);
        capat = jucatori.size();
        OperatiiTurneu.grupareJucatori(jucatori,jocs,capat);

    }
}
