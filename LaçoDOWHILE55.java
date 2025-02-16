package LaçoFORDoWhile;

public class LaçoDOWHILE55 {
        public static void main(String[] args) {
            int linhas = 5;
            int i = 1;

            do {
                int j = 1;

                do {
                    System.out.print(j + " ");
                    j++;
                } while (j <= i);

                System.out.println();
                i++;
            } while (i <= linhas);
        }
    }

