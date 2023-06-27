
package esercizio01;

import java.util.Random;
import java.util.Scanner;


public class Esercizio02 {
    
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    Random casuale = new Random();
    
    int numMisterioso=casuale.nextInt(11);
        for (int i = 10; i > 0; i--) {
            System.out.println("Inserisci un numero");
            int indovina = in.nextInt();
            
            if (indovina==numMisterioso) {
                System.out.println("Bravo hai vinto con" +(11 - i) + " tentativi");
                break;
            }else{
                
                System.out.println("sbagliato");
                if(numMisterioso<indovina){
                    System.out.println("Il numero segreto è più piccolo " +(i-1)+" tentativi");
                }else{
                    System.out.println("Il numero segreto è più grande " +(i-1)+" tentativi");
                }
            }
        }
    
}
}
