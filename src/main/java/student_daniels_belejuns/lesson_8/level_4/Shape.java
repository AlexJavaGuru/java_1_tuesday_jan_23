package student_daniels_belejuns.lesson_8.level_4;

public abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = new String(title);
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
