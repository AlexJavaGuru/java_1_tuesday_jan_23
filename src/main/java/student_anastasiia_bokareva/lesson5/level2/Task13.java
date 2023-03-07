package student_anastasiia_bokareva.lesson5.level2;

import java.util.Random;


public class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum=0;
        Random random = new Random();
        for (int i = 0; i<3; i++){
            numbers[i]=random.nextInt();
            System.out.println(numbers[i]);
            sum=sum+numbers[i];
        }
        System.out.println("Sum = " + sum);
    }

}

