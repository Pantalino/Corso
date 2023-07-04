

package veicoliastratti;


public class VeicoliAstratti {


    public static void main(String[] args) {
      
        
        Veicolo[] v={new Macchina("fiat", "panda"), new Bicicletta("bianchi", "corsa"), new Barca("titanic", "crociera")};
        
        for (Veicolo veicolo : v) {
            System.out.println(veicolo);
            veicolo.parti();
            veicolo.frena();
        }
        
        stampa(new Macchina("tesla", "x"));
    }
    
    static void stampa(Veicolo v){
        System.out.println(v);
        v.parti();
        v.frena();
        
    }

}
