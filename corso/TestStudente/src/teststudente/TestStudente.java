

package teststudente;


public class TestStudente {


    public static void main(String[] args) {
      
        
        Studente s = new Studente("Java", "Mario", "Rossi", 20);
        
        System.out.println(s);
        
        s.studia("java");
        s.dorme();
        
    }

}
