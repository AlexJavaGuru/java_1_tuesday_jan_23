package student_nikita_visnakovs.lesson_6.level_4;

public class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int i = 0;
        while (i < 1) {
            System.out.println(i);
            i--;
            break;
        }
    }
}
