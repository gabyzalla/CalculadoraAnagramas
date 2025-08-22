import java.util.Scanner;
import java.util.Arrays;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("Resultado: As palavras são anagramas!");
        } else {
            System.out.println("Resultado: As palavras NÃO são anagramas!");
        }

        scanner.close();
    }

    public static boolean saoAnagramas(String palavra1, String palavra2) {
        // Normaliza: minúsculas e remove espaços
        palavra1 = palavra1.toLowerCase().replaceAll("\\s+", "");
        palavra2 = palavra2.toLowerCase().replaceAll("\\s+", "");

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
