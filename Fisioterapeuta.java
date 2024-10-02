package polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude {

    private String crefito; 

    public Fisioterapeuta(String nome, String especialidade, double valorConsulta, String crefito) {
        super(nome, especialidade, valorConsulta);
        this.crefito = crefito;
    }

    @Override
    public String toString() {
        return "Fisioterapeuta " + "nome = " + getNome() + ", especialidade = " + getEspecialidade() + 
                ", valorConsulta = " + getValorConsulta() + 
                ", crefito = " + crefito;
    }
}