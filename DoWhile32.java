package org.example;

import java.util.Scanner;

public class DoWhile32 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            int soma = 0;

            System.out.println("Digite números para somar. Digite 0 para parar e ver o resultado.");

            do {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();

                soma += numero; // Adiciona o número digitado à soma total
            } while (numero != 0); // Repete o loop enquanto o número digitado não for zero

            // Quando o usuário digita 0, o loop acaba e exibe a soma total
            System.out.println("A soma dos números digitados é: " + soma);

            scanner.close();
        }
    }

