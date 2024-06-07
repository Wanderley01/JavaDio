import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);   
    
     // Começando o contato com o cliente

     System.err.println("Seja Bem vindo a nossa Agência, nos informe os seguintes dados por favor.");

     // Declarando os requisitos da conta 

    System.err.println("Digite o Número da Conta: ");

    int conta = scanner.nextInt();

    scanner.nextLine();

    System.err.println("Digite o Nome do Cliente: ");
    String nome = scanner.nextLine();

    System.err.println("Digite a Agencia: ");

    String agencia = scanner.nextLine();

    System.err.println("Digite o Saldo da Conta: ");

    double saldo = scanner.nextDouble();

    scanner.close();

    System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, seu agência é " + agencia + " conta " + conta + " e seu saldo de "+ saldo + " já está disponível para saque. ");
    // Criando os métodos 
    
        
    }
}
