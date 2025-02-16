import java.util.Scanner;

public class LaçoFor22 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.println("Divisores de " + numero + ":");

            // Laço para encontrar e exibir os divisores
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) { // Verifica se i é um divisor de numero
                    System.out.print(i + " "); // Exibe o divisor
                }
            }

            scanner.close();
        }
    }
