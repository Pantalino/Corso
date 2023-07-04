package testpackage;

public class Class1 {
    
    private int x;
    private int y;

    public Class1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Classe1{ "+ "x= "+x+" y= "+y+" }";
    }
    
    
    
    
}
