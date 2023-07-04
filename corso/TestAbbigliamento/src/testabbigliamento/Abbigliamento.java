package testabbigliamento;

/*
Scrivere la classe astratta "Abbigliamento" che ha gli attributi
taglia, prezzo, colore e quantità e il metodo applicaSconto.

Scrivere la classe "Maglia" e "Pantalone", sottoclassi della classe"Abbigliamento.

La classe "Magliia" ha in più l'attributo "tipo(t-shirt o felpa), 
mentre la classe "Pantalone" ha l'attributo "modello(jeans o bermuda)"

Si ottiene uno sconto del 10% se si acquistano 2 o più felpe rosse.

Si ottiene uno sconto del 20% sui pantaloncini con la taglia xl

Nel main creare un elenco di "Abbigliamenti", calcolare eventuali sconti e calcolare il totale spesp(prezzo*quantitàAcquistata)
*/

public abstract class Abbigliamento {
 
    private String taglia;
    private double prezzo;
    private String colore;
    private static int quantita = 0;

    public Abbigliamento(String taglia, double prezzo, String colore) {
        quantita++;
        this.taglia = taglia;
        this.prezzo = prezzo;
        this.colore = colore;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public static int getQuantita() {
        return quantita;
    }

    public static void setQuantita(int quantita) {
        Abbigliamento.quantita = quantita;
    }
    
    public abstract void applicaSconto();

    @Override
    public String toString() {
        return "Abbigliamento{" + "taglia=" + taglia + ", prezzo=" + prezzo + ", colore=" + colore + '}';
    }
    
    
    
}


