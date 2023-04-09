package student_oksana_tarasova.Lesson_9.level_7;

public class CalculateNumbers {
    private  CalculateTwoNumbers calculateTwoNumbers;

    public void setCalculateTwoNumbers(CalculateTwoNumbers calculateTwoNumbers) {
        this.calculateTwoNumbers = calculateTwoNumbers;
    }

    public int calculate(int firstNumber, int secondNumber) {
        return calculateTwoNumbers.calculateTwoNumbers(firstNumber, secondNumber);
    }
}

