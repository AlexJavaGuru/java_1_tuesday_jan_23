package student_aleksandrs_lezhennikovs.lesson_10.level_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordsFinder {

    Set<String> find(String text) {
        Set<String> resultSet = new HashSet<>(Arrays.asList(text.replaceAll("[^a-zA-Z ]", "").split(" ")));
        return resultSet;
    }

}
