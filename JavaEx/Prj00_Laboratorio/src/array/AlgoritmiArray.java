package array;

import java.util.Arrays;

public class AlgoritmiArray {

	public static void main(String[] args) {

		String[] nani = {
				"Pisolo",
				"Eolo",
				"Mammolo",
				"Cucciolo",
				"Gongolo",
				"Brontolo",
				"Dotto",
		};
		
		Arrays.sort(nani);
		
		for (String nano : nani) {
			System.out.print(nano + " ");
		}
	}

}
