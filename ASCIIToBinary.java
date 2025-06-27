import java.util.Scanner;



public class ASCIIToBinary {
    public static void binaryTranslator(Integer ascii) {
        int temp = ascii;
        int size = 0;
        if (temp == 0) {
            size = 1;
        } else {
            while (temp > 0) {
                temp /= 2;
                size++;
            }
        }

        int[] binary = new int[size];
        int index = 0;

        while (ascii > 0) {
            if (ascii % 2 == 1) {
                binary[index++] = 1;
                ascii -= 1;
                ascii /= 2;
            } else {
                binary[index++] = 0;
                ascii /= 2;
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.print(" ");
    }

    public static void translateAll(int[] list) {
        for (int number : list) {
            binaryTranslator(number);
        }
    }
}

