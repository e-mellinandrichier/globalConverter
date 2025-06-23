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

        // Conversion et affichage
        String converted = convertStringToBase(input, normalizedBase);
        System.out.println("\n--- Résultat ---");
        System.out.println("Chaîne convertie en " + normalizedBase + " :");
        System.out.println(converted);

        scanner.close();
    }

    // === VALIDATION ===
    public static boolean isValidInput(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    public static boolean isValidBase(String base) {
        return base.equals("hexadecimal") || base.equals("-h") ||
               base.equals("octal")       || base.equals("-o") ||
               base.equals("decimal")     || base.equals("-d") ||
               base.equals("binary")      || base.equals("-b") ||
               base.equals("text")        || base.equals("-t");
    }

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

    // === CONVERSION PRINCIPALE ===
    public static String convertStringToBase(String input, String base) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            int ascii = (int) c;

            switch (base) {
                case "binary":
                    result.append(convertNumberToBase(ascii, 2)).append(" ");
                    break;
                case "octal":
                    result.append(convertNumberToBase(ascii, 8)).append(" ");
                    break;
                case "decimal":
                    result.append(ascii).append(" ");
                    break;
                case "hexadecimal":
                    result.append(convertNumberToBase(ascii, 16)).append(" ");
                    break;
                case "text":
                    result.append(c).append(" ");
                    break;
            }
        }

        return result.toString().trim();
    }

    // === ALGORITHME DE CONVERSION ENTIER → BASE ===
    public static String convertNumberToBase(int number, int base) {
        String digits = "0123456789ABCDEF";
        StringBuilder converted = new StringBuilder();

        if (number == 0) {
            return "0";
        }

        while (number > 0) {
            int remainder = number % base;
            converted.insert(0, digits.charAt(remainder));
            number /= base;
        }

        return converted.toString();
    }
}
