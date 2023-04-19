package student_andrejs_cekalins.lesson_12.level_1.Task_5;

import student_andrejs_cekalins.lesson_12.level_1.Task_3.MyException;
import student_andrejs_cekalins.lesson_12.level_1.Task_3.RuntimeException;

public class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception = new Exception("Message");
        System.out.println(exception);

        MyException myException1 = new MyException();
    }
}
