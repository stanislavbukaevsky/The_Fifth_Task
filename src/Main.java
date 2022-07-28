public class Main {
    public static void main(String[] args) {
        //Задание 1

        int[] threeDigits = new int[3];
        threeDigits[0] = 1;
        threeDigits[1] = 2;
        threeDigits[2] = 3;

        double[] fractionalArray = {1.57, 7.654, 9.986};

        int[] thirdArray = {5, 6, 7, 8};

        //Задание 2

        for (int i = 0; i < threeDigits.length - 1; i++) {
            System.out.print(threeDigits[i] + ", ");
        }
        System.out.println(threeDigits[threeDigits.length - 1]);

        for (int j = 0; j < fractionalArray.length; j++) {
            if (j == fractionalArray.length - 1) {
                System.out.println(fractionalArray[j]);
            } else {
                System.out.print(fractionalArray[j] + ", ");
            }
        }

        for (int k = 0; k < thirdArray.length; k++) {
            System.out.print(thirdArray[k] + ", ");
        }
        System.out.println(thirdArray[thirdArray.length - 1]);

        //Задание 3

        int counter = threeDigits.length - 1;
        while (counter > 0) {
            System.out.print(threeDigits[counter] + ", ");
            counter--;
        }
        System.out.println(threeDigits[0]);

        //Задание 4

        for (int l = 0; l < threeDigits.length; l++) {
            if (threeDigits[l] % 2 != 0) {
                threeDigits[l]++;
                System.out.print(threeDigits[l] + ", ");
            }
        }
    }
}