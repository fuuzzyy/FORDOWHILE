import java.util.Scanner;

public class LaçoFor21 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int soma = 0; // Variável para armazenar a soma dos dígitos
            int numeroOriginal = numero; // Guarda o número original para exibição

            // Laço para calcular a soma dos dígitos
            while (numero != 0) {
                int digito = numero % 10; // Extrai o último dígito
                soma += digito; // Adiciona o dígito à soma
                numero /= 10; // Remove o último dígito do número
            }

            // Exibe o resultado
            System.out.println("A soma dos dígitos de " + numeroOriginal + " é: " + soma);

            scanner.close();
        }
    }

