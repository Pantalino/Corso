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

public class Maglia extends Abbigliamento{

    private String tipo;

    public Maglia(String tipo, String taglia, double prezzo, String colore) {
        super(taglia, prezzo, colore);
        this.tipo = tipo;
    }
    
    
    @Override
    public void applicaSconto() {
            
        if()
    }
    
}
