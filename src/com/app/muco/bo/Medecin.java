package com.app.muco.bo;

public class Medecin extends Personne {
	private String specialisation;

	public Medecin(int id, String nom, String prenom, String email, String motDePasse, String admin,
			String specialisation) {
		super(id, nom, prenom, email, motDePasse, admin);
		this.specialisation = specialisation;
	}
	public Medecin(String nom, String prenom, String email, String motDePasse, String specialisation) {
		super(nom, prenom, email, motDePasse);
		this.specialisation = specialisation;
	}
	public Medecin( String nom, String prenom, String email, String motDePasse, String specialisation, int id) {
		super(nom, prenom, email, motDePasse, id);
		this.specialisation = specialisation;
	}
	@Override
	public String toString() {
		return "Medecin [specialisation=" + specialisation + "]";
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	
	
}
