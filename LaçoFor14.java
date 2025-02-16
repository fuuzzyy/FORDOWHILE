public class LaçoFor14 {
        public static void main(String[] args) {
            System.out.println("Números primos entre 1 e 50:");

            for (int i = 1; i <= 50; i++) {
                // Verifica se o número é primo
                if (ehPrimo(i)) {
                    // Exibe o número primo
                    System.out.print(i + " ");
                }
            }
        }

        // Método para verificar se um número é primo
        public static boolean ehPrimo(int numero) {
            if (numero <= 1) {
                // Números menores ou iguais a 1 não são primos
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    // Se for divisível por algum número, não é primo
                    return false;
                }
            }
            // Se não for divisível por nenhum número, é primo
            return true;
        }
    }

