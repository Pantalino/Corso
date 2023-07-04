package testfrigo;


public class Cibo {
    
   private String nome;
   private double prezzo;

    public Cibo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    

    @Override
    public String toString() {
        return nome + prezzo;
    }
    
    
    
}
