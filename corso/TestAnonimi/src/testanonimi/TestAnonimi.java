

package testanonimi;


public class TestAnonimi {


    public static void main(String[] args) {

        Anonima a = new Anonima();
        
        a.saluta();
        a.mangia();
        
        Anonima b = new Anonima();
        
        b.saluta();
        b.mangia();
        
        
        
        Anonima c = new Anonima(){//obbligatorio il ;
        
            @Override
            public void saluta(){
                System.out.println("Hello world");
            }
        };
        
        c.saluta();
        
        
        Anonima d  = new Anonima(){
            
            public void saluta(){
                System.out.println("Bonjour monde");
                canta();
            }
            
            public void canta(){
                System.out.println("do-re-mi");
            }
        };
        d.saluta();
        
    }

}
