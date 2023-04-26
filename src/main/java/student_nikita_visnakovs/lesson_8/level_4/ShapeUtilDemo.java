package student_nikita_visnakovs.lesson_8.level_4;

public class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println(shapeUtil.calculateArea(circle));
        System.out.println(shapeUtil.calculatePerimeter(circle));
    }
}
