public class Ascii {
    public static void main(String[] args) {
        String str = "ABC";
        StringBuilder sb = new StringBuilder();

        char[] letters = str.toCharArray();
        for (char ch : letters) {
            sb.append((int) ch).append(" ");
        }

        System.out.println(sb.toString());
    }
}
