package student_andrejs_cekalins.lesson_14.level_1_2;


import java.util.Objects;

public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return color.equals(apple.color) && weight == apple.weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color = " + color + "" +
                ", weight =" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}