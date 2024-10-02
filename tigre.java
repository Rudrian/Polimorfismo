package polimorfismo;

public class tigre extends Animal {

	public tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void emitirSom() {
		System.out.println("O tigre esta roncando!");
	}
	}

