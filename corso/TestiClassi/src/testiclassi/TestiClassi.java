

package testiclassi;


public class TestiClassi {


    public static void main(String[] args) {
      
        Gatto gatto1 = new Gatto("milu", "persiano", 2);
        System.out.println(gatto1.toString());
        gatto1.faiLeFusa();
        gatto1.miagola();
        gatto1.setNome("giorgio");
        System.out.println(gatto1);
        
        Macchina m = new Macchina("BWM", "S1", 15000, 150000);
        System.out.println(m.toString());
        m.guida(22);
        m.frena();
        
        Studente s=new Studente("Mario", "Rossi", 1);
        System.out.println(s.toString());
        s.setVoto1(18);
        s.setVoto2(24);
        s.setVoto1(12);
        
        double media = s.mediaVoti();
        
        System.out.println("La media e' "+media);
        System.out.println(media >=18?"promosso":"bocciato");
        
        
        
    }

}
