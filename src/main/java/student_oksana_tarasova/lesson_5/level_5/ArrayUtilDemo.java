package student_oksana_tarasova.lesson_5.level_5;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] demoArray = demo.createArray(5);

        demo.fillArrayWithRandomNumbers(demoArray);
        demo.printArrayToConsole(demoArray);
        System.out.println(demo.findMaxNumber(demoArray));
        System.out.println(demo.findMinNumber(demoArray));
    }
}
