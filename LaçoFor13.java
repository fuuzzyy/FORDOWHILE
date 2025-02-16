public class LaçoFor13 {
        public static void main(String[] args) {
            int n = 10;
            int primeiroTermo = 0;
            int segundoTermo = 1;

            System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

            for (int i = 1; i <= n; i++) {
                // Exibe o termo atual
                System.out.print(primeiroTermo + " ");

                // Calcula o próximo termo
                int proximoTermo = primeiroTermo + segundoTermo;
                // Atualiza o primeiro termo
                primeiroTermo = segundoTermo;
                // Atualiza o segundo termo
                segundoTermo = proximoTermo;
            }
        }
    }

