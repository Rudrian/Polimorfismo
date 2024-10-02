package polimorfismo;

public class leao extends Animal {
		
		public leao(String nome, String sexo, String raca) {
			super(nome, sexo, raca);

		}
		@Override
		public void emitirSom() {
			System.out.println("O alex esta rugindo!");
		}
		}
