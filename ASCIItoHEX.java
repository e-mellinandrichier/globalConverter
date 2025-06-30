
public class ASCIItoHEX {
    // Converts an ASCII value to its hexadecimal representation as a string
    public static String hexTranslator(int ascii)
    {
        int hex = ascii % 16;
        ascii -= hex;
        int hex2 = ascii / 16;
        char letter2 = 'J';
        String hexaString = "";

    
        if (hex > 9 && hex < 17) {
            int hex3 = hex;
            hex3 -= 10;
            hex += 55;
            letter2 = (char)hex;
        }
        if ( letter2 == 'J') {
            hexaString = "" + hex2 + hex;
        }
        if (letter2 != 'J') {
            hexaString = "" + hex2 + letter2;
        }
        return hexaString;
    }

    // Converts an array of ASCII values to their hexadecimal representations
    public static void translateAll(int[] list) {
        for (int number : list) {
            hexTranslator(number);
        }
    }
}