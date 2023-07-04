package testastratte;

public abstract class Animale {
    
    //Se una classe ha un metodo astratto. tuttala classe è astratta
    private String nome;
    private int eta;

    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Animale{" + "nome=" + nome + ", eta=" + eta + '}';
    }
    
    //metodo astratto che deve essere fatto un override
    public abstract void parla();
    public abstract void mangia();
}
