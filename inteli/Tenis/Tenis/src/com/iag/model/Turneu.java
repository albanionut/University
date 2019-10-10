package com.iag.model;

import java.util.List;

public class Turneu {
	private List<Jucator> jucatori;
	private List<ScorJoc> jocuri;

	public Turneu(List<Jucator> jucatori, List<ScorJoc> jocuri) {
		super();
		this.jucatori = jucatori;
		this.jocuri = jocuri;
	}

	public List<Jucator> getJucatori() {
		return jucatori;
	}

	public void setJucatori(List<Jucator> jucatori) {
		this.jucatori = jucatori;
	}

	public List<ScorJoc> getJocuri() {
		return jocuri;
	}

	public void setJocuri(List<ScorJoc> jocuri) {
		this.jocuri = jocuri;
	}

	public boolean addJucator(Jucator jucator) {
		return jucatori.add(jucator);
	}

	public boolean removeJucator(Jucator jucator) {
		return jucatori.remove(jucator);
	}

	public boolean addJoc(ScorJoc joc) {
		return jocuri.add(joc);
	}

	public boolean removeJoc(ScorJoc joc) {
		return jocuri.remove(joc);
	}

	@Override
	public String toString() {
		return "Turneu [jucatori=" + jucatori + ", jocuri=" + jocuri + "]";
	}

}
