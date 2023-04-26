package student_vladislav_romanov.lesson_11.level_7;

import java.util.Random;

class AI {

    Random random;

    public AI() {
        this.random = new Random();
    }

    public int getAIMove(Board board) {
        return random.nextInt(board.getWidth());
    }

}
