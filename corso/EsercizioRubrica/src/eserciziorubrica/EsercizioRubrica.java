package eserciziorubrica;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioRubrica {


    /*
    una rubrica di nomi di persona
    bisogna implementare le seguenti operazioni;
    inserimento di un nome nella rubrica
    cancellazione di un nome
    ricerca di un nome
    visualizzazione di tutti i nomi nella rubrica
    bisogna presentare all'utente un menù di scelta delle diverse opzioni
    se lutente sceglie esci; altrimenti propone il menù
    ciascuna operazione deve essere un metodo separato(fuori dal main)
     */
    static ArrayList<String> rubrica = new ArrayList();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        boolean uscita = false;

        do {
            System.out.println("1) inserici\n2) elimina\n3) cerca nome\n4) stampa\n5) esci");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Inserisci nome");
                    EsercizioRubrica.addNome(s.nextLine());

                    break;

                case 2:
                    System.out.println("Inserisci nome");
                    EsercizioRubrica.removeNome(s.nextLine());
                    break;

                case 3:
                    System.out.println("Cerca nome");
                    EsercizioRubrica.searchNome(s.nextLine());
                    break;

                case 4:
                    EsercizioRubrica.viewNome();
                    break;
                case 5:
                    System.out.println("Ciao");
                    uscita = true;
                    break;
                default:
                    System.out.println("ERRORE");
                    
            }
        } while (uscita == false);

    }

    static public void addNome(String nome) {
        rubrica.add(nome);
        System.out.println("Hai aggiunto " + nome);
    }

    static public void removeNome(String nome) {
        rubrica.remove(nome);
        System.out.println("Hai eliminato " + nome);

    }

    static public void searchNome(String nome) {
        if (rubrica.contains(nome.toLowerCase()) || rubrica.contains(nome.toUpperCase())) {
            System.out.println("Nome trovato: "+nome);
        } else {
            System.out.println("Nome non trovato");
        };
    }

    static public void viewNome() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota");
        } else {
            System.out.println("Nomi nella rubrica: ");
            rubrica.forEach(System.out::println);
        }
    }

}
