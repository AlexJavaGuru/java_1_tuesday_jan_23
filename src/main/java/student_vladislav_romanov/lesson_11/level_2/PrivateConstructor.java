package student_vladislav_romanov.lesson_11.level_2;

public class PrivateConstructor {

    private PrivateConstructor () {

    }

    public PrivateConstructor createPrivateConstructor() {
        return new PrivateConstructor();
    }
}
