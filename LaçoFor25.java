public class LaçoFor25 {
        public static void main(String[] args) {
            int altura = 5; // Altura do triângulo

            // Laço externo para controlar as linhas
            for (int i = 1; i <= altura; i++) {
                // Laço interno para imprimir os asteriscos
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

