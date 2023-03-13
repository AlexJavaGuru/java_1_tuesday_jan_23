package student_dmitry_kupcus.lesson_6;

public class ForLoopContinue {
    public static void main(String[] args) {
        int i = 10;
        for (int j = 0; j < i; j++) {
            System.out.println(j);
            if (j == 6) {
                break;
            }

        }
    }
}
