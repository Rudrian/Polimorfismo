package polimorfismo;

public class PrincipalPF {

    public static void main(String[] args) {
    	
 
        
        Medico medico = new Medico("Dr. João", "Cardiologista", 300.0, "12345-CRM");
        System.out.println(medico);
        medico.agendarConsulta();
        
        Dentista dentista = new Dentista("Dr. Maria", "Ortodontista", 250.0, "67890-CRO");
        System.out.println(dentista);
        dentista.agendarConsulta();
        
        Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Ana Silva", "Reabilitação", 200.0, "54321-CREFITO");
        System.out.println(fisioterapeuta);
        fisioterapeuta.agendarConsulta();
    }
}