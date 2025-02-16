package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE41 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String texto = scanner.nextLine();
            int i = 0;

            do {
                System.out.println(texto.charAt(i));
                i++;
            } while (i < texto.length());

            scanner.close();
        }
    }

