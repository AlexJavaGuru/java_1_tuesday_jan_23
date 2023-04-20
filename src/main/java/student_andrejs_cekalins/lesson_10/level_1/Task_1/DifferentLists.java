package student_andrejs_cekalins.lesson_10.level_1.Task_1;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

class DifferentLists {
    // Structured:
    List<String> strings = new ArrayList<>();
    // Not structured:
    List<Integer> integer = new LinkedList<>();
    // Not structured, hashCode, Key Value:
    Map<Key, Value> strings1 = new HashMap<>();
    // Not structured, no duplicates:
    Set<String> strings2 = new HashSet<>();
}
