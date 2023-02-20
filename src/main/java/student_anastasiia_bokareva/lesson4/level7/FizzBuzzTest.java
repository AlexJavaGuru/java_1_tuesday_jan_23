package student_anastasiia_bokareva.lesson4.level7;

import teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testNonOfThem();

    }
    public void checkResult(boolean realResult, String testName){
        if (realResult){
            System.out.println(testName+" passed");
        } else {
            System.out.println(testName+" fail");
        }
    }
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(9);
        String expectedResult = "Fizz";
        checkResult((realResult.equals(expectedResult)),"Fizz test");
    }
    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        String expectedResult = "Buzz";
        checkResult((realResult.equals(expectedResult)),"Buzz test ");
    }
    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        checkResult((realResult.equals(expectedResult)),"FizzBuzz test ");
    }
    public void testNonOfThem(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String realResult = fizzBuzz.detect(15);
        String expectedResult = ""+number;
        checkResult((realResult.equals(expectedResult)),"Non of them test ");
    }
}