package polimorfismo;

public class Jornada extends funcionario {

    private double horasTrabalhadas;
    private double valorHora;

    public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
        super(id, nome, telefone, matricula, endereco);
    }

    @Override
    public double calcularSalario(double valorHora, double horasTrabalhadas) {
        return horasTrabalhadas * valorHora;
    }
}
