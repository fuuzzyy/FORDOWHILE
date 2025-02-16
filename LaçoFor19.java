import java.util.Scanner;

public class LaçoFor19 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();

            // Verifica se o número é não negativo
            if (numero < 0) {
                System.out.println("Fatorial não é definido para números negativos.");
            } else {
                long fatorial = calcularFatorial(numero); // Calcula o fatorial
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }

            scanner.close();
        }

        // Para calcular o fatorial de um número
        public static long calcularFatorial(int numero) {
            if (numero == 0 || numero == 1) {
                return 1; // Fatorial de 0 e 1 é 1
            }
            long resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i; // Multiplica o resultado pelo valor atual de i
            }
            return resultado;
        }
    }

