package student_aleksandrs_lezhennikovs.lesson_11.level_7.check_win;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Field;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;

public class CheckDiagonals {
    private Field field;

    public CheckDiagonals(Field field) {
        this.field = field;
    }

    public boolean executeCheckLeftRightDown(Token token) {
        int x = token.getCoord().getX();
        int y = token.getCoord().getY();
        int counter = 0;
        int rowStart = 0;
        int columnStart = 0;
        if (x > y) {
            rowStart = x - y;
        } else if (y > x) {
            columnStart = y - x;
        }
        for (int i = rowStart; i < field.getHeight(); i++) {
            if (columnStart < field.getWith()) {
                if (field.getMatrix()[rowStart][columnStart].getElement().equals(token.getElement())) {
                    counter++;
                    if (counter >= field.getWinCount()) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
                rowStart++;
                columnStart++;
            }
        }
        return false;
    }

    public boolean executeCheckRightLeftDown(Token token) {
        int x = token.getCoord().getX();
        int y = token.getCoord().getY();
        int counter = 0;
        int rowStart = 0;
        int columnStart = 6;
        if (x + y > field.getWith() - 1) {
            columnStart = field.getWith() - 1;
            rowStart = field.getWith() - 1 - y;
        } else if (x + y < field.getWith() - 1) {
            columnStart = x + y;
        }
        for (int i = rowStart; i < field.getHeight(); i++) {
            if (columnStart >= 0) {
                if (field.getMatrix()[rowStart][columnStart].getElement().equals(token.getElement())) {
                    counter++;
                    if (counter >= field.getWinCount()) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
                rowStart++;
                columnStart--;
            }
        }
        return false;
    }
}