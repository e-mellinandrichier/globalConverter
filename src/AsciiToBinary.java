package src;

public class AsciiToBinary {
    public static String convert(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            int value = c;
            StringBuilder bin = new StringBuilder();
            for (int i = 7; i >= 0; i--) {
                bin.append((value >> i) & 1);
            }

            binary.append(bin).append("");
        }

        return binary.toString();
    }
}
