

public class main {
	public static void main(String[] args) {
		System.out.println("GLOBAL CONVERTER");
        if (args.length <= 0) {
			System.out.println("Please enter a correct line.");
	    }
        String base = args[0];
        String startingString = args[1];
        
        int[] askip = ASCII.asciiTranslator(startingString);

        if (base.equals("hexadecimal") || base.equals("-h")) {
            ASCIItoHEX.translateAll(askip);
        }
        if (base.equals("binary") || base.equals("-b")) {
            ASCIIToBinary.translateAll(askip);
        }
        if (base.equals("octal") || base.equals("-o")) {
            ASCIIToOctal.translateAll(askip);
        }
        if (base.equals("decimal") || base.equals("-d")) {
            ASCII.iWantDecimal(askip);
        }
    }
}