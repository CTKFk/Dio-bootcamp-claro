
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner conta = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = conta.nextLine();
            
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = conta.nextInt();
            conta.nextLine();
            
            System.out.print("Por favor, digite o seu nome: ");
            String nomeCliente = conta.nextLine();
            
            System.out.print("Por favor, digite o saldo inicial: ");
            double saldo = conta.nextDouble();
            
            
            System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        }
        
    }
}
