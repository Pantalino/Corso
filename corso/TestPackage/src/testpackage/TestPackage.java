

package testpackage;

import package2.Class2;
import personatest.Persona;

public class TestPackage {


    public static void main(String[] args) {
      
        Class1 c = new Class1(10, 20);
        System.out.println(c);
        
        Class2 c2 = new Class2("a", "b");
        System.out.println(c2);
//        c2.d="d";

        Persona p = new Persona("Mario", "Rossi", 30);
        System.out.println(p);
        
        
    }

}
