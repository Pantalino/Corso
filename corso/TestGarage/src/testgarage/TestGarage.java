package testgarage;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGarage {

    public static void main(String[] args) {

        System.out.println("Quanti posti ha il parcheggio ");
        Scanner s = new Scanner(System.in);

        int posti = s.nextInt();//sono i posti del parcheggio 
        s.nextLine();

        Garage garage1 = new Garage("Garage1");

        //parcheggio un veicolo alla volta
        for (int i = 0; i < posti; i++) {
            System.out.println("Che macchina vuoi parcheggiare");
            garage1.parcheggia(new Macchina(s.nextLine()));
        }
        
        System.out.println("Il parcheggio ha questi veicoli");
        garage1.elenco();
    //////////////////////////////////////////////////////////////////    
        ArrayList<Macchina> veicoli = new ArrayList();
        
        for (int i = 0; i < posti; i++) {
            System.out.println("Che macchina vuoi parcheggiare?");
            veicoli.add(new Macchina(s.nextLine()));
        }
        
        //metodo che parcheggia un elenco di veicoli
        garage1.parcheggiaTutti(veicoli);
        
        System.out.println("Il parcheggio ha questi veicoli");
        garage1.elenco();

    }

}
