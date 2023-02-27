package student_julija_raudive.lesson_6.level_4;

class WhileLoopContinue {

    public void LoopContinue() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
    }
}
