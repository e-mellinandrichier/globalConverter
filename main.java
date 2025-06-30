import java.util.Scanner;

public class main {
    // Main method to run the global converter
    public static void main(String[] args) {
        System.out.println("GLOBAL CONVERTER");
        if (args.length < 2) {
            System.out.println("Usage: java main <base> <text> [key]");
            System.out.println("   Example: java main -h Hello 3");
            return;
        }

        String base = args[0];
        String startingString = args[1];

        if (!InputValidator.isValidBase(base)) {
            System.out.println("Invalid base. Please use: -h, -b, -o, -d, or -t");
            return;
        }

        if (!InputValidator.isValidInput(startingString)) {
            System.out.println("Invalid input. Only alphanumeric characters are allowed.");
            return;
        }

        int[] translateToInt;
        if (args.length == 3) {
            Integer key = InputValidator.parseKey(args[2]);
            if (key == null) {
                System.out.println("Invalid key. It must be an integer.");
                return;
            }
            translateToInt = ASCII.cesar(startingString, key);
        } else {
            translateToInt = ASCII.asciiTranslator(startingString);
        }

        verify(base, translateToInt);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nDo you want to change the base? (-h, -o, -d, -t, -b) or type 'exit' to quit:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program.");
                break;
            }

            if (InputValidator.isValidBase(input)) {
                verify(input, translateToInt);
            } else {
                System.out.println("Invalid option. Please choose one of: -h, -o, -d, -t, -b or 'exit'");
            }
        }
        sc.close();
    }
    // Method to change the base of the translation
    public static void change(int[] translateToInt) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to change the base? (-h, -o, -d, -t, -b)");
        String str = sc.nextLine();

        if (InputValidator.isValidBase(str)) {
            verify(str, translateToInt);
        } else {
            System.out.println("Invalid option. Please choose one of: -h, -o, -d, -t, -b");
        }
    }

    // Method to verify the base and print the corresponding translation
    public static void verify(String base, int[] translateToInt) {
        if (base.equals("hexadecimal") || base.equals("-h")) {
            for (int number : translateToInt) {
                System.out.print(ASCIItoHEX.hexTranslator(number) + " ");
            }
        }

        if (base.equals("binary") || base.equals("-b")) {
            for (int number : translateToInt) {
                int[] binary = ASCIIToBinary.binaryTranslator(number);
                System.out.print(ASCIIToBinary.binaryToString(binary) + " ");
            }
        }

        if (base.equals("octal") || base.equals("-o")) {
            for (int number : translateToInt) {
                int[] octal = ASCIIToOctal.octalTranslator(number);
                System.out.print(ASCIIToOctal.octalToString(octal) + " ");
            }
        }

        if (base.equals("decimal") || base.equals("-d")) {
            ASCII.iWantDecimal(translateToInt);
        }

        if (base.equals("text") || base.equals("-t")) {
            System.out.print(ASCIIToText.backToText(translateToInt));
        }
    }
}