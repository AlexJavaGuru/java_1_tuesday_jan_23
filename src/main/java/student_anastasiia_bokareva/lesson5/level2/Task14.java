package student_anastasiia_bokareva.lesson5.level2;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum=0;
        int quantaty =0;
        Random random = new Random();

        for (int i = 0; i<3; i++){
            numbers[i]=random.nextInt();
            sum=sum+numbers[i];
            quantaty++;
        }
        double averega = sum / quantaty;
        System.out.println(averega);
    }

}


