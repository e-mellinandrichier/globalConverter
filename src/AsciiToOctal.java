package src;

public class AsciiToOctal {
    public static String convert( String input) {
        StringBuilder octal = new StringBuilder();
        for (char c : input.toCharArray()) {
            int value = c;
            StringBuilder oct = new StringBuilder();
            do {
                oct.insert(0, value % 8);
                value /= 8;
            } while (value > 0);
            octal.append(oct).append("");
        }

        return octal.toString();
    }
}
