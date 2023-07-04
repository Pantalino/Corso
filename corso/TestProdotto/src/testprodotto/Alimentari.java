package testprodotto;

import java.util.Calendar;

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
public class Alimentari extends Prodotto{
    
<<<<<<< HEAD
  
    Calendar dataScadenza,oggi;

    public Alimentari(Calendar dataScadenza, Calendar oggi, String descrizione, double prezzo, Cliente c) {
        super(descrizione, prezzo, c);
        this.dataScadenza = dataScadenza;
    }
    
    @Override
       public void applicaSconto(){
        
       oggi=Calendar.getInstance();
       
       long giornoTra2Data=( dataScadenza.getTimeInMillis()-oggi.getTimeInMillis())/86400000;
       
        if (giornoTra2Data<10) {//se è vicino alla scadenza
            prezzo-=prezzo*0.2;
            
        }
        super.applicaSconto();//se età>60
       
    }

    @Override
    public String toString() {
        return super.toString()+ "Data di scadenza "+dataScadenza.getTime();
    }


       
       
    
=======
    private dataScadenza = Calen
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
}
