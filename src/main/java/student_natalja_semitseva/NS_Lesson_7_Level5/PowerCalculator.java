package student_natalja_semitseva.NS_Lesson_7_Level5;

public class PowerCalculator {


   public float degree(int number, int pow) {
        float result = 1;
        for (int i = 0; i < pow; i++) {
            result *= number;


        }
        return result;
    }
}
