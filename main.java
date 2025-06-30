import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("GLOBAL CONVERTER");

        // 1. Check argument count
        if (args.length < 2) {
            System.out.println("Usage: java main <base> <text> [key]");
            System.out.println("   Example: java main -h Hello 3");
            return;
        }

        String base = args[0];
        String startingString = args[1];

        // 2. Validate base
        if (!InputValidator.isValidBase(base)) {
            System.out.println("Invalid base. Please use: -h, -b, -o, -d, or -t");
            return;
        }

        // 3. Validate input string
        if (!InputValidator.isValidInput(startingString)) {
            System.out.println("Invalid input. Only alphanumeric characters are allowed.");
            return;
        }

        // 4. Optional Caesar cipher key
        int[] askip;
        if (args.length == 3) {
            Integer key = InputValidator.parseKey(args[2]);
            if (key == null) {
                System.out.println("Invalid key. It must be an integer.");
                return;
            }
            askip = ASCII.cesar(startingString, key);
        } else {
            askip = ASCII.asciiTranslator(startingString);
        }

        // 5. First conversion
        verify(base, askip);

        // 6. Optional reconversion
        change(askip);
    }

    public static void change(int[] askip) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to change the base? (-h, -o, -d, -t, -b)");
        String str = sc.nextLine();

        if (InputValidator.isValidBase(str)) {
            verify(str, askip);
        } else {
            System.out.println("Invalid option. Please choose one of: -h, -o, -d, -t, -b");
        }
    }

    public static void verify(String base, int[] askip) {
        if (base.equals("hexadecimal") || base.equals("-h")) {
            for (int number : askip) {
                System.out.print(ASCIItoHEX.hexTranslator(number) + " ");
            }
        }

        if (base.equals("binary") || base.equals("-b")) {
            for (int number : askip) {
                int[] binary = ASCIIToBinary.binaryTranslator(number);
                System.out.print(ASCIIToBinary.binaryToString(binary) + " ");
            }
        }

        if (base.equals("octal") || base.equals("-o")) {
            for (int number : askip) {
                int[] octal = ASCIIToOctal.octalTranslator(number);
                System.out.print(ASCIIToOctal.octalToString(octal) + " ");
            }
        }

        if (base.equals("decimal") || base.equals("-d")) {
            ASCII.iWantDecimal(askip);
        }

        if (base.equals("text") || base.equals("-t")) {
            System.out.print(ASCIIToText.backToText(askip));
        }
    }
}
