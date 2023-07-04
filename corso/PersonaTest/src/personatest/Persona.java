package personatest;

public class Persona {

    //attributi descrivono le caratteristiche della classe
    private String nome;
    private String cognome;
    private int eta;
    private boolean maggiorenne;
    private final int NUMERO_OCCHI = 2;

    ///////////////////////////////////////////////////////////////////////
    
    //javadoc
    /**
     * Questo metodo serve per assegnare il valore il nome alla persona
     * @param nome parametro stringa che rappresente uil nome della persona
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * Metodo per assegnare il cognome alla persona
     * @param cognome il cognome della persona
     */
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setEta(int eta){
        this.eta = eta;
    }
    public void setMaggiorenne(boolean maggiorenne){
        this.maggiorenne = maggiorenne;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getEta(){
        return eta;
    }
    public boolean getMaggiorenne(){
        return maggiorenne;
    }
    
    
    
    //il costruttore è un metodo che non ritorna niente, neanche void
    //ha lo stesso nome della classe
    public Persona(){};//costruttore di default derivato della classe Object,
                //che è la classe che derivano tutte le altre classi//costruttore di default derivato della classe Object,
                //che è la classe che derivano tutte le altre classi
   
    //overload del metodo costruttore
    /**
     * Costruttore con 3 parametri
     * @param nome nome della persona
     * @param cognome cognome della persona
     * @param eta età della persona
     */
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
      
    }//this si riferisce alla classe
    
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    //metodi rappresente le fuzionalità della classe. Cosa la può fare
    /**
     * metodo che mangiare la persona
     * @param cibo 
     */
    public void mangia(String cibo) {
        System.out.println("Sto mangiando " + cibo);
    }

    
    public void mangia(String pranzo, String cena) {
        System.out.println("A pranzo " + pranzo + " a cena mangio " + cena);
    }

    public void dorme() {
        System.out.println("ZzZZzzZZZzz");
    }

    public boolean isMaggiorenne() {
        return eta >= 18;
       
       }

//    public void info() {
//
//        System.out.println("La persona si chiama " + nome + " " + cognome
//                + " ha " + eta + " maggiorenne? " + maggiorenne
//                + " ha come tutti " + NUMERO_OCCHI + " occhi");
//    
//            }
    
    @Override
    public String toString(){
        return "La persona si chiama " + nome + " " + cognome
                + " ha " + eta + " maggiorenne? " + maggiorenne
                + " ha come tutti " + NUMERO_OCCHI + " occhi";
        
    }
    
    @Override
    public boolean equals(Object o){
        return this.nome.equals(((Persona)(o)).nome) && 
                this.cognome.equals(((Persona)(o)).cognome);
    }
}
