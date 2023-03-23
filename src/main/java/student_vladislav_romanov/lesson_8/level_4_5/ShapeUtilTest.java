package student_vladislav_romanov.lesson_8.level_4_5;

class ShapeUtilTest {

    private int succeedTests;
    private int failedTests;

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTestSucceed();
        shapeUtilTest.calculateAreaTestFailed();
        shapeUtilTest.calculatePerimeterTestSucceed();
        shapeUtilTest.calculatePerimeterTestFailed();
        shapeUtilTest.printStat();
    }

    public void calculateAreaTestSucceed() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = createShapeArray();
        double expected = 0;
        for (Shape shape : shapes) {
            expected += shape.calculateArea();
        }
        double current = shapeUtil.calculateArea(shapes);
        printResult(current == expected, "calculateAreaTestSucceed");
    }

    public void calculateAreaTestFailed() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = createShapeArray();
        double expected = 0;
        double current = shapeUtil.calculateArea(shapes);
        printResult(current != expected, "calculateAreaTestFailed");
    }

    public void calculatePerimeterTestSucceed() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = createShapeArray();
        double expected = 0;
        for (Shape shape : shapes) {
            expected += shape.calculatePerimeter();
        }
        double current = shapeUtil.calculatePerimeter(shapes);
        printResult(current == expected, "calculatePerimeterTestSucceed");
    }

    public void calculatePerimeterTestFailed() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = createShapeArray();
        double expected = 0;
        double current = shapeUtil.calculatePerimeter(shapes);
        printResult(current != expected, "calculatePerimeterTestFailed");
    }

    public Shape[] createShapeArray() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        return shapes;
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
