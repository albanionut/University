package com.iag.operatii;
	import java.util.List;

import com.iag.model.Jucator;

public class OperatiiJucator {
	

		public static boolean adaugaJucator(List<Jucator> jucatori, Jucator jucator) {
			return jucatori.add(jucator);
		}

		public static void retragereJucator(List<Jucator> jucatori) {
			Jucator jucator=new Jucator();
			do {
				
						jucator=jucatori.get((int) (Math.random()*jucatori.size()));
				}while(!jucator.isStatus());
			jucator.setStatus(false);
			System.out.println("Jucatorul "+jucator+" s-a retras");
			}
		

		public static void afisareJucatori(List<Jucator> jucatori) {
			for (int i = 0; i < jucatori.size(); i++) {
			System.out.println(jucatori.get(i).toString());
			}
		}
		
//		public static void sorteazaJucatori(List<Jucator> jucatori) {
//			Jucator aux;
//			for (int i = 0; i < jucatori.size(); i++) {
//				if(!jucatori.get(i).isStatus()) {
//					aux=jucatori.get(i);
//					jucatori.set(i,jucatori.get(jucatori.size()-1));
//					jucatori.set(jucatori.size()-1, aux);
//				}
//			}
//		}
	}
