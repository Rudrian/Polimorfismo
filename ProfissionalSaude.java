package polimorfismo;

public class ProfissionalSaude {

    private String nome;
    private String especialidade;
    private double valorConsulta;

    public ProfissionalSaude(String nome, String especialidade, double valorConsulta) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }
    
    public void agendarConsulta() {
 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
