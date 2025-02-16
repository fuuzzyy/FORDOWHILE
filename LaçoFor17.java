import java.util.Scanner;

public class LaçoFor17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira uma string
            System.out.print("Digite uma string: ");
            String texto = scanner.nextLine();

            System.out.println("String invertida:");

            for (int i = texto.length() - 1; i >= 0; i--) {
                char caractere = texto.charAt(i); // Obtém o caractere na posição i
                System.out.print(caractere);
            }

            System.out.println();
            scanner.close();
        }
    }

