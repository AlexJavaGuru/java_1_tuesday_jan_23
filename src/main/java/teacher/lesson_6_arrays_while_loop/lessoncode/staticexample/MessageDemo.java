package teacher.lesson_6_arrays_while_loop.lessoncode.staticexample;

public class MessageDemo {

    public static void main(String[] args) {
        System.out.println("Created = " + Message.instancesCreated);
        Message greeting = new Message("Hi!");
        Message question = new Message("How are you?");
        Message farewell = new Message("Goodbye!");
        System.out.println("Created = " + Message.instancesCreated);


        greeting.instancesCreated = 10;
        question.instancesCreated = 100;
        System.out.println(greeting.instancesCreated);
    }
}
