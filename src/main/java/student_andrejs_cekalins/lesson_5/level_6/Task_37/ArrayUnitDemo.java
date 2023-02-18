package student_andrejs_cekalins.lesson_5.level_6.Task_37;

class ArrayUnitDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] intArray = arrayUtil.createArray(5);
        int minNumber = arrayUtil.findMinNumber(intArray);
        System.out.println("Min number in array is: " +minNumber);
    }
}
