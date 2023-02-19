package student_romualds_leitans.lesson_5.level_5;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] intArray = arrayUtil.createArray(10);

        for (int element : intArray) {
            System.out.println(element);
        }
    }
}
