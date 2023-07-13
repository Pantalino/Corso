package Model;

public class Cappuccino extends Bevanda{

	public Cappuccino(double prezzo) {
		super(prezzo);
		this.nome = "cappuccino";
	}

	@Override
	public Bevanda prepara() {
		System.out.println("macina caffè");
		System.out.println("aggiungi latte in polvere");
		System.out.println("aggiungi acqua 5cl");
		return this;
	}

}
