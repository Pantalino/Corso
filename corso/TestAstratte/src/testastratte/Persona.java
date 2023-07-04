package testastratte;


public class Persona extends Animale{

    public Persona(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void parla() {
        System.out.println("Ciao");
    }

    @Override
    public void mangia() {
        System.out.println("gli spaghetti");
    }
    
}
