import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ASCIIToBinary {
    public static void binaryTranslator(Integer ascii)
    {
        List<Integer> binary=new ArrayList<Integer>();
        while (ascii > 0) {
            if (ascii % 2 == 1) {
                binary.add(1);
                ascii -=1;
                ascii /= 2;
            }
            if (ascii % 2 == 0) {
                binary.add(0);
                ascii /= 2;
            }
        }
        Collections.reverse(binary);
        System.out.println(binary + " ");
    }

    public static void translateAll(List<Integer> list) {
        for (Integer number : list) {
            binaryTranslator(number);
        }
    }
}

