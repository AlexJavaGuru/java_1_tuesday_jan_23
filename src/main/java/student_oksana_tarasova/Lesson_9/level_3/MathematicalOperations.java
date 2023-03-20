package student_oksana_tarasova.Lesson_9.level_3;

public class MathematicalOperations {
    int firstNumber;
    int secondNumber;


    /*
        Обычные методы приведены для сравнения
         */
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    /*
    Объявляется ссылка на интерфейс, которой присваивается лямбда-выражение,
    которое реализует метод финкционального интерфейса.
     */
    TwoNumbers numbers = (firstNumber, secondNumber) -> firstNumber + secondNumber;
    TwoNumbers numbers2 = (firstNumber, secondNumber) -> firstNumber * secondNumber;

    public int sumNumbers(int firstNumber, int secondNumber){
        return numbers.actionsWithTwoNumbers(firstNumber, secondNumber);
    }

    public  int mulNumber(int firstNumber, int secondNumber){
        return numbers2.actionsWithTwoNumbers(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        MathematicalOperations demo = new MathematicalOperations();
        System.out.println(demo.sum(6, 6));
        System.out.println(demo.mul(6, 6));
        System.out.println(demo.sumNumbers(6, 6));
        System.out.println(demo.mulNumber(6, 6));
    }
}
