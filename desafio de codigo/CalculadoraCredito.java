import java.util.Scanner;

public class CalculadoraCredito {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Processa múltiplos casos de teste
        try (Scanner scanner = new Scanner(System.in)) {
            // Processa múltiplos casos de teste
            while (scanner.hasNextLine()) {
                // Lê o número de ligações
                int n = Integer.parseInt(scanner.nextLine().trim());
                double totalCredito = 0.0;
                
                // Processa cada ligação
                for (int i = 0; i < n; i++) {
                    String[] dadosLigacao = scanner.nextLine().trim().split(",");
                    int duracao = Integer.parseInt(dadosLigacao[0].trim());
                    String tipoLigacao = dadosLigacao[1].trim();
                    double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());
                    
                    // Calcula o custo da ligação
                    double custoLigacao = duracao * valorPorMinuto;
                    totalCredito += custoLigacao;
                }
                
                // Formata o resultado com duas casas decimais e imprime
                System.out.printf("%.2f%n", totalCredito);
            }
        }
    }
}