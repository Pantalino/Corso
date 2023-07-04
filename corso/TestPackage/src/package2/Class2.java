package package2;


public class Class2 {

    private String a;
    private String b;
    
    String c;//visibilià di default, visibile solo all'interno el suo package
    public String d;
    

    public Class2(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Class2{" + "a=" + a + ", b=" + b + '}';
    }
    
    
    
}
