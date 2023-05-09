package student_julija_raudive.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class Task2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(78);
        list.add(46);
        System.out.println(list);

        List<SomeClass> list2 = new ArrayList<>();
        list2.add(new SomeClass(1));
        list2.add(new SomeClass(2));
        list2.add(new SomeClass(3));
        System.out.println(list2);



    }

}

class SomeClass {

    int ID;

    public SomeClass(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "ID=" + ID +
                '}';
    }
}
