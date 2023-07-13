package test;

import java.util.ArrayList;

import Model.Bevanda;
import Model.Caffe;
import Model.Cappuccino;
import Model.Cioccolata;
import Model.The;

public class Demo {

	public static void main(String[] args) {

		Bevanda b = new Caffe(0.5);
		Bevanda b1 = new Cioccolata(0.55);
		Bevanda b2 = new The(0.6);
		Bevanda b3 = new Cappuccino(0.75);
		
		ArrayList<Bevanda> bevande = new ArrayList<>();
		
		bevande.add(b);
		bevande.add(b1);
		bevande.add(b2);
		bevande.add(b3);
		
		
		for (Bevanda bevanda : bevande) {
			bevanda.prepara();
			System.out.println(bevanda);
		}
	}

}
