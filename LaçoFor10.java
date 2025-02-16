public class LaçoFor10 {
        public static void main(String[] args) {
            int numero = 5;

            System.out.println("Os primeiros 10 múltiplos de " + numero + " são:");

            for (int i = 1; i <= 10; i++) {
                // Calcula o múltiplo
                int multiplo = numero * i;
                // Exibe o múltiplo
                System.out.println(numero + " x " + i + " = " + multiplo);
            }
        }
    }

