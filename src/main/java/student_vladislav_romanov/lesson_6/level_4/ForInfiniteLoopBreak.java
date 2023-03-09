package student_vladislav_romanov.lesson_6.level_4;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1; i++) {
            if (counter == 100) {
                break;
            }
            counter++;
            i--;
        }
    }

}
