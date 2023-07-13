package interfaccia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Libreria {

	public static void main(String[] args) {

		List<Libro> libri = new ArrayList<>();
		libri.add(new Libro(1, "Siddharta", 10.0));
		libri.add(new Libro(2, "Rapture", 15.0));
		libri.add(new Libro(3, "Alba Chiara ", 9.50));
		libri.add(new Libro(4, "Zanna Bianca", 20.0));
		libri.add(new Libro(5, "DarkSiders", 13.30));
		
		//ComparatorePrezzo cp = new ComparatorePrezzo();		
		//Comparator<Libro> cp = (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo);
		
		//Collections.sort(libri, (libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo);

		
		libri
			.stream()//con stream posso scorrere la collezione 
			.sorted((libro1, libro2) -> Double.compare(libro1.prezzo, libro2.prezzo))
			.forEach(l -> System.out.println(l));
		     Collections.sort(libri, (libro1, libro2) -> libro1.id - libro2.id);

		
		
		
	}

}
