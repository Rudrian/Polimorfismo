package polimorfismo;

public class Dentista extends ProfissionalSaude {
   
    private String cro;

    public Dentista(String nome, String especialidade, double valorConsulta, String cro) {
        super(nome, especialidade, valorConsulta);
        this.cro = cro;
    }

    @Override
    public String toString() {
        return "Dentista " + "nome = " + getNome() + ", especialidade = " + getEspecialidade() + 
                ", valorConsulta = " + getValorConsulta() + 
                ", cro = " + cro;
    }
}
