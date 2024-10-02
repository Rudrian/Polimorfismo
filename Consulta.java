package polimorfismo;

public class Consulta extends funcionario {

    private int valorTotal;
    private double imposto;

    public Consulta(int id, String nome, String telefone, int matricula, String endereco) {
        super(id, nome, telefone, matricula, endereco);
    }

    @Override
    public double calcularSalario(double valorTotal, double imposto) {
        return valorTotal * imposto;
    }
}
