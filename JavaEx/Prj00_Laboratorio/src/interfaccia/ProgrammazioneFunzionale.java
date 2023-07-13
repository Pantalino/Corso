package interfaccia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProgrammazioneFunzionale {

	public static void main(String[] args) {
		
		String[] arrMoto = {"yamaha", "kawasaki", "aprilia", "ducati", "bmw"};
		List<String> moto = Arrays.asList(arrMoto);
		List<String> moto2 = new ArrayList<>(moto);
		Set<String> moto3 = new TreeSet<>(moto2);
		
		moto2.add("ktm");
		moto3.add("aprilia");
		
		
		//approccio proceduale
		/*for (String elemento : moto3) {
			System.out.println(elemento);
		}
	*/
		
		//approccio funzionale con lamba expression
		moto3
			.stream()//trasformo in un flusso(stream)
			.filter(m -> m.length()>4)//filtra seguendo condiozione tra (); operazione intermedia
			.filter(m -> m.endsWith("i"))//operazione intermedia
			.forEach(m -> System.out.println(m));//operazioneterminale
	}

}
