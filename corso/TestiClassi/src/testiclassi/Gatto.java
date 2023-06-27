package testiclassi;


public class Gatto {
    
    private String nome, razza;
    
    private int eta;

    /**
     * Costruttore con 3 parametri
     * @param nome String
     * @param razza String
     * @param eta int
     */
    public Gatto(String nome, String razza, int eta) {
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
    }

    /**
     * metodo che fa miagolare il gatto
     */
    public void miagola(){
        System.out.println("miao");
    }
    /**
     * metodo che fa afre le fuse al gatto
     */
    public void faiLeFusa(){
        System.out.println("prrrr");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    //il toString deriva da object e noi lo sovrascriviamo
    @Override
    public String toString() {
        return "Gatto{" + "nome=" + nome + 
                ", razza=" + 
                razza + 
                ", eta=" + 
                eta + '}';
    }

    
    
    
    
    
}
