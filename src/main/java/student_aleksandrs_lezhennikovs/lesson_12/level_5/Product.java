package student_aleksandrs_lezhennikovs.lesson_12.level_5;

import java.math.BigDecimal;
import java.util.Objects;

class Product {
    private String title;
    private BigDecimal price;
    private String description;

    public Product(String title, BigDecimal price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return title.equals(product.title) && price.equals(product.price) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
