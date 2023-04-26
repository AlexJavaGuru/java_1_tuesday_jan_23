package student_nikita_visnakovs.lesson_8.level_4;

class Rectangle extends Shape {

    private int height;
    private int width;

    Rectangle(String title, int height, int width){
        super(title);
        this.width = width;
        this.height = height;

    }


    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (height * width);
    }
}
