import java.util.Scanner;

public class OrdenarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {
            System.out.println("As palavras em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (comparacao > 0) {
            System.out.println("As palavras em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais: " + palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra \"" + palavra1 + "\" tem o maior número de caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra \"" + palavra2 + "\" tem o maior número de caracteres.");
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres.");
        }
    }
}
