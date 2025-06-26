package src;

public class AsciiToText {
    public static String convert(int[] asciiCodes) {
        StringBuilder text = new StringBuilder();
        for (int code : asciiCodes) {
            text.append((char) code);
        }

        return text.toString();
    }
}
