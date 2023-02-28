package student_vladislav_romanov.lesson_6.level_7;

import java.util.Random;

class AI {

    Random random = new Random();
    char cell = '\u25a2';

    public Move getAIMove(char[][] field, Player player) {
        Move checkHorizontalsResult = checkHorizontals(field, player);
        Move checkVerticalsResult = checkVerticals(field, player);
        Move checkMainDiagonalResult = checkMainDiagonal(field, player);
        Move checkSideDiagonalResult = checkSideDiagonal(field, player);

        if (checkHorizontalsResult != null) {
            return checkHorizontalsResult;
        } else if (checkVerticalsResult != null) {
            return checkVerticalsResult;
        } else if (checkMainDiagonalResult != null) {
            return checkMainDiagonalResult;
        } else if (checkSideDiagonalResult != null) {
            return checkSideDiagonalResult;
        }

        return new Move(random.nextInt(field.length), random.nextInt(field.length));
    }

    public Move checkHorizontals(char[][] field, Player player) {
        Move move;

        for (int x = 0; x < field.length; x++) {
            move = checkSingleHorizontal(field, player, x);
            if (move != null) {
                return move;
            }
        }

        return null;
    }


    public Move checkSingleHorizontal(char[][] field, Player player, int x) {
        Move potentialMove = new Move();
        int counter = 0;

        for (int y = 0; y < field[x].length; y++) {
            if (field[x][y] == player.getSymbol()) {
                counter++;
            } else if (field[x][y] != cell) {
                counter--;
            } else {
                potentialMove = new Move(x, y);
            }
        }
        if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkVerticals(char[][] field, Player player) {
        Move move;

        for (int x = 0; x < field.length; x++) {
            move = checkSingleVertical(field, player, x);
            if (move != null) {
                return move;
            }
        }

        return null;
    }

    public Move checkSingleVertical(char[][] field, Player player, int x) {
        Move potentialMove = new Move();
        int counter = 0;

        for (int y = 0; y < field[x].length; y++) {
            if (field[y][x] == player.getSymbol()) {
                counter++;
            } else if (field[y][x] != cell) {
                counter--;
            } else {
                potentialMove = new Move(y, x);
            }
        }
        if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkMainDiagonal(char[][] field, Player player) {
        Move potentialMove = new Move();
        int counter = 0;

        for (int x = 0; x < field.length; x++) {
            if (field[x][x] == player.getSymbol()) {
                counter++;
            } else if (field[x][x] != cell) {
                counter--;
            } else {
                potentialMove = new Move(x, x);
            }
        }
        if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

    public Move checkSideDiagonal(char[][] field, Player player) {
        Move potentialMove = new Move();
        int counter = 0;

        for (int x = 0, y = field.length - x - 1; x < field.length; x++, y--) {
            if (field[x][y] == player.getSymbol()) {
                counter++;
            } else if (field[x][y] != cell) {
                counter--;
            } else {
                potentialMove = new Move(x, y);
            }
        }
        if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
            return potentialMove;
        }

        return null;
    }

}
