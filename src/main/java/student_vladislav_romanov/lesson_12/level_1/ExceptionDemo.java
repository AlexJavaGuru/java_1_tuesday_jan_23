package student_vladislav_romanov.lesson_12.level_1;

public class ExceptionDemo extends Exception {

    public ExceptionDemo() {
        super();
    }

    public ExceptionDemo(String message) {
        super(message);
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo(Throwable cause) {
        super(cause);
    }

}
