package application;

import java.util.Map;
import java.util.TreeMap;

public class Entreprise {
	private String NomE;
	Map<Integer, Salarié> salari = new TreeMap<Integer,Salarié>();
	public String getNomE() {
		return NomE;
	}
	public void setNomE(String nomE) {
		NomE = nomE;
	}
	public Map<Integer, Salarié> getSalari() {
		return salari;
	}
	
	public Entreprise(String nomE, Map<Integer, Salarié> salari) {
		super();
		NomE = nomE;
		this.salari = salari;
	}
	@Override
	public String toString() {
		return "Entreprise [NomE=" + NomE + ", salari=" + salari + "]";
	}


}

