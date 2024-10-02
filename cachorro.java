package polimorfismo;

public class cachorro extends Animal{

	public cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void emitirSom() {
		System.out.println("O Golden Retriever esta latindo!");
	}
	}

