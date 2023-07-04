package testdipendente;
 
import personatest.Persona;

public class Dipendente extends Persona{
      
    private double stipendio;

    public Dipendente(double stipendio, String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return super.toString()+ " Stipendio: "+stipendio; 
    }
    
    /**
     * metodo che aumenta la percentuale solo se il dipendente ha più di 50
     * @param percentuale la percentuale
     */
    public void  aumento(int percentuale){
        if(this.getEta() > 50){
            stipendio+=(stipendio*percentuale/100);
            System.out.println("Stipendio aumentato di "+percentuale+"%");
        }else{
            System.out.println("Aumento non concesso");
        }
    }
    
    
    
    
}
