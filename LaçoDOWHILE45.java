package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE45 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor máximo para a sequência de Fibonacci: ");
            int maximo = scanner.nextInt();
            int a = 0, b = 1;

            do {
                System.out.print(a + " ");
                int proximo = a + b;
                a = b;
                b = proximo;
            } while (a <= maximo);

            scanner.close();
        }
    }

