package student_dmitry_kupcus.lesson_6;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
