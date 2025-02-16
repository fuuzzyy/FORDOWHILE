package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE48 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Digite um número (0 para sair): ");
                numero = scanner.nextInt();

                if (numero != 0) {
                    if (numero % 2 == 0) {
                        System.out.println(numero + " é par.");
                    } else {
                        System.out.println(numero + " é ímpar.");
                    }
                }
            } while (numero != 0);

            System.out.println("Programa encerrado.");
            scanner.close();
        }
    }

