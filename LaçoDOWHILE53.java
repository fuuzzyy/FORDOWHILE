package LaçoFORDoWhile;

public class LaçoDOWHILE53 {
        public static void main(String[] args) {
            int contador = 1;
            int termo = 1;

            do {
                System.out.println(termo);
                contador++;
                termo = contador * (contador + 1) / 2;
            } while (contador <= 10);
        }
    }

