package testgarage;

import java.util.ArrayList;


public class Garage {
    
    private String nome;
    private ArrayList<Macchina> macchine = new ArrayList();

    public Garage(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo che parcheggia un veicolo
     * @param veicolo una macchina da inserire nell'arrayList macchine
     */
    public void parcheggia(Macchina veicolo){
       macchine.add(veicolo);
    }
    /**
     * Metodo che parcheggia un insieme di veicoli
     * @param veicoli arraylist di veicoli da parcheggiare
     */
    public void parcheggiaTutti(ArrayList<Macchina> veicoli){
        for (Macchina macchina : veicoli) {
            macchine.add(macchina);
        }
    }
    
    public void elenco(){
        macchine.forEach(System.out::println);
    }
}
