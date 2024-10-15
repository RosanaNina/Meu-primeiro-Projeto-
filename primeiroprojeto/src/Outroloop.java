import java.util.Scanner;

public class Outroloop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;
        double nota = 0; // Inicializa nota com 0 para garantir a primeira iteração

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar o programa:");
            nota = leitura.nextDouble();

            if (nota != -1) { // Verifica se a nota é diferente de -1 antes de calcular a média
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas > 0) { // Verifica se foram inseridas alguma nota antes de calcular a média
            System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }
    }
}