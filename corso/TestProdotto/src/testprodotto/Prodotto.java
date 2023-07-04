package testprodotto;
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
public class Prodotto{

<<<<<<< HEAD
    private static int codice=0;
    private int codProdotto;
    private String descrizione;
    protected double prezzo;//lo rende visibile alle classi che ereditano da prodotto
    protected Cliente c;

    public Prodotto(String descrizione, double prezzo, Cliente c) {
        codice++;
        
        this.codProdotto = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.c = c;
    }
    
    public void applicaSconto(){
        
        if(c.getEta()>60){
            prezzo-=(prezzo*5)/100;
        }
    }

    public static int getCodice() {
        return codice;
    }

    public static void setCodice(int codice) {
        Prodotto.codice = codice;
=======
   private int codiceBarre;
   private String descrizione;
   private int prezzo;
   private Cliente cliente;

    public Prodotto(int codiceBarre, String descrizione, int prezzo, Cliente cliente) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.cliente = cliente;
    }
   
   

    public int getCodiceBarre() {
        return codiceBarre;
    }

    public void setCodiceBarre(int codiceBarre) {
        this.codiceBarre = codiceBarre;
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

<<<<<<< HEAD
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codProdotto=" + codProdotto + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", cliente=" + c + '}';
    }
    

=======
    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codiceBarre=" + codiceBarre + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", cliente=" + cliente + '}';
    }

   public void sconto(int percentuale){
       if(cliente.getEta() >= 60){
           prezzo-=(prezzo*percentuale/100);
           System.out.println("Sconto del "+percentuale);
       }
   }
>>>>>>> fb91b61d378430e1e681b7fbbfb5076a483fdb11
   
   
    
}
