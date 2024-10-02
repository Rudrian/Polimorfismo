package polimorfismo;

public class lobo extends Animal{
	
	public lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void emitirSom() {
		System.out.println("O husk esta uivando!");
	}
	}
	

