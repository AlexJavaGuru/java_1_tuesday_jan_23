package student_oleg_gryazev.lesson_4.level_1_10;

public class TestingArithmeticsOperation {

    public static void main(String[] args) {
        SwitchArithmeticOperation switchOperation = new SwitchArithmeticOperation();
       ListOfMathOperationYouNeed list = new ListOfMathOperationYouNeed();
        list.readArithmeticOptions();
        switchOperation.switchOperation();


    }
}
