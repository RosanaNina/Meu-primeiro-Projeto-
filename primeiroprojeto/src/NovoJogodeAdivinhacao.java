import java.util.Random;
import java.util.Scanner;

public class NovoJogodeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Número entre 0 e 100
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int chute;

        System.out.println("Bem-vindo ao jogo da adivinhação!");

        while (tentativas < 5) {
            System.out.print("Digite o seu chute: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break; // Interrompe o loop se acertar
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("O número secreto é maior.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        }
    }
}