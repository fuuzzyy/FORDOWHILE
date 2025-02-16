package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE47 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            boolean primo = true;
            int i = 2;

            if (numero <= 1) {
                primo = false;
            } else {
                do {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                    i++;
                } while (i <= Math.sqrt(numero));
            }

            if (primo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }

            scanner.close();
        }
    }

