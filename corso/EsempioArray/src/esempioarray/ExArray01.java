
package esempioarray;

import java.util.Random;

public class ExArray01 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int casuale = r.nextInt(1,21);
        System.out.println("numero casuale: "+casuale);
        int[] arrayCasuale = new int[10];
        
        for (int i = 0; i < arrayCasuale.length; i++) {
            arrayCasuale[i]=casuale;
            System.out.println(casuale);
        } System.out.println(Arrays.toString(arrayCasuali))
    } 
}
