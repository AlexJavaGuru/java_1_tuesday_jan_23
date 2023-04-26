package student_oksana_tarasova.lesson_12.level_1;

public class MyException extends Exception {


    String codeKey;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, String codeKey) {
        super(message);
        this.codeKey = codeKey;
    }
}
