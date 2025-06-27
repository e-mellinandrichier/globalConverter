import java.util.Scanner;
import java.util.List;

public class main {
	public static void main(String[] args) {
        String startingString;
        Scanner console = new Scanner(System.in);
		System.out.println("GLOBAL CONVERTER");
        startingString = console.nextLine();
        if (args.length <= 0) {
			System.out.println("Please enter a correct line.");
	    }
        List<Integer> askip = ASCII.asciiTranslator(startingString);
        ASCIIToOctal.translateAll(askip);
    }
}