package gestionieccezzioni;

import java.util.Arrays;
import java.util.Scanner;

public class EsEccezione {

    /*
    creare un programma che permette all'utente di scegliere la lunghezzadi un array
    riempirlo con valori a piacere
    il programma deve continuare finchè l'utente non digita la parola fine
    gestire l'eccezione in cui l'utente non digita fine e mette più valori di quelli ammessi dall'array
    se si supera la lunchezza, allora svuotare l'array e far inserire di nuovo gli errori
     */
    public static void main(String[] args) {

        System.out.println("Inserisci la lunghezza");

        Scanner in = new Scanner(System.in);

        int lung = in.nextInt();
        in.nextLine();
        int[] arr = new int[lung];
        int i = 0;

        while (true) {
            System.out.println("Inserisci un numero, fine per uscire");
            String val = in.nextLine();
            if (val.equalsIgnoreCase("fine")) {
                break;
            }

            try {

                arr[i] = Integer.parseInt(val);
                i++;
                System.out.println(Arrays.toString(arr));
            } catch (NumberFormatException e) {
                System.out.println("non è un numero");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hai srperato i limiti dell'array");
                System.out.println(Arrays.toString(arr));
                arr = new int[lung];//qua azzeriamo l'array
                i = 0;
            } catch (Exception e) {
                System.out.println("Errore generico " + e.getMessage());
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
