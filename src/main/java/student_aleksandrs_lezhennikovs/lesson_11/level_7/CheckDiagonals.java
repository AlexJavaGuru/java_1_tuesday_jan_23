package student_aleksandrs_lezhennikovs.lesson_11.level_7;

public class CheckDiagonals {
    private Field field;

    public CheckDiagonals(Field field) {
        this.field = field;
    }

    public boolean diagonalsWin(Coord coord, Token token) {
        int counter = 1;
        int leftDownCount = countEqualElement(counter, coord, token);

        return leftDownCount == 4 || leftDownCount > 4;
    }
    public int countEqualElement(int counter, Coord coord, Token token) {
        int X = coord.getX();
        int Y = coord.getY(); //remove after
        int prevSize = coord.getY();

        for (int i = 1; i < 5; i++) {
            int currentSize = field.getCols().get(X - 2).getTokenList().size();
            boolean checkCond = X - 1 == 0 || Y - 1 == 0 || currentSize == 0  || prevSize - currentSize > 1;
            if (X - 1 == 0 || Y - 1 == 0 || currentSize == 0 || prevSize - currentSize > 1) {
                return counter;
            }
            Token leftDownToken = field.getCols().get(X - 2).getTokenList().get(Y - 2);
            if (leftDownToken.getElement().equals(token.getElement())) {
                counter++;
                X--;
                Y--;
            }
        }
        return counter;
    }
}
