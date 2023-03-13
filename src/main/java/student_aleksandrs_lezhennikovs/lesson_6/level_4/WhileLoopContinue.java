package student_aleksandrs_lezhennikovs.lesson_6.level_4;

public class WhileLoopContinue {

    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 5) {
            if (counter == 3) {
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
