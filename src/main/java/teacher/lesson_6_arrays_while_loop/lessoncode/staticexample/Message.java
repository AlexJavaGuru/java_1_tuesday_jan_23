package teacher.lesson_6_arrays_while_loop.lessoncode.staticexample;

public class Message {

    public static int instancesCreated = 0;

    private String text;

    public Message(String text) {
        this.text = text;
        System.out.println("Creating message = '" + text + "'");
        instancesCreated++;
    }
}
