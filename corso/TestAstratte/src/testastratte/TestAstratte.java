

package testastratte;


public class TestAstratte {


    public static void main(String[] args) {
      
        
//        Cane c = new Cane("boby", 10);
//        c.mangia();
//        c.parla();


//Polimorfismo

        Animale[] a= {new Cane("Boby", 10), new Gatto("Milu", 10), new Persona("Mario", 10)};

        //polimorfismo
        for (Animale animale : a) {
            System.out.println(animale);
            animale.parla();//assume diverse forme
            animale.mangia();//metodo polimorfico
        }
    }

}
