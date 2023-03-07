package student_aleksandrs_lezhennikovs.lesson_8.level_4.task_14;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
