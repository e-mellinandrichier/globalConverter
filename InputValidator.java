public class InputValidator {

    public static boolean isValidBase(String base) {
        return base.equals("hexadecimal") || base.equals("-h") ||
               base.equals("binary")      || base.equals("-b") ||
               base.equals("octal")       || base.equals("-o") ||
               base.equals("decimal")     || base.equals("-d") ||
               base.equals("text")        || base.equals("-t");
    }

    public static boolean isValidInput(String input) {
        return input != null && input.matches("[a-zA-Z0-9]+");
    }

    public static Integer parseKey(String keyString) {
        try {
            return Integer.parseInt(keyString);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
