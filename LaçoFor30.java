import java.util.Scanner;

public class LaçoFor30 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário o tamanho do vetor
            System.out.print("Digite o tamanho do vetor: ");
            int tamanho = scanner.nextInt();

            int[] vetor = new int[tamanho]; // Cria o vetor com o tamanho informado

            // Solicita ao usuário que insira os valores do vetor
            System.out.println("Digite os elementos do vetor:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            int pares = 0; // Contador de números pares
            int impares = 0; // Contador de números ímpares

            // Laço for para contar pares e ímpares
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            // Exibe o resultado
            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);

            scanner.close(); // Fecha o scanner
        }
    }

