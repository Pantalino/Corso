/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piove;

import java.util.Scanner;


public class esercizio1 {
    public static void main(String[] args) {
        //dato un mese restituire il numero di giorno
        //febbrario
        //novembre
        
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci mese: ");
        String mese = in.nextLine();
        String messaggio;
        String s = "";
 /*       
        switch(mese){
            case "Aprile","Giugno","Settembre","Novembre"->messaggio="Il mese " + mese + " ha 30 giorni";
            case "Gennaio","Marzo","Maggio","Luglio","Agosto","Ottobre","Dicembre"->messaggio="Il mese " + mese + " ha 31 giorni";
            default->messaggio="Il mese " + mese + " ha 28/29";
           
        }
        System.out.println(messaggio.equalsIgnoreCase(messaggio));
*/       
        
        switch (mese.toLowerCase()) {
            case "febbraio":
               s = "28/29 giorni";
                break;
            case "aprile","giugno","settembre","novembre":
                s = "30 giorni";
                break;
            case "gennaio","marzo","maggio","luglio","agosto","ottobre","dicembre":    
                s ="31 giorni";
                break;
            default:
                System.out.println("Inserire mese valido ");
        }
                System.out.println("Il mese "+ mese + " " + s);
                    
    }
    
}
