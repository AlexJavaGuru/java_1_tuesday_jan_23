package student_vladislav_romanov.lesson_5.level_7;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(random.nextInt(1, 10));

        arrayUtil.fillArrayWithRandomNumbers(numbers);

        System.out.println(arrayUtil.findMaxNumber(numbers));
    }

}
