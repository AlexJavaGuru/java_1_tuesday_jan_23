package student_oksana_tarasova.lesson_11.level_7;



class WinningPositionTest {
    public static void main(String[] args) {
        WinningPositionTest test = new WinningPositionTest();
        test.isWinVerticalTest();
        test.isWinVerticalTest1();
        test.isWinHorizontalTest();
        test.isWinHorizontalTest1();
        test.isWinRightDiagonalTest();
        test.isWinRightDiagonalTest1();
        test.isWinRightDiagonalTest2();
        test.isWinRightDiagonalTest3();
        test.isWinRightDiagonalTest4();
        test.isWinRightDiagonalTest5();
        test.isWinRightDiagonalTest6();
        test.isWinLeftDiagonalTest1();
        test.isWinLeftDiagonalTest2();
        test.isWinLeftDiagonalTest3();
        test.isWinLeftDiagonalTest4();
        test.isWinLeftDiagonalTest5();
        test.isWinLeftDiagonalTest6();
    }

    public void isWinVerticalTest() {
        VerticalVictory verticalVictory = new VerticalVictory();
        int[][] field = {{0, 0, 0, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1, 0},
                         {0, 0, 0, 0, 0, 0, 1},
                         {0, 0, 0, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1, 1}
        };
        boolean realResult = verticalVictory.countFour(field, 1);
        boolean expectedResult = false;
        check(realResult == expectedResult, "No vertical win");
    }

    public void isWinVerticalTest1() {
        VerticalVictory verticalVictory = new VerticalVictory();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 1, 0},
                         {0, 0, 0, 0, 0, 1, 0},
                         {0, 0, 0, 0, 0, 1, 0},
                         {0, 0, 0, 0, 0, 1, 0}
        };
        boolean realResult = verticalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a vertical victory");
    }

    public void isWinHorizontalTest() {
        HorizontalVictory horizontalVictory = new HorizontalVictory();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1, 1}
        };
        boolean realResult = horizontalVictory.countFour(field, 1);
        boolean expectedResult = false;
        check(realResult == expectedResult, "No horizontal win");
    }

    public void isWinHorizontalTest1() {
       HorizontalVictory horizontalVictory = new HorizontalVictory();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 1, 1, 1, 1, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = horizontalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a horizontal victory");
    }

    public void isWinRightDiagonalTest() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = {{0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0, 1, 1}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = false;
        check(realResult == expectedResult, "No right diagonal win");
    }

    public void isWinRightDiagonalTest1() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {1, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal1 win");
    }

    public void isWinRightDiagonalTest2() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {1, 0, 0, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal2 win");
    }

    public void isWinRightDiagonalTest3() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal3 win");
    }

    public void isWinRightDiagonalTest4() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0, 1},
                          {0, 0, 0, 1, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal4 win");
    }

    public void isWinRightDiagonalTest5() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 0, 0, 1},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal5 win");
    }

    public void isWinRightDiagonalTest6() {
        RightDiagonalVictory rightDiagonalVictory= new RightDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {1, 0, 0, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0}
        };
        boolean realResult = rightDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a right diagonal6 win");
    }

    public void isWinLeftDiagonalTest1() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {1, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal1 win");
    }

    public void isWinLeftDiagonalTest2() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0},
                          {1, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal2 win");
    }

    public void isWinLeftDiagonalTest3() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal3 win");
    }

    public void isWinLeftDiagonalTest4() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal4 win");
    }

    public void isWinLeftDiagonalTest5() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal5 win");
    }

    public void isWinLeftDiagonalTest6() {
        LeftDiagonalVictory leftDiagonalVictory= new LeftDiagonalVictory();
        int[][] field = { {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 1},
                          {0, 0, 0, 0, 0, 1, 0},
                          {0, 0, 0, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 0, 0}
        };
        boolean realResult = leftDiagonalVictory.countFour(field, 1);
        boolean expectedResult = true;
        check(realResult == expectedResult, "There is a left diagonal6 win");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}



