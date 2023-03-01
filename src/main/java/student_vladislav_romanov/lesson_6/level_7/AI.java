package student_vladislav_romanov.lesson_6.level_7;

import java.util.Optional;
import java.util.Random;

class AI {

    Random random = new Random();
    private final int CELL = 0;

    public Move getAIMove(int[][] field) {
        Move resultMove = Optional.ofNullable(checkHorizontals(field))
                .orElse(Optional.ofNullable(checkVerticals(field))
                        .orElse(Optional.ofNullable(checkMainDiagonal(field))
                                .orElseGet(() -> checkSideDiagonal(field))));
        if (resultMove != null) {
            return resultMove;
        }

        return new Move(random.nextInt(field.length), random.nextInt(field.length));
    }

    public Move checkHorizontals(int[][] field) {
        Move move;

        for (int x = 0; x < field.length; x++) {
            move = checkSingleHorizontal(field, x);
            if (move != null) {
                return move;
            }
        }

        return null;
    }


    public Move checkSingleHorizontal(int[][] field, int x) {
        Move potentialMove = new Move();
        int sum = 0;

        for (int y = 0; y < field[x].length; y++) {
            sum += field[x][y];
            if (field[x][y] == CELL) {
                potentialMove = new Move(x, y);
            }
        }
        if (sum == field.length - 1 || sum == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkVerticals(int[][] field) {
        Move move;

        for (int x = 0; x < field.length; x++) {
            move = checkSingleVertical(field, x);
            if (move != null) {
                return move;
            }
        }

        return null;
    }

    public Move checkSingleVertical(int[][] field, int x) {
        Move potentialMove = new Move();
        int sum = 0;

        for (int y = 0; y < field[x].length; y++) {
            sum += field[y][x];
            if (field[y][x] == CELL) {
                potentialMove = new Move(y, x);
            }
        }
        if (sum == field.length - 1 || sum == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkMainDiagonal(int[][] field) {
        Move potentialMove = new Move();
        int sum = 0;

        for (int x = 0; x < field.length; x++) {
            sum += field[x][x];
            if (field[x][x] == CELL) {
                potentialMove = new Move(x, x);
            }
        }
        if (sum == field.length - 1 || sum == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkSideDiagonal(int[][] field) {
        Move potentialMove = new Move();
        int sum = 0;

        for (int x = 0; x < field.length; x++) {
            sum += field[x][field.length - x - 1];
            if (field[x][field.length - x - 1] == CELL) {
                potentialMove = new Move(x, field.length - x - 1);
            }
        }
        if (sum == field.length - 1 || sum == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

}
