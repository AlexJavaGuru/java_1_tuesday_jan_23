package student_aleksandrs_lezhennikovs.lesson_11.level_7.check_win;

import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Field;
import student_aleksandrs_lezhennikovs.lesson_11.level_7.domens.Token;

public class CheckHorizontal {
    private static Field field;

    public CheckHorizontal(Field field) {
        this.field = field;
    }

    public boolean executeCheck(Token token) {
        int x = token.getCoord().getX();
        int counter = 0;
        for (int i = 0; i < field.getHeight(); i++) {
            if (field.getMatrix()[x][i].getElement().equals(token.getElement())) {
                counter++;
            } else {
                counter = 0;
            }
        }
        if (counter >= field.getWinCount()) {
            return true;
        } else {
            return false;
        }
    }
}
