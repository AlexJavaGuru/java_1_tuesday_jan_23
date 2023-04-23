package student_anastasiia_bokareva.lesson10.level1;

import java.util.ArrayList;

public class Dublicate {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anastasiia");
        list.add("Anastasiia");
        for (String element : list){
            System.out.println(element);
        }
    }
}
