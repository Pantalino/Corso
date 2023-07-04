

package testdipendente;

import java.util.ArrayList;


public class TestDipendente {


    public static void main(String[] args) {
      
        ArrayList<Dipendente> d = new ArrayList();
        
        int somma = 0;
        d.add(new Dipendente(1500, "Mario", "Rossi", 33));
        d.add(new Dipendente(1000, "Giuseppe", "Verdi", 51));
        d.add(new Dipendente(1300, "Aldo", "Baglio", 60));
        
        for (Dipendente dipendente : d) {
            dipendente.aumento(10);
            System.out.println(dipendente.getStipendio());
            somma+=dipendente.getStipendio();
            
        }
        
        System.out.println("Somma stipendi "+somma);
    }

}
