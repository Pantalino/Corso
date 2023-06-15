

package dado;

import java.util.Random;


public class Dado {


    public static void main(String[] args) {
      
        Random r = new Random();
        int dado1 = r.nextInt(1, 7);
        int dado2 = r.nextInt(1, 7);
        
        System.out.println(dado1);
        System.out.println(dado2);
        
        if (dado1 == 6 && dado2 ==6) {
            System.out.println("Hai lanciato 6 in tutte e due i dadi");
        }else{
            System.out.println("Hai perso");
        }
    }

}
