package student_aleksandrs_lezhennikovs.lesson_13.level_3.domens;

import java.util.Objects;

public class Cell {
    private boolean isLive;
    private Coord coord;

    public Cell(boolean isLive, Coord coord) {
        this.isLive = isLive;
        this.coord = coord;
    }
    public Cell(Coord coord) {
        this.coord = coord;
    }

    public Cell(boolean isLive, int x, int y) {
        this.isLive = isLive;
        this.coord = new Coord(x, y);

    }


    public boolean isLiveGetter() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell cell)) return false;
        return isLive == cell.isLive && coord.equals(cell.coord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLive, coord);
    }
}
