package student_andrejs_cekalins.lesson_5.level_6.Task_35;


class ArrayUnitDemo {
    public static void main(String[] args) {
        ArrayUnit arrayUnit = new ArrayUnit();
        int[] intArray = arrayUnit.createArray(7);
        int maxNumber = arrayUnit.findMaxNumber(intArray);
        System.out.println("Max number in array is: " + maxNumber);
    }
}
