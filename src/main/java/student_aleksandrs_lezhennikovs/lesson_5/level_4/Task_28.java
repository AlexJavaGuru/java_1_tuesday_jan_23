package student_aleksandrs_lezhennikovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers  = createRandomSizeArray();
        fillArrayWithRandomElements(numbers);
        System.out.println("Your array: " + Arrays.toString(numbers));

        int maxResult = minElementsInArray(numbers);
        System.out.println("Max element in array is: " + maxResult);
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

    private static int minElementsInArray(int[] numbers) {

        int result = numbers[0];
        for (int number : numbers) {
            result = minOfTwo(result, number);
        }
        return result;
    }

    private static int minOfTwo(int firstNumber, int secondNumber) {

        return (firstNumber <= secondNumber) ? firstNumber : secondNumber;
    }
}
