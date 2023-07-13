package app;

import model.Prodotto;
import controller.ProdottoCtrl;

public class Carrello {

	public static void main(String[] args) {

		int posti = MioScanner.leggiInt("Scontrino da quanti posti?");
		
		ProdottoCtrl ctrl = new ProdottoCtrl(posti);
		
		for (int i = 0; i < posti; i++) {
			
			String nome = MioScanner.leggiString("Nome Prodotto");
			String codice = MioScanner.leggiString("codice Prodotto");
			double prezzo = MioScanner.leggiDouble("Prezzo Prodotto");
			Prodotto p = new Prodotto(codice,nome, prezzo);
			ctrl.addProdotto(p);
		}
		
		System.out.println("Il carrello contiene");
		System.out.println(ctrl.stampa());
	}

}
