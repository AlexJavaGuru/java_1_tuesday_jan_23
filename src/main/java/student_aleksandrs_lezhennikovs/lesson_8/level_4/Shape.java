package student_aleksandrs_lezhennikovs.lesson_8.level_4;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}