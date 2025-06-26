package src;

public class AsciiToDecimal {
    public static String convert(String input) {
        StringBuilder decimal = new StringBuilder();
        for (char c : input.toCharArray()) {
            decimal.append((int) c).append("");
        }

        return decimal.toString();
    }
}
