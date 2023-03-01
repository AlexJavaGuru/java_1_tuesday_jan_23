package student_anastasiia_bokareva.lesson3.level5;

import java.util.Scanner;

public class DogDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Dog staford = new Dog(" ", 0, " ");
        staford.name = scan.next();
        staford.age=scan.nextInt();
        staford.voice();
        staford.age();
        staford.newVoice();

    }
}

