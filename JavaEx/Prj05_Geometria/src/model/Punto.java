package model;

;

public class Punto {

	public int x, y;
	 /**
	  * Cotruttore del Punto
	  * @param x - passare come primo parametro il valore di x di questo punto
	  * @param y - passare come secondo parametro il valore di y di questo punto
	  */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
}
