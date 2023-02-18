package student_ilya_tihonov.lesson_4.level_3.task_10;

public class Finder {

    int check(int firstNumber , int secondNumber , int thirdNumber){
        int result;
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            result = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            result = secondNumber;
        } else {result = thirdNumber;}
        return result;
    }

}
