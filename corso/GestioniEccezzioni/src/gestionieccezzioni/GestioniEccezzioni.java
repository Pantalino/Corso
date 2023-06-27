package gestionieccezzioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioniEccezzioni {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

//        try {
//            int c = a/b;
//        } catch (NullPointerException | ArithmeticException e) {
//            
//            System.out.println("niente panico è solo diviso 0" +e.getMessage());
//            
//        }catch(Exception e){
//            System.out.println("altro errore sconosciuto, ma lo gestisto lo stesso"+e.getMessage());
//        }
//        
//        finally{//non è obbliogatorio
//            System.out.println("io vengo eseguito comunque, anche se non ci sono errori");
//        }
//        
//        //////////////////////////////////////////////////////
//        
//        try {
//              int[] arr={1,2,3,4,5};
//        
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            
//            System.out.println("hai superatp i limiti dell'array" + e.getMessage());
//        }finally{
//            System.out.println("faccio qualcos'altro");
//        }
//      
//        //////////////////////////////////////////////////////////////////////
//        
//        
//        Scanner s = new Scanner(System.in);
//        System.out.println("inserisci un numero");
//     
//       
//        
//        try {  
//             int num = s.nextInt();
//             s.nextLine();
//        } catch (InputMismatchException e) {
//            System.out.println("non e' un input valido");
//            s.nextLine();
//        }
        /////////////////////////////////////////////////////////////////////////////
        int z = 5;

//        try {
//            if (z == 5) {
//                throw new Exception("il 5 mi fa schifo");
//            }
//        } catch (Exception e) {
//
//            System.out.println("sto gestendo l'errore che hai sollevato " + e.getMessage());
//        }

        /////////////////////////////////////////////////////////////////////////
        
        //propagazione delle eccezioni
//        try {
//            System.out.println("blocco try esterno");
//            try {
//                 System.out.println("blocco try interno");
//                throw new Exception(" eccezzione sollevata dal blocco interno");
//
//            } catch (ArithmeticException e) {
//                System.out.println("gestisco l'eccezione del blocco interno");
//            }finally{
//                System.out.println("finally del blocco interno");
//            }
//
//        } catch (Exception e) {
//            System.out.println("sto gestendo l'eccezione che non e' gestita dal blocco interno");
//        }finally{
//            System.out.println("finally del blocco esterno");
//        }

//        try {//checked
//            leggiNumero("ciao");
//        } catch (Exception e) {
//            System.out.println("errore di conversione");
//        }
//        
//        try {//checked
//               double ris = dividi(10, 0);
//               System.out.println(ris);
//        } catch (Exception e) {
//            
//            System.out.println("errore divisione per 0 " + e.getMessage());
//        }finally{
//            System.out.println("faccio qualcos'altro");
//        }
     
        try {
                analizzaInput("ciao");
        } catch (Exception e) {
            System.out.println("errore "+e.getMessage());
        }
    

    }//fine man
    
    
    static void leggiNumero(String stringa) throws Exception{
        System.out.println("provo a convertire una stringa in un numero");
     
        int i = Integer.parseInt(stringa);
            System.out.println("i = "+i); 
  
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    static double dividi(int uno, int due) throws Exception{
        double c = uno/due;
        return c;
    }
    
    ////////////////////////////////////////////////////////////////////////
    
    static void analizzaInput(String input) throws Exception{
        
        if (input == null || input.isEmpty()) {
            throw new Exception("input non può essere vuoto");
        }
    }

}
