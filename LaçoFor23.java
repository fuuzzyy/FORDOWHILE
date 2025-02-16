public class LaçoFor23 {
        public static void main(String[] args) {
            System.out.println("Números entre 1 e 200 divisíveis por 4:");

            // Laço for para iterar de 1 a 200
            for (int i = 1; i <= 200; i++) {
                if (i % 4 == 0) { // Verifica se o número é divisível por 4
                    System.out.print(i + " "); // Exibe o número
                }
            }
        }
    }

