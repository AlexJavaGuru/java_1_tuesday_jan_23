package student_andrejs_cekalins.lesson_11.level_2.Task_10;


public class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        new ConstructorChaining(constructorName);
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }
}
