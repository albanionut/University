package com.unitbv.operatii;

import com.unitbv.model.Joc;
import com.unitbv.model.Jucator;
import com.unitbv.model.ScorJoc;
import com.unitbv.model.Set;

import java.util.List;
import java.util.Random;

public class OperatiiTurneu {
    public boolean addJucator(List<Jucator> jucatori, Jucator jucator) {
        return jucatori.add(jucator);
    }

    public boolean removeJucator(List<Jucator> jucatori, Jucator jucator) {
        return jucatori.remove(jucator);
    }

    public boolean addJoc(List<ScorJoc> jocuri, ScorJoc joc) {
        return jocuri.add(joc);
    }

    public boolean removeJoc(List<ScorJoc> jocuri, ScorJoc joc) {
        return jocuri.remove(joc);
    }

    public static List<Joc> grupareJucatori(List<Jucator> jucatori, List<Joc> jocuri,int capat) {

        for (int i = 1; i <capat/2 ; i++) {
            //Cat timp avem 2 jucatori.
            int randomJucator1 = new Random().nextInt(jucatori.size());
            //Cream o variabila care va fi indexul listei ,dar acest index va fi random.
            int randomJucator2 = new Random().nextInt(jucatori.size());
            if (randomJucator1 != randomJucator2) {
                Jucator jucator1 = jucatori.get(randomJucator1);
                Jucator jucator2 = jucatori.get(randomJucator2);
                if (jucator1.isStatus() && jucator2.isStatus()) {
                    Joc joc = new Joc(jucator1, jucator2, "1");
                    jocuri.add(joc);
                    //Joc-ul se adauga in lista si castigatorul acestui joc va fi ales in alta metoda.
                }
            }
            for (Joc jocurii:jocuri){
                System.out.println(jocurii);
            }

        }
        return jocuri;
    }

    //Metoda pentru a alege castigatorul random.
    public static Jucator castigatorRandom(Joc joc) {
        Random random = new Random();
        int loto = random.nextInt(2);
        if (loto == 1)
            return joc.getJucator1();
        return joc.getJucator2();
    }

    public static void seteazaScor(ScorJoc scor , OperatiiScor operatiiScor, Set set) {
        if (scor.getJoc().getJucator1().equals(OperatiiTurneu.castigatorRandom(scor.getJoc()))) {
            //scor.getSeturi().set(0, new Set(6, (int) (Math.random() * 4)));
            scor.addSet(new Set(6, (int) (Math.random() *4)));
        } else {
            //scor.getSeturi().set(0, new Set((int) (Math.random() * 4), 6));
            scor.addSet(new Set((int) (Math.random() * 4), 6));
        }
    }

}
