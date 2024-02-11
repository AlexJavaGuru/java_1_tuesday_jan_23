package student_anastasiia_bokareva.lesson12.level1;

public class MyException extends Exception {
    private int mistake;
    public MyException(String message) {
        super(message);
    }

    public  MyException(){

    }
    public  MyException (String message, int mistake){
        super(message);
        this.mistake=mistake;
    }

}
