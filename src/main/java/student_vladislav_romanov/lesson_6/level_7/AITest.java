package student_vladislav_romanov.lesson_6.level_7;

public class AITest {

    public static void main(String[] args) {
        AITest aiTest = new AITest();

        aiTest.getAIMoveSuccess();
        aiTest.getAIMoveFail();
        aiTest.aiHorizontalCombinationTestSuccess();
        aiTest.aiHorizontalCombinationTestFail();
        aiTest.aiVerticalCombinationTestSuccess();
        aiTest.aiVerticalCombinationTestFail();
        aiTest.aiMainDiagonalCombinationTestSuccess();
        aiTest.aiMainDiagonalCombinationTestFail();
        aiTest.aiSideDiagonalCombinationTestSuccess();
        aiTest.aiSideDiagonalCombinationTestFail();
    }

    public void getAIMoveSuccess() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 0}};
        Move expectedResult = new Move(0,2);
        Move currentResult = ai.checkHorizontals(field);

        printResult(compareResults(expectedResult, currentResult), "getAIMoveSuccess");
    }

    public void getAIMoveFail() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 0}};
        Move expectedResult = new Move(0,1);
        Move currentResult = ai.checkHorizontals(field);

        printResult(!compareResults(expectedResult, currentResult), "getAIMoveFail");
    }

    public void aiHorizontalCombinationTestSuccess() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 0}};
        Move expectedResult = new Move(0,2);
        Move currentResult = ai.checkHorizontals(field);

        printResult(compareResults(expectedResult, currentResult), "aiHorizontalCombinationTestSuccess");
    }

    public void aiHorizontalCombinationTestFail() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 0}};
        Move expectedResult = new Move(1,2);
        Move currentResult = ai.checkHorizontals(field);

        printResult(!compareResults(expectedResult, currentResult), "aiHorizontalCombinationTestFail");
    }

    public void aiVerticalCombinationTestSuccess() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {0, -1, 0}, {1, -1, 0}};
        Move expectedResult = new Move(1,0);
        Move currentResult = ai.checkVerticals(field);

        printResult(compareResults(expectedResult, currentResult), "aiVerticalCombinationTestSuccess");
    }

    public void aiVerticalCombinationTestFail() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {0, -1, 0}, {1, -1, 0}};
        Move expectedResult = new Move(1,2);
        Move currentResult = ai.checkVerticals(field);

        printResult(!compareResults(expectedResult, currentResult), "aiVerticalCombinationTestFail");
    }

    public void aiMainDiagonalCombinationTestSuccess() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 1}};
        Move expectedResult = new Move(1,1);
        Move currentResult = ai.checkMainDiagonal(field);

        printResult(compareResults(expectedResult, currentResult), "aiMainDiagonalCombinationTestSuccess");
    }

    public void aiMainDiagonalCombinationTestFail() {
        AI ai = new AI();
        int[][] field = {{1, 1, 0}, {-1, 0, 0}, {1, -1, 1}};
        Move expectedResult = new Move(2,1);
        Move currentResult = ai.checkMainDiagonal(field);

        printResult(!compareResults(expectedResult, currentResult), "aiMainDiagonalCombinationTestFail");
    }

    public void aiSideDiagonalCombinationTestSuccess() {
        AI ai = new AI();
        int[][] field = {{1, 0, 0}, {-1, 1, 0}, {1, -1, 1}};
        Move expectedResult = new Move(0,2);
        Move currentResult = ai.checkSideDiagonal(field);

        printResult(compareResults(expectedResult, currentResult), "aiSideDiagonalCombinationTestSuccess");
    }

    public void aiSideDiagonalCombinationTestFail() {
        AI ai = new AI();
        int[][] field = {{1, 0, 0}, {-1, 1, 0}, {1, -1, 1}};
        Move expectedResult = new Move(1,1);
        Move currentResult = ai.checkSideDiagonal(field);

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
