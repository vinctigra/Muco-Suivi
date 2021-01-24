package com.app.muco.bo;

public class Patient extends Personne {
	private int sante;

	
	public Patient(int id, String nom, String prenom, String email, String motDePasse, String admin, int sante) {
		super(id, nom, prenom, email, motDePasse, admin);
		this.sante = sante;
	
	}

	public Patient( String nom, String prenom, String email, String motDePasse, int sante) {
		super( nom, prenom, email, motDePasse);
		this.sante = sante;
	}
	
	public Patient( String nom, String prenom, String email, String motDePasse) {
		super( nom, prenom, email, motDePasse);
	}
	public Patient( String nom, String prenom, String email, String motDePasse,int sante, int id) {
		super( nom, prenom, email, motDePasse, id);
		this.sante = sante;
	}
	
	public Patient() {}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	@Override
	public String toString() {
		return "Patient [sante=" + sante + "]";
	}


	
	
	
	
	
	
	
	
	
}
