package testcellulare;


public class Cellulare {
    
    private String marca;
    private String modello;
    private double credito;
    private int numeroChiamate;
    private final double PREZZO_AL_MINUTO=0.20;

    public Cellulare(String marca, String modello, double credito) {
        this.marca = marca;
        this.modello = modello;
        this.credito = credito;
    }


    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaodello() {
        return modello;
    }

    public void setMaodello(String modello) {
        this.modello = modello;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getNumeroChiamate() {
        return numeroChiamate;
    }

    public void setNumeroChiamate(int numeroChiamate) {
        this.numeroChiamate = numeroChiamate;
    }

    @Override
    public String toString() {
        return "Cellulare{" + "marca=" + marca + ", maodello=" + modello + ", credito=" + credito + ", numeroChiamate=" + numeroChiamate + ", PREZZP_AL_MINUTO=" + PREZZO_AL_MINUTO + '}';
    }
    
    
    public void chiamata(double minuti){
        credito-=(PREZZO_AL_MINUTO*minuti);
        numeroChiamate++;
    }
    
    public boolean creditoEsaurito(){
        return credito<=0;
    }
            
    
    /**
     * Metodo per ricaricare il cellulare
     * @param soldi double
     */
    public void ricarica(double soldi){
        credito+=soldi;
        
    }
    
}
