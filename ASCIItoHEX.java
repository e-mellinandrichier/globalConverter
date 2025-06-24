
import java.util.Scanner;

public class ASCIItoHEX {
    public static String ASCIItoHEX(String ascii)
    {
        String hex = "";
        for (int i = 0; i < ascii.length(); i++) {
            char ch = ascii.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hex += part;
        }

        return hex;
    }

    public static void main(String arg[])
    {
        // print the Hex String
        System.out.println(ASCIItoHEX("CACA"));
    }
}