public class LaçoFor15 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                // Verifica se é múltiplo de 3 e 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // Verifica se é múltiplo de 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // Verifica se é múltiplo de 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

