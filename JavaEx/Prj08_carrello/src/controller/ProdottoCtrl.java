package controller;


import model.Prodotto;

public class ProdottoCtrl {

	private Prodotto[] prodotti;
	
	public ProdottoCtrl() {
		this.prodotti = new Prodotto[10];
	}
	
	/**
	 * 
	 * @param numProdotti inserire il numero intero di prodotti che conterrò questo contenitore
	 */
	public ProdottoCtrl(int numProdotti) {
		this.prodotti = new Prodotto[numProdotti];
	}
	
	public void addProdotto(Prodotto p, int pos) {
		this.prodotti[pos] = p; //aggiungo il prodotto p alla posizione pos
	}
	
	public void addProdotto(Prodotto p) {
		int pos = trovaPostoLibero();
		
		if(pos > -1) {
			
		}else {
			System.out.println("Contenitore già pieno!!");
		}
	}
	
	private int trovaPostoLibero() {
		
		for (int i = 0; i < prodotti.length; i++) {
			if(this.prodotti[i] == null)
				return i;
		}
		
		return -1;
	}
	
	public String stampa() {
		String scontrino = "";
		for (Prodotto prodotto : prodotti) {
			scontrino += prodotto + "\n";
		}
		return scontrino;
	}
	
}
