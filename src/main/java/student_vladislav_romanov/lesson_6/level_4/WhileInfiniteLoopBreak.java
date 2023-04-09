package student_vladislav_romanov.lesson_6.level_4;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int counter = 0;
        while(true) {
            if (counter == 100) {
                break;
            }
            counter++;
        }
    }

}
