package student_anastasiia_bokareva.lesson6.level4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int number = 3;
        while (number<4){
            number=number-1;
            if (number<2) {
                number=5;
            }
        }
    }
}
