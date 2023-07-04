package ripassoanonime;

public class Anonima {

    private int x;

    public Anonima(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Anonima{" + "x=" + x + '}';
    }
    
    
    public void ciao(){
        System.out.println("ciao");
    }
        
}
