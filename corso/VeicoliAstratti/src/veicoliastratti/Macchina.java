package veicoliastratti;

public class Macchina extends Veicolo{

    public Macchina(String marca, String modello) {
        super(marca, modello);
    }

    
    
    @Override
    public void parti() {

        System.out.println("la Mavvhina parte con la chiave");
        
    }

    @Override
    public void frena() {
        
        System.out.println("la macchina si ferma con il pedale");
    }
    
}
