// Jeito com melhoria pelo VSC
import java.util.Scanner;

public class verificadorCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
               String servicoNormalizado = servico.trim().toLowerCase(); // Normaliza a string para comparação
            switch (servicoNormalizado) {
                case "movel" -> movelContratado = true;
                case "banda larga" -> bandaLargaContratada = true;
                case "tv" -> tvContratada = true;
                default -> {
                }
            }
        }
        // TODO: Verifique se todos os serviços foram contratados
        if (movelContratado == true && bandaLargaContratada == true && tvContratada == true) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        // Solicitando ao usuário a lista de serviços contratados
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário a lista de serviços contratados
            String input = scanner.nextLine();
            // Convertendo a entrada em uma lista de strings
            String[] servicosContratados = input.split(",");
            // Verificando se o cliente contratou um combo completo
            String resultado = verificarComboCompleto(servicosContratados);
            // Exibindo o resultado
            System.out.println(resultado);
            // Fechando o scanner
        }
    }
}

/* Jeito realizado no desafio de código

import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
               String servicoNormalizado = servico.trim().toLowerCase(); // Normaliza a string para comparação
            if (servicoNormalizado.equals("movel")) {
                movelContratado = true;
            } else if (servicoNormalizado.equals("banda larga")) {
                bandaLargaContratada = true;
            } else if (servicoNormalizado.equals("tv")) {
                tvContratada = true;
            }
        }
        // TODO: Verifique se todos os serviços foram contratados
        if (movelContratado == true && bandaLargaContratada == true && tvContratada == true) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
} */