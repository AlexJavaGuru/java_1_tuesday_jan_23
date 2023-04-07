package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.List;
import java.util.Optional;

public class CheckHorizontal {
    private static Field field;

    public CheckHorizontal(Field field) {
        this.field = field;
    }


    public boolean horizontalWin(int colNumber, Token token) {
        int counter = 1;
        int leftCount = checkLeftSide(counter, colNumber, token);
        int totCount = checkRightSide(leftCount, colNumber, token);
        return totCount == 4 || totCount > 4;
    }

    private static int checkLeftSide(int counter, int colNumber, Token token) {
        int end = 0;
        int x = colNumber;
        int y = field.getCols().get(x - 1).getTokenList().size();
        if (x > 4) {
            end = x - 4;
        }
        for (int i = x; i > end; i--) {
            if (field.getCols().get(i - 1).getTokenList().size() >= y) {
                Token leftToken = field.getCols().get(i - 1).getTokenList().get(y - 1);
                if (leftToken.getElement().equals(token.getElement())) {
                    counter++;
                } else {
                    return counter;
                }
            } else {
                return counter;
            }
        }
        return counter;
    }

    private static int checkRightSide(int counter, int colNumber, Token token) {
        int end = field.getWIDTH();
        int x = colNumber;
        int y = field.getCols().get(colNumber - 1).getTokenList().size();
        if (x < 4) {
            end = x + 4;
        }
        for (int i = x; i < end; i++) {
            if (field.getCols().get(i).getTokenList().size() >= y) {
                Token leftToken = field.getCols().get(i).getTokenList().get(y - 1);
                if (leftToken.getElement().equals(token.getElement())) {
                    counter++;
                } else {
                    return counter;
                }
            }
        }
        return counter;
    }

}
