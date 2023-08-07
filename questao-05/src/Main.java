import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            String diaDaSemana = diasDaSemana[numero - 1];
            System.out.println("O dia da semana correspondente é: " + diaDaSemana);
        } else {
            System.out.println("Número inválido! Digite um número de 1 a 7.");
        }
    }
}