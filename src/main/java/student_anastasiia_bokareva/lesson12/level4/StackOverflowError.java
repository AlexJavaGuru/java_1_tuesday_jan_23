package student_anastasiia_bokareva.lesson12.level4;

public class StackOverflowError {
    public static void main(String[] args) {
        check(1);

    }
    private static void check (int i){
        check(i+1);
    }
}
