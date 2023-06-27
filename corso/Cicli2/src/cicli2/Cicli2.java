package cicli2;

import java.util.Scanner;

public class Cicli2 {

    public static void main(String[] args) {

        /*    
        System.out.println("ciclo con while");
        
        int i=20;
        
        do{
           
            System.out.print(i + " ");
            i++;
        } while(i<10);
         */
        Scanner in = new Scanner(System.in);
/*
        do {
            System.out.println("Metti un numero, 0 per uscire");

        } while (in.nextInt() > 0);
 */        
        char lettera = 'a';
        int vocale = 0;
        int consonante = 0;
        while (lettera <= 'z') {
            System.out.println(lettera);
            lettera++;
        }

        for (lettera = 'a'; lettera <= 'z'; lettera++) {
            System.out.println(lettera);
        }

        for (lettera = 'a'; lettera <= 'z'; lettera++) {

            switch (lettera) {
                case 'a','e','i','o','u':
                    System.out.println(lettera + " e` una vocale");
                    vocale++;

                    break;
                default:
                    System.out.println(lettera + " e` una consonante");
                    ;
                    consonante++;
            }
        }

        System.out.println("ci sono " + vocale + " vocali e " + consonante + " consonanti");

        for (int i = 0; i < 10; i++) {
            //
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            //           if (i==5) {
            //               break;
        }
        
        
        while (true) {            
            System.out.println("Inserisci un numero, 0 per uscire");
            int numero=in.nextInt();
            System.out.println("Hai inserito "+numero);
            
            if (numero==0) {
                System.out.println("Sei uscito. Ciao");
                break;       
            }
        }
        
        int val=0;
        for (;;) {
            System.out.println(val);
            if(val==10){
                break;
            }
            val++;
        }
        
    }

}


