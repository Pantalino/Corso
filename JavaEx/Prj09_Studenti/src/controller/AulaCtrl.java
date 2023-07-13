package controller;

import java.util.ArrayList;

import model.Registro;
import model.Studente;

public class AulaCtrl {

	private Registro r;
	
	public AulaCtrl(String nomeCorso) {
		this.r = new Registro(nomeCorso);
	}
	
	public void addStudente(Studente s) {
		this.r.getElenco().add(s);
	}
	public void deleteStudente(Studente s) {
		this.r.getElenco().remove(s);
	}
	
	public ArrayList<Studente> getStudenti(){
		return this.r.getElenco();
	}
}
