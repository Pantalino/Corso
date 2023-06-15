package cicli;

import java.util.Random;

public class Cicli {

    public static void main(String[] args) {

        //il for è composto da 3 parti
        //1 inizializazzione del contatore
        //2 condizione
        //3 incremento
        /*       
        for(int i = 0; i<10; i++){
            System.out.print(i + " ");
        }
         */
 /*        for (int i = 5; i < 16; i++) {
            System.out.print(i +" ");
        }
         */
 /*          for (int i = 10; i > 0; i--) {
               System.out.print(i+" ");
        }
         */
 /*
            for (int i = 0; i < 10; i+=2) {
                System.out.print(i+" ");
        }
         */
/*
        for (int i = 0; i < 256; i++) {
            System.out.println((char)+i);
        }
*/
 /* 
        int contatore = 0;
        for (; contatore < 10;) {
            System.out.println(contatore);
            contatore++;
        }
*/
 /*
        for (int i = 0, j=10; i < 10; i++,j--) {
            System.out.println(i+ " " + j);
        }
*/
 /*
        String a = " ciao a tutti";
        
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
*/
 
 /*
        String frase = "ciao a tutti oggi piove";
        int numeroSpazi = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            
            
            if (frase.charAt(i)== ' ') {
                numeroSpazi++;
            }
        }
        
        System.out.println("ci sono " + numeroSpazi+ " spazi");
*/
 /*
        Random r = new Random();
        int casuale =r.nextInt(1,21);//1-20
        boolean trovato=false;//stati iniziale
        int posizione=0;
        
        System.out.println("casuale " + casuale);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i==casuale){ 
               trovato=true;//cambiamento di stato
               posizione=1;
            break;
            }
        }
        //controllo dello stato a fine codice
        System.out.println("Il numero "+casuale+" è stato trovato in posizione "+posizione);
 */
 
        for (int i = 1; i <= 10; i++) {//per ogni ciclo di questo
            for (int j = 1; j <= 10; j++) {//stampo tutti i valori
                System.out.print(i*j + "\t");//stampo in linea
            }System.out.println("");//stampo a capo dopo il ciclo esterno
        }
    }

}
