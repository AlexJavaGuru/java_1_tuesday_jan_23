package student_natalja_semitseva.Level_4_Task_15_16_17_18_19;

public abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = new String(title);
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

