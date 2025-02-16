package LaçoFORDoWhile;

import java.util.Scanner;

public class LaçoDOWHILE50 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String senhaCorreta = "Aninhalinda123";
            String senha;

            do {
                System.out.print("Digite a senha: ");
                senha = scanner.nextLine();
            } while (!senha.equals(senhaCorreta));

            System.out.println("Senha correta! Acesso concedido.");
            scanner.close();
        }
    }
