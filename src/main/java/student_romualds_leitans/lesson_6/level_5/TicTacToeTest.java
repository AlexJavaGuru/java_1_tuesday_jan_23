package student_romualds_leitans.lesson_6.level_5;



public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.testIsWinPositionForHorizontalsWin();
        test.testIsWinPositionForHorizontalsNoWin();
        test.testWinPositionForVerticalsWin();
        test.testWinPositionForVerticalsNoWin();
        test.testWinPositionForDiagonalsWin();
        test.testWinPositionForDiagonalsNoWin();
        test.testisWinPosition();
        test.testisDrawPosition();
        test.testCreateField();
    }
    
    public void testIsWinPositionForHorizontalsWin(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,1,1},
                          {0,0,0},
                          {1,1,0}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(field,0);
        check(expected,actual,"IsWinPositionForHorizontalsWin");

    }

    public void testIsWinPositionForHorizontalsNoWin() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 1},
                         {1, 0, 0},
                         {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForHorizontals(field, 0);
        check(expected, actual, "IsWinPositionForHorizontalsNoWin");
    }

    public void testWinPositionForVerticalsWin(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,0,1},
                          {0,0,1},
                          {1,0,0}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(field,0);
        check(expected,actual,"WinPositionForVerticalsWin");

    }

    public void testWinPositionForVerticalsNoWin(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,0,1},
                          {0,0,1},
                          {1,1,0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForVerticals(field,0);
        check(expected,actual,"WinPositionForVerticalsNoWin");

    }

    public void testWinPositionForDiagonalsWin(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,0,1},
                          {1,0,1},
                          {1,1,0}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(field,0);
        check(expected,actual,"WinPositionForDiagonalsWin");

    }

    public void testWinPositionForDiagonalsNoWin(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{1,0,1},
                          {0,0,1},
                          {1,1,0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForDiagonals(field,0);
        check(expected,actual,"WinPositionForDiagonalsNoWin");

    }

    public void testisWinPosition(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{0,1,1},
                          {0,0,0},
                          {1,1,0}};
        check(true, ticTacToe.isWinPosition(field,0),"Win Position Horizontal: Win");

        field = new int[][]{{0,1,1},
                            {0,0,1},
                            {1,0,1}};
        check(false,ticTacToe.isWinPosition(field,0),"Win Position Horizontal: No Win");

        field = new int[][]{{1,1,0},
                            {0,1,0},
                            {1,0,0}};
        check(true,ticTacToe.isWinPosition(field,0),"Win Position Vertical: Win");

        field = new int[][]{{1,1,0},
                            {0,1,1},
                            {1,0,0}};
        check(false,ticTacToe.isWinPosition(field,0),"Win Position Vertical: No Win");

        field = new int[][]{{0,1,0},
                            {1,0,1},
                            {1,0,0}};
        check(true,ticTacToe.isWinPosition(field,0),"Win Position Diagonals: Win");

        field = new int[][]{{0,1,0},
                            {1,0,1},
                            {1,0,1}};
        check(false,ticTacToe.isWinPosition(field,0),"Win Position Diagonals: No Win");

    }
    public void  testisDrawPosition(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = {{ 0,1,1 },
                          { 1,1,0 },
                          { 1,0,0 }};
        check(true, ticTacToe.isDrawPosition(field),"No empty cells and no winner: ");

        field = new int[][] {{-1, 1, 1 },
                             { 1,-1, 0 },
                             { 1, 1, 0 }};
        check(false, ticTacToe.isDrawPosition(field)," empty cells : ");

    }

    public void testCreateField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, -1, -1},
                         {-1, -1, -1},
                         {-1, -1, -1}};
        check(true, field.equals(ticTacToe.createField()), "in every cell array -1");

        return;
    }// не могу понять почему не проходит теct


    private void check(boolean expected, boolean actual, String testName){
        if(expected==actual){
            System.out.println("Test name: " + testName + " - Test Passed!");
        }else {
            System.out.println("Test name: " + testName + " - Test Failed!");

        }
    }


}
