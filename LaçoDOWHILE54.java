package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE54 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double numero;

            do {
                System.out.print("Digite um número (negativo para sair): ");
                numero = scanner.nextDouble();

                if (numero >= 0) {
                    System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
                }
            } while (numero >= 0);

            System.out.println("Número negativo digitado. Programa encerrado.");
            scanner.close();
        }
    }

