package student_anastasiia_bokareva.lesson10.level3;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {
    Set<String> find(String text){
        String[] words = text.replaceAll("[^a-zA-Z]","").toLowerCase().split("\\s+");
        Set<String> real = new HashSet<>();
        for (String string : words){
            real.add(string);
        }
        return real;
    }
}
