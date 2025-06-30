public class ASCIIToText {
    public static String backToText(int[] ascii) {
        String result = "";
        for (int code : ascii) {
            result += (char) code;
        }
        return result;
    }
}
