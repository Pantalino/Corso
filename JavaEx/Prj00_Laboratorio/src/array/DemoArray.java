package array;


public class DemoArray {

	public static void main(String[] args) {


		//String[] note = new String[7];
		//note[0] = "do";
		
		String[] note = {"do","re","mi","fa","sol","la","si"};
		
/*		for(int i = note.length -1; i >= 0; i--) {
			System.out.println(note[i]);
		}
*/		
		for (String nota : note) {
			System.out.print(nota.toUpperCase() + " ");
		}
	}

}
