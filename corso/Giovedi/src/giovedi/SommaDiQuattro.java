/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giovedi;

import java.util.Scanner;

/*
Scrivere un programma SommaDiQuattro
 */
public class SommaDiQuattro {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //somma di 4 input con due variabile
/*
        int num,somma= 0;       
        System.out.println("Inserire il primo numero: ");
        num = in.nextInt();
        somma+=num;
        in.nextLine();
        System.out.println("Inserire il secondo numero: ");
        in.nextInt();
        somma+=num;
        System.out.println("Inserire il terzo numero: ");
        in.nextInt();
        somma+=num;
        System.out.println("Inserire il quarto numero: ");
        in.nextInt();
        somma+=num;

        System.out.println("La somma è: " + somma);
*/        

//somma di 4 input con una variabile
         int somma = 0; //accumulatore
         //somma incrementale
        System.out.println("Inserire il primo numero: ");
        somma += in.nextInt();;
        System.out.println("Inserire il secondo numero: ");
        somma += in.nextInt();
        System.out.println("Inserire il terzo numero: ");
        somma += in.nextInt();
        System.out.println("Inserire il quarto numero: ");
        somma += in.nextInt();
        

        System.out.println("La somma è: " + somma);
    }
    
}
