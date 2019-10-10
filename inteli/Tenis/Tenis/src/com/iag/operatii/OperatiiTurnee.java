package com.iag.operatii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.iag.model.Joc;
import com.iag.model.Jucator;
import com.iag.model.ScorJoc;
import com.iag.model.Set;

public class OperatiiTurnee {
	// distribuire pe jocuri (incremental) cu random
	public static List<Joc> distribuireJucatori(List<Jucator> jucatori, String tur) {
		int jocs= jucatori.size()/2;
		List<Joc> jocuri = new ArrayList<>();
		Collections.shuffle(jucatori);
		int a = 0, b = 1,nr=0;
		for (int i = 0; i < jucatori.size(); i++) {
			if(jucatori.get(i).isStatus())
				nr++;
		}
		if(nr%2==1)
			jocs--;
		while (jocuri.size() < jocs) {
			if (jucatori.get(a).isStatus() && jucatori.get(b).isStatus()) {
				Jucator juc1 = jucatori.get(a);
				Jucator juc2 = jucatori.get(b);

				Joc joc = new Joc(juc1, juc2, tur);
				jocuri.add(joc);
				a += 2;
				b += 2;

			} else if (!jucatori.get(a).isStatus())
				a += 2;
			else if (!jucatori.get(b).isStatus())
				b += 2;
		}
	
	return jocuri;

	}

	public static Jucator alegeCastigator(Joc joc) {
		Random rand = new Random();
		int nr = rand.nextInt(2);
		if (nr == 1)
			return joc.getJucator1();
		return joc.getJucator2();
	}
	public static Jucator turneu(List<Jucator> jucatori, List<Jucator>copy) {
		for (int i = 0; i < jucatori.size(); i++) {
			if(!jucatori.get(i).isStatus()) {
				copy.add(jucatori.get(i));
				jucatori.remove(jucatori.get(i));}
		}
		StringBuilder sb = new StringBuilder();
		int nr = jucatori.size();
		for (int j = 1; j <= nr / 2+1; j++) {
			List<Joc> jocuri = OperatiiTurnee.distribuireJucatori(jucatori, new String (sb.append(j).toString()));
			OperatiiTurnee.afisareJocuri(jocuri);
			System.out.println();
			nr = jucatori.size();
			if (nr % 2 == 1)
				nr--;
			else
				nr++;
			List<Set> seturi = new ArrayList<>();
			for (int i = 0; i < nr / 2; i++) {
				ScorJoc scor = new ScorJoc(jocuri.get(i), seturi);
				int x = OperatiiScor.seteazaScor(scor);
				if (x == 1) {
					System.out.println("Jucatorul : " + jocuri.get(i).getJucator1() + " a castigat");
					copy.add(jocuri.get(i).getJucator2());
					jucatori.remove(jocuri.get(i).getJucator2());
				} else {
					System.out.println("Jucatorul : " + jocuri.get(i).getJucator2() + " a castigat");
					copy.add(jocuri.get(i).getJucator1());
					jucatori.remove(jocuri.get(i).getJucator1());
				}
			}
			System.out.println();
			
		}
		copy.add(jucatori.get(0));
return jucatori.get(0);

	}
	public static void afisareJocuri(List<Joc> joc) {
		for (int i = 0; i < joc.size(); i++) {
			System.out.println(joc.get(i).toString());
		}
	}
}
