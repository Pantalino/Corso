package veicoliastratti;

public class Bicicletta extends Veicolo{

    public Bicicletta(String marca, String modello) {
        super(marca, modello);
    }

    
    
    @Override
    public void parti() {
        System.out.println("parto con le gambe");
    }

    @Override
    public void frena() {

        System.out.println("freno con le manopole");
    }
    
}
