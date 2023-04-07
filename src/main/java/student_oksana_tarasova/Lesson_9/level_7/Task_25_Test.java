package student_oksana_tarasova.Lesson_9.level_7;

public class Task_25_Test {
    public static void main(String[] args) {
        Task_25_Test test = new Task_25_Test();
        test.plusNumbersTest();
        test.minusNumbersTest();
    }

    public void plusNumbersTest() {
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        calculateNumbers.setCalculateTwoNumbers(new PlusNumbers());
        int expectedResult = 15;
        int realResult = calculateNumbers.calculate(10, 5);
        check(expectedResult == realResult, "plus numbers");
    }

    public void minusNumbersTest() {
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        calculateNumbers.setCalculateTwoNumbers(new MinusNumbers());
        int expectedResult = 5;
        int realResult = calculateNumbers.calculate(10, 5);
        check(expectedResult == realResult, "minus numbers");
    }

    void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
