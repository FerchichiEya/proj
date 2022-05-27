package application;

import application.Salari�;

public class Salari� implements  Comparable<Salari�>  {
	protected Double Recrutement;
	protected int Matricule;
	protected String Nom;
	protected String Email;
	protected double salaire;
	public Double getRecrutement() {
		return Recrutement;
	}
	public void setRecrutement(Double recrutement) {
		Recrutement = recrutement;
	}
	public int getMatricule() {
		return Matricule;
	}
	public void setMatricule(int matricule) {
		Matricule = matricule;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public Salari�(Double recrutement, int matricule, String nom, String email, double salaire) {
		super();
		Recrutement = recrutement;
		Matricule = matricule;
		Nom = nom;
		Email = email;
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "Salari� [Recrutement=" + Recrutement + ", Matricule=" + Matricule + ", Nom=" + Nom + ", Email=" + Email
				+ ", salaire=" + salaire + "]";
	}
	
	public void setSalaireF(Double salaire) {
		if (this.getRecrutement()<=2005) {
			this.salaire = 400;
		}else {
			this.salaire = 280;
		}
	}


	@Override
	public int compareTo(Salari� o) {
		 if(this.getSalaire() ==o.getSalaire()) return 0;
	        else if (this.getSalaire()>o.getSalaire()) return 1;
	        else return -1;
	}
}
	



