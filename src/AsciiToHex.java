package src;

public class AsciiToHex {
    private static final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public static String convert(String input) {
        StringBuilder hex = new StringBuilder();
        for (char c : input.toCharArray()) {
            int value = c;
            StringBuilder h = new StringBuilder();
            do {
                h.insert(0, HEX_DIGITS[value % 16]);
                value /= 16;
            } while (value > 0);
            hex.append(h).append("");
        }

        return hex.toString();
    }
}
