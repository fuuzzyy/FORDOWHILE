public class LaçoFor28 {
        public static void main(String[] args) {
            int[] vetor = {10, 20, 30, 40, 50};

            int soma = 0;
            double media;

            // Laço for para calcular a soma dos elementos do vetor
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i]; // Adiciona o elemento atual à soma
            }

            // Calcula a média
            media = (double) soma / vetor.length;

            // Exibe o resultado
            System.out.println("A média dos números do vetor é: " + media);
        }
    }

