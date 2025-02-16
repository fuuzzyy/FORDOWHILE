package LaçoFORDoWhile;
import java.util.Scanner;
public class LaçoDOWHILE35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para exibir a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;

        System.out.println("Tabuada do " + numero + ":");

        do {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        scanner.close();
    }
}