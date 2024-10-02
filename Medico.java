package polimorfismo;

public class Medico extends ProfissionalSaude {

    private String crm;

    public Medico(String nome, String especialidade, double valorConsulta, String crm) {
        super(nome, especialidade, valorConsulta);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico " + "nome = " + getNome() + ", especialidade = " + getEspecialidade() 
        		+ ", valorConsulta = " + getValorConsulta() 
        		+ ", crm = " + crm;
    }
}
