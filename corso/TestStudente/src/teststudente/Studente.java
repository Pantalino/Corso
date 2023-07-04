
package teststudente;

import personatest.Persona;

public class Studente extends Persona{
    
    //Si può fare l'ereditarietà solo quando la classe che si vuole estendere
    // è un tipo di dato della classe base
    //Risponde alla è un?
    
    private String materia;

    public Studente(String materia, String nome, String cognome, int eta) {
        super(nome, cognome, eta);//chiamo il costruttore di persona
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public String toString() {
        return super.toString()+" studio "+materia; 
    }
    
    public void studia(String materia){
        System.out.println("Studia "+materia);
    }
    
    public void dorme(){
        System.out.println("dormo ad occhi aperti");
    }
    
    
    
}
