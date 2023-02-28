package student_vladislav_romanov.lesson_6.level_7;

public class AITest {

    Player playerOne = new Player("Player 1", '\u2612', true);
    Player playerTwo = new Player("Player 2", '\u2b24', false);
    char cell = '\u25a2';

    public static void main(String[] args) {
        AITest aiTest = new AITest();

        aiTest.aiHorizontalCombinationTestSuccess();
        aiTest.aiHorizontalCombinationTestFail();
        aiTest.aiVerticalCombinationTestSuccess();
        aiTest.aiVerticalCombinationTestFail();
        aiTest.aiMainDiagonalCombinationTestSuccess();
        aiTest.aiMainDiagonalCombinationTestFail();
        aiTest.aiSideDiagonalCombinationTestSuccess();
        aiTest.aiSideDiagonalCombinationTestFail();
    }

    public void aiHorizontalCombinationTestSuccess() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {playerTwo.getSymbol(), cell, cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), cell}};
        Move expectedResult = new Move(0,2);
        Move currentResult = ai.checkHorizontals(field, playerOne);

        printResult(compareResults(expectedResult, currentResult), "aiHorizontalCombinationTestSuccess");
    }

    public void aiHorizontalCombinationTestFail() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {playerTwo.getSymbol(), cell, cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), cell}};
        Move expectedResult = new Move(1,2);
        Move currentResult = ai.checkHorizontals(field, playerOne);

        printResult(!compareResults(expectedResult, currentResult), "aiHorizontalCombinationTestFail");
    }

    public void aiVerticalCombinationTestSuccess() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {cell, playerTwo.getSymbol(), cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), cell}};
        Move expectedResult = new Move(1,0);
        Move currentResult = ai.checkVerticals(field, playerOne);

        printResult(compareResults(expectedResult, currentResult), "aiVerticalCombinationTestSuccess");
    }

    public void aiVerticalCombinationTestFail() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {cell, playerTwo.getSymbol(), cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), cell}};
        Move expectedResult = new Move(1,2);
        Move currentResult = ai.checkVerticals(field, playerOne);

        printResult(!compareResults(expectedResult, currentResult), "aiVerticalCombinationTestFail");
    }

    public void aiMainDiagonalCombinationTestSuccess() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {playerTwo.getSymbol(), cell, cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), playerOne.getSymbol()}};
        Move expectedResult = new Move(1,1);
        Move currentResult = ai.checkMainDiagonal(field, playerOne);

        printResult(compareResults(expectedResult, currentResult), "aiMainDiagonalCombinationTestSuccess");
    }

    public void aiMainDiagonalCombinationTestFail() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), playerOne.getSymbol(), cell}, {playerTwo.getSymbol(), cell, cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), playerOne.getSymbol()}};
        Move expectedResult = new Move(2,1);
        Move currentResult = ai.checkMainDiagonal(field, playerOne);

        printResult(!compareResults(expectedResult, currentResult), "aiMainDiagonalCombinationTestFail");
    }

    public void aiSideDiagonalCombinationTestSuccess() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), cell, cell}, {playerTwo.getSymbol(), playerOne.getSymbol(), cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), playerOne.getSymbol()}};
        Move expectedResult = new Move(0,2);
        Move currentResult = ai.checkSideDiagonal(field, playerOne);

        printResult(compareResults(expectedResult, currentResult), "aiSideDiagonalCombinationTestSuccess");
    }

    public void aiSideDiagonalCombinationTestFail() {
        AI ai = new AI();
        char[][] field = {{playerOne.getSymbol(), cell, cell}, {playerTwo.getSymbol(), playerOne.getSymbol(), cell}, {playerOne.getSymbol(), playerTwo.getSymbol(), playerOne.getSymbol()}};
        Move expectedResult = new Move(1,1);
        Move currentResult = ai.checkSideDiagonal(field, playerOne);

        printResult(!compareResults(expectedResult, currentResult), "aiSideDiagonalCombinationTestFail");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
    }

    public boolean compareResults(Move expectedResult, Move currentResult) {
        return currentResult.getX() == expectedResult.getX() && currentResult.getY() == expectedResult.getY();
    }

}
