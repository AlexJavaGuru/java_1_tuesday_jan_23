package student_nikita_visnakovs.lesson_6.level_4;

public class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while (1 < 3) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
