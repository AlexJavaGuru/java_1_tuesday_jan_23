package teacher.lesson_7_encapsulation.lessoncode.homeassignmentcheck;

class TicTacToe {

    public static void main(String[] args) {
        checkDiagonal();
    }

    private static boolean checkDiagonal() {
        int[][] field = {{0, 1, 0},
                         {1, 0, 1},
                         {0, 1, 0}};

//        field[0][0];
//        field[1][1];
//        field[2][2];
        int playerToCheck = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonalV2() {
        int[][] field = {{0, 1, 1},
                         {1, 1, 1},
                         {1, 1, 0}};

//        field[0][2];
//        field[1][1];
//        field[2][0];
        int playerToCheck = 1;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }
    /*
    1 - i = 0; 3 - 1 - i (= 0)
    2 - i = 1; 3 - 1 - i (= 1)
    3 - i = 2; 3 - 1 - i (= 2)
     */

    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    int testReplaceAll() {
        int[] inputArray = {12, -3, 0, 12, 12, -5, 2};
        int[] expectedArray = {100, -3, 0, 100, 100, -5, 2};
        int expectedCounter = 3;
        int resultCounter = replaceAll(inputArray, 12, 100);
//        if (/* check arrays equality*/) {
//
//        }
        return 0;
    }
}
