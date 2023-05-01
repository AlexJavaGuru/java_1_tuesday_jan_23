package student_vladislav_romanov.lesson_14.level_1_2;

public class AppleWeightFruitPredicate implements FruitPredicate {

    private final int weight;
    private final Operation operation;

    AppleWeightFruitPredicate(int weight, Operation operation) {
        this.weight = weight;
        this.operation = operation;
    }

    @Override
    public boolean test(Apple apple) {
        return switch (operation) {
            case LESS -> apple.getWeight() < weight;
            case MORE -> apple.getWeight() > weight;
            case EQUALS -> apple.getWeight() == weight;
            case LESSOREQUALS -> apple.getWeight() <= weight;
            case MOREOREQUALS -> apple.getWeight() >= weight;
        };
    }

}