package student_andrejs_cekalins.lesson_11.level_2.Task_9;

public class PrivateConstructor {
    public String name;
    public String surname;

    public PrivateConstructor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    private PrivateConstructor() {
        String name1;
        String surname2;
    }


}
