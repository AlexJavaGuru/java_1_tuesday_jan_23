package student_andrejs_cekalins.lesson_12.level_4.Task_26;

public class StackOverflowError {
    static  int i=0;
    public static int sumNumbers (int number) {
        i=i+10;
        System.out.println(i);
        return i+sumNumbers(i);
    }
    public static void main(String[] args) throws Exception {
        StackOverflowError.sumNumbers(i);


    }
}
