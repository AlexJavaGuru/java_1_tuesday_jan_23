package student_romualds_leitans.lesson_8.level_7;

public class Varargs {

    static int sumOfNumbers (int... numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
             result +=numbers[i];
        }
        return result;
    }
    public static  void main(String[]args){
        int result = sumOfNumbers(2,3,4,9,5,3,2,2);
        System.out.println(result);
    }
}
