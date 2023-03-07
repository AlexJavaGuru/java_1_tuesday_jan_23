package student_anastasiia_bokareva.lesson3.level3;

public class RoboDemo {
    public static void main(String[] args) {
        Robo robot1 = new Robo("Rider"); // пусть этого робота зовут "Rider"
        robot1.sayHello();
        robot1.sayYourName();

        Robo robot2 = new Robo("John"); // а этого робота зовут "John"
        robot2.sayHello();
        robot2.sayYourName();
    }
}
