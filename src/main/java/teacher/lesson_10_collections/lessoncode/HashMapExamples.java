package teacher.lesson_10_collections.lessoncode;

import student_anastasiia_bokareva.lesson3.level7.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {

        Product banana = new Product("Banana", 10.0, 20.0);
        Product apple = new Product("Apple", 150.0, 20.0);
        Product bananaTwo = new Product("Banana", 10.0, 20.0);

        System.out.println(banana.hashCode());
        System.out.println(apple.hashCode());

        Map<Integer, String> mapExample = new HashMap<>();
        mapExample.put(1, "My Name");
        mapExample.put(2, "Alex");
        mapExample.put(2, "ejhwetrjh");

        System.out.println("Hash Code for 1: " + Integer.valueOf(395763487).hashCode());

        System.out.println(mapExample);

        String result = mapExample.get(2);
        System.out.println(result);

        mapExample.putIfAbsent(2, "wgwghwh");
        System.out.println(mapExample);

        //put(key, value)
        //key -> hash(key) -> 1726356828
        // hash(key) & (n - 1) ; n - bucket count = 16
        //1726356828 & 15
        //11100110111001100001110101011100 &
        //00000000000000000000000000001111
        //00000000000000000000000000001100 - 12 = bucket where to put

        //1000000000110100110000100011001
        //0000000000000000000000000001111
        //0000000000000000000000000001001 - 9

    }
}
