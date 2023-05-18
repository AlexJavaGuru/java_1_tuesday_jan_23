package student_andrejs_cekalins.lesson_14.level_1_2;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    List<Apple> apples;

    public FruitStorage(List<Apple> apples) {
        this.apples = apples;
    }

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

    public List<Apple> getAnyColourApples(String colour) {
        List<Apple> applesList = new ArrayList<>();
        for (Apple apple : apples) {
            if (colour.equals(apple.getColor())) {
                applesList.add(apple);
            }
        }
        return applesList;
    }
    public List<Apple> getApplesByWeight(int weight) {
        List<Apple> applesList = new ArrayList<>();
        for (Apple apple : apples) {
            if(apple.getWeight()> weight) {
                applesList.add(apple);
            }
        }
        return applesList;
    }
public List<Apple>findApples(ApplePredicate predicate) {
    List<Apple> applesList = new ArrayList<>();
    for (Apple apple : apples) {
        if ((predicate.test(apple))) {
            applesList.add(apple);
        }
    }
    return applesList;
}


    public String toString() {
        return "FruitStorage{" +
                "apples=" + apples +
                '}';
    }
}
