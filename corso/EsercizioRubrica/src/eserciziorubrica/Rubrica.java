package eserciziorubrica;

import java.util.ArrayList;
import java.util.Scanner;

class Rubrica {

    static Scanner s = new Scanner(System.in);
    static ArrayList<String> nomi = new ArrayList();

    public static void main(String[] args) {

        System.out.println("Scegli una opzione");
        System.out.println("1 inserisci nome");
        System.out.println("2 cancella");
        System.out.println("3 cerca nome");
        System.out.println("4 visualizza nomi");
        System.out.println("5 esci");

        int scelta = s.nextInt();
        s.nextLine();
        while (true) {
            switch (scelta) {
                case 1:
                   
                    inserisciNome();
                    break;
                case 2:
                    
                    cancellaNome();
                    break;
                case 3:
                  
                    cercaNome();
                    break;

                case 4:

                    visualizza();
                    break;
                case 5:
                    System.out.println("ciao");
                    return;
                default:
                    System.out.println("non e' una scelta valida");
            }
        }
    }

    static void inserisciNome(){
        System.out.println("Inserisci il nome");
        String nome = s.nextLine();
        nomi.add(nome);
        System.out.println("hai aggiunto "+nome);
    }
    
       static void cancellaNome(){
        System.out.println("Inserisci il nome da cancellare");
        String nome = s.nextLine();
        
           if (nomi.contains(nome)) {
               nomi.remove(nome); 
               System.out.println("hai eliminato "+nome);
           }else{
               System.out.println("il nome non esiste");
           }
    }
       
       static void cercaNome(){
        System.out.println("Inserisci il nome da cercare");
        String nome = s.nextLine();
        
           if (nomi.contains(nome)) {
               nomi.contains(nome); 
               System.out.println("hai cercato "+nome);
           }else{
               System.out.println("il nome non esiste");
           }
    }
       
         static void visualizza(){
      
             nomi.forEach(System.out::println);
    }
    
       
}
