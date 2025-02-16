public class LaçoFor26 {
        public static void main(String[] args) {
            int base = 5;
            int espacos = base / 2;

            // Parte superior do losango
            for (int i = 1; i <= base; i += 2) {
                // Imprime espaços à esquerda
                for (int j = 0; j < espacos; j++) {
                    System.out.print(" ");
                }
                // Imprime números
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(); // Pula para a próxima linha
                espacos--; // Reduz o número de espaços
            }

            espacos = 1; // Reinicia o número de espaços para a parte inferior

            // Parte inferior do losango
            for (int i = base - 2; i >= 1; i -= 2) {
                // Imprime espaços à esquerda
                for (int j = 0; j < espacos; j++) {
                    System.out.print(" ");
                }
                // Imprime números
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(); // Pula para a próxima linha
                espacos++; // Aumenta o número de espaços
            }
        }
    }

