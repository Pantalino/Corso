package veicoliastratti;

public class Barca extends Veicolo{

    public Barca(String marca, String modello) {
        super(marca, modello);
    }

    
    
    @Override
    public void parti() {
        System.out.println("parte con il vento");
    }

    @Override
    public void frena() {
        System.out.println("si ferma affondando");
    }
    
}
