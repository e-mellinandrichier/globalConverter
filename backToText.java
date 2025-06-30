public class backToText {
    // en premier, on regarde de quel type c'est (ça sera vérifié dans le main ça)
    // ensuite, on fait une fonction pour chaque (hex vers dec, oct ver dec etc...)
    // et en dernier, on fait une fonction commune, deci vvers texte
    
    public static int hexToDec(String hexStr) {
        char first = hexStr.charAt(0);
        char second = hexStr.charAt(1);

        int value1, value2;

        if (first >= '0' && first <= '9') {
            value1 = first - '0';
        } else {
            value1 = first - 'A' + 10;
        }

        if (second >= '0' && second <= '9') {
            value2 = second - '0';
        } else {
            value2 = second - 'A' + 10;
        }

        int decimal = value1 * 16 + value2;
        return decimal;
    }

    // public static void translateAll(int[] list) {
    //     for (int number : list) {
    //         hexToDec(number);
    //     }
    // }
}
