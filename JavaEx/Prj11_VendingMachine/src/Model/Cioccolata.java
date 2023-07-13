package Model;

public class Cioccolata extends Bevanda {

	public Cioccolata(double prezzo) {
		super(prezzo);
		this.nome = "cioccolata";
	}

	@Override
	public Bevanda prepara() {
		System.out.println("aggiungi polvere di cacao");
		System.out.println("aggiungi acqua bollente 10cl");
		return this;
	}


	
}
