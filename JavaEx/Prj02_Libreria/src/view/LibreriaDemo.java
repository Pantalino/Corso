package view;

import java.util.Scanner;

public class LibreriaDemo {

	//Static appartiene alla classe
	
	public static void main(String[] args) {

		System.out.println("Libreria 233");
		
		String azioneUtente = chiediAllUtente("Utente cosa vuoi fare?");
		
		if (azioneUtente.equals("addLibro")) {
			System.out.println("L'utente vuole aggiungere un libro");
			String titolo = chiediAllUtente("Quali titolo vuoi inserire?");
			System.out.println("Vuoi inserire il titolo " + titolo);
		}
		if (azioneUtente.equals("getLibri")) {
			System.out.println("L'utente vuole vedere tutti i libri");
		}
		
		//System.out.println("L'azione utente è: " + azioneUtente);
		
	}
	
	public static String chiediAllUtente(String domanda) {
	
		//String domanda = "Utente! Cosa vuoi fare?";
		
		Scanner in = new Scanner(System.in);
		System.out.println(domanda);
		String risposta = in.nextLine();
		return risposta;
		
	}

}
