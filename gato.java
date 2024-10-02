package polimorfismo;

public class gato extends Animal{
	public gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void emitirSom() {
		System.out.println("O Borel esta miando!");
	}
	}

