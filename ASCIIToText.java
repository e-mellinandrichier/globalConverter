
public class ASCIIToText {
    // Converts an array of ASCII values back to a text string
    public static String backToText(int[] ascii) {
        String result = "";
        for (int code : ascii) {
            result += (char) code;
        }
        return result;
    }
}
