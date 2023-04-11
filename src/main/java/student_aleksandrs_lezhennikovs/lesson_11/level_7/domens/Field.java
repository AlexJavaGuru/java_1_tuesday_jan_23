package student_aleksandrs_lezhennikovs.lesson_11.level_7.domens;

public class Field {
    private int height;
    private int with;
    private int winCount;
    private static final String emptyElement = "[ ]";
    private static final String elementX = "[x]";
    private static final String elementO = "[o]";
    private Token[][] matrix;
    private int emptyCells;


    public Field(int width, int height, int winCount) {
        this.height = height;
        this.with = width;
        this.winCount = winCount;
        this.matrix = new Token[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Token token = new Token(Element.EMPTY);
                matrix[i][j] = token;
            }
        }
        this.emptyCells = width * height;
    }

    public int getEmptyCells() {
        return emptyCells;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getHeight() {
        return height;
    }

    public int getWith() {
        return with;
    }

    public Token[][] getMatrix() {
        return matrix;
    }

    public void printFieldToConsole() {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < with; column++) {
                printSymbolInField(matrix[row][column], column);

            }
        }
        System.out.println();
    }

    public boolean isTokenDropped(int colNumber, Token token) {
        int y = colNumber - 1;
        for (int x = height - 1; x >= 0; x--) {
            if (matrix[x][y].getElement().equals(Element.EMPTY)) {
                token.setCoord(new Coord(x, y));
                matrix[x][y].setElement(token.getElement());
                emptyCells--;
                return true;
            }
        }
        return false;
    }

    private static void printSymbolToColumn(Token token) {
        switch (token.getElement()) {
            case X -> System.out.println(elementX);
            case O -> System.out.println(elementO);
            case EMPTY -> System.out.println(emptyElement);
        }
    }

    private static void printSymbolToRow(Token token) {
        switch (token.getElement()) {
            case X -> System.out.print(elementX);
            case O -> System.out.print(elementO);
            case EMPTY -> System.out.print(emptyElement);
        }
    }

    private void printSymbolInField(Token token, int cell) {
        if (cell == height) {
            printSymbolToColumn(token);
        } else {
            printSymbolToRow(token);
        }
    }

}
