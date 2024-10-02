package polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		funcionario fun = new funcionario(1, "Rubinho"," (15) 99602-6913", 1234, "Rua Benedito Nunes Vieira");
		System.out.println(fun.calcularSalario(10000, 1000));
		System.out.println(fun.getNome());
	
		horista hor = new horista(1, "Caio", "(15)99999-9999", 1235, "Rua 25 de março");
		System.out.println(hor.calcularSalario(300, 200));
		System.out.println(hor.getNome());
		
		Jornada jor = new Jornada(1, "Joao", "(11) 99990-9990", 1236, "Rua Palmeiras");
		System.out.println(jor.calcularSalario(150, 224));
		System.out.println(jor.getNome());
		
		Consulta consultor = new Consulta(1, "Maria", "(21) 95690-3590", 1237, "Rua Padre Antonio Brunetti");
		System.out.println(consultor.calcularSalario(50000, 6000));
		System.out.println(consultor.getNome());
	}
}
