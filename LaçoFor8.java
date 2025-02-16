public class LaçoFor8 {
        public static void main(String[] args) {
            int numero = 7; // Número para o qual queremos exibir a tabuada

            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i; // Calcula o produto
                System.out.println(numero + " x " + i + " = " + resultado); // Exibe o resultado
            }
        }
    }
