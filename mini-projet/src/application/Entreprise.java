package application;

import java.util.Map;
import java.util.TreeMap;

public class Entreprise {
	private String NomE;
	Map<Integer, Salari�> salari = new TreeMap<Integer,Salari�>();
	public String getNomE() {
		return NomE;
	}
	public void setNomE(String nomE) {
		NomE = nomE;
	}
	public Map<Integer, Salari�> getSalari() {
		return salari;
	}
	
	public Entreprise(String nomE, Map<Integer, Salari�> salari) {
		super();
		NomE = nomE;
		this.salari = salari;
	}
	@Override
	public String toString() {
		return "Entreprise [NomE=" + NomE + ", salari=" + salari + "]";
	}


}

