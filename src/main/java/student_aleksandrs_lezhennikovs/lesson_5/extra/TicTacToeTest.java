package student_aleksandrs_lezhennikovs.lesson_5.extra;

class TicTacToeTest {

    public static void main(String[] args) {

        checkFieldSize();
        checkFieldElements();
        checkWinCombination();
        firstRowWinCheckForZero();
        secondRowWinCheckForZero();
        thirdRowWinCheckForZero();
        firstRowWinCheckForOne();
        secondRowWinCheckForOne();
        thirdRowWinCheckForOne();
        firstColumnWinCheckForZero();
        secondColumnWinCheckForZero();
        thirdColumnWinCheckForZero();
        firstColumnWinCheckForOne();
        secondColumnWinCheckForOne();
        thirdColumnWinCheckForOne();
        firstDiagonalWinCheckForOne();
        firstDiagonalWinCheckForZero();
        secondDiagonalWinCheckForOne();
        secondDiagonalWinCheckForZero();
        firstDiagonalWinPositionCheckForOne();
        secondDiagonalWinPositionCheckForOne();
        firstDiagonalWinPositionCheckForZero();
        secondDiagonalWinPositionCheckForZero();
        drawCheckZero();
        drawCheckOne();
        rowWinPositionCheckForZero();
        rowWinPositionCheckForOne();
        columnWinPositionCheckForZero();
        columnWinPositionCheckForOne();
        diagonalWinPositionCheckForZero();
        diagonalWinPositionCheckForOne();
    }

    static void checkFieldSize() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testArray = ticTac.createField(3);

        int expectedResult = 3;
        int calculatedResult = testArray.length;

        if (expectedResult == calculatedResult) {
            System.out.println("Size array is OK");
        } else {
            System.out.println("Size array is FAIL");
        }
    }

    static void checkFieldElements() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testArray = ticTac.createField(3);
        int calculatedResult = 0;
        int expectedResult = 9;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                if (testArray[i][j] == -1) {
                    calculatedResult++;
                }

            }
        }
        if (expectedResult == calculatedResult) {
            System.out.println("Elements in Field are OK");
        } else {
            System.out.println("Elements in Field are FAIL");
        }
    }

    static void checkWinCombination() {

        TicTacToe ticTac = new TicTacToe();
        String expectedResult = "000";
        String calculatedResult = ticTac.winCombination(3, 0);

        if (expectedResult.equals(calculatedResult)) {
            System.out.println("Win combination is OK");
        } else {
            System.out.println("Win combination Test is FAIL");
        }
    }

    static String testMessage(String methodForTest, int player, boolean testStatus) {

        String result;
        if (testStatus) {
            result = methodForTest + playerName(player) + " test is OK";
        } else {
            result = methodForTest + playerName(player) + " test is FAIL";
        }
        return result;
    }

    static String playerName(int player) {

        String result;
        if (player == 0) {
            result = "ZERO player";
        } else {
            result = "ONE player";
        }
        return result;
    }

    static void firstRowWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkRow = 0;
        int player = 0;
        String testMethod = "First row Win for ";

        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondRowWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "Second row Win for ";
        int checkRow = 1;
        int player = 0;
        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);

        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void thirdRowWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "Third row Win for ";
        int checkRow = 2;
        int player = 0;
        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);

        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstRowWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "First row Win for ";
        int checkRow = 0;
        int player = 1;
        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }
        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);

        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondRowWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "Second row Win for ";
        int checkRow = 1;
        int player = 1;
        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);

        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void thirdRowWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "Third row Win for ";
        int checkRow = 2;
        int player = 1;
        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForHorizontals(testField, player);

        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstColumnWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 0;
        int player = 0;
        String testMethod = "First column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondColumnWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 1;
        int player = 0;
        String testMethod = "Second column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void thirdColumnWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 2;
        int player = 0;
        String testMethod = "Third column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstColumnWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 0;
        int player = 1;
        String testMethod = "First column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondColumnWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 1;
        int player = 1;
        String testMethod = "Second column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void thirdColumnWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 2;
        int player = 1;
        String testMethod = "Third column Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForVerticals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstDiagonalWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 1;
        String testMethod = "First diagonal Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][row] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.firstDiagonal(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstDiagonalWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 0;
        String testMethod = "First diagonal Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][row] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.firstDiagonal(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondDiagonalWinCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 1;
        String testMethod = "Second diagonal Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.secondDiagonal(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondDiagonalWinCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 0;
        String testMethod = "Second diagonal Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.secondDiagonal(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstDiagonalWinPositionCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 1;
        String testMethod = "First Diagonal position Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][row] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForDiagonals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondDiagonalWinPositionCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 1;
        String testMethod = "Second diagonal position Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForDiagonals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void firstDiagonalWinPositionCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 0;
        String testMethod = "First Diagonal position Win for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][row] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForDiagonals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void secondDiagonalWinPositionCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 0;
        String testMethod = "Second diagonal position Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPositionForDiagonals(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void drawCheckZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "DRAW ";
        int player = 0;
        for (int row = 0; row < testField.length; row++) {
            for (int column = 0; column < testField.length; column++) {
                testField[row][column] = player;
            }
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isDrawPosition(testField);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void drawCheckOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        String testMethod = "DRAW ";
        int player = 1;
        for (int row = 0; row < testField.length; row++) {
            for (int column = 0; column < testField.length; column++) {
                testField[row][column] = player;
            }
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isDrawPosition(testField);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void rowWinPositionCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkRow = 0;
        int player = 0;
        String testMethod = "Rows Win position for ";

        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void rowWinPositionCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkRow = 0;
        int player = 1;
        String testMethod = "Rows Win position for ";

        for (int column = 0; column < testField.length; column++) {
            testField[checkRow][column] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void columnWinPositionCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 2;
        int player = 0;
        String testMethod = "Column Win position for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void columnWinPositionCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int checkColumn = 2;
        int player = 1;
        String testMethod = "Column Win position for ";

        for (int row = 0; row < testField.length; row++) {
            testField[row][checkColumn] = player;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void diagonalWinPositionCheckForZero() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 0;
        String testMethod = "Diagonal position Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }

    static void diagonalWinPositionCheckForOne() {

        TicTacToe ticTac = new TicTacToe();
        int[][] testField = ticTac.createField(3);
        int player = 1;
        String testMethod = "Diagonal position Win for ";

        int fromEnd = testField.length - 1;
        for (int row = 0; row < testField.length; row++) {
            testField[row][fromEnd] = player;
            fromEnd--;
        }

        boolean expectedResult = true;
        boolean calculatedResult = ticTac.isWinPosition(testField, player);
        boolean testStatus = (expectedResult == calculatedResult);
        System.out.println(testMessage(testMethod, player, testStatus));
        ticTac.printFieldToConsole(testField);
    }
}
