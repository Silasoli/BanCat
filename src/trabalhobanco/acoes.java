//29/08
package trabalhobanco;
//chamando método Scanner do java para receber entradas do úsuario

import java.util.Scanner;
//classe com todos os métodos do programa

public class acoes {

    int[][] contas = {{1, 12, 15, 300, 1000, 500}, {2, 123, 30, 300, 100, 500}, {3, 1234, 45, 300, 1000, 500}};
    //Declaração de variáveis
    private int numconta;
    private int numcont2;
    private int numcont;

    //Metodo de validação de úsuario
//    public acoes(String nome, int tempo) {
//        super(nome, tempo);
//    }
    public void validacao(int array[][]) {
        System.out.println("\n"
                + "                         BanCat             \n"
                + "\n"
                + "                ───▄▄─▄████▄▐▄▄▄▌\n"
                + "                ──▐──████▀███▄█▄▌\n"
                + "                ▐─▌──█▀▌──▐▀▌▀█▀  \n"
                + "                ─▀───▌─▌──▐─▌\n"
                + "                ─────█─█──▐▌█ \n"
                + "\n");
        System.out.println(""
                + "╔═════════════════════════════════════╗\n"
                + "║     Bem vindo, para começar digite os dados solicitados:   ║\n"
                + "╚═════════════════════════════════════╝\n"
        );
 
        //Metodo de validação de úsuario
        //Recebendo dados digitado pelo usuario
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o numero da sua conta:");
        int numcont = num.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite o numero de login:");
        int numlog = num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.print("Digite sua senha:");
        int numse = num3.nextInt();
        if(array.length<numcont){
            //Se o úsuario não for encontrado ele entra no processo de validação novamente
                System.out.println("Úsuario não foi encontrado");
                repetirvalidacao();
        } 
        //Verificando se os dados inseridos pelo úsuario estão dentro do array
        for (int i = numcont - 1; i < array.length; i++) {
            if ((array[i][0]) == numcont && (array[i][2]) == numse && (array[i][1]) == numlog) {
                //Se o úsuario for encontrado ele entra no menu do programa
                System.out.println("╔═════════════════╗\n"
                                + "║    Úsuario Encontrado      ║\n"
                                + "╚═════════════════╝");
                        menu();
                        break;
            } else if ((array[i][0]) != numcont && (array[i][2]) != numse && (array[i][1]) != numlog) {
                //Se o úsuario não for encontrado ele entra no processo de validação novamente
                System.out.println(""
                        + "█████████\n"
                        + "█▄█████▄█\n"
                        + "█▼▼▼▼▼\n"
                        + "█\n"
                        + " Úsuario não foi encontrado\n"
                        + "█▲▲▲▲▲\n"
                        + "█████████\n"
                        + " ██ ██");
                repetirvalidacao();

                break;
            } else {
                //Se o úsuario não for encontrado ele entra no processo de validação novamente
                
                System.out.println(""
                        + "█████████\n"
                        + "█▄█████▄█\n"
                        + "█▼▼▼▼▼\n"
                        + "█\n"
                        + " Úsuario não foi encontrado\n"
                        + "█▲▲▲▲▲\n"
                        + "█████████\n"
                        + " ██ ██");
                repetirvalidacao();

                break;
            }

        }
    }
    

    //Método menu onde o úsuario escolhe o que deseja fazer no programa
    public void menu() {
        System.out.println("Escolha o que deseja fazer:");

        System.out.println("╔═════════════════════════════════════════════════════╗\n"
                + "║   Saque(1)   Deposito(2)   Transferência(3)   Ver extrato(4)   Sair do sistema(5)              ║\n"
                + "╚═════════════════════════════════════════════════════╝\n"
        );
        System.out.println("Número do processo: ");

        //Recebe entrada do úsuario 
        Scanner escolha = new Scanner(System.in);
        int escolhido = escolha.nextInt();

        //A entrada do úsuario é comparada e o método correspondente é invocado
        if (escolhido == 1) {
            sacar();
        } else if (escolhido == 2) {
            depositar();
        } else if (escolhido == 3) {
            transferencia(contas);
        } else if (escolhido == 4) {
            extrato();
        } else if (escolhido == 5) {
            sair();
            
        } else {
            System.out.println("Um problema encontrado do TIPO: entre o teclado e a cadeira.");
            menu();
        }
    }

    //Método sacar onde o úsuario insere o valor que ele quer sacar 
    public void sacar() {
        System.out.println("Iniciando processo de saque");
        Scanner valor = new Scanner(System.in);
        System.out.println("Quanto você deseja sacar?");
        int valsaque = valor.nextInt();

        //Verificação de saldo
        if ((contas[getNumcont()][3]) > valsaque) {
            System.out.println("Saque realizado com sucesso.");
            //Retorna o novo valor após descontar o valor do saque
            contas[getNumcont()][3] = (contas[getNumcont()][3]) - valsaque;
            System.out.println("Saldo atual R$ " + contas[getNumcont()][3]);
            System.out.println("Transação concluida. ");
            repeticao();
        } else {
            //A transação é negada e o método de repetição é chamado
            System.out.println("Transação negada");
            repeticao();
        }
    }

    //Método de repetição
    public void repeticao() {
        //Úsuario escolhe se deseja sair do programa ou voltar para o menu

        Scanner escolha1 = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════╗\n"
                + "║  Finalizar Programa (1)  Voltar para Menu (2)    ║\n"
                + "╚═══════════════════════════════╝");

        int escolha2 = escolha1.nextInt();
        if (escolha2 == 1) {
             sair();
        } else {
            menu();
        }
    }

    //Método depósito
    public void depositar() {
        System.out.println("Iniciando processo de deposito\n"
                + "██████████████] 99% \n"
        );
        //Recebendo o valor que o úsuario deseja depositar
        Scanner valor = new Scanner(System.in);
        System.out.println("Quanto você deseja depositar? ");
        int valdep = valor.nextInt();
        //Valor é do depósito é adicionado a conta
        contas[getNumcont()][3] = (contas[getNumcont()][3]) + valdep;
        System.out.println("Seu saldo atual R$" + contas[getNumcont()][3]);
        System.out.println("Deposito concluido");
        //Chamada do método de repetição
        repeticao();

    }

    //Método repetir validação
    public void repetirvalidacao() {
        //Chamada do método de repetição
        validacao(this.contas);
    }

    //Método sair utilizado para finalizar o programa
    public void sair() {
        System.out.println("Fim do programa, volte sempre!");
        
    }

    //Método extrato 
    public void extrato() {
        //Dados do úsuario são printados na tela

        System.out.println(""
                + "╔═════════════════╗\n"
                + "║      Dados do usuário     ║\n"
                + "╚═════════════════╝\n"
                + "Numero da sua conta :\n"
                + "█║▌│█│║▌║││█║▌║▌║\n"
                + contas[getNumcont()][0]
        );

        System.out.println("Numero de login: " + contas[getNumcont()][1]);
        System.out.println("Senha: " + contas[getNumcont()][2]);
        System.out.println("Saldo: " + contas[getNumcont()][3]);
        System.out.println("Limite de credito: " + contas[getNumcont()][4]);
        System.out.println("Credito disponivel: " + contas[getNumcont()][5]);
        //Chamada do método de repetição
        repeticao();
    }

    //Método de transferência
    public void transferencia(int array[][]) {
        System.out.println("Iniciando processo de transferência");
        //Recebendo do úsuario o número da conta para qua ele deseja fazer a  transferência
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o numero da conta para qual o dinheiro será transferido: ");
        int numcont2 = valor.nextInt();
        //Verificação da existência da conta inserida pelo úsuario

        for (int i = 0; i < array.length; i++) {

            if ((array[numcont2 - 1][0]) == numcont2) {
                System.out.println("Conta encontrada");
                //Recebendo do úsuario o valor que deseja transferir
                Scanner valortrans = new Scanner(System.in);
                System.out.println("Digite o valor a ser transferido");
                int valtrans = valortrans.nextInt();
                //Verifica se o valor que o úsuario tem em conta é maior do que o valor que deseja transferir 

                if ((contas[numcont][3]) >= valtrans) {
                    //Descontando valor da conta 
                    contas[numcont][3] = (contas[numcont][3]) - valtrans;
                    numcont2 = numcont2 - 1;
                    //Adicionando valor na outra conta
                    contas[numcont2][3] = (contas[numcont2][3]) + valtrans;
                    System.out.println("Saldo atual da sua conta R$" + contas[numcont][3]);
                    System.out.println("Saldo atual da outra conta R$" + contas[numcont2][3]);
                    repeticao();
                        break;
                } else {
                    //Após a verificação de saldo se o saldo em conta não for suficiente o úsuario volta para o menu
                    System.out.println("Dinheiro insuficiente, volte para o menu e tente novamente");
                    //Chamada do método menu
                    menu();
                    break;
                }

            }
            //Se a conta que o úsuario digitou não for encontrada pelo úsuario ele volta para o menu

            if ((array[i][0]) != numcont2) {
                System.out.println("Conta não encontrada, volte para o menu e tente novamente");
                //Chamada do método menu
                menu();
                break;
            }
        }
    }

    public int[][] getContas() {
        return contas;
    }

    public void setContas(int[][] contas) {
        this.contas = contas;
    }

    public int getNumcont() {
        return numconta;
    }

    public void setNumcont(int numcont) {
        this.numconta = numcont;
    }

    public int getNumcont2() {
        return numcont2;
    }

    public void setNumcont2(int numcont2) {
        this.numcont2 = numcont2;
    }

}
