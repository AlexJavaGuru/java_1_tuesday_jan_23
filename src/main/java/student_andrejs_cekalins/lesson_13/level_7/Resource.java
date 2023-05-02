package student_andrejs_cekalins.lesson_13.level_7;

import java.util.Objects;

abstract class Resource {
    private String name;
    private int size;

    Resource(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Resource{" +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource that = (Resource) o;
        return name.equals(that.name) && size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
