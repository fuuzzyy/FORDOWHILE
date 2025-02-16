public class LaçoFor27 {
        public static void main(String[] args) {
            int[] vetor = {5, 10, 15, 20, 25};

            int soma = 0;

            // Laço for para iterar sobre os elementos do vetor
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i]; // Adiciona o elemento atual à soma
            }

            // Exibe o resultado
            System.out.println("A soma dos números do vetor é: " + soma);
        }
    }

