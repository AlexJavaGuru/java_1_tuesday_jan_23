package student_natalija_rasponomarjova.lesson_5.level_7;

class Task28_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println();

        System.out.println("Minimal random array number is: " + arrayUtil.findMinNumber(numbers));
    }
}
