import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.println("A área do círculo é: " + Math.round(area));
    }

    // Função para calcular a área do círculo
    public static double calcularAreaCirculo(double raio) {
        final double PI = 3.14159;
        return PI * raio * raio;
    }
}
