package student_anastasiia_bokareva.lesson12.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OutOfMemoryError {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object());
        }
    }
}