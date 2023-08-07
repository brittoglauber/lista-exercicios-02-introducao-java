import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = milhasParaQuilometros(milhas);

        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
    }

    public static double milhasParaQuilometros(double milhas) {
        final double FATOR_CONVERSAO = 1.609;
        return milhas * FATOR_CONVERSAO;
    }
}