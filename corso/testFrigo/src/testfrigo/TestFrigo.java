

package testfrigo;

import java.util.ArrayList;
import java.util.Arrays;


public class TestFrigo {


    public static void main(String[] args) {
      
        Cibo[] arrCibi = new Cibo[3];
        
        Cibo pizza = new Cibo("Pizza", 7.0);
        Cibo hamburger = new Cibo("Hamburger", 4.99);
        Cibo gelato = new Cibo("gelato", 2.50);
        
        arrCibi[0]=pizza;
        arrCibi[1]=hamburger;
        arrCibi[2]=gelato;
        
        System.out.println("Nel frigo ci sono questi cibi");
        for(Cibo cibo : arrCibi){
            System.out.println(cibo);
        }
        
        //oggetti anonimi
        Cibo[] dispensa={new Cibo("pasta", 0.89),new Cibo("pollo", 10.0), new Cibo("insalata", 2.4)};
        for (Cibo cibo : dispensa) {
            System.out.println(cibo);
        }
        
        System.out.println("////////////////////////////////////");
        
        ArrayList<Cibo> lista = new ArrayList(Arrays.asList(dispensa));
        lista.add(new Cibo("formaggio",25.99));
        //callback function
        lista.forEach(cibo->System.out.println(cibo));
           System.out.println("////////////////////////////////////");
        lista.forEach(System.out::println);
    }

}
