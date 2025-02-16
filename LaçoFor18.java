import java.util.Scanner;

public class LaçoFor18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que insira uma string
            System.out.print("Digite uma string: ");
            String texto = scanner.nextLine();

            // Remove espaços e converte para minúsculas
            String textoFormatado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Verifica se a string é um palíndromo
            if (ehPalindromo(textoFormatado)) {
                System.out.println("A string \"" + texto + "\" é um palíndromo!");
            } else {
                System.out.println("A string \"" + texto + "\" não é um palíndromo.");
            }

            scanner.close();
        }

        // Vaerificar se uma string é um palíndromo
        public static boolean ehPalindromo(String texto) {
            int esquerda = 0; // Índice inicial
            int direita = texto.length() - 1; // Índice final

            // Compara os caracteres da esquerda para a direita e vice-versa
            while (esquerda < direita) {
                if (texto.charAt(esquerda) != texto.charAt(direita)) {
                    return false; // Se os caracteres forem diferentes, não é palíndromo
                }
                esquerda++; // Move para a direita
                direita--; // Move para a esquerda
            }
            return true; // Se todos os caracteres forem iguais, é palíndromo
        }
    }

