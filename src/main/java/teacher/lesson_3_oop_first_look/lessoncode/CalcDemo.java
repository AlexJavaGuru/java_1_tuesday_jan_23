package teacher.lesson_3_oop_first_look.lessoncode;

public class CalcDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(5, 5);
        System.out.println(sumResult);
    }
}
