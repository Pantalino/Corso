package modelli;

public class LibroDemo {

	public static void main(String[] args) {

		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		
		libro1.titolo = "Immaginazione e Lavoro";
		libro1.prezzo = 5.99;
		libro2.titolo = "IO, robot";
		libro2.prezzo = 10.5;
/*		
		System.out.println("Libro: " +  libro1.titolo + " -- " + "Prezzo: " + libro1.prezzo);
		System.out.println("-----------------------");
		System.out.println("Libro: " +  libro2.titolo + " -- " + "Prezzo: " + libro2.prezzo);
*/
		Disco d1 = new Disco();
		
		d1.titolo = "Dogocrazia";
		d1.prezzo = 1000;
	
		//System.out.println("\nTitolo: "+ d1.titolo + " --- " + "Prezzo: " + d1.prezzo );
		
		System.out.println(libro1.stampa());
		System.out.println(libro2.stampa());
		System.out.println(d1.stampa());
		
		double totale = libro1.prezzo + libro2.prezzo + d1.prezzo;
		
		System.out.println(totale);
	}

}
