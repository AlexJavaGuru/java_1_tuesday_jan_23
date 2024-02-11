package student_anastasiia_bokareva.lesson13.level5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator(new AdditionalRules("\n",",",
            ";","&"));


    @Test
    void checkStringTwoNumbers() {
        String numbers = "1,2";
        int sum = stringCalculator.add(numbers);
        int result =3;
        assertEquals(sum, result);
    }

    @Test
    void checkOneNumbers() {
        String numbers = "1";
        int sum = stringCalculator.add(numbers);
        int result = 1;
        assertEquals(sum, result);
    }

    @Test
    void checkIsEmpty() {
        String numbers = " ";
        int sum = stringCalculator.add(numbers);
        int result = 0;
        assertEquals(sum, result);
    }

    @Test
    void checkMoreThanTwoNumbers(){
        String numbers ="1,2,3,4";
        int sum = stringCalculator.add(numbers);
        int result = 10;
        assertEquals(sum,result);
    }

    @Test
    void checkMoreFunctional(){
        String string = "1\n2,3,4";
        int sum = stringCalculator.add(string);
        int result = 10;
        assertEquals(sum,result);
    }
    @Test
    void checkNewFunctional(){
        String string = "1\n1;2&3";
        int sum = stringCalculator.add(string);
        int result = 7;
        assertEquals(sum,result);
    }
}


