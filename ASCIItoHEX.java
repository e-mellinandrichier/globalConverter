
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.println(hex2+ " "+ hex);
        }
        if (letter2 != 'J') {
            System.out.println(hex2+ " "+ letter2);
        }
    }

    public static void translateAll(List<Integer> list) {
        for (Integer number : list) {
            hexTranslator(number);
        }
    }
}