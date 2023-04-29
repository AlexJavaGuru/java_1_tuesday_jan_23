package student_oksana_tarasova.lesson_12.level_1;

public class ExceptionDemo {

    public static void main(String[] args) {
        MyException myException = new MyException();

        MyException myException1 = new MyException("Invalid codeKey");

        MyException myException2 = new MyException("Invalid codeKey", "365");

    }
}
