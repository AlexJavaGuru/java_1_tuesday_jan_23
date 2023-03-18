package student_anastasiia_bokareva.lesson6.level7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.checkFizz();
        test.checkBuzz();
        test.checkFizzBuzz();
    }
    public void checkFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String word = fizzBuzz.detect(3);
        String expectedWord ="Fizz";
        check(word,expectedWord,"Fizz test ");
    }
    public void checkBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String word = fizzBuzz.detect(5);
        String expectedWord ="Buzz";
        check(word,expectedWord,"Buzz test ");
    }
    public void checkFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String word = fizzBuzz.detect(15);
        String expectedWord ="FizzBuzz";
        check(word,expectedWord,"FizzBuzz test ");
    }
    public void check(String word, String expectedWord,String testName){
        if (word==expectedWord){
            System.out.println(testName + " is Ok");
        } else {
            System.out.println(testName + " is Fail");
        }
    }
}
