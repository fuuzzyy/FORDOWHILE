import java.util.Scanner;

public class LaçoFor9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira um número
            System.out.print("Digite um número para exibir a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                // Calcula o produto
                int resultado = numero * i;
                // Exibe o resultado
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            scanner.close();
        }
    }

