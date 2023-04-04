package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.List;
import java.util.Optional;

public class CheckHorizontal {
    private static Field field;

    public CheckHorizontal(Field field) {
        this.field = field;
    }


    public boolean horizontalWin(int colNumber, Token token) {
        int left = checkLeftSide(colNumber, token);
        int right = checkRightSide(colNumber, token);
        return checkLeftSide(colNumber, token) + checkRightSide(colNumber, token) == 4;
    }

    private static int checkLeftSide(int colNumber, Token token) {
        int counter = 1;
        int start = token.getCoord().getX() - 2;
        for (int i = start; i > 0; i--) {
            Token leftToken = token;
            int x = token.getCoord().getX() - 1;
            int y = token.getCoord().getY() - 1;
            leftToken.setCoord(new Coord(x, y));
            if (isEqualToken(colNumber, leftToken)) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }

    private static int checkRightSide(int colNumber, Token token) {
        int counter = 1;
        int end = field.getWIDTH();
        int start = token.getCoord().getX() + 1;
        for (int i = start; i < end; i++) {
            Token rightToken = token;
            int x = token.getCoord().getX() + 1;
            int y = token.getCoord().getY();
            rightToken.setCoord(new Coord(x, y));
            if (isEqualToken(colNumber, rightToken)) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }

    private static boolean isEqualToken(int colNumber, Token token) {
        List<Token> tokenList = field.getCols().get(colNumber - 1).getTokenList();
        for (Token tokenCheck : tokenList) {
            Optional<Token> optToken = Optional.ofNullable(tokenCheck);
            if (optToken.isPresent()) {
                if (optToken.get().getElement().equals(token)) {
                    return true;
                }
            }
        }
        return false;
    }
}
