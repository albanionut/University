package com.iag.model;

import java.util.ArrayList;
import java.util.List;

public class ScorJoc {
	private Joc joc;
	private List<Set> seturi;

	public ScorJoc(Joc joc, List<Set> seturi) {
		super();
		this.joc = joc;
		this.seturi = seturi;
	}

	public Joc getJoc() {
		return joc;
	}

	public void setJoc(Joc joc) {
		this.joc = joc;
	}

	public List<Set> getSeturi() {
		return seturi;
	}

	public void setSeturi(List<Set> seturi) {
		this.seturi = seturi;
	}

	public boolean addSet(Set set) {
		if (set != null) {
			if (seturi == null)
				seturi = new ArrayList<>();
			if (seturi.size() < 3)
				return seturi.add(set);
		}
		return false;
	}

	public boolean removeSet(Set set) {
		if (set != null)
			if (seturi != null)
				return seturi.remove(set);
		return false;
	}

	@Override
	public String toString() {
		return "ScorJoc [joc=" + joc + ", seturi=" + seturi + "]";
	}

}
