package student_oksana_tarasova.lesson_5.level_7;


class AllTasksInOneDemo {
    public static void main(String[] args) {
        ArraysUtilAndNewMethodsAdded demo = new ArraysUtilAndNewMethodsAdded();
        int[] demoArray = demo.createArray(10);
        demo.fillArrayWithRandomNumbers(demoArray);
        demo.printArrayToConsole(demoArray);
        demo.doubleTheValueOfArrayNumbers(demoArray);
        System.out.println("Maximum number array: " + demo.findMaxNumber(demoArray));
        System.out.println("Minimum number array: " + demo.findMinNumber(demoArray));
        System.out.println("Even numbers array: " + demo.evenArrayNumbers(demoArray));
        System.out.println("Odd numbers array: " + demo.oddArrayNumbers(demoArray));
        System.out.println("Average of all numbers: " + demo.findAverageOfAllNumbersInTheArray(demoArray));
        System.out.println("Sum all numbers array: " + demo.findSumAllNumbersArray(demoArray));

    }
}
