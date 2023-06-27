

package metodi;


public class Metodi {


    public static void main(String[] args) {
      
        stampa();
        stampaConParametriIngresso("mario", "rossi");
        String risultato = stampaConParametriOutput("Dario", "Plino");
        
        System.out.println(risultato);
                                                    //parametri attuali
        System.out.println(stampaConParametriOutput("pippo", "cane"));
        
        int ris = somma(1, 2);
        System.out.println(ris);
        
        ris=somma(1, 2, 3);
        System.out.println(ris);
        
        double risDouble = somma(1.5, 3.5);
        System.out.println(risDouble);
        
        ris=somma("1","2");
        System.out.println(ris);
        
        String risString = somma("ciao","miao","bau");
        System.out.println(risString);
        
        ris=varArgs(1,2,3);
        ris=varArgs(1,2,3,4,5,6);
        ris=varArgs(1,2,3,4,5,6,7,8,9);
        System.out.println(ris);
        
        ris=modulo(10, 3);
        System.out.println(ris);
        
//        ris=isDivisibile(55, 9);
//        System.out.println(ris);

        String[] animali ={"cane","gatto","pesce","tricheco"};
        leggiArray(animali);

        String[] arrString = creaArray("dario", "peppe", "pippo");
        leggiArray(arrString);
    }
    
    //funzione ricorsive
    //le funzione ricorsive sono tutte composrte da:
    //1) un calcolo da ritornare (da mettere nel return)
    //2) una condizione di uscita che si chiama "caso base"
    
//    static void sempre(){
//        sempre();
//    }
    
    static long fattoriale(long x){
        
        if(x==0){
            return 1;
        }else{
            return x*fattoriale(x-1);//1
        }
        
    }
    
    //metodo ch prende in input un array e stampa i valori
    static void leggiArray(String[] arr){
        for (String valori : arr) {
            System.out.println(valori);
        }
    }
    
    static String[] creaArray(String uno, String due, String tre){
        String[] giorgio ={uno,due,tre};
        return giorgio;
    }
    
    
    static int varArgs(int...x){
        int tot=0;
        System.out.println("Hai passato questi valori");
        for (int i : x) {
            System.out.println(i);
            tot+=i;
            
        }
        return tot;
    }
    
    static boolean isDivisibile(int num1, int num2){
        return (num1%num2==0);
    }
    
    
    static int modulo(int a, int b){
        if(a %b == 0){
            System.out.println("é divisibile");
        }else{
            System.out.println("non è divisibile");
        }
        return a/b;
    }
    
    
    //overload stesso nome, ma diverso numero /o tipo di parametro
    
    static String somma(String a, String b, String c){
        return a+b+c;
    }
    
    static int somma(String a, String b){
        int valore1=Integer.parseInt(a);
        int valore2=Integer.parseInt(b);
        return valore1+valore2;
    }
    static int somma(int a, int b){
        return a+b;
    }
    
    static int somma(int a, int b, int c){
        return a+b+c;
    }
    
    static double somma(double a, double b){
        return a+b;
    }
    
    
    static void stampa(){
        System.out.println("ciao");
    }
    //nome+parametri=firma del metodo
    static void stampaConParametriIngresso(String valore, String valore2){
        System.out.println("il mio nome è " + valore + " il cognome è " + valore2);
    }
    
    static String stampaConParametriOutput(String valore, String valore2){
//        String scritta = "il mio nome è " + valore + " il cognome è " + valore2;
//        return scritta;
           return "il mio nome è " + valore + " il cognome è " + valore2;
    }

    
    
}
