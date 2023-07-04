package testprodotto;
import personatest.Persona;
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
public class Cliente extends Persona{
    
<<<<<<< HEAD
    static int numeroTessera = 0;
    //numero progressivo della tessera
    //non appartiene al singolo oggetto, ma appartiene alla classe
    //quindi ciascun oggetto usa lo stesso attributo
    
    int tesseraCliente = 0;
    
    public Cliente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        numeroTessera++;
        tesseraCliente=numeroTessera;
  
=======
    private int numeroTessera;

    public Cliente(int numeroTessera, String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        this.numeroTessera = numeroTessera;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(int numeroTessera) {
        this.numeroTessera = numeroTessera;
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return super.toString()+" numero tessera= " +tesseraCliente; }
    
    
    
    
    
//    private int numeroTessera;
//
//    public Cliente(int numeroTessera, String nome, String cognome, int eta) {
//        super(nome, cognome, eta);
//        this.numeroTessera = numeroTessera;
//    }
//
//    public int getNumeroTessera() {
//        return numeroTessera;
//    }
//
//    public void setNumeroTessera(int numeroTessera) {
//        this.numeroTessera = numeroTessera;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+ " Tessera: "+numeroTessera; 
//    }
//    

    
=======
        return super.toString()+ " Tessera: "+numeroTessera; 
    }
    
    
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
}
