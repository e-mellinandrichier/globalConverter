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

        // Saisie et validation de la base
        String base;
        do {
            System.out.print("Choisissez la base (hexadecimal, octal, decimal, binary, text ou -h, -o, -d, -b, -t) : ");
            base = scanner.nextLine();

            if (!isValidBase(base)) {
                System.out.println("Erreur : base invalide !");
            }
        } while (!isValidBase(base));

        String normalizedBase = normalizeBase(base);

        // Affichage des résultats de saisie
        System.out.println("\n--- Résumé ---");
        System.out.println("Chaîne saisie     : " + input);
        System.out.println("Base choisie      : " + normalizedBase);

        scanner.close();
    }

    // Méthode de validation d'entrée (lettres et chiffres uniquement)
    public static boolean isValidInput(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    // Vérifie si la base est parmi les options valides
    public static boolean isValidBase(String base) {
        return base.equals("hexadecimal") || base.equals("-h") ||
               base.equals("octal")       || base.equals("-o") ||
               base.equals("decimal")     || base.equals("-d") ||
               base.equals("binary")      || base.equals("-b") ||
               base.equals("text")        || base.equals("-t");
    }

    // Normalise la base (convertit les options abrégées en noms complets)
    public static String normalizeBase(String base) {
        return switch (base) {
            case "-h" -> "hexadecimal";
            case "-o" -> "octal";
            case "-d" -> "decimal";
            case "-b" -> "binary";
            case "-t" -> "text";
            default   -> base;
        };
    }
}
