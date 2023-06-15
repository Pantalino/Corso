package gestionedate;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class GestioneDate {

    public static void main(String[] args) {
/*
        Calendar c = Calendar.getInstance();

        //questo per formattare una data
        SimpleDateFormat sdf = new SimpleDateFormat("'Oggi è il: ' dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(c.getTime()));

        System.out.println("Giorno: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mese: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Anno: " + c.get(Calendar.YEAR));

        //formattazione numeri
        double d = 3.141589751;

        //questo serve per formattare un numero
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(d));

        Random r = new Random();//gli estremi superiori non sono mai compresi
        int numero = r.nextInt(101);

        System.out.println(numero);

        double virgola = r.nextDouble(50, 101);
        System.out.println(df.format(virgola));

        boolean b = r.nextBoolean();
        System.out.println(b);

        //////////////////////////////
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci età: ");
        int eta = in.nextInt();

        if (eta > 18) {//ramo vero
            System.out.println("Sei maggiorenne");
        } else if (eta == 18) {//ramo falso
            System.out.println("Hai proprio 18 anni");
        } else {
            System.out.println("Sei minorenne");

        }
*/

/*
    boolean sole = false;
    double temp = 22;
    
        if (sole || temp > 20) {
            System.out.println("esco");
        }else{
            System.out.println("sto a casa");
        }
     */
/*
     int voto1= 5;        
     int voto2= 5;        
     int voto3= 9;
     
        if (voto1 >= 6 || voto2 >= 6 &&  voto3 >= 6) {
            System.out.println("Promosso");
        }else{
            System.out.println("Bocciato");
        }
*/

    }

}
