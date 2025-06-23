import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GlobalConverter ===");

        // Saisie de la chaîne
        System.out.print("Entrez une chaîne à convertir : ");
        String input = scanner.nextLine();

        // Saisie de la base
        System.out.print("Choisissez la base (hexadecimal, octal, decimal, binary, text ou -h, -o, -d, -b, -t) : ");
        String base = scanner.nextLine();

        // TODO : on ajoutera la validation ici

        System.out.println("Chaîne saisie : " + input);
        System.out.println("Base choisie : " + base);

        scanner.close();
    }
}
