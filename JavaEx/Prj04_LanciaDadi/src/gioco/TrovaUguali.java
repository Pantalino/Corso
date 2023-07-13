package gioco;


import model.Dado;

public class TrovaUguali {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		final int partite = 100_000;
		int vittoria = 0;
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < partite; i++) {
			int res1 = d1.lancia();
			int res2 = d2.lancia();
			
			if (res1 == res2) {
				vittoria++;
				//System.out.println("Hai vinto con una coppia di " + res1);
			}else {
				//System.out.println("Hai perso!");
			}
		}
		
		double percVittoria = (double)vittoria / partite *100;
		System.out.println("Hai giocato " + partite + "volte");
		System.out.println("Hai vinto " + vittoria + "volte");
		System.out.println("La percetuale di successo " + percVittoria + "%");
		System.out.println(start);
	}

}
