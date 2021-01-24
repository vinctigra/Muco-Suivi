package com.app.muco.bo;

import java.util.List;

public class Soignant extends Personne {
	private String specialisation;
	private List<Patient> newPatient;
	
	public Soignant() {
		super();
	}

	public Soignant(int id, String nom, String prenom, String email, String motDePasse, String admin,
			String specialisation, List<Patient> newPatient) {
		super(id, nom, prenom, email, motDePasse, admin);
		this.specialisation = specialisation;
		this.newPatient = newPatient;
	}
	
	public Soignant(String nom, String prenom, String email, String motDePasse, String specialisation, int id) {
		super(nom, prenom, email, motDePasse,id);
		this.specialisation = specialisation;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public List<Patient> getNewPatient() {
		return newPatient;
	}

	public void setNewPatient(List<Patient> newPatient) {
		this.newPatient = newPatient;
	}

	@Override
	public String toString() {
		return "Soignant [specialisation=" + specialisation + ", newPatient=" + newPatient + "]";
	}
	
	
	

	
	
	
	

}
