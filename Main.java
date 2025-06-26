import src.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nEnter a ASCII caracter chain to covert :");
            String input = scanner.nextLine();

            System.out.println("\nChose a type de conversion :");
            System.out.println("1. To Binaire");
            System.out.println("2. To Décimal");
            System.out.println("3. To Octal");
            System.out.println("4. To Hexadécimal");
            System.out.println("5. To Text");
            System.out.println("6. Quit");

            System.out.print("Your choise : ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nResult in binary :\n" + AsciiToBinary.convert(input));
                    break;
                case "2":
                    System.out.println("\nResult in decimal :\n" + AsciiToDecimal.convert(input));
                    break;
                case "3":
                    System.out.println("\nResult in octal :\n" + AsciiToOctal.convert(input));
                    break;
                case "4":
                    System.out.println("\nResult in hexadecimal :\n" + AsciiToHex.convert(input));
                    break;
                case "5":
                    System.out.println("\nEnter a ASCII code with space :");
                    String[] parts = scanner.nextLine().split("\\s+");
                    int[] asciiCodes = new int[parts.length];
                    try {
                        for (int i = 0; i < parts.length; i++) {
                            asciiCodes[i] = Integer.parseInt(parts[i]);
                        }
                        System.out.println("\nConvert text :\n" + AsciiToText.convert(asciiCodes));
                    } catch (NumberFormatException e) {
                        System.out.println("Error : Please enter only number.");
                    }
                    continue;
                case "6":
                    running = false;
                    System.out.println("Closing program...");
                    break;
                default:
                    System.out.println("Error : Chose number between 1 and 6.");
            }
        }
    }
}
