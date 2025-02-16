package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE42 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String texto = scanner.nextLine();
            int i = texto.length() - 1;

            do {
                System.out.print(texto.charAt(i));
                i--;
            } while (i >= 0);

            scanner.close();
        }
    }

