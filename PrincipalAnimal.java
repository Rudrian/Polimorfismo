package polimorfismo;

public class PrincipalAnimal {

    public static void main(String[] args) {

        lobo lobo = new lobo("Husk", "M", "Husk");
        lobo.emitirSom();
    
        leao leao = new leao("Alex", "M", "Qualquer");
        leao.emitirSom();
        
        tigre tigre = new tigre("Trigue", "M", "Qualquer");
        tigre.emitirSom();
        
        cachorro cachorro = new cachorro("Caramelo", "M", "Vira-Lata");
        cachorro.emitirSom();
        
        gato gato = new gato("Borel", "M", "Siamês");
        gato.emitirSom();
    }
}
