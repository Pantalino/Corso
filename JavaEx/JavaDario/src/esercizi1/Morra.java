package esercizi1;

import java.util.Random;
import java.util.Scanner;

public class Morra {

	public static void main(String[] args) throws InterruptedException {


		String[] morra = {"Carta", "Sasso", "Forbici"};
		for(int i = 0; i<morra.length; i++);
		
		Random random = new Random();
		int casuale = random.nextInt(morra.length);
		
		int  scelta;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Giochiamo alla Morra Cinese");
		Thread.sleep(2000);
		System.out.println("Scegli la tua giocata!");
		Thread.sleep(2000);
		System.out.println("1:Carta\n"+"2:Sasso\n"+"3:Forbici");
		scelta = in.nextInt();
		switch (scelta) {
		case 1:
			System.out.println("Hai scelto " + morra[0]);
			break;		
		case 2:
			System.out.println("Hai scelto " + morra[1]);
			break;
		case 3:
			System.out.println("Hai scelto " + morra[2]);
			break;

		}
		
		if (scelta == casuale) {
			System.out.println("Pareggio! \nIl pc ha scelto: " + morra[casuale]);
		}else if(scelta != casuale) {
			System.out.println("Hai vinto! \nIl pc ha scelto: " + morra[casuale]);
		}else {
			System.out.println("Hai perso! \nIl pc ha scelto: " + morra[casuale]);
		}
		in.close();

	}

}
