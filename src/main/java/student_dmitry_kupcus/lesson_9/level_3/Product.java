package student_dmitry_kupcus.lesson_9.level_3;

import java.util.Objects;

class Product {


    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student_dmitry_kupcus.lesson_9.level_3.Product product)) return false;
        return Objects.equals(title, product.title);
    }
    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

}