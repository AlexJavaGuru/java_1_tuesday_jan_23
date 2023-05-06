package student_andrejs_cekalins.lesson_12.level_5_6;


import java.util.Objects;

public class Product {
    private String title;
    private Double price;
    private String description;

    Product(String title, Double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                ", title ='" + title + '\'' +
                ", price ='" + price + '\'' +
                ", description =" + description +
                '}';
    }
}
