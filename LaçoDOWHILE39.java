package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE39 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();

                if (numero >= 0) {
                    System.out.println("Número positivo: " + numero);
                }
            } while (numero >= 0);

            System.out.println("Número negativo digitado. Programa encerrado.");
            scanner.close();
        }
    }

