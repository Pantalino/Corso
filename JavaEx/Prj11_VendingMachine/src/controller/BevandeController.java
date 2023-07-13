package controller;

import Model.Bevanda;
import Model.Caffe;
import Model.Cappuccino;
import Model.Cioccolata;
import Model.The;

public class BevandeController {
	
	public static boolean checkMoney(double money, double price) {
		
		System.out.println("Resto: " + (money - price));
		return money >= price;
		
	}
	

	public static Bevanda getBevanda(String codice) {
		
		Bevanda b = null;
		
		switch (codice) {
		case "A1":
			b = new Caffe(0.5);
			break;
			
		case "A2":
			b = new Cioccolata(0.5);
			break;
			
		case "A3":
			b = new Cappuccino(0.5);
			break;
			
		case "A4":
			b = new The(0.5);
			break;

		default:
			System.out.println("Scelta non disponible");
			break;
		}
		
		return b;
		
	}
	
}
