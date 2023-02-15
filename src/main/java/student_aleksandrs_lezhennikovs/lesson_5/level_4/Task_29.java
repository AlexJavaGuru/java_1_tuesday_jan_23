package student_aleksandrs_lezhennikovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {

    public static void main(String[] args) {

        int[] numbers  = createRandomSizeArray();
        fillArrayWithRandomElements(numbers);
        System.out.println("Your array: " + Arrays.toString(numbers));

        String evenElements = evenElementsInArray(numbers);
        System.out.println("Even elements in array : " + evenElements);

    }

    private static int[] createRandomSizeArray() {

        Random random = new Random();
        int arraySize = random.nextInt(10) + 1;
        int[] numbers = new int[arraySize];

        return numbers;
    }

    private static void fillArrayWithRandomElements(int[] numbers) {

        Random random = new Random();
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = random.nextInt(100);
        }
    }

    private static String evenElementsInArray(int[] numbers) {

        String result = "";
        for (int number : numbers) {
            if (isEven(number)) {
                result = result + " " + number;
            }
        }
        return result;
    }

/*    private static boolean isEven(int number) {

        boolean result;
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }*/

    private static boolean isEven(int number) {

        return (number % 2 == 0);
    }
}
