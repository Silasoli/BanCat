package trabalhobanco;
//classe principal:utilizada para chamar os metodos e instanciar a classe

public class principal {

    public static void main(String[] args) {
        //criação do array
        int[][] contas = {{1, 12, 15, 300, 1000, 500}, {2, 123, 30, 300, 100, 500}, {3, 1234, 45, 300, 1000, 500}};
        //instanciamento da classe
        acoes obj = new acoes();
//        MinhaThread thread = new MinhaThread("Loading…\n█▒▒▒▒▒▒▒▒▒", 600);
//chamando método que inicia o funcionamento do programa
        obj.validacao(contas);
        
    }
}
