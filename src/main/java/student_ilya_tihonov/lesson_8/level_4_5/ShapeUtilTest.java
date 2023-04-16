package student_ilya_tihonov.lesson_8.level_4_5;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.testCalculatePerimeter();
        test.testCalculateArea();
    }

    public void testCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5, "Circle");
        shapes[1] = new Square(10, "Square");
        shapes[2] = new Rectangle(6, 8, "Rectangle");
        shapes[3] = new Triangle(3, 4, "Triangle");

        double expectedPerimeter = 68.84;
        double actualPerimeter = shapeUtil.calculatePerimeter(shapes);

        if (expectedPerimeter == actualPerimeter) {
            System.out.println("calculatePerimeter() test passed!");
        } else {
            System.out.println("calculatePerimeter() test failed!");
        }
    }

    public void testCalculateArea() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5, "Circle");
        shapes[1] = new Square(10, "Square");
        shapes[2] = new Rectangle(6, 8, "Rectangle");
        shapes[3] = new Triangle(3, 4, "Triangle");

        double expectedArea = 216.84;
        double actualArea = ShapeUtil.calculateArea(shapes);

        if (expectedArea == actualArea) {
            System.out.println("calculateArea() test passed!");
        } else {
            System.out.println("calculateArea() test failed!");
        }

    }
}
