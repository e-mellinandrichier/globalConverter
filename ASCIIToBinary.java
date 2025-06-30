
public class ASCIIToBinary {
    // Converts an ASCII value to its binary representation as an array of integers
    public static int[] binaryTranslator(Integer ascii) {
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

        // Convert the ASCII value to binary
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
        return binary;
    }

    // Converts an array of binary integers to a string representation
    public static String binaryToString(int[] binary) {
        String result = "";
        for (int i = binary.length - 1; i >= 0; i--) {
            result += binary[i];
        }
        return result;
    }
}