package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterSearchCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;

public class RedTomatoSearchCriteria implements FilterSearchCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("tomato") &&
                fruit.getColor().equals("red") &&
                fruit.getWeight() == 100;
    }
}
