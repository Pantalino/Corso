

package testprodotto;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Calendar;

=======
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
/*
Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco,
una descrizione del prodotto e il suo prezzo

Realizzare una classe prodotto con le oppurtune variabili d'istanza elencate precedentemente, 
e in più una variabile di tipo cliente(Riferimento alla classe cliente, identificato dal nome e dall'età
da persona. e da numero tessera) e i varimetodi get, set e toString

Aggiungere alla classe Prodotto un metodo applicaSconto che mofichi il prezzo del prodotto
diminuendo del 5% solo se il cliente ha più di 60 anni

il gestore del negozio vuole fare una distinzione tra prodotti Alimentati e quelli Non Alimentari

Ai prodotti alimentari viene infatti associata una data di scdenza, 
mentre a quelli non alimentari il materiale princiale di cui sono fatti(carta, vetro, plastica...)

Realizzare le sottoclassi Alimentari e NonAlimentari estendendo la classe Prodotto

Modificare le due sottoclassi specializzando il metodo applicaSconto in modo che nel caso dei
prodotti alimentari venga applicato uno sconto ulteriore del 20% se la dataè a meno 
di 10 giorni dalla dat attuale, mentre nel caso dei prodotti nonAlimentari venga applicato uno
sconto del 10% se il prodotto è composto da materiale riciclabile

Creare un elendo di prodotti Alimentari e NonAlimentari, stamparne l'elenco visuallizando
le informazioni dei clienti e tutte le caratteristiche e il prezzo dei prodotti pagati dagli utenti
*/
public class TestProdotto {


    public static void main(String[] args) {
      
<<<<<<< HEAD
       
        Cliente c = new Cliente("Mario", "Rossi", 70);
        
        System.out.println(c);
        
     ArrayList<Prodotto> p = new ArrayList();
     
     p.add(new NonAlimentari("vetro", "specchio", 10.0, c));
     p.add(new NonAlimentari("plastica", "penna", 10.0, c));
     
        
     Calendar dLatte = Calendar.getInstance();
     dLatte.set(2023,6,8);        
     p.add(new Alimentari(dLatte, "latte", 10.0, c));
=======
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
    }

}
