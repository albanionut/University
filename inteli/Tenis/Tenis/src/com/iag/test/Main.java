package com.iag.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iag.model.Jucator;

import com.iag.operatii.OperatiiJucator;
import com.iag.operatii.OperatiiScor;
import com.iag.operatii.OperatiiTurnee;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Jucator> copy = new ArrayList<>();
		List<Jucator> jucatori = new ArrayList<>();
		Jucator jucator1 = new Jucator("Mihai");
		Jucator jucator2 = new Jucator("Ana");
		Jucator jucator3 = new Jucator("Anita");
		Jucator jucator4 = new Jucator("Gigi");
		Jucator jucator5 = new Jucator("Mimi");
		Jucator jucator6 = new Jucator("Anuta");
		Jucator jucator7 = new Jucator("Mami");
		Jucator jucator8 = new Jucator("Anda");

		OperatiiJucator.adaugaJucator(jucatori, jucator1);
		OperatiiJucator.adaugaJucator(jucatori, jucator2);
		OperatiiJucator.adaugaJucator(jucatori, jucator3);
		OperatiiJucator.adaugaJucator(jucatori, jucator4);
		OperatiiJucator.adaugaJucator(jucatori, jucator5);
		OperatiiJucator.adaugaJucator(jucatori, jucator6);
		OperatiiJucator.adaugaJucator(jucatori, jucator7);
		OperatiiJucator.adaugaJucator(jucatori, jucator8);

		
		int inputUser;
		
		do {
			System.out.println("                      MENU                          ");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| Press 0 for exit                                 |");
			System.out.println("| Press 1 to play tournament                       |");
			System.out.println("| Press 2 to display players                       |");
			System.out.println("| Press 3 to display winner                        |");
			System.out.println("| Press 4 to retreat a player                      |");
			System.out.println("| Press 5 to display games                         |");
			System.out.println("| Press 6 to display player with max played sets   |");             
			System.out.println("|--------------------------------------------------|");
			inputUser = sc.nextInt();
			switch (inputUser) {

			case 0:

				System.out.println("------Exit-----");
				break;
			case 1:
				OperatiiTurnee.turneu(jucatori,copy);
				break;
			case 2:
				
				System.out.println(" Jucatori inscrisi turneu : \n");
				OperatiiJucator.afisareJucatori(jucatori);
				break;
			case 3:
				int nr0=0;
				for (int i = 0; i < jucatori.size(); i++) {
					if(jucatori.get(i).isStatus())
						nr0++;
				}
				if(nr0==1)
				for (int i = 0; i < jucatori.size(); i++) {
					if(jucatori.get(i).isStatus() )
						System.out.println(jucatori.get(i).getNume()+" este castigator.");
					
				}else System.out.println("Turneul nu s-a terminat.");
				break;
			case 4:
				OperatiiJucator.retragereJucator(jucatori);
				break;
			case 5:
				OperatiiTurnee.afisareJocuri(OperatiiTurnee.distribuireJucatori(jucatori, "1"));
				break;
			case 6:
				
				System.out.println(OperatiiScor.setMax(copy));
				break;
			default:
				break;
			}
		} while (inputUser!= 0);

	}

}
