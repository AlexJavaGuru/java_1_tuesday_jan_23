package student_natalija_rasponomarjova.lesson_6.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if ((i % 10) == 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
