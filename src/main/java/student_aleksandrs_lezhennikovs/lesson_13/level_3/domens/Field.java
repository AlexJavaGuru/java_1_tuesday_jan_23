package student_aleksandrs_lezhennikovs.lesson_13.level_3.domens;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Field {
    private Cell[][] matrix;
    private Coord size;
    private Integer population;
    private static final String dieCell = "[ ]";
    private static final String liveCell = "[\u2B1B]";

    public Field(Coord size) {
        this.size = size;
        this.matrix = new Cell[size.getX()][size.getY()];
        for (int x = 0; x < size.getX(); x++) {
            for (int y = 0; y < size.getY(); y++) {
                matrix[x][y] = new Cell(false, x, y);
            }
        }
    }

    public Cell[][] getMatrix() {
        return matrix;
    }

    public void setPopulation(Integer population) {
        Random random = new Random(10);
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            matrix[x][y] = new Cell(true, x, y);
        }
    }

    public Coord getSize() {
        return size;
    }

    private boolean inRange(Coord coord) {
        return coord.getX() >= 0
            && coord.getY() >= 0
            && coord.getX() <= size.getX() - 1
            && coord.getY() <= size.getY() - 1;
    }

    public Cell getCell(Coord coord) {
        if (inRange(coord)) {
            return matrix[coord.getX()][coord.getY()];
        } else {
            return null;
        }
    }
    public void setCell(Cell cell) {
        if (inRange(cell.getCoord())) {
            this.matrix[cell.getCoord().getX()][cell.getCoord().getY()] = cell;
        }
    }


    public List<Cell> getAroundCoord(Coord coord) {
        List<Cell> list = new ArrayList<>();
        for (int i = coord.getX() - 1; i <= coord.getX() + 1; i++) {
            for (int j = coord.getY() - 1; j <= coord.getY() + 1; j++) {
                if(inRange(new Coord(i, j))) {
                    if (!matrix[i][j].getCoord().equals(coord)) {
                        list.add(matrix[i][j]);

                    }
                }
            }
        }
        return list;
    }

    public void printFieldToConsole() {
        for (int row = 0; row < size.getX(); row++) {
            for (int column = 0; column < size.getY(); column++) {
                printSymbolInField(matrix[row][column], column);
            }
        }
        System.out.println();
    }

    private static void printSymbolToColumn(Cell cell) {
        if (cell.isLiveGetter()) {
            System.out.println(liveCell);
        } else if (!(cell.isLiveGetter())) {
            System.out.println(dieCell);
        }
    }

    private static void printSymbolToRow(Cell cell) {
        if (cell.isLiveGetter()) {
            System.out.print(liveCell);
        } else if (!(cell.isLiveGetter())) {
            System.out.print(dieCell);
        }
    }

    private void printSymbolInField(Cell cell, Integer column) {
        if (column.equals(size.getY() - 1)) {
            printSymbolToColumn(cell);
        } else {
            printSymbolToRow(cell);
        }
    }
}
