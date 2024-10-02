package polimorfismo;

public class horista extends funcionario {

    private double horasTrabalhadas;
    private double valorHora;

    public horista(int id, String nome, String telefone, int matricula, String endereco) {
        super(id, nome, telefone, matricula, endereco);

    }

    @Override
    public double calcularSalario(double valorHora, double horaTrabalhadas) {
        return horasTrabalhadas * valorHora;
    }
}