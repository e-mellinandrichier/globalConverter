import java.util.ArrayList;
import java.util.List;

public class ASCII {
    public static List<Integer> ASCII(String ascii)
    {
        List<Integer> sb = new ArrayList<Integer>();

        char[] letters = ascii.toCharArray();
        for (char ch : letters) {
            sb.add((int) ch);
        }

        return sb;
    }
}
