public class ASCIIToText {
    public static String backToText(int[] asciiCodes) {
        StringBuilder sb = new StringBuilder();
        for (int code : asciiCodes) {
            sb.append((char) code);
        }
        return sb.toString();
    }

}
