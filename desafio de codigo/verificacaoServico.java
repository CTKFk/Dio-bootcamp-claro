// versão melhora pelo vsc
import java.util.Scanner;

public class verificacaoServico {
    public static void main(String[] args) {
        // Entrada do serviço a ser verificado
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do serviço a ser verificado
            String servico = scanner.nextLine().trim();
            // Entrada do nome do cliente e os serviços contratados
            String entradaCliente = scanner.nextLine().trim();
            // Separando o nome do cliente e os serviços contratados
            String[] partes = entradaCliente.split(",");
            boolean contratado = false;
            
            // TODO: Verifique se o serviço está na lista de serviços contratados
            for (int i = 1; i < partes.length; i++) {
                if (partes[i].equals(servico)) {
                    contratado = true;
                    break;
                }
            }
            if (contratado) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }
        }
    }
}
/* Realizado no desafio de código
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
            
        // TODO: Verifique se o serviço está na lista de serviços contratados
            for (int i = 1; i < partes.length; i++) {
            if (partes[i].equals(servico)) {
                contratado = true;
                break;
            }
        }
           if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
} */