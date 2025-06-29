
public class ASCII {
    public static int[] asciiTranslator(String ascii) {
        int length = ascii.length();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = (int) ascii.charAt(i);
        }

        return result;
    }

    public static void iWantDecimal(int[] ascii) {
        for (int i = 0; i < ascii.length; i++) {
            System.out.print(ascii[i] + " ");
        }
    }

    public static int[] cesar(String ascii, int key) {
        int[] deci = asciiTranslator(ascii);
        for (int i = 0; i < deci.length; i++) {
            deci[i] += key;
        }
        return deci;
    }
}