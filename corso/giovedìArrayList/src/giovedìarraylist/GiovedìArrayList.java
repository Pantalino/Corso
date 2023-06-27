package giovedìarraylist;

import java.util.ArrayList;

public class GiovedìArrayList {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();

        lista.add("eolo");
        lista.add("cucciolo");
        lista.add("mammolo");
        lista.add("brontolo");
        lista.add("dotto");
        lista.add("pisolo");
        lista.add("trichecolo");

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++){
        System.out.println(lista.get(i));
        }
        
        System.out.println("**********************************");
        for (String nani : lista) {
            System.out.println(nani);
        }
        
        System.out.println("***************************");
        
        //funzione di callbacj
        lista.forEach(nani ->System.out.println(nani));
        
        System.out.println("*******************/********************");
        
        lista.forEach(System.out::println);
        
        lista.remove("eolo");
        //lista.remove(0);
        
        System.out.println(lista);
        
        lista.set(3, "dottolo");
        
        System.out.println(lista);
        
        System.out.println("*********************************");
        
        stampaNani(lista);
    }

    static void stampaNani(ArrayList nani){
        nani.forEach(System.out::println);
    }
    
   
    
    
}
