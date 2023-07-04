package testlibreria;

import java.util.ArrayList;
import java.util.Arrays;

/*
Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro:
titolo, autore, presso e che contenga il costruttore e tutti i metodi get/set e toString

Scrivere poi una classe Libreria, che rappresenti iun insieme di libri, e che contenga
il costruttore, o metodi get/set e toStringed un metodo trova, che accetta in ingresso
un autore e restituisca i titoli di tutti i libri scritti da quell'autore

Creare la classe TestLibreria per testare le 2 classi
 */
public class Libreia {

    private String nome;
    private ArrayList<Libro> libri = new ArrayList();

    public Libreia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiLibro(Libro l) {
        libri.add(l);
    }
    
    public void aggiungiLibri(Libro[] l) {
        libri.addAll(Arrays.asList(l));
    }

    public String trovaLibri(String a) {
        String elenco = "";
        for (int i = 0; i < libri.size(); i++) {
            if(libri.get(i).getAutore().equals(a)){
                elenco += libri.get(i).getTitolo()+"\n";
            }
           
        }
        return "Autore = "+a+"\nLibri = " +elenco;
    }

//    public void elenco(){
//        libri.forEach(System.out::println);
//    }
    @Override
    public String toString() {
        String elenco = "";

        for (Libro libro : libri) {
            elenco += libro.getTitolo() + " ";
        }
        return "Libreria " + nome + "\nLibri " + elenco;

    }
}
