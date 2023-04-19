package teacher.lesson_14_streamapi.lessoncode;

import java.util.function.Predicate;

public interface FruitPredicate extends Predicate<Fruit> {

    boolean test(Fruit fruit);

}
