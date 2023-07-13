package esercizi1;

import java.util.Scanner;

public class UsernamePass {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 String a = "Dario@pp.it";
		 String b = "dariopp";
		 
		System.out.println("Inserisci e-mail: ");
		String email = in.next();
		System.out.println("Inserisci password: ");
		String password = in.next();
		
		if (email.equals(a) && password.equals(b)) {
			System.out.println("Accesso consentito!");
		}else {
			System.out.println("Accesso negato");
		}
		in.close();
		
	}

}
