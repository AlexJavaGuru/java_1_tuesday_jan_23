package student_julija_raudive.lesson_10.level_4;



import java.util.*;

class UniqueWordFinder {


     Set<String> find(String text){
         String[] textArray = text.split("\\W+");
         List<String> list = Arrays.asList(textArray);
         return new HashSet<>(list);
     }
}

