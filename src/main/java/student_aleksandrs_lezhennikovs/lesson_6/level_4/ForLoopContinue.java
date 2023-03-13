package student_aleksandrs_lezhennikovs.lesson_6.level_4;

public class ForLoopContinue {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            if (counter == 3) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
