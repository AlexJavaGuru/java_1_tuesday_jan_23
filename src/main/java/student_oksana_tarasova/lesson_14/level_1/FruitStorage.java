package student_oksana_tarasova.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {

    List<Apple> apples;

    public FruitStorage(List<Apple> apples) {
        this.apples = apples;
    }

    void addNewFruit(Apple apple) {
        apples.add(apple);
    }

    public List<Apple> getAllApples() {
        return apples;
    }

    public List<Apple> getApplesByApples(String color) {
       List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> getApplesByWeight(int weight) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findApples(ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "FruitStorage{" +
                "apples=" + apples +
                '}';
    }
}
