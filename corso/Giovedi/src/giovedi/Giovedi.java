package giovedi;

import java.util.Scanner;


public class Giovedi {


    public static void main(String[] args) {
        
        //scambio del valore di 2 variabili usando una 3° varibiale temporanea
      int x = 10;
      int y = 3;
      
      System.out.println("x= " + x + " y= " + y);
      
      int temp;
      temp = x;
      x = y;
      y = temp;
      
      System.out.println("x= " + x + " y= " + y);

      Scanner in = new Scanner(System.in); 
        System.out.println("Nome: ");
      String nome = in.nextLine();
        System.out.println("Età: ");
      int eta = in.nextInt();
        System.out.println("Colre: ");
        in.nextLine(); //per pulire l'invio
        String colore = in.nextLine();
        
    }

}
