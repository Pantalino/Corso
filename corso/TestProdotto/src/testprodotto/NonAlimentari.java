
package testprodotto;

/*
Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco,
una descrizione del prodotto e il suo prezzo

Realizzare una classe prodotto con le oppurtune variabili d'istanza elencate precedentemente, 
e in più una variabile di tipo cliente(Riferimento alla classe cliente, identificato dal nome e dall'età
da persona. e da numero tessera) e i varimetodi get, set e toString

Aggiungere alla classe Prodotto un metodo applicaSconto che mofichi il prezzo del prodotto
diminuendo del 5% solo se il cliente ha più di 60 anni

Il gestore del negozio vuole fare una distinzione tra prodotti Alimentati e quelli Non Alimentari

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
public class NonAlimentari extends Prodotto{
    
<<<<<<< HEAD
    String materiale;
    
     public NonAlimentari(String materiale, String descrizione, double prezzo, Cliente c) {
        super(descrizione, prezzo, c);
        this.materiale = materiale;
    }
    
     
    @Override
        public void applicaSconto(){
        
            if(materiale.equalsIgnoreCase("carta")||materiale.equalsIgnoreCase("vetro")||materiale.equalsIgnoreCase("plastica")){
                prezzo-=prezzo/0.1;//10%
            }
            super.applicaSconto();//sconto per età >60
            
            
        }

    @Override
    public String toString() {
        return super.toString()+" materiale "+materiale; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        
        
   
=======
    private String carta;
    private String vetro;
    private String plastica;

    public NonAlimentari(String carta, String vetro, String plastica, int codiceBarre, String descrizione, int prezzo, Cliente cliente) {
        super(codiceBarre, descrizione, prezzo, cliente);
        this.carta = carta;
        this.vetro = vetro;
        this.plastica = plastica;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public String getVetro() {
        return vetro;
    }

    public void setVetro(String vetro) {
        this.vetro = vetro;
    }

    public String getPlastica() {
        return plastica;
    }

    public void setPlastica(String plastica) {
        this.plastica = plastica;
    }

    @Override
    public String toString() {
        return "NonAlimentari{" + "carta=" + carta + ", vetro=" + vetro + ", plastica=" + plastica + '}';
    }
    
    
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
    
}
