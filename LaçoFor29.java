public class LaçoFor29 {
        public static void main(String[] args) {
            int[] vetor = {64, 25, 12, 22, 11};

            System.out.println("Vetor original:");
            exibirVetor(vetor);

            // Aplica o algoritmo de ordenação por seleção
            ordenacaoPorSelecao(vetor);

            System.out.println("\nVetor ordenado em ordem crescente:");
            exibirVetor(vetor);
        }

        // Para ordenar o vetor usando o algoritmo de seleção
        public static void ordenacaoPorSelecao(int[] vetor) {
            int n = vetor.length;

            // Percorre o vetor
            for (int i = 0; i < n - 1; i++) {
                // Encontra o índice do menor elemento na parte não ordenada
                int indiceMenor = i;
                for (int j = i + 1; j < n; j++) {
                    if (vetor[j] < vetor[indiceMenor]) {
                        indiceMenor = j;
                    }
                }

                // Troca o menor elemento encontrado com o elemento na posição i
                int temp = vetor[indiceMenor];
                vetor[indiceMenor] = vetor[i];
                vetor[i] = temp;
            }
        }

        // Para exibir o vetor
        public static void exibirVetor(int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

