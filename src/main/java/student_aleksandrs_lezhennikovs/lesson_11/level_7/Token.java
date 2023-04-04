package student_aleksandrs_lezhennikovs.lesson_11.level_7;

import java.util.Objects;

public class Token {
    private Element element;
    private Coord coord;

    public Token(Element element) {
        this.element = element;
    }
    public Token() {

    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.toString();
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
        if (!(o instanceof Token token)) return false;
        return element == token.element && coord.equals(token.coord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element, coord);
    }
}
