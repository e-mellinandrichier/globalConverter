import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GlobalConverter ===");

        // Saisie et validation de la chaîne
        String input;
        do {
            System.out.print("Entrez une chaîne à convertir : ");
            input = scanner.nextLine();

            if (!isValidInput(input)) {
                System.out.println("Erreur : la chaîne ne doit contenir que des lettres et/ou des chiffres !");
            }
        } while (!isValidInput(input));

        // Saisie de la base (validation à venir)
        System.out.print("Choisissez la base (hexadecimal, octal, decimal, binary, text ou -h, -o, -d, -b, -t) : ");
        String base = scanner.nextLine();

        // Affichage temporaire
        System.out.println("Chaîne saisie : " + input);
        System.out.println("Base choisie : " + base);

        scanner.close();
    }

    // Méthode de validation d'entrée (lettres et chiffres uniquement)
    public static boolean isValidInput(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }
}
