package com.iag.model;

public class Joc {
	private static int id;
	private int idJucator;
	private final Jucator jucator1, jucator2;
	private final String tur;

	public Joc(Jucator jucator1, Jucator jucator2, String tur) {
		super();
		this.idJucator = ++id;
		this.jucator1 = jucator1;
		this.jucator2 = jucator2;
		this.tur = tur;
	}

	public int getIdJucator() {
		return idJucator;
	}

	public Jucator getJucator1() {
		return jucator1;
	}

	public Jucator getJucator2() {
		return jucator2;
	}

	public String getTur() {
		return tur;
	}

	@Override
	public String toString() {
		return "Joc [id=" + idJucator + "jucator1=" + jucator1 + ", jucator2=" + jucator2 + ", tur=" + tur + "]" ;
		
	}

}
