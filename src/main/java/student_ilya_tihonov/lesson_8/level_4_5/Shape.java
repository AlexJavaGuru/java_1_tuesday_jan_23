package student_ilya_tihonov.lesson_8.level_4_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double perimeterCount();

}
