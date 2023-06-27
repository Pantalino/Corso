package esempioarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EsempioArray {

    public static void main(String[] args) {
        /*
        int[] y;// è un array

        y = new int[10];

        //gli elementi di un array non inizialializzato valgono
        //0 per int
        //stringa vuota per string
        //false per boolean
        int[] unArray = new int[10];

        unArray[0] = 12;
        unArray[1] = 32;
        unArray[2] = 55;

        System.out.println(unArray[3]);
        System.out.println(unArray[2]);

        String[] colori = {"bianco", "nero", "giallo", "blu"};

        System.out.println(colori[2]);
        System.out.println(colori.length);

        int lunghezza = colori.length;
        System.out.println(colori[lunghezza - 2]);

        for (int i = 0; i < colori.length; i++) {
            System.out.println(colori[i]);
        }

        for (String colore : colori) {
            System.out.println(colore);
        }

        double[] arrDouble = new double[5];

        arrDouble[0] = 1.5;
        arrDouble[1] = 2.5;
        arrDouble[3] = 3.5;
        System.out.println(arrDouble[4]);
        System.out.println("--------------");
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
        }
        System.out.println("-------------");

        for (int i = 0; i < arrDouble.length; i += 2) {
            System.out.println(arrDouble[i]);
        }

        System.out.println("--------");

        for (double elementi : arrDouble) {
            System.out.println(elementi);
        }
        System.out.println("----------------------------");
        ////////////////////////////////////////////

        int[] arr = new int[5];
        //popoliamo l'array con indice del for
        for (int contatore = 0; contatore < 5; contatore++) {
            arr[contatore] = contatore;
        }
        //lo stampiamo
        for (int valori : arr) {
            System.out.println(valori);
        }

        System.out.println("-------------------------------");

        String[] animali = {"cane", "gatto", "criceto", "giorgio", "pesce", "tricheco"};

        /*
          int lungh = animali[0].length();
          System.out.println(lungh);
         */
 /*
        System.out.println("----------------");

        String lunghe = animali[0];
        for (String s : animali) {
            if(s.length()>lunghe.length()){
                lunghe=s;
            }
        }
        System.out.println("La più lunga è "+lunghe);
        
        /////////////////////
        
        String stringa="ciao,come,stai?";
        char[] car = stringa.toCharArray();
        
        for (int i = 0; i < car.length; i++) {
            System.out.print(car[i]);
           
        }
        
        /////////////////////////////
        
        String[] arrStringhe=stringa.split(",");
        
        for (String a : arrStringhe) {
            System.out.println(a);
        }
        
        int[] numeri={4,2,1,3};
        
        //per stamapare un array come se fosse un primitivo
        System.out.println(Arrays.toString(numeri));
        
        //////////////////////////////////////////////////
        System.out.println("----------------------------------");
        int[] arrCasuali= new int[10];
        
        Random r = new Random();
        
        for (int i = 0; i < arrCasuali.length; i++) {
         arrCasuali[i]=r.nextInt(0,21);
        }
        System.out.println(Arrays.toString(arrCasuali));
        for (int valori : arrCasuali) {
            System.out.println(valori);
        }
        
        //////////////////////////////////////
        
        System.out.println("Quanti numeri vuoi?");
        Scanner in = new Scanner(System.in);
        
        int quanti=in.nextInt();
        in.nextLine();
        
        int[] valori= new int[quanti];
        
        for (int i = 0; i < valori.length; i++) {
            System.out.println("Inserisci il numero alla posizione " + i);
            valori[i]=in.nextInt();
            
        }
        
        for (int i : valori) {
            System.out.println(i);
        }
        
        //selection sort
        
        for (int i = 0; i < valori.length; i++) {//ogni valorie
            for (int j = 0; j < valori.length; j++) {
                if(valori[i]<valori[j]){
                    int temp=valori[i];
                    valori[i]=valori[j];
                    valori[j]=temp;
                }
                
            }
           
        } 
        System.out.println("Array ordinato: " + Arrays.toString(valori));
        Arrays.sort(valori);
         */
        //////////////////////////////////////////////////////////

        int[][] arrMulti = {
            {1, 2, 3},//0
            {4, 5, 6}//1
        };

        System.out.println(arrMulti[0][1]);

        String[][] arrMult2 = {
            {"mario", "rossi"},
            {"giuseppe", "verdi"},
            {"ugo", "bianchi"}
        };
        
        System.out.println(arrMult2[1][1]);
        //due righe 3 colonne
        int[][] multiplo = new int[2][3];//un array che contiene 2 array ciascuno 3 righe
        multiplo[0][0]=1;
        multiplo[0][1]=2;
        multiplo[0][2]=3;
        multiplo[1][0]=4;
        multiplo[1][1]=5;
        multiplo[1][2]=6;

        for (int[] righe : multiplo) {
            for (int colonne : righe) {
                System.out.println(colonne);
            }
        }

        //////////////////////////////////////////////
        
        String[] frutti = {"Arance", "limoni","banane","lamponi"};
        String[] verdure = {"carote", "pomodori","piselli","insalata"};
        
        String[][] vegetali = {frutti,verdure};
        
        for (String[] f : vegetali) {
            for (String v : f) {
                System.out.println(v);
            }
        }
        
    }
}
