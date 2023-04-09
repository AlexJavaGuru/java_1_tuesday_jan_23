package student_anastasiia_bokareva.lesson5.level2;

public class Task15 {
    public static void main(String[] args) {
        int[] numbers = {3,14,5};
        for (int i =0; i<3; i++){
            System.out.println(numbers[i]);
        }
        for (int i = 0; i<3;i++){
            numbers[i]=numbers[i]+2;
            System.out.println(numbers[i]);
        }
    }
}

