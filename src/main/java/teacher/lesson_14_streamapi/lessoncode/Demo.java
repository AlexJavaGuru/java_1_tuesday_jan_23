package teacher.lesson_14_streamapi.lessoncode;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer();
//
//        for (int i = 0; i < 2001; i++) {
//            stringBuffer.append(i);
//        }
//
//        String result = stringBuffer.toString();
//        System.out.println(result.length());

        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        fruitStreamApi.findAnyApple()
                .ifPresent(System.out::println);

        fruitStreamApi.findAnyApple().map(fruit -> fruit.getColor()).ifPresent(System.out::println);

        String result = doSomething(new Fruit("Apple", "Red", 120));

        System.out.println(result);

        System.out.println(fruitStreamApi.test());
    }

    private static String doSomething(Fruit fruit) {
        return Optional.ofNullable(fruit)
                .map(Fruit::getColor)
                .orElse("");
    }
}
