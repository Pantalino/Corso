package app;

import model.ListaSpesa;
import model.Todo;

public class TodoList {

	public static void main(String[] args) {

		//chiedi all'utente cosa vuole comprare
		//chiedi all'utente quale azione compiere
/*		
		for (int i = 0; i < 5; i++) {
			String risposta = MioScanner.leggiString("cosa vuoi comprare?");
			System.out.println(risposta);
		}*/
	ListaSpesa lista = new ListaSpesa();
	
	for (int i = 0; i <10; i++) {
		String risposta = MioScanner.leggiString("Cosa vuoi comprare?");
		Todo t = new Todo(risposta);
		lista.addTodo(t, i);
		
	}
	System.out.println(lista.printTodo());
	
	
	}

}
