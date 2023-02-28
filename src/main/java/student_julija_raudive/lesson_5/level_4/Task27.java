package student_julija_raudive.lesson_5.level_4;

import java.util.Random;

class Task27 {

    public static void main(String[] args) {


        ArrayUtil arr = new ArrayUtil();

        Random random = new Random();
        int lengthOfArray = random.nextInt(10);
        int[] array = arr.createArray(lengthOfArray);
        arr.fillArrayWithRandomNumbers(array);


        arr.printArrayToConsole(array);

        int maxValue = arr.findMaxNumber(array);

        System.out.println("Max value: " + maxValue);


    }

}
