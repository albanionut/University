package com.iag.model;

public class Set {
	private int nrGamesJuc1;
	private int nrGamesJuc2;

	public Set(int nrGamesJuc1, int nrGamesJuc2) {
		super();
		this.nrGamesJuc1 = nrGamesJuc1;
		this.nrGamesJuc2 = nrGamesJuc2;
	}

	public int getNrGamesJuc1() {
		return nrGamesJuc1;
	}

	public void setNrGamesJuc1(int nrGamesJuc1) {
		this.nrGamesJuc1 = nrGamesJuc1;
	}

	public int getNrGamesJuc2() {
		return nrGamesJuc2;
	}

	public void setNrGamesJuc2(int nrGamesJuc2) {
		this.nrGamesJuc2 = nrGamesJuc2;
	}

	@Override
	public String toString() {
		return "Set [nrGamesJuc1=" + nrGamesJuc1 + ", nrGamesJuc2=" + nrGamesJuc2 + "]";
	}
}
