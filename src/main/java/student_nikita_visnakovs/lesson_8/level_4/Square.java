package student_nikita_visnakovs.lesson_8.level_4;

class Square extends Shape {

    private double size;

    Square(String title, double size){
        super(title);
        this.size = size;
    }

    @Override
    double calculateArea() {
        return size * size;
    }

    @Override
    double calculatePerimeter() {
        return size * 4;
    }
}
