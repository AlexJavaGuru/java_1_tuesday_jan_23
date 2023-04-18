package teacher.lesson_14_streamapi.lessoncode;

public class AppleFruitPredicate implements FruitPredicate {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}
