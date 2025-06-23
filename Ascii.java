import java.util.ArrayList;
import java.util.List;

public class Ascii {
    public static void main(String[] args) {
        String str = "ABC";
        List<Integer> sb = new ArrayList<Integer>();

        char[] letters = str.toCharArray();
        for (char ch : letters) {
            sb.add((int) ch);
        }

        System.out.println(sb);
    }
}
