

import java.util.List;

public class ASCIItoHEX {
    public static void hexTranslator(int  ascii)
    {
        int hex = ascii % 16;
        ascii -= hex;
        int hex2 = ascii / 16;
        char letter2 = 'J';

        if (hex > 9 && hex < 17) {
            int hex3 = hex;
            hex3 -= 10;
            hex += 55;
            letter2 = (char)hex;
            
        }
        if ( letter2 == 'J') {
            System.out.print(hex2);
            System.out.print(hex + " ");
        }
        if (letter2 != 'J') {
            System.out.print(hex2);
            System.out.print(letter2 + " ");
        }
    }

    public static void translateAll(int[] list) {
        for (int number : list) {
            hexTranslator(number);
        }
    }
}