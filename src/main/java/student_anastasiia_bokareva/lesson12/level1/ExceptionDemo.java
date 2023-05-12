package student_anastasiia_bokareva.lesson12.level1;

public class ExceptionDemo {
    public static void main(String[] args) {

        MyException exception = new MyException("Catch you!");
        MyException newException = new MyException();
        MyException new2Exception = new MyException("Catch you", 12);
    }

}
