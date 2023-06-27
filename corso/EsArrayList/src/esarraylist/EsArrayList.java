

package esarraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class EsArrayList {


    public static void main(String[] args) {
      //collection
      //gli arraList non accettano tipo primitivi
      ArrayList<Character> lettere = new ArrayList();
       
      lettere.add('a');
      lettere.add('b');
      lettere.add('c');
        
        System.out.println(lettere);
        
       lettere.add(0,'d');
        System.out.println(lettere);
        
        System.out.println("elemento in posizione 2 " + lettere.get(2));
        System.out.println("dimensione " + lettere.size());
        
        for (int i = 0; i < lettere.size(); i++) {
            System.out.println(lettere.get(i));
            
        }
        System.out.println("//////////////////////////////");
        for (Character caratteri : lettere) {
            System.out.println(caratteri);
        }
        System.out.println("//////////////////////////////");
        
        //-> lamba expression
        //funzione di callbacj -> una funzione con parametro di ingresso di un altra funzione
        lettere.forEach(/*si mette una funzione*/ caratteri->System.out.println(caratteri));
        
        System.out.println("//////////////////////////////");
        //method reference
        lettere.forEach(System.out::println);
        
        System.out.println("//////////////////////////////");
        
        System.out.println(lettere.contains('a'));//true se esiste
        
        System.out.println("//////////////////////////////");
        
        System.out.println("e` vuoto: " + lettere.isEmpty());//vero se vuoto
        
        System.out.println("//////////////////////////////");
        
        Character[] c={'x','y','z'};
        
        ArrayList<Character> lettere2 = new ArrayList(Arrays.asList(c));//trasformo un array in un arralist
        
        lettere2.add('w');
        
        for (Character car : lettere2) {
            System.out.println(car);
        }
        
        System.out.println("//////////////////////////////");
        
        lettere2.forEach( elemento->System.out.println(elemento));
        
        System.out.println("//////////////////////////////");
        
        lettere2.forEach(System.out::println);
        
        System.out.println("1//////////////////////////////");
        
        lettere2.set(0, 'a');
        
        System.out.println(lettere2);
        
        lettere2.forEach(System.out::println);
        
        System.out.println("//////////////////////////////");
        
        lettere2.remove(2);
        
        System.out.println(lettere2);
        
        //riepilogo metodi arrayList
        /*
        .add() aggiunge un elemento in coda
        .add(0,'x') aggiunge l'elemento x in prima posizione
        .remove(i) rimuove l'elemento alla posizione i
        .size() ritorna l'elemento all'indice i
        .get(i) ritorna l'elementp all'indice i
        .set(i,a) assegna il valore a nella posizione i
        .isEmpty() controlla se l'arrayList è vuoto
        .contains(x) cerca l'elemento x nell'array
        */
        
        ArrayList misto = new ArrayList();
        
        misto.add(1);
        misto.add("ciao");
        misto.add(true);
        misto.add(3.14);
        
        System.out.println(misto);
        
        for (Object valore : misto) {
            System.out.println(valore);
        }
        
        misto.forEach(valore->System.out.println(valore));
        
        misto.forEach(System.out::println);
        
        System.out.println("//////////////////////////////");
        
        stampa(misto);
    }//main

    
    static void stampa(ArrayList parole){
        for (Object val : parole) {
            System.out.println(val);
        }
    }
}
