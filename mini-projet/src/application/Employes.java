package application;

public class Employes extends Salarié{
	private  double Hsupp;
	private  double PHsupp;
	
	public double getHsupp() {
		return Hsupp;
	}
	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}
	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	
	public Employes(Double recrutement, int matricule, String nom, String email, double salaire, double hsupp,
			double pHsupp ) {
		super(recrutement, matricule, nom, email, salaire);
		Hsupp = hsupp;
		PHsupp = pHsupp;
	}
	@Override
	public String toString() {
	return "employes [HSupp=" + Hsupp + ", PHsupp=" + PHsupp + ", nom=" + Nom + ", email=" + Email
			+ ", recrutement=" + Recrutement + ", salaire=" + salaire + ", getHsupp()=" + getHsupp()
			+ ", getPHsupp()=" + getPHsupp() + ", getnom()=" + getNom() + ", getEmail()=" + getEmail()
			+ ", toString()=" + super.toString() + ", getRecrutement()=" + getRecrutement() + ", getSalaireF()="
			+ getSalaire() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
public void setSalaireF () {
	if (this.getRecrutement()<=2005) {
		this.salaire = 400 + this.PHsupp;
	}else {
		this.salaire = 280 + this.PHsupp;
	}
}
}


	


