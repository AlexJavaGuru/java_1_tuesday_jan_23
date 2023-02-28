package student_aleksandrs_lezhennikovs.lesson_6.level_5;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    private int fieldSize;

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public int[][] createField() {
        int[][] field = new int[fieldSize][fieldSize];
        for (int rows = 0; rows < fieldSize; rows++) {
            for (int columns = 0; columns < fieldSize; columns++){
                field[rows][columns] = -1;
            }
        }
        return field;
    }

    public void printFieldToConsole(int[][] field) {
        for (int rows = 0; rows < fieldSize; rows++) {
            for (int columns = 0; columns < fieldSize; columns++) {
                if (columns == fieldSize - 1) {
                    if (field[rows][columns] != -1){
                        System.out.println(" " + field[rows][columns]);
                    } else {
                        System.out.println(field[rows][columns]);
                    }
                } else {
                    if (field[rows][columns] != -1) {
                        System.out.print(" " + field[rows][columns] + "|");
                    } else {
                        System.out.print(field[rows][columns] + "|");
                    }
                }
            }
        }
        System.out.println("");
    }




    public boolean isWinPositionInOneRow(int[][] field, int playerToCheck, int row) {
        for (int column = 0; column < fieldSize; column++) {
            if (playerToCheck != field[row][column]) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int rows = 0; rows < fieldSize; rows++) {
            if(isWinPositionInOneRow(field, playerToCheck, rows)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionInOneColumn(int[][] field, int playerToCheck, int column) {
        for (int row = 0; row < fieldSize; row++) {
            if (playerToCheck != field[row][column]) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int column = 0; column < fieldSize; column++) {
            if (isWinPositionInOneColumn(field, playerToCheck, column)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return firstDiagonal(field, playerToCheck) || secondDiagonal(field, playerToCheck);
    }

    public boolean firstDiagonal(int[][] field, int playerToCheck) {
        for (int cell = 0; cell < fieldSize; cell++) {
            if (playerToCheck != field[cell][cell]) {
                return false;
            }
        }
        return true;
    }

    public boolean secondDiagonal(int[][] field, int playerToCheck) {
        int fromEnd = fieldSize - 1;
        for (int fromStart = 0; fromStart < fieldSize; fromStart++) {
            if (playerToCheck != field[fromStart][fromEnd]) {
                return false;
            }
            fromEnd--;
        }
        return true;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean isHorizontalWin = isWinPositionForHorizontals(field, playerToCheck);
        boolean isVerticalWin = isWinPositionForVerticals(field, playerToCheck);
        boolean isDiagonalsWin = isWinPositionForDiagonals(field, playerToCheck);

        return isHorizontalWin || isVerticalWin || isDiagonalsWin;
    }

    public boolean isDrawPosition(int[][] field) {
        int check = 0;
        for (int rows = 0; rows < fieldSize; rows++) {
            for (int columns = 0; columns < fieldSize; columns++) {
                if (field[rows][columns] == -1) {
                    check++;
                }
            }
        }
        return (check == 0);
    }

    public void play() {

        int[][] field = createField();
        int playerCheck = 0;

        PlayerSwitcher playerSwitcher = new PlayerSwitcher(playerCheck);
        boolean isWin = isWinPosition(field, playerCheck);
        boolean isDraw = isDrawPosition(field);
        boolean isContinue = !(isWin || isDraw);

        printFieldToConsole(field);

        while(isContinue) {

            nextMove(field, playerCheck);
            isWin = isWinPosition(field, playerCheck);
            isDraw = isDrawPosition(field);
            isContinue = !(isWin || isDraw);

            if (isWin) {
                System.out.println("Player " + playerCheck + " WIN!");
            } else if (isDraw) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
            }
            playerCheck = playerSwitcher.changePlayer(playerCheck);
        }
    }

    public void messageAIorUserMove(int playerCheck) {
        if (playerCheck == 0) {
            System.out.println("Input new coordinates please");
        } else {
            System.out.println("AI move");
        }
    }
    public Move getNextMove(int playerCheck) {
        messageAIorUserMove(playerCheck);
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        return new Move(x, y);
    }

    public Move getRandomAINextMove() {
        Random random = new Random();
        int x = random.nextInt(fieldSize);
        int y = random.nextInt(fieldSize);
        return new Move(x, y);
    }

    public Move getAIMove(int[][] field, int playerCheck) {
        Move move;
        AI aI = new AI();
        messageAIorUserMove(playerCheck);
        if (aI.getWin(field, playerCheck) != null) {
            move = aI.getWin(field, playerCheck);
        } else if (aI.getProtectedMoveFromLoss(field) != null) {
            move =  aI.getProtectedMoveFromLoss(field);
        } else {
            move =  getRandomAINextMove();
        }
        return  move;
    }

    public Move userOrAIMove(int[][] field, int playerCheck) {
        if (playerCheck == 0) {
            return getNextMove(playerCheck);
        } else {
            return getAIMove(field, playerCheck);
        }
    }

    public void nextMove(int[][] field, int playerCheck) {
        Move move = userOrAIMove(field, playerCheck);
        AI aI = new AI();
        if(isInFieldRange(move.getX(), move.getY())) {
            if (aI.isCellEmpty(field[move.getX()][move.getY()])) {
                field[move.getX()][move.getY()] = playerCheck;
                printFieldToConsole(field);
            } else {
                nextMove(field, playerCheck);
            }
        } else {
            nextMove(field, playerCheck);
        }
    }

    public boolean isInFieldRange(int x, int y) {
        return (x >= 0 && x < fieldSize && y >= 0 && y < fieldSize);
    }

}
