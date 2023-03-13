package student_andrejs_cekalins.lesson_6.level_4.Task_21;


public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = new int[2][3];
        twoDimensionalArray.fillDoubleArrayWithRandomNumbers(array);
        twoDimensionalArray.findSumInDoubleArray(array);
    }
}
