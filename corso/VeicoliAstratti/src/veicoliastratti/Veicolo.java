package veicoliastratti;

public abstract class Veicolo {
    
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Veicolo{" + "marca=" + marca + ", modello=" + modello + '}';
    }
    
    public abstract void parti();
    public abstract void frena();
    
}
