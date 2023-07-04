

package testlibreria;

/*
Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro:
titolo, autore, presso e che contenga il costruttore e tutti i metodi get/set e toString

Scrivere poi una classe Libreria, che rappresenti iun insieme di libri, e che contenga
il costruttore, o metodi get/set e toStringed un metodo trova, che accetta in ingresso
un autore e restituisca i titoli di tutti i libri scritti da quell'autore

Creare la classe TestLibreria per testare le 2 classi
*/
public class TestLibreria {


    public static void main(String[] args) {
      
        
        Libreia libreria = new Libreia("Mondadori");
        Libro l = new Libro("Il giovane Holden", "Salinger", 10);
        
        libreria.aggiungiLibro(l);
        
        Libro l2 = new Libro("La Bibbia", "Gesù", 2);
        
        libreria.aggiungiLibro(l2);
       
        
        System.out.println(libreria);
        Libro[] arrL = {new Libro("Il lupo della steppa","Herman Hesse",12),
        new Libro("Alchimista", "Coelho", 8)};
        
        libreria.aggiungiLibri(arrL);
        
        System.out.println(libreria);
        
        String elenco = libreria.trovaLibri("Gesù");
        System.out.println(elenco);
        
        Libro l3 = new Libro("Siddartha", "Herman Hesse", 10);
        
        libreria.aggiungiLibro(l3);
        
        elenco= libreria.trovaLibri("Herman Hesse");
        System.out.println(elenco);
    }

}
