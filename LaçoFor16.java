import java.util.Scanner;

public class LaçoFor16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira uma string
            System.out.print("Digite uma string: ");
            String texto = scanner.nextLine();

            System.out.println("Caracteres da string:");

            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i); // Obtém o caractere na posição i
                System.out.println("Caractere " + (i + 1) + ": " + caractere);
            }

            scanner.close();
        }
    }

