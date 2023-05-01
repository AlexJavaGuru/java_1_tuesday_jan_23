package student_vladislav_romanov.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getApplesByCriteria(Color color) {
        List<Apple> apples = getAllApples();
        return apples.stream()
                .filter(new AppleFruitPredicate(color))
                .toList();
    }

    public List<Apple> getGreenApples() {
        List<Apple> apples = getAllApples();
        return apples.stream()
                .filter(apple -> Color.GREEN.equals(apple.getColor()))
                .toList();
    }

    public List<Apple> getRedApples() {
        List<Apple> apples = getAllApples();
        return apples.stream()
                .filter(apple -> Color.RED.equals(apple.getColor()))
                .toList();
    }

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Color.RED, 100));
        apples.add(new Apple(Color.RED, 160));
        apples.add(new Apple(Color.RED, 200));
        apples.add(new Apple(Color.GREEN, 200));
        apples.add(new Apple(Color.GREEN, 90));
        apples.add(new Apple(Color.GREEN, 50));
        apples.add(new Apple(Color.YELLOW, 50));
        apples.add(new Apple(Color.YELLOW, 170));
        return apples;
    }

}