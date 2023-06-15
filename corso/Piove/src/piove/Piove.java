package piove;

public class Piove {

    public static void main(String[] args) {
        /*     
        int voto = 8;
        
        if(voto >= 6){
            System.out.println("Sono promosso");
        }else{
            System.out.println("bocciato");
        }
        
        //operatore ternario
        
        //1 condizione
        //2 cosa fare se vero
        // cosa fare se falso
        
       //System.out.println(voto >=6?"promosso":"bocciato"); 
        String ris = voto >=6?"promosso":"bocciato";
        
        
        int a = 10;
        int b = 10;
        
        int max;
        
        if(a>b){
            max=a;
        }else if(a==b){
            max=0;
        }else{
            max=b;
        }
        
        max=(a>b)?a:(a==b)?0:b;
        
        
        
        System.out.println(ris);
         */

        ///////////////////////////////////////////////////////////////////////
        int i = 3;

        if (i == 0) {
            System.out.println("i==0");
        } else if (i == 1) {
            System.out.println("i==1");
        } else if (i == 2) {
            System.out.println("i==2");
        } else {
            System.out.println("i è diverso da 0,1,2");

            switch (i) {
                case 0://if
                    System.out.println("i==0");
                    break;
                case 1://else if
                    System.out.println("i==1");
                    break;
                case 2://else if
                    System.out.println("i==2");
                    break;
                default://else
                    System.out.println("i è diverso da 0,1,2");
            }

            String lettera = "i";
            String messaggio;

            switch (lettera) {
                case "a"://if
                case "e"://else if
                case "i"://else if
                case "o"://else if
                case "u"://else if
                    messaggio = "vocale";
                    break;
                default://else
                    messaggio = "consonante";

            }
            System.out.println(messaggio);

            switch (lettera) {
                case "a","e","i","o","u" ->
                    messaggio = "vocale";
                default ->
                    messaggio = "consonante";
            }
            
            
        }

    }

}
