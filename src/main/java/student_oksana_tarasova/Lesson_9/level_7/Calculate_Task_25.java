package student_oksana_tarasova.Lesson_9.level_7;

public class Calculate_Task_25 {
    public static void main(String[] args) {
        CalculateNumbers calculateNumbers = new CalculateNumbers();

        calculateNumbers.setCalculateTwoNumbers(new PlusNumbers());
        int plusNumbers = calculateNumbers.calculate(10, 5);

        calculateNumbers.setCalculateTwoNumbers(new MinusNumbers());
        int minusNumbers = calculateNumbers.calculate(10,5);

        System.out.println(plusNumbers);
        System.out.println(minusNumbers);

    }
}
