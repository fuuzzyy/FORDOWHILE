public class LaçoFor24 {
        public static void main(String[] args) {
            System.out.println("Os primeiros 10 números triangulares são:");

            // Laço for para calcular e exibir os números triangulares
            for (int n = 1; n <= 10; n++) {
                int triangular = n * (n + 1) / 2; // Fórmula do número triangular
                System.out.println("T" + n + " = " + triangular); // Exibe o número triangular
            }
        }
    }

