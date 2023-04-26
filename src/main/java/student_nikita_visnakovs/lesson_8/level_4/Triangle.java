package student_nikita_visnakovs.lesson_8.level_4;

class Triangle extends Shape {
    private int size;

    Triangle(String title, int size){
        super(title);
        this.size = size;

    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3)/4) * size * size;
    }

    @Override
    double calculatePerimeter() {
        return size * 3;
    }
}
