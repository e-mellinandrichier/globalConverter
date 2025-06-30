import java.util.Scanner;

import src.ASCII;
import src.ASCIIToBinary;
import src.ASCIIToOctal;
import src.ASCIItoHEX;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GLOBAL CONVERTER ===");

        boolean running = true;

        while (running) {
            // 1. Choix de la base
            System.out.print("Choisissez une base (-h, -b, -o, -d, -t) : ");
            String base = scanner.nextLine();

            // 2. Chaîne à convertir
            System.out.print("Entrez une chaîne à convertir : ");
            String input = scanner.nextLine();

            // 3. Clé de chiffrement
            System.out.print("Entrez la clé pour le chiffrement César (ex: 3) : ");
            int key = Integer.parseInt(scanner.nextLine());

            // 4. Conversion en tableau ASCII
            int[] asciiCodes = ASCII.asciiTranslator(input);

            // 5. Traitement selon la base
            switch (base) {
                case "-h":
                case "hexadecimal":
                    ASCIItoHEX.translateAll(asciiCodes);
                    break;

                case "-b":
                case "binary":
                    ASCIIToBinary.translateAll(asciiCodes);
                    break;

                case "-o":
                case "octal":
                    ASCIIToOctal.translateAll(asciiCodes);
                    break;

                case "-d":
                case "decimal":
                    int[] encrypted = ASCII.cesar(input, key);
                    ASCII.iWantDecimal(encrypted);
                    break;

                case "-t":
                case "text":
                    System.out.println(input);
                    break;

                default:
                    System.out.println("❌ Base invalide.");
            }

            // 6. Recommencer ?
            System.out.print("\nRecommencer ? (y/n) : ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("y")) {
                running = false;
                System.out.println("Bye !");
            }
        }

        scanner.close();
    }
}
