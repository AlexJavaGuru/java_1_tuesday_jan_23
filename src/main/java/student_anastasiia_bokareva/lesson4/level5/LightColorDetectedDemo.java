package student_anastasiia_bokareva.lesson4.level5;

import java.util.Scanner;

public class LightColorDetectedDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LightColorDetector detector = new LightColorDetector();
        int wavelenght = scan.nextInt();
        String color = detector.detect(wavelenght);
        System.out.println("the color is "+ color);
    }
}
