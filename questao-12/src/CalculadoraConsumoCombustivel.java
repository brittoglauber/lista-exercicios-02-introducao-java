import java.util.Scanner;

public class CalculadoraConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalQuilometros = 0;
        int totalLitros = 0;
        int tanquesCheios = 0;

        while (true) {
            System.out.print("Digite a quilometragem dirigida no tanque cheio (ou -1 para sair): ");
            int quilometros = scanner.nextInt();

            if (quilometros == -1) {
                break;
            }

            System.out.print("Digite a quantidade de litros de gasolina utilizados: ");
            int litros = scanner.nextInt();

            float consumo = (float) quilometros / litros;

            System.out.println("Consumo no tanque cheio: " + consumo + " km/l");

            totalQuilometros += quilometros;
            totalLitros += litros;
            tanquesCheios++;
        }

        if (tanquesCheios > 0) {
            float consumoMedio = (float) totalQuilometros / totalLitros;

            System.out.println("\nConsumo médio combinado: " + consumoMedio + " km/l");
            System.out.println("Soma total de litros de combustível consumidos: " + totalLitros + " litros");
        } else {
            System.out.println("Nenhum tanque cheio registrado.");
        }
    }
}
