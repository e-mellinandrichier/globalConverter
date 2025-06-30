
public class ASCII {
    // Converts an ASCII string to an array of integers representing the ASCII values
    public static int[] asciiTranslator(String ascii) {
        int length = ascii.length();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = (int) ascii.charAt(i);
        }
        return result;
    }

    // Converts an array of ASCII values to a string representation
    public static void iWantDecimal(int[] ascii) {
        for (int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i] + " ");
        }
    }

    // Converts an ASCII string to an array of integers representing the ASCII values
    public static int[] cesar(String ascii, int key) {
        int[] deci = asciiTranslator(ascii);
        for (int i = 0; i < deci.length; i++) {
            deci[i] += key;
        }
        return deci;
    }
}