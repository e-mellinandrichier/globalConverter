
public class ASCIIToOctal {
    // Converts an ASCII value to its octal representation as an array of integers
    public static int[] octalTranslator(int ascii) {
        int temp = ascii;
        int size = 0;
        if (temp == 0) {
            size = 1;
        } else {
            while (temp > 0) {
                temp /= 8;
                size++;
            }
        }

        // Create an array to hold the octal digits
        int[] octal = new int[size];
        int index = 0;

        while (ascii > 0) {
            int quo = ascii / 8;
            int rem = ascii % 8;
            ascii = quo;
            octal[index++] = rem;
        }
        return octal;
    }
    // Converts an array of octal integers to a string representation
    public static String octalToString(int[] octal) {
        String result = "";
        for (int i = octal.length - 1; i >= 0; i--) {
            result += octal[i];
        }
        return result;
    }
}
