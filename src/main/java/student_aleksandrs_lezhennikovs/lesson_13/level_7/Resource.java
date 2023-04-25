package student_aleksandrs_lezhennikovs.lesson_13.level_7;

import java.util.Objects;

abstract class Resource {
    private String name;
    private int size;

    public Resource(String name, int size) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resource resource)) return false;
        return size == resource.size && name.equals(resource.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
