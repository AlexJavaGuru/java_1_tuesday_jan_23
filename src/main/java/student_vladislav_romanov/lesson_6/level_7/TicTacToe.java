package student_vladislav_romanov.lesson_6.level_7;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    char cell = '\u25a2';

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontal(char[][] field, char playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[x][y] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForHorizontals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForHorizontal(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVertical(char[][] field, char playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[y][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForVerticals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForVertical(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForMainDiagonal(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForSideDiagonal(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            int y = field.length - x - 1;
            if (field[x][y] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(char[][] field, char playerToCheck) {
        return isWinPositionForMainDiagonal(field, playerToCheck) || isWinPositionForSideDiagonal(field, playerToCheck) ;
    }

    public boolean isWinPosition(char[][] field, char playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(char[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == cell) {
                    return false;
                }
            }
        }
        return true;
    }

    public char[][] createField(int size) {
        char[][] field = new char[size][size];

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                field[x][y] = cell;
            }
        }

        return field;
    }

    public Move getNextMove(char[][] field, Player player) {
        int[] targetCell;
        if (player.isAI()) {
            targetCell = getMoveFromAI(field, player);
        } else {
            targetCell = getMoveFromPlayer(field);
        }
        int x = targetCell[0];
        int y = targetCell[1];

        if (isMoveInRange(field, x, y)) {
            if (isCellFree(field, x, y)) {
                return new Move(x, y);
            } else {
                if (!player.isAI()) {
                    System.out.println("Cell isn't empty. Try again!");
                }
                return getNextMove(field, player);
            }
        } else {
            System.out.println("Cell is out of range. Try again!");
            return getNextMove(field, player);
        }
    }

    public int[] getMoveFromAI(char[][] field, Player player) {
        int[] targetCell = new int[2];
        int[] aiHorizontalHelperCell = aiHorizontalHelper(field, player);
        int[] aiVerticalHelperCell = aiVerticalHelper(field, player);
        int[] aiMainDiagonalHelperCell = aiMainDiagonalHelper(field, player);
        int[] aiSideDiagonalHelperCell = aiSideDiagonalHelper(field, player);

        if (aiHorizontalHelperCell[2] == 1) {
            targetCell[0] = aiHorizontalHelperCell[0];
            targetCell[1] = aiHorizontalHelperCell[1];
        } else if (aiVerticalHelperCell[2] == 1) {
            targetCell[0] = aiVerticalHelperCell[0];
            targetCell[1] = aiVerticalHelperCell[1];
        } else if (aiMainDiagonalHelperCell[2] == 1) {
            targetCell[0] = aiMainDiagonalHelperCell[0];
            targetCell[1] = aiMainDiagonalHelperCell[1];
        } else if (aiSideDiagonalHelperCell[2] == 1) {
            targetCell[0] = aiSideDiagonalHelperCell[0];
            targetCell[1] = aiSideDiagonalHelperCell[1];
        } else {
            Random random = new Random();
            targetCell[0] = random.nextInt(field.length);
            targetCell[1] = random.nextInt(field.length);
        }

        return targetCell;
    }

    public int[] aiHorizontalHelper(char[][] field, Player player) {
        int[] helperCell = new int[3];

        for (int x = 0; x < field.length; x++) {
            int counter = 0;
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == player.getSymbol()) {
                    counter++;
                } else if (field[x][y] != cell) {
                    counter--;
                }
                if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
                    for (int y2 = 0; y2 < field[x].length; y2++) {
                        if (field[x][y2] == cell) {
                            helperCell[0] = x;
                            helperCell[1] = y2;
                            helperCell[2] = 1;
                            return helperCell;
                        }
                    }
                }
            }
        }

        return helperCell;
    }

    public int[] aiVerticalHelper(char[][] field, Player player) {
        int[] helperCell = new int[3];

        for (int x = 0; x < field.length; x++) {
            int counter = 0;
            for (int y = 0; y < field[x].length; y++) {
                if (field[y][x] == player.getSymbol()) {
                    counter++;
                } else if (field[y][x] != cell) {
                    counter--;
                }
                if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
                    for (int y2 = 0; y2 < field[x].length; y2++) {
                        if (field[y2][x] == cell) {
                            helperCell[0] = y2;
                            helperCell[1] = x;
                            helperCell[2] = 1;
                            return helperCell;
                        }
                    }
                }
            }
        }

        return helperCell;
    }

    public int[] aiMainDiagonalHelper(char[][] field, Player player) {
        int[] helperCell = new int[3];
        int counter = 0;

        for (int x = 0; x < field.length; x++) {
            if (field[x][x] == player.getSymbol()) {
                counter++;
            } else if (field[x][x] != cell) {
                counter--;
            }
            if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
                for (int x2 = 0; x2 < field.length; x2++) {
                    if (field[x2][x2] == cell) {
                        helperCell[0] = x2;
                        helperCell[1] = x2;
                        helperCell[2] = 1;
                        return helperCell;
                    }
                }
            }
        }

        return helperCell;
    }

    public int[] aiSideDiagonalHelper(char[][] field, Player player) {
        int[] helperCell = new int[3];
        int counter = 0;

        for (int x = 0; x < field.length; x++) {
            int y = field.length - x - 1;
            if (field[x][y] == player.getSymbol()) {
                counter++;
            } else if (field[x][y] != cell) {
                counter--;
            }
            if (counter == field.length - 1 || counter == (field.length - 1) * -1) {
                for (int x2 = 0; x2 < field.length; x2++) {
                    int y2 = field.length - x2 - 1;
                    if (field[x2][y2] == cell) {
                        helperCell[0] = x2;
                        helperCell[1] = y2;
                        helperCell[2] = 1;
                        return helperCell;
                    }
                }
            }
        }

        return helperCell;
    }

    public int[] getMoveFromPlayer(char[][] field) {
        int[] targetCell = new int[2];

        System.out.print("Enter coordinate x (from 1 to " + (field.length) + "): ");
        targetCell[0] = scanner.nextInt() - 1;
        System.out.print("Enter coordinate y (from 1 to " + (field.length) + "): ");
        targetCell[1] = scanner.nextInt() - 1;

        return targetCell;
    }

    public boolean isMoveInRange(char[][] field, int x, int y) {
        return x < field.length && y < field.length;
    }

    public boolean isCellFree(char[][] field, int x, int y) {
        return field[x][y] == cell;
    }

    public void printFieldToConsole(char[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                System.out.print(field[x][y]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public int setFieldSize() {
        System.out.print("Please enter size of field: ");
        return scanner.nextInt();
    }

    public Player setPlayer(char symbol) {
        return new Player(symbol, isPlayerAI());
    }

    public boolean isPlayerAI() {
        System.out.print("Do you want AI for player one? (Y/N): ");
        return scanner.next().equals("Y");
    }

    public void play() {
        Player playerOne = setPlayer('\u2612');
        Player playerTwo = setPlayer('\u2b24');

        char[][] field = createField(setFieldSize());
        printFieldToConsole(field);
        while(true) {
            Move move0 = getNextMove(field, playerOne);
            field[move0.getX()][move0.getY()] = playerOne.getSymbol();
            printFieldToConsole(field);
            if (isWinPosition(field, playerOne.getSymbol())) {
                System.out.println("Player 1 WIN!");
                break;
            } else if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove(field, playerTwo);
            field[move1.getX()][move1.getY()] = playerTwo.getSymbol();
            printFieldToConsole(field);
            if (isWinPosition(field, playerTwo.getSymbol())) {
                System.out.println("Player 2 WIN!");
                break;
            } else if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
