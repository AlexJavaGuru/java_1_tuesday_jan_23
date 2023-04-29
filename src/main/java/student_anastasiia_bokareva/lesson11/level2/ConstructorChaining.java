package student_anastasiia_bokareva.lesson11.level2;

public class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount){
        ConstructorChaining constructorChaining = new ConstructorChaining(constructorName);
        this.parameterCount=parameterCount;
    }
}
