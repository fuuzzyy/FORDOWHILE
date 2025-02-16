package LaçoFORDoWhile;

import java.util.Random;

public class LaçoDOWHILE49 {
        public static void main(String[] args) {
            Random random = new Random();
            StringBuilder senha = new StringBuilder();
            int i = 0;

            do {
                char caractere = (char) (random.nextInt(94) + 33); // Gera caracteres ASCII entre 33 e 126
                senha.append(caractere);
                i++;
            } while (i < 6);

            System.out.println("Senha gerada: " + senha.toString());
        }
    }
