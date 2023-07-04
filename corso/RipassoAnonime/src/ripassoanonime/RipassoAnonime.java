

package ripassoanonime;


public class RipassoAnonime {


    public static void main(String[] args) {
      
        
        Anonima a = new Anonima(10);
        
        System.out.println(a);
        
        a.ciao();
        
        Anonima b = new Anonima(20);
        b.ciao();
        
        Anonima c = new Anonima(30){
            
            @Override
            public void ciao(){
                System.out.println("Hello");
                canta();
            }
            
            public void canta(){
                System.out.println("ijefwjhffqweuhtuihtqerhgruh");
            }
        };
        
        c.ciao();
    }

}
