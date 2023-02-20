package student_anastasiia_bokareva.lesson4.level7;

public class FizzBuzz {
    public String detect(int number) {
        String result;
        if (div3(number) && div5(number)) {
            result = "FizzBuzz";
        } else if (div3(number)) {
            result = "Fizz";
        } else if (div5(number)) {
            result =  "Buzz";
        } else {
            result =  "" + number;
        }
        return result;
    }

    public boolean div3(int number) {
        return (number % 3) == 0;
    }
    public boolean div5(int number) {
        return (number % 5) == 0;
    }
}

