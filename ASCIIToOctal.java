public class ASCIIToOctal {

    public static void octalTranslator(Integer ascii) {
        // Calcul de la taille nécessaire
        int temp = ascii;
        int size = 0;
        if (temp == 0) {
            size = 1;
        } else {
            while (temp > 0) {
                temp /= 8;
                size++;
            }
        }

        int[] octal = new int[size];
        int index = 0;

        while (ascii > 0) {
            int quo = ascii / 8;
            int rem = ascii % 8;
            ascii = quo;
            octal[index++] = rem;
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(octal[i]);
        }
        System.out.print(" ");
        
    }

    public static void translateAll(int[] list) {
        for (int number : list) {
            octalTranslator(number);
        }
    }
}
