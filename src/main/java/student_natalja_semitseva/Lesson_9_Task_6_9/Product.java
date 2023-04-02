package student_natalja_semitseva.Lesson_9_Task_6_9;

public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
//интерфейс не является функциональным, потому что для создания функциональных интерфейсов можно использовать аннотацию @FunctionalInterface,
// либо использовать предопределенные функциональные интерфейсы Java.