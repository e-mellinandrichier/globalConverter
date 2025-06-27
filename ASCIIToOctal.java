import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ASCIIToOctal {
    public static void octalTranslator(Integer ascii)
    {
        List<Integer> octal=new ArrayList<Integer>();
        while (ascii > 0) {
            int quo = ascii/8;
            int rem = ascii % 8;
            ascii = quo;
            octal.add(rem);
        }
        Collections.reverse(octal);
        System.out.println(octal + " ");
    }

    public static void translateAll(List<Integer> list) {
        for (Integer number : list) {
            octalTranslator(number);
        }
    }
}

