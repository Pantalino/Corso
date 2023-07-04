package testastratte;

public class Cane extends Animale{

    public Cane(String nome, int eta) {
        super(nome, eta);
    
    }

    
    
    @Override
    public void parla() {
        
        System.out.println("Il cane fa bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("mangia le osse");
    }
    
    
    
}
