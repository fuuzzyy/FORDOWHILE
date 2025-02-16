package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE40 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            int contador = 0;

            do {
                System.out.print("Digite um número (0 para sair): ");
                numero = scanner.nextInt();

                if (numero != 0) {
                    contador++;
                }
            } while (numero != 0);

            System.out.println("Quantidade de números digitados antes do zero: " + contador);
            scanner.close();
        }
    }

