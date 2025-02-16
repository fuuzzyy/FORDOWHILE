package LaçoFORDoWhile;

public class LaçoDOWHILE51 {
        public static void main(String[] args) {
            int contador = 0;
            int numero = 2;

            do {
                int somaDivisores = 0;

                for (int i = 1; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        somaDivisores += i;
                    }
                }

                if (somaDivisores == numero) {
                    System.out.println(numero);
                    contador++;
                }

                numero++;
            } while (contador < 10);
        }
    }

