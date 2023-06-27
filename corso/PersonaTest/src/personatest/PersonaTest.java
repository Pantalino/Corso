package personatest;

import java.util.Scanner;

public class PersonaTest {

    //1 incapsulamento
    //2 ereditarietà
    //3 polimorfismo
    
    
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        
        
        Persona persona1 = new Persona();//cotruttore di default
        
//        persona1.cognome= "Rossi";
//        persona1.nome= "Mario";
//        persona1.eta= 20;
//        persona1.maggiorenne= true;

            persona1.setNome("Mario");
            persona1.setCognome("rossi");
            persona1.setEta(20);
            persona1.setMaggiorenne(true);
            
            System.out.println("Come si chima la persona?\n "+persona1.getNome());
        
//        persona1.info();
        
        System.out.println(persona1.isMaggiorenne());
        
        
        ///////////////////////////////////////////
//        Scanner s = new Scanner(System.in);
//        System.out.println("Inseusci nome");
//        String nome = s.nextLine();
//        System.out.println("Inseusci cognome");
//        String cognome = s.nextLine();
//        System.out.println("Inseusci età");
//        int eta = s.nextInt();
        
//        Persona persona2 = new Persona(nome, cognome, eta);
//        persona2.info();
        
        
        /////////////////////////////////////////////////////
        
        Persona persona3 = new Persona("Mario", "Rossi");
//        persona3.eta=99;
//        persona3.info();

        System.out.println(persona3);
        
        //persona 1 è uguale a persona 3?
        System.out.println(persona1.equals(persona3));

        
        
    }

}
