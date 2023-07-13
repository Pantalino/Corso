package controller;
import model.Libro;

public class LibroCtrl {
	
	//Propietà
	public Libro[] scaffale = new Libro[100];
	
	//Metodi --> CRUD
	//CREATE
	public void addLibro(int pos, Libro libro) {
		scaffale[pos] = libro;
	}
	//READ
	public Libro getLibroByPosizione(int pos) {
		return scaffale[pos];
	}
	public Libro[] getAll() {
		return scaffale;
	}
	//UPDATE
	public void upadteLibro(int pos, Libro libro) {
		scaffale[pos] = libro;
	}
	//DELETE
	public void deleteLibro(int pos) {
		scaffale[pos] = null;
	}

	
}
