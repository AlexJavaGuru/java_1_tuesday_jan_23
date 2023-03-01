package student_romualds_leitans.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 0;

        for (; ;) {
            i++;
            System.out.println(i);
            break;
        }


    }
}