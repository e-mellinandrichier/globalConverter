
public class InputValidator {
    // Validates the base input for conversion
    public static boolean isValidBase(String base) {
        return base.equals("hexadecimal") || base.equals("-h") ||
               base.equals("binary")      || base.equals("-b") ||
               base.equals("octal")       || base.equals("-o") ||
               base.equals("decimal")     || base.equals("-d") ||
               base.equals("text")        || base.equals("-t");
    }
    // Validates the input for ASCII conversion
    public static boolean isValidInput(String input) {
        return input != null && input.matches("[a-zA-Z0-9]+");
    }
    // Parses a string to an Integer, returning null if parsing fails
    public static Integer parseKey(String keyString) {
        try {
            return Integer.parseInt(keyString);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
