package model;

public class Quadrato  extends Rettangolo{

	Segmento lato;
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}
	@Override
	public double calcolaArea() {
		System.out.println("Ho usato il metodo del quadrato");
		return Math.pow(lato.calcolaLunghezza(), 2);
	}
	
	

	
}
