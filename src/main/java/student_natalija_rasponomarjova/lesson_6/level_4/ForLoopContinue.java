package student_natalija_rasponomarjova.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
