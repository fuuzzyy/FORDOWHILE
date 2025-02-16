package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE44 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int i = 1;

            do {
                if (numero % i == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);

            scanner.close();
        }
    }

