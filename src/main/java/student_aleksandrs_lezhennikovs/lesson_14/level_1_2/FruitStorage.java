package student_aleksandrs_lezhennikovs.lesson_14.level_1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findApples(ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : getAllApples()) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findGreenApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals("green"))
                .collect(Collectors.toList());
    }

    public List<Apple> findRedApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals("red"))
                .collect(Collectors.toList());
    }

    public List<Apple> findHeavyApples(int weight) {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }
    public List<Apple> findLightApples(int weight) {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() < weight)
                .collect(Collectors.toList());
    }


}
