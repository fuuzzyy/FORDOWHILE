public class LaçoFor7 {
        public static void main(String[] args) {
            int soma = 0;

            for (int i = 1; i <= 100; i++) {
                // Verifica se o número é ímpar
                if (i % 2 != 0) {
                    soma += i; // Adiciona o número ímpar à soma
                }
            }

            // Exibe o resultado
            System.out.println("A soma dos números ímpares de 1 a 100 é: " + soma);
        }
    }

