package student_aleksandrs_lezhennikovs.lesson_11.level_7.services;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Field;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.check_win.CheckDiagonals;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.check_win.CheckHorizontal;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.check_win.CheckVertical;

public class CheckWin {
    public boolean checkAll(Field field, Token token) {
        CheckVertical checkVertical = new CheckVertical(field);
        CheckHorizontal checkHorizontal = new CheckHorizontal(field);
        CheckDiagonals checkDiagonals = new CheckDiagonals(field);

        boolean vertWin = checkVertical.executeCheck(token);
        boolean horWin = checkHorizontal.executeCheck(token);
        boolean firstDiagonal = checkDiagonals.executeCheckLeftRightDown(token);
        boolean secondDiagonal = checkDiagonals.executeCheckRightLeftDown(token);

        return vertWin || horWin || firstDiagonal || secondDiagonal;
    }
}


