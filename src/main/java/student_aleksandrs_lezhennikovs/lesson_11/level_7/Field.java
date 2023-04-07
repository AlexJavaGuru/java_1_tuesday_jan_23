package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private final int HEIGHT;
    private final int WIDTH;
    private List<Column> cols;

    public Field(int WIDTH, int HEIGHT) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.cols = new ArrayList<>();
        for (int i = 0; i < WIDTH; i++) {
            Column column = new Column();
            cols.add(column);
        }
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public List<Column> getCols() {
        return cols;
    }

    public void putToken(int colNumber, Token token) {
        Token newToken = new Token();
        int x = colNumber;
        int y = cols.get(colNumber - 1).getTokenList().size() + 1;
        token.setCoord(new Coord(x, y));
        cols.get(colNumber - 1).getTokenList().add(token);
    }

    public void printField() {
        for (int i = 0; i < WIDTH; i++) {
            System.out.println(i + 1 + " " + cols.get(i));
        }
        System.out.println();
    }

    public boolean isEmptyCell(int colNumber) {
        return cols.get(colNumber - 1).getTokenList().size() < HEIGHT;
    }

}
