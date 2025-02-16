package org.example;

import java.util.Scanner;

public class DoWhile31 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                // Pede para o usuário digitar um número
                System.out.print("Digite um número: ");
                numero = scanner.nextInt(); // Lê o número que o usuário digitou

                // Se o número for positivo ou zero, mostra ele na tela
                if (numero >= 0) {
                    System.out.println("Você digitou: " + numero);
                }
            } while (numero >= 0); // Repete o loop enquanto o número for positivo ou zero

            // Quando o usuário digita um número negativo, o loop acaba e exibe esta mensagem
            System.out.println("Você digitou um número negativo. Programa encerrado.");

            scanner.close();
        }
    }

