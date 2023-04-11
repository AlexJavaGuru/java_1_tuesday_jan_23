package student_vladislav_romanov.lesson_11.level_7;

import java.util.Objects;

public class Chip {

    private ChipColor color;

    public Chip(ChipColor color) {
        this.color = color;
    }

    public ChipColor getColor() {
        return color;
    }

    public void setColor(ChipColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" + color + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chip chip = (Chip) o;
        return color == chip.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
