import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		System.out.println("GLOBAL CONVERTER");
        if (args.length <= 0) {
			System.out.println("Please enter a correct line.");
	    }

        String base = args[0];
        String startingString = args[1];
        int[] askip = ASCII.asciiTranslator(startingString);
        if (args.length == 3) {
            int key = Integer.parseInt(args[2]);
            askip = ASCII.cesar(startingString, key);
        }

        if (base.equals("hexadecimal") || base.equals("-h")) {
            for (int number : askip) {
                System.out.print(ASCIItoHEX.hexTranslator(number) +" ");
            }
        }
        if (base.equals("binary") || base.equals("-b")) {
            for (int number : askip) {
                int[] octal = ASCIIToBinary.binaryTranslator(number);
                System.out.print(ASCIIToBinary.binaryToString(octal) + " ");
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

    Scanner sc = new Scanner(System.in);
    System.out.println("\nDo you wish to change base ? (-h, -o, -d, -t, -b)");
    String str = sc.nextLine();
    if (str.equals("-t")) {
        
    }
    // else {
    //     System.exit(0);
    // }
    }               
}