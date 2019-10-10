package com.iag.model;

public class Jucator {
	private int idJucator;
	private static int id;
	private String nume;
	private boolean status;
	private int seturi;
	
	public Jucator(String nume) {
		super();

		this.idJucator = ++id;
		this.nume = nume;
		this.status = true;
	}
	
	public int getSeturi() {
		return seturi;
	}

	public void setSeturi(int seturi) {
		this.seturi = seturi;
	}

	
	
	public Jucator() {
		super();
	}

	public int getIdJucator() {
		return idJucator;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idJucator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jucator other = (Jucator) obj;
		if (idJucator != other.idJucator)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jucator [idJucator=" + idJucator + ", nume=" + nume + ", status=" + status + "]";
	}

	

}
