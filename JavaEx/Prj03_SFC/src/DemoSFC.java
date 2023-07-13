import java.util.Scanner;

public class DemoSFC {

	public static void main(String[] args) {
		// 1) Chiedi all'umano
		// 2) Scelta random della macchina
		// 3) Confronta la scelta dell'umano e della macchina
		// 4) Stampa il risultato
		// 5) Ripeti il gioco finchè umano fa scelte corrette
		// 6) Stampa le statistiche del gioco
		
		String umano = sceltaUmano();
		String macchina = sceltaMacchina();
		String result = calcolaRisultato(umano, macchina);
		String report = stampaReport(umano, macchina, result);
		
		System.out.println(report);
		//System.out.println(result);
	}
	
	
	
	private static String stampaReport(String umano, String macchina, String result) {

		String report = "Umano: " + umano + "\n"
				+ "Macchina: " + macchina + "\n"
				+ "Risulato: " + result + "\n";
 		
		return report;
	}



	private static String calcolaRisultato(String umano, String macchina) {

		String result = "Vince umano";
		
		if (umano.equalsIgnoreCase(macchina)) {
			result = "Pareggio";
		}else {
		}
		if (umano.equalsIgnoreCase("S")) {
			if (macchina.equalsIgnoreCase("C")) {
				result = "Vince macchina";
			}
		}
		if (umano.equalsIgnoreCase("F")) {
			if (macchina.equalsIgnoreCase("S")) {
				result = "Vince macchina";
			}
		}
		if (umano.equalsIgnoreCase("C")) {
			if (macchina.equalsIgnoreCase("F")) {
				result = "Vince macchina";
			}
		}
		
		return result;
	}



	private static String sceltaMacchina() {

		double casuale = Math.random();
		
		if(casuale < 0.33)
			return "S";
		else 
			if(casuale < 0.66)
				return "F";
		
		return "C";
	}



	private static String sceltaUmano() {
		System.out.println("Scegli tra: (S)sasso - (F)forbici - (C)carta ");
		Scanner in = new Scanner(System.in);
		in.close();
		return in.nextLine();
		
	}

}
