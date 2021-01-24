package com.app.muco.bo;

public class Patient extends Personne {
	private int sante;
	private String motCle;
	private String commentaire;
	
	public Patient(int id, String nom, String prenom, String email, String motDePasse, String admin, int sante,
			String motCle, String commentaire) {
		super(id, nom, prenom, email, motDePasse, admin);
		this.sante = sante;
		this.motCle = motCle;
		this.commentaire = commentaire;
	}

	public Patient( String nom, String prenom, String email, String motDePasse, int sante,
			String motCle, String commentaire) {
		super( nom, prenom, email, motDePasse);
		this.sante = sante;
		this.motCle = motCle;
		this.commentaire = commentaire;
	}
	
	public Patient( String nom, String prenom, String email, String motDePasse) {
		super( nom, prenom, email, motDePasse);
	}
	
	public Patient() {}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Patient [sante=" + sante + ", motCle=" + motCle + ", commentaire=" + commentaire + "]";
	}


	
	
	
	
	
	
	
	
	
}
