package com.unitbv.operatii;

import com.unitbv.model.Jucator;

import java.util.ArrayList;
import java.util.List;

public class OperatiiJucator {

    public static boolean addJucator(Jucator jucator, List<Jucator> jucatori){
        return jucatori.add(jucator);
        //Adaugam inca un jucator in lista de jucatori.
    }

    public static void abandonJucator(ArrayList<Jucator>jucatori,Jucator jucatorulNostru ){
        if (jucatori.contains (jucatorulNostru)){
            //Daca lista de jucatori contine jucatorulNostru.
            //(Adica jucatorul ce vrea sa abandoneze)
            for (int i = 1; i <jucatori.size() ; i++) {
                if (jucatori.get(i).equals(jucatorulNostru)){
                    //Parcurgem toata lista de jucatori.
                    //Cautam pe ce pozitie se afla jucatorulNostru in lista cu equals.
                    jucatori.get(i).setStatus(false);
                    //Pentru ai putea face statusul false.
                }

            }

        }

    }


}
