public class DivisaoPor2MultiplosDe3Int {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultado = i / 2;
                System.out.println("Divisão por 2 de " + i + ": " + resultado);
            }
        }
    }
}
