package student_natalija_rasponomarjova.lesson_5.level_7;

class Task27_Refactoring {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);

        System.out.println();

        System.out.println("Maximal random array number is: " + arrayUtil.findMaxNumber(numbers));
    }
}
